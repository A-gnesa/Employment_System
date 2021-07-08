<%--
  Created by IntelliJ IDEA.
  User: hanhan
  Date: 2021/7/7
  Time: 10:56 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
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
<head>
    <title>Title</title>
</head>
<body class="bs_bg">
<!-- top内容开始 -->
<div class="top">


    <div class="top_bg">
        <div class="top_bga">
            <div class="top_bga_1"></div>
            <div class="top_bga_2">
                <ul>
                    <a href="/personalCenter">
                        <li>个人中心</li>
                    </a>
                    <a href="/addRecruitPage">
                        <li>发布中心</li>
                    </a>
                    <a href="/applicationCenter">
                        <li>应聘中心</li>
                    </a>
                    <a href="/returnIndex">
                        <li>首页</li>
                    </a>

                    </a>
                </ul>
            </div>
        </div>
    </div>
</div>
<!-- top内容结束 -->
<!-- 搜索内容开始 -->
<div class="blank"></div>
<form action="/search" method="post">
<div class="search">
    <div class="search_blank"></div>
    <div class="search_c">
        <label>
            <input class="s_t" style="width:690px; height:17px; padding:8px; font-size:14px; color:#b8b8b8; letter-spacing:2px;margin-top: 10px" onblur="if(this.value==''){this.value='请输入职位名、公司名等关键词';this.style.color='#aaa'}" onfocus="if(this.value=='请输入职位名 公司名等关键字'){this.value='';this.style.color='#666'}" value="请输入职位名 公司名等关键字"
                   name="keyword" >
        </label>
    </div>

    <input class="search_btn" value="搜索" type="submit"/>

</div>
</form>
<!-- 搜索内容结束 -->
<!-- 公告和介绍开始  -->
<div class="center_a" style="width: 1400px !important;">
    <div class="center_blank"></div>
    <div class="center_b" style="width: 1250px !important;">
        <div class="itab" style="width: 600px !important; height: 300px !important;">
            <div class="zhuce">
                <div class="zhuce_name">

                    <div class="zhuce_balnk2"></div>

                </div>
            </div>

        </div>
        <div class="center_gg" style="width: 620px !important;">
            <div class="center_gga">
                <div class="center_gga_1">精选职位</div>
                <div class="more"><a href="/findAll">更多&gt;&gt;</a></div>
            </div>
            <div class="center_ggb">
                <ul>
                    <c:forEach items="${recruitList}" var="recruit" begin="1" end="8">
                        <li><span>${recruit.time}</span>${recruit.companyInformation}
                                    </li>
                    </c:forEach>
                </ul>
            </div>
        </div>

    </div>

</div>
<!-- 公告和介绍结束  -->

<!-- 帮众开始 -->
<div class="blank"></div>
<div class="bz">
    <div class="center_gga" style="float:left">
        <div class="center_gga_1">招聘分类</div>
        <div class="center_ggc">
            <a href="/assort?jname=c">c++/c</a>
            <a href="/assort?jname=java">java</a>
            <a href="/assort?jname=python">python</a>
            <a href="/assort?jname=web">web</a>

        </div>
    </div>
    <div class="bz_a">
        <div class="bz_a_1">c++/c</div>
        <div class="bz_a_2">
            <ul>
                <li><a href="/application?PID=1">思维造物</a></li>
                <li><a href="/application?PID=3">富途</a></li>
                <li><a href="/application?PID=5">字节跳动</a></li>
            </ul>
        </div>
    </div>
    <div class="bz_a">
        <div class="bz_a_1">java</div>
        <div class="bz_a_2">
            <ul>
                <li><a href="/application?PID=7">美团</a></li>
                <li><a href="/application?PID=9">百融云创</a></li>
                <li><a href="/application?PID=10">星辰互联</a></li>
            </ul>
        </div>
    </div>
    <div class="bz_a">
        <div class="bz_a_1">python</div>
        <div class="bz_a_2">
            <ul>
                <li><a href="/application?PID=12">快手</a></li>
                <li><a href="/application?PID=13">金山办公软件</a></li>
                <li><a href="/application?PID=14">京东物流</a></li>
                <li><a href="/application?PID=15">智创聚合</a></li>
            </ul>
        </div>
    </div>
    <div class="bz_a">
        <div class="bz_a_1">web</div>
        <div class="bz_a_2">
            <ul>
                <li><a href="/application?PID=16">泛微</a></li>
                <li><a href="/application?PID=17">数字100</a></li>
                <li><a href="/application?PID=21">海看股份</a></li>
                <li><a href="/application?PID=22">酷宅</a></li>
            </ul>
        </div>
    </div>

</div>
<!-- 帮众结束 -->
<!-- 帮交开始 -->

<!-- 帮交结束 -->

<!-- 底部内容开始 -->
<div class="blank"></div>
<div class="blank"></div>
<div class="button">
    <a href="">关于我们</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="">商务合作</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="">网站声明</a>&nbsp;&nbsp;|&nbsp;&nbsp;
    <a href="">联系方式</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="">服务中心</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="">加入我们</a>
</div>
<!-- 底部内容结束 -->

<!-- 内容结束 -->
<!-- alpha div -->
<div id="maskLayer" style="display:none;">
    <iframe id="maskLayer_iframe" frameborder="0" scrolling="no" style="filter:alpha(opacity=50)"></iframe>
    <div id="alphadiv" style="filter:alpha(opacity=50);-moz-opacity:0.5;opacity:0.5"></div>
    <div id="drag">
        <h3 id="drag_h"></h3>
        <div id="drag_con"></div>
        <!-- drag_con end -->
    </div>
</div>
</body>
</html>
