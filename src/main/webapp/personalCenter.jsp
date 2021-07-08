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
</head>

<body class="bz_bg">
<div class="top_bg">
    <div class="top_bga">
        <div class="top_bga_1"></div>
        <div class="top_bga_2">
            <ul>
                <a href="/personalCenter">
                    <li>个人中心</li>
                </a>
                <a href="zp.jsp">
                    <li>发布中心</li>
                </a>
                <a href="">
                    <li>应聘中心</li>
                </a>
                <a href="/returnIndex">
                    <li>首页</li>
                </a>

            </ul>
        </div>
    </div>
</div>
<div class="bzz">
    <div class="center_gga">
        <div class="center_gga_1">个人中心</div>
    </div>
</div>
<form action="/setPersonalInformation" method="post">
<div class="bzz_c" style="height: 1115px !important; width: 1430px !important;">

    <p class="title1">修改信息</p>
    <p class="bzz_c_p ">用户名：</p>
    <label>
        <input type="text" class="UID bzz_text"  value="${sessionScope.get("user").accountNumber}"/>
    </label><br/>
    <p class="bzz_c_p">姓名：</p>
    <label>
        <input type="text" class="user_name bzz_text" name = "name" value="${sessionScope.get("PersonalInformation").name}"/>
    </label><br/>
    <p class="bzz_c_p">性别：</p>
    <label>
        <input type="text" class="user_sex bzz_text"  name = "sex" value="${sessionScope.get("PersonalInformation").sex}"/>
    </label>
    <br/>
    <p class="bzz_c_p">年龄：</p>
    <label>
        <input type="text" class="user_age bzz_text" name = "age"  value="${sessionScope.get("PersonalInformation").age}"/>
    </label><br/>
    <p class="bzz_c_p" >学校：</p>
    <label>
        <input type="text" class="college bzz_text" name = "school" value="${sessionScope.get("PersonalInformation").school}" />
    </label><br/>
    <p class="bzz_c_p">联系方式：</p>
    <label>
        <input type="text" class="contact_information bzz_text" name = "communication" value="${sessionScope.get("PersonalInformation").communication}"/>
    </label><br/>
    <div class="bzz_d">

        <input type="submit"  class="item" value="" style="background: url(53/images/tijiao.jpg) ;width:80px;height:26px;"/>
        &nbsp;&nbsp;&nbsp;<input type="reset"  value="" class="item" style="background: url(53/images/chongzhi.jpg) ;width:80px;height:26px;"/>
    </div>
</div>
</form>

</body>
</html>