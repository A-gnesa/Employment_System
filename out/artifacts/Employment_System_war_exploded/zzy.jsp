
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8 ">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/select2.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/search/area.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/search/location.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/search/select2.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/search/select2_locale_zh-CN.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.touchSlider.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/js.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/ks-switch.pack.js"></script>

<body class="bft_bg">
<!-- top内容开始 -->
<div class="top">
    <div class="top_bg">
        <div class="top_bga">
            <div class="top_bga_1"></div>
            <div class="top_bga_2">
                <ul>
                    <a href="bz.html">
                        <li>个人中心</li>
                    </a>
                    <a href="zp.html">
                        <li>发布中心</li>
                    </a>
                    <a href="/returnIndex">
                        <li>首页</li>
                    </a>
                    <a href="">
                        <li></li>
                    </a>
                    </a>
                </ul>
            </div>
        </div>
    </div>
</div>
<!-- top内容结束 -->
<div class="center_blank"></div>
<!-- 内容开始 -->
<div class="nr">
    <div class="zzy_nr">
        <div class="zzy">${recruit.companyname}高薪诚聘</div>
        <div class="zzy_1">
            <ul>
                <li><span>☆</span>&nbsp;今天更新</li>
                <li><span>¤</span>&nbsp;49人浏览</li>
                <li><span>♥</span>&nbsp;4人投递简历</li>
            </ul>
        </div>
        <div class="zzy_2">
            <table width="600" border="1" cellspacing="1" cellpadding="1">
                <tr>
                    <td>城市：<span>${recruit.city}</span></td>
                    <td>工作需求：<span>${recruit.requirement}</span></td>
                </tr>
                <tr>
                    <td>月薪：${recruit.salary}</td>
                    <td>招聘时间：${recruit.time}</td>
                </tr>
                <tr>
                    <td>公司名称：${recruit.companyname}</td>
                    <td>公司情况：${recruit.companyInformation}</td>
                </tr>
            </table>
        </div>
        <div class="zzy_4">
            <a> <button onclick="alert('申请成功')" style="width:180px; height:50px; line-height:50px; text-align:center; color:#fff; background:#fd8000; float:left; font-size:24px; margin-left:50px;font-family:"微软雅黑"; letter-spacing:4px;">申请职位</button></a>

        </div>

    </div>
    <div class="zzy_nra">
        <div class="zzy_8"><a href="#"><img src="images/pic.jpg" /></a></div>

    </div>
    <!-- 内容结束 -->
    <!-- 友情链接开始 -->
    <div class="blank"></div>
    <div class="link">
        <div class="link_a">友情链接</div>
        <div class="link_b">
            <ul>
                <li><a href=""><img src="images/link_pic.jpg" /></a></li>
                <li><a href=""><img src="images/link_pic2.jpg" /></a></li>
                <li><a href=""><img src="images/link_pic3.jpg" /></a></li>
                <li><a href=""><img src="images/link_pic4.jpg" /></a></li>
                <li><a href=""><img src="images/link_pic.jpg" /></a></li>
                <li><a href=""><img src="images/link_pic2.jpg" /></a></li>
                <li><a href=""><img src="images/link_pic3.jpg" /></a></li>
            </ul>
        </div>
    </div>
    <!-- 友情链接结束 -->
    <!-- 底部内容开始 -->
    <div class="blank"></div>
    <div class="blank"></div>
    <!-- 底部内容结束 -->
</div>
<div class="submenu"></div>
<!-- 搜索内容结束 -->
</div>
<!-- 帮众结束 -->
<!-- alpha div -->
<div id="maskLayer" style="display:none;">
    <iframe id="maskLayer_iframe" frameBorder=0 scrolling=no style="filter:alpha(opacity=50)"></iframe>
    <div id="alphadiv" style="filter:alpha(opacity=50);-moz-opacity:0.5;opacity:0.5"></div>
    <div id="drag">
        <h3 id="drag_h"></h3>
        <div id="drag_con"></div>
        <!-- drag_con end -->
    </div>
</div>
<!-- maskLayer end -->
</div>
<!-- alpha div end -->
<script type="jscript" src="js/buttonJS.js"></script>
</body>


</html>