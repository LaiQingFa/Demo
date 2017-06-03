<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0; user-scalable=0;" />
<title>框架测试登录页</title>
<link href="/ssmdemo/css/main.css" rel="stylesheet" type="text/css" />

<script type="text/javascript" src="/ssmdemo/js/jquery.min.js"></script>

<script type="text/javascript" src="/ssmdemo/js/plugins/spinner/ui.spinner.js"></script>
<script type="text/javascript" src="/ssmdemo/js/plugins/spinner/jquery.mousewheel.js"></script>

<script type="text/javascript" src="/ssmdemo/js/jquery-ui.min.js"></script>

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

<script type="text/javascript" src="js/plugins/uploader/plupload.js"></script>
<script type="text/javascript" src="js/plugins/uploader/plupload.html5.js"></script>
<script type="text/javascript" src="js/plugins/uploader/plupload.html4.js"></script>
<script type="text/javascript" src="js/plugins/uploader/jquery.plupload.queue.js"></script>

<script type="text/javascript" src="/ssmdemo/js/plugins/tables/datatable.js"></script>
<script type="text/javascript" src="/ssmdemo/js/plugins/tables/tablesort.min.js"></script>
<script type="text/javascript" src="/ssmdemo/js/plugins/tables/resizable.min.js"></script>

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
  

<body class="nobg loginPage">

<!-- Top fixed navigation -->
<div class="topNav">
    <div class="wrapper">
        <div class="userNav">
            <ul>
                <li><a  title=""><img src="/ssmdemo/images/icons/topnav/mainWebsite.png" alt="" /><span>Main website</span></a></li>
                <li><a  title=""><img src="/ssmdemo/images/icons/topnav/profile.png" alt="" /><span>Contact admin</span></a></li>
                <li><a title=""><img src="/ssmdemo/images/icons/topnav/messages.png" alt="" /><span>Support</span></a></li>
                <li><a  title=""><img src="/ssmdemo/images/icons/topnav/settings.png" alt="" /><span>Settings</span></a></li>
            </ul>
        </div>
        <div class="clear"></div>
    </div>
</div>


<!-- Main content wrapper -->
<div class="loginWrapper">
    <div class="loginLogo"><img src="/ssmdemo/images/loginLogo.png" alt="" /></div>
    <div class="widget">
        <div class="title"><img src="/ssmdemo/images/icons/dark/files.png" alt="" class="titleIcon" /><h6>登录ssmdemo框架测试</h6></div>
        <form action="loginCheckController/loginCheck.do" id="validate" method ="Post" class="form">
            <fieldset>
                <div class="formRow">
                    <label for="login">账号:</label>
                    <div class="loginInput"><input type="text"  name="username" class="validate[required]" id="login" /></div>
                    <div class="clear"></div>
                </div>
                
                <div class="formRow">
                    <label for="pass">密码:</label>
                    <div class="loginInput"><input type="password" name="password" class="validate[required]" id="pass" /></div>
                    <div class="clear"></div>
                </div>
                
                <div class="loginControl">
                    <div class="rememberMe"><input type="checkbox" id="remMe" name="remMe" /><label for="remMe">记住密码</label></div>
                    <input type="submit" value="登录" class="dredB logMeIn" />
                    <div class="clear"></div>
                </div>
            </fieldset>
        </form>
    </div>
</div>    




</body>
</html>
