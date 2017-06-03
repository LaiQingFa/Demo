<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0; user-scalable=0;" />
<title>login</title>
<link href="/ssmdemo/css/main.css" rel="stylesheet" type="text/css" />

<script type="text/javascript" src="/ssmdemo/js/jquery.min.js"></script>

<script type="text/javascript" src="/ssmdemo/js/plugins/spinner/ui.spinner.js"></script>
<script type="text/javascript" src="/ssmdemo/js/plugins/spinner/jquery.mousewheel.js"></script>

<script type="text/javascript" src="/ssmdemo//ssmdemo/js/jquery-ui.min.js"></script>

<script type="text/javascript" src="/ssmdemo/js/plugins/charts/excanvas.min.js"></script>
<script type="text/javascript" src="/ssmdemo/js/plugins/charts/jquery.sparkline.min.js"></script>

<script type="text/javascript" src="/ssmdemo/js/plugins/forms/uniform.js"></script>
<script type="text/javascript" src="/ssmdemo/js/plugins/forms/jquery.cleditor.js"></script>
<script type="text/javascript" src="/ssmdemo/js/plugins/forms/jquery.validationEngine-en.js"></script>
<script type="text/javascript" src="/ssmdemo/js/plugins/forms/jquery.validationEngine.js"></script>
<script type="text/javascript" src="/ssmdemo/js/plugins/forms/jquery.tagsinput.min.js"></script>
<script type="text/javascript" src="/ssmdemo/js/plugins/forms/autogrowtextarea.js"></script>
<script type="text/javascript" src="/ssmdemo/js/plugins/forms/jquery.maskedinput.min.js"></script>
<script type="text/javascript" src="/ssmdemo/js/plugins/forms/jquery.dualListBox.js"></script>
<script type="text/javascript" src="/ssmdemo/js/plugins/forms/jquery.inputlimiter.min.js"></script>
<script type="text/javascript" src="/ssmdemo/js/plugins/forms/chosen.jquery.min.js"></script>

<script type="text/javascript" src="/ssmdemo/js/plugins/wizard/jquery.form.js"></script>
<script type="text/javascript" src="/ssmdemo/js/plugins/wizard/jquery.validate.min.js"></script>
<script type="text/javascript" src="/ssmdemo/js/plugins/wizard/jquery.form.wizard.js"></script>

<script type="text/javascript" src="/ssmdemo/js/plugins/uploader/plupload.js"></script>
<script type="text/javascript" src="/ssmdemo/js/plugins/uploader/plupload.html5.js"></script>
<script type="text/javascript" src="/ssmdemo/js/plugins/uploader/plupload.html4.js"></script>
<script type="text/javascript" src="/ssmdemo/js/plugins/uploader/jquery.plupload.queue.js"></script>

<script type="text/javascript" src="/ssmdemo/js/plugins/tables/datatable.js"></script>
<script type="text/javascript" src="/ssmdemo/js/plugins/tables/tablesort.min.js"></script>
<script type="text/javascript" src="js/plugins/tables/resizable.min.js"></script>

<script type="text/javascript" src="/ssmdemo/js/plugins/ui/jquery.tipsy.js"></script>
<script type="text/javascript" src="/ssmdemo/js/plugins/ui/jquery.collapsible.min.js"></script>
<script type="text/javascript" src="/ssmdemo/js/plugins/ui/jquery.prettyPhoto.js"></script>
<script type="text/javascript" src="/ssmdemo/js/plugins/ui/jquery.progress.js"></script>
<script type="text/javascript" src="/ssmdemo/js/plugins/ui/jquery.timeentry.min.js"></script>
<script type="text/javascript" src="/ssmdemo/js/plugins/ui/jquery.colorpicker.js"></script>
<script type="text/javascript" src="/ssmdemo/js/plugins/ui/jquery.jgrowl.js"></script>
<script type="text/javascript" src="/ssmdemo/js/plugins/ui/jquery.breadcrumbs.js"></script>
<script type="text/javascript" src="/ssmdemo/js/plugins/ui/jquery.sourcerer.js"></script>

<script type="text/javascript" src="/ssmdemo/js/plugins/calendar.min.js"></script>
<script type="text/javascript" src="/ssmdemo/js/plugins/elfinder.min.js"></script>

<script type="text/javascript" src="/ssmdemo/js/custom.js"></script>

<!-- Shared on MafiaShare.net  --><!-- Shared on MafiaShare.net  --></head>
  

<body>

<!-- Left side content -->
<div id="leftSide">
    <div class="logo"><a href="#"><img src="/ssmdemo/images/logo.png" alt="" /></a></div>
    
    <div class="sidebarSep mt0"></div>
    
    <!-- General balance widget -->
 <!--    <div class="genBalance">
        <a href="#" title="" class="amount">
            <span>账户余额:</span>
            <span class="balanceAmount">$10,900.36</span>
        </a>
        <a href="#" title="" class="amChanges">
            <strong class="sPositive">+0.6%</strong>
        </a>
    </div> -->
    
    <!-- Next update progress widget -->
    <div class="nextUpdate">
        <ul>
            <li>最近一次记录:</li>
            <li>23 hrs 14 min</li>
        </ul>
        <div class="pWrapper"><div class="progressG" title="78%"></div></div>
    </div>
    
    <div class="sidebarSep"></div>
    
    <!-- Left navigation -->
    <ul id="menu" class="nav">
        <li class="dash"><a href="#" title=""><span>1</span></a></li>
        <li class="charts"><a href="#" title=""><span>2</span></a></li>
        <li class="forms"><a href="#" title="" class="exp"><span>3</span><strong>4</strong></a>
      
        </li>
        <li class="ui"><a href="#" title=""><span>4</span></a></li>
        <li class="tables"><a href="#" title="" class="exp"><span>5</span><strong>3</strong></a>
           
        </li>
        <li class="widgets"><a href="#" title="" class="exp"><span>6</span><strong>2</strong></a>
            
        </li>

    </ul>
</div>


<!-- Right side -->
<div id="rightSide">

  <!-- Top fixed navigation -->
    <div class="topNav">
        <div class="wrapper">
            <div class="welcome"><a href="#" title=""><img src="/ssmdemo/images/userPic.png" alt="" /></a><span>你好！${u.username}</span></div>
            <div class="userNav">
                <ul>
                   
                    <li><a href="#" title=""><img src="/ssmdemo/images/icons/topnav/settings.png" alt="" /><span>设置</span></a></li>
                    <li><a href="#" title=""><img src="/ssmdemo/images/icons/topnav/logout.png" alt="" /><span>退出</span></a></li>
                </ul>
            </div>
            <div class="clear"></div>
        </div>
    </div>
    
   

    
    <!-- Title area -->
    <div class="titleArea">
        <div class="wrapper">
            <div class="pageTitle">
                <h5>注释;</h5>
                <span>下面的数据是Tmessage表中查询出的list</span>
            </div>
            <div class="middleNav">
               
                <div class="clear"></div>
            </div>
            <div class="clear"></div>
        </div>
    </div>
    
    <div class="line"></div>
    

    
    <div class="line"></div>
    
    <!-- Main content wrapper -->
    <div class="wrapper">
    
        <!-- Images gallery -->
        <div class="widget">
            
        
        <div class="widget">
        <div class="title"><span class="titleIcon"><input type="checkbox" id="titleCheck" name="titleCheck" /></span><h6>消息记录</h6></div>
        <table cellpadding="0" cellspacing="0" width="100%" class="sTable withCheck mTable" id="checkAll">
            <thead>
                <tr>
                    <td><img src="images/icons/tableArrows.png" alt="" /></td>
                    <td>消息档案编号</td>
                    <td class="sortCol"><div>用户名<span></span></div></td>
                    <td class="sortCol"><div>用户档案编号<span></span></div></td>
                    <td>时间</td>
                    <td>消息内容</td>
                </tr>
            </thead>
            <tfoot>
                <tr>
                    <td colspan="6">
                        
                        <div class="tPagination">
                            <ul>
                                <li class="prev"><a href="#" title=""></a></li>
                                <li><a href="#" title="">1</a></li>
                                <li><a href="#" title="">2</a></li>
                                <li><a href="#" title="">3</a></li>
                                <li><a href="#" title="">4</a></li>
                                <li><a href="#" title="">5</a></li>
                                <li><a href="#" title="">6</a></li>
                                <li>...</li>
                                <li><a href="#" title="">20</a></li>
                                <li class="next"><a href="#" title=""></a></li>
                            </ul>
                        </div>
                    </td>
                </tr>
            </tfoot>
            <tbody>
			<c:forEach items="${list}" var="c" varStatus="st">
                <tr>
                    <td><input type="checkbox" id="titleCheck2" name="checkRow" /></td>
                    <td align="center">${c.messageid}</td>
                    <td>${c.username}</td>
                    <td align="center">${c.userid}</td>
                    <td class="fileInfo">2017.6.3</td>
                    <td class="actBtns">${c.contents}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        </div>
    
    </div>
    
   

</div>

<div class="clear"></div>

</body>
</html>
