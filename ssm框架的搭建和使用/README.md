README
===========================
SPRING+SPING MVC + MYBATIS 三大框架整合步骤
****
#### 个人笔记

****
### 一、JDK版本是1.8，mysql数据库版本5.6
### 二、在myeclipse2015中创建 java project ，项目名是ssmdemo
### 三、ssmdemo是一个MVC的框架的实现，是一个web项目。 在ssmdemo项目目录下创建一个web目录，接着在web目录下创建如下子目录
       
	WEB-INF
	WEB-INF/classes
	WEB-INF/lib
	   
### 四、下载项目ssmdemo，直接复制项目中的lib里面的jar, 解压后复制到新项目中的lib目录下，然后把jar包导入到项目中

	右键 project-> build path->configure build path ->add external jars

### 五、将java project转成web 的项目

- 找到.project文件，找到里面的<natures>标签，查看是否有下面的代码，没有则复制进去。

* Xml代码
	<nature>org.eclipse.wst.common.project.facet.core.nature</nature>
	<nature>org.eclipse.wst.common.modulecore.ModuleCoreNature</nature>
	<nature>org.eclipse.jem.workbench.JavaEMFNature</nature>
- 刷新导入的项目
- 在项目上点击右键，进入Properties配置，MyEclipse-->Project Facets,进入属性设置：勾选Dynamic Web Module和Java、JavaScript  ，然后应用，确认
- 这个时候在项目下回多出一个WebRoot  ,删掉WebRoot下的lib, 将原有的web下的lib以及其他资源放入WebRoot，最后删掉原有的名字为web的Folder

### 六、创建package 

	com.ssmdemo.controller
	com.ssmdemo.mapper
	com.ssmdemo.entity
	com.ssmdemo.service
	com.ssmdemo.service.impl
	
### 七、使用Mybatis-Generator自动生成Mybatis映射的相关文件，包括实体类，mapper、xml文件，下载Mybatis-Generator文件夹就可以使用

* 和Hibernate逆向生成一样，这里也需要一个配置文件。在这边设置的时候，配置文件里面设置的生成位置（包名）要和项目中的包名一一对应

	
	<table tableName="tmessage" domainObjectName="Tmessgae" 

	enableCountByExample="false" enableUpdateByExample="false" 

	enableDeleteByExample="false" enableSelectByExample="false" 

	selectByExampleQueryId="false"></table>

* tableName和domainObjectName为必选项，分别代表数据库表名和生成的实例类名，其余的可以自定义去选择（一般情况下均为false）。

* win7环境下打开dos命令，进入到Mybatis-Generator所在的位置，运行下面的生成文件的语句：

	java -jar mybatis-generator-core-1.3.2.jar -configfile generatorConfig.xml -overwrite
	
### 八、将生成的mapper文件，xml文件放到项目中com.ssmdemo.mapper这个package下，将生成的实体类文件，放到com.ssmdemo.entity这个包下

* 在WEB-INF目录下新增加web.xml，这个web.xml有两个作用：
	
	1.通过ContextLoaderListener在web app启动的时候，获取contextConfigLocation配置文件的文件名applicationContext.xml，并进行Spring相关初始化工作
	
	2.有任何访问，都被DispatcherServlet所拦截，这就是Spring MVC那套工作机制了
	
### 九、在src目录下新建applicationContext.xml文件，这是Spring的配置文件，其作用：
	1. 通过注解，将Service的生命周期纳入Spring的管理
	<context:annotation-config /><context:component-scan base-package="com.ssmdemo.service" />
	
	2.配置数据源
	<bean id="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
	
	3. 扫描存放SQL语句的Category.xml
	<bean id="sqlSession" class="org.mybatis.spring.SqlSessionFactoryBean">
	
	4. 扫描Mapper，并将其生命周期纳入Spring的管理
	<bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
	
### 十、在src目录下新建springMVC.xml、applicationContext.xml，也可以从下载的源码中复制过去，不过要修改对应的配置
	
	1. 扫描Controller,并将其生命周期纳入Spring管理
	<context:annotation-config/>
	<context:component-scan base-package="com.ssmdemo.controller">
	<context:include-filter type="annotation" 
	expression="org.springframework.stereotype.Controller"/>
	</context:component-scan>
	
	2. 注解驱动，以使得访问路径与方法的匹配可以通过注解配置
	<mvc:annotation-driven />
	
	3. 静态页面，如html,css,js,images可以访问
	<mvc:default-servlet-handler />
	
	4. 视图定位到/WEB/INF/jsp 这个目录下
	<bean  
	class="org.springframework.web.servlet.view.InternalResourceViewResolver">
    <property name="viewClass"
    value="org.springframework.web.servlet.view.JstlView" />
    <property name="prefix" value="/WEB-INF/jsp/" />
    <property name="suffix" value=".jsp" />
    </bean>
	
### 十、applicationContext.xml  配置数据库相关
	
	1. 通过注解，将Service的生命周期纳入Spring的管理
	<context:annotation-config />
	<context:component-scan base-package="com.ssmdemo.service" />
	
	2. 配置数据源
	<bean id="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
	
	3. 扫描存放SQL语句的Category.xml
	<bean id="sqlSession" class="org.mybatis.spring.SqlSessionFactoryBean">
	
	4. 扫描Mapper，并将其生命周期纳入Spring的管理
	<bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
	
### 十一、由于在springMVC.xml设置了视图定位 ，所以，在WEB-INF下创建jsp目录，并创建文件login.jsp，然后在com.ssmdemo.controller包下创建LoginCheckController

	基本的配置已经完成，不清楚的将项目ssmdemo下载下来看
	
	
#### 参考：
|1|[SM SPRING+SPING MVC + MYBATIS 三大框架整合详细步骤](http://how2j.cn/k/ssm/ssm-tutorial/1137.html?tid=77#step4514 "SM SPRING+SPING MVC + MYBATIS 三大框架整合详细步骤")|
|1|[使用Mybatis-Generator自动生成Dao、Model、Mapping相关文件(转)](http://www.cnblogs.com/smileberry/p/4145872.html "使用Mybatis-Generator自动生成Dao、Model、Mapping相关文件(转)")|

