<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
    <html xmlns="http://www.w3.org/1999/xhtml">

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>网站模板 — 精选事务</title>
        <link href="css/select2.css" rel="stylesheet" />
        <link rel="stylesheet" href="css/style.css" />
        <script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
        <script type="text/javascript" src="js/search/area.js"></script>
        <script type="text/javascript" src="js/search/location.js"></script>
        <script type="text/javascript" src="js/search/select2.js"></script>
        <script type="text/javascript" src="js/search/select2_locale_zh-CN.js"></script>
        <script type="text/javascript" src="js/jquery.touchSlider.js"></script>
        <script type="text/javascript" src="js/js.js"></script>
        <script type="text/javascript" src="js/ks-switch.pack.js"></script>
    </head>

<body class="bft_bg">
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
</div>
<!-- top内容结束 -->
<div class="center_blank"></div>
<!-- 内容开始 -->
<div class="nr">
    <div class="bft_f">
        <div class="bft_f_1">
            <ul>
                <li>城市</li>
                <li>职业分类</li>
                <li>薪资</li>
                <li>公司介绍</li>
                <li></li>
            </ul>
        </div>
        <c:forEach items="${recruitList}" var="recruit" begin="1" end="45">
        <div class="bft_f_2">
            <ul>
            <li><span>${recruit.city}</span></li>
            <li>${jname}</li>
            <li>${recruit.salary}</li>
            <li>${recruit.companyInformation}</li>
            <li><a href="/application?PID=${recruit.PID}"><img src="images/shenqing.jpg" /></a></li>
            </ul>
        </div>
        </c:forEach>
<%--        <div class="bft_f_2">--%>
<%--            <ul>--%>

<%--                <li><span>三门峡市区</span></li>--%>
<%--                <li>高薪招聘广告业务员</li>--%>
<%--                <li>200元/天</li>--%>
<%--                <li>熟练操作电脑，熟悉网络</li>--%>
<%--                <li><a href="zzy.jsp"><img src="images/shenqing.jpg" /></a></li>--%>
<%--            </ul>--%>
<%--        </div>--%>
<%--        <div class="bft_f_2">--%>
<%--            <ul>--%>
<%--                <li><span>灵宝市区</span></li>--%>
<%--                <li>移动互联网销售代表</li>--%>
<%--                <li>40元/小时</li>--%>
<%--                <li>安装机柜内网络配线架和110配线架</li>--%>
<%--                <li><a href="zzy.jsp"><img src="images/shenqing.jpg" /></a></li>--%>
<%--            </ul>--%>
<%--        </div>--%>
<%--        <div class="bft_f_2">--%>
<%--            <ul>--%>
<%--                <li><span>西站</span></li>--%>
<%--                <li>八达企业管理顾问有限公司招聘业务员</li>--%>
<%--                <li>150元/天</li>--%>
<%--                <li>安装电话和网络模块</li>--%>
<%--                <li><a href="zzy.jsp"><img src="images/shenqing.jpg" /></a></li>--%>
<%--            </ul>--%>
<%--        </div>--%>
<%--        <div class="bft_f_2">--%>
<%--            <ul>--%>
<%--                <li><span>卢氏</span></li>--%>
<%--                <li>弱电工人</li>--%>
<%--                <li>120元/天</li>--%>
<%--                <li>新装修办公楼内桥架管内敷设线路</li>--%>
<%--                <li><a href="zzy.jsp"><img src="images/shenqing.jpg" /></a></li>--%>
<%--            </ul>--%>
<%--        </div>--%>
<%--        <div class="bft_f_2">--%>
<%--            <ul>--%>
<%--                <li><span>渑池</span></li>--%>
<%--                <li>电脑维修工程师电脑技术员</li>--%>
<%--                <li>200元/天</li>--%>
<%--                <li>熟练操作电脑，熟悉网络</li>--%>
<%--                <li><a href="zzy.jsp"><img src="images/shenqing.jpg" /></a></li>--%>
<%--            </ul>--%>
<%--        </div>--%>
<%--        <div class="bft_f_2">--%>
<%--            <ul>--%>
<%--                <li><span>义马</span></li>--%>
<%--                <li>模板专业苹果电脑系统维护</li>--%>
<%--                <li>50/小时</li>--%>
<%--                <li>安装机柜内网络配线架和110配线架</li>--%>
<%--                <li><a href="zzy.jsp"><img src="images/shenqing.jpg" /></a></li>--%>
<%--            </ul>--%>
<%--        </div>--%>
<%--        <div class="bft_f_2">--%>
<%--            <ul>--%>
<%--                <li><span>三门峡市区</span></li>--%>
<%--                <li>高薪招聘广告业务员</li>--%>
<%--                <li>200元/天</li>--%>
<%--                <li>熟练操作电脑，熟悉网络</li>--%>
<%--                <li><a href="zzy.jsp"><img src="images/shenqing.jpg" /></a></li>--%>
<%--            </ul>--%>
<%--        </div>--%>
<%--        <div class="bft_f_2">--%>
<%--            <ul>--%>
<%--                <li><span>灵宝市区</span></li>--%>
<%--                <li>移动互联网销售代表</li>--%>
<%--                <li>40元/小时</li>--%>
<%--                <li>安装机柜内网络配线架和110配线架</li>--%>
<%--                <li><a href="zzy.jsp"><img src="images/shenqing.jpg" /></a></li>--%>
<%--            </ul>--%>
<%--        </div>--%>
<%--        <div class="bft_f_2">--%>
<%--            <ul>--%>
<%--                <li><span>西站</span></li>--%>
<%--                <li>八达企业管理顾问有限公司招聘业务员</li>--%>
<%--                <li>150元/天</li>--%>
<%--                <li>安装电话和网络模块</li>--%>
<%--                <li><a href="zzy.jsp"><img src="images/shenqing.jpg" /></a></li>--%>
<%--            </ul>--%>
<%--        </div>--%>
<%--        <div class="bft_f_2">--%>
<%--            <ul>--%>
<%--                <li><span>卢氏</span></li>--%>
<%--                <li>弱电工人</li>--%>
<%--                <li>120元/天</li>--%>
<%--                <li>新装修办公楼内桥架管内敷设线路</li>--%>
<%--                <li><a href="zzy.jsp"><img src="images/shenqing.jpg" /></a></li>--%>
<%--            </ul>--%>
<%--        </div>--%>
<%--        <div class="bft_f_2">--%>
<%--            <ul>--%>
<%--                <li><span>渑池</span></li>--%>
<%--                <li>电脑维修工程师电脑技术员</li>--%>
<%--                <li>200元/天</li>--%>
<%--                <li>熟练操作电脑，熟悉网络</li>--%>
<%--                <li><a href="zzy.jsp"><img src="images/shenqing.jpg" /></a></li>--%>
<%--            </ul>--%>
<%--        </div>--%>
<%--        <div class="bft_f_2">--%>
<%--            <ul>--%>
<%--                <li><span>义马</span></li>--%>
<%--                <li>模板专业苹果电脑系统维护</li>--%>
<%--                <li>50/小时</li>--%>
<%--                <li>安装机柜内网络配线架和110配线架</li>--%>
<%--                <li><a href="zzy.jsp"><img src="images/shenqing.jpg" /></a></li>--%>
<%--            </ul>--%>
<%--        </div>--%>
<%--        <div class="bft_f_2">--%>
<%--            <ul>--%>
<%--                <li><span>三门峡市区</span></li>--%>
<%--                <li>高薪招聘广告业务员</li>--%>
<%--                <li>200元/天</li>--%>
<%--                <li>熟练操作电脑，熟悉网络</li>--%>
<%--                <li><a href="zzy.jsp"><img src="images/shenqing.jpg" /></a></li>--%>
<%--            </ul>--%>
<%--        </div>--%>
<%--        <div class="bft_f_2">--%>
<%--            <ul>--%>
<%--                <li><span>灵宝市区</span></li>--%>
<%--                <li>移动互联网销售代表</li>--%>
<%--                <li>40元/小时</li>--%>
<%--                <li>安装机柜内网络配线架和110配线架</li>--%>
<%--                <li><a href="zzy.jsp"><img src="images/shenqing.jpg" /></a></li>--%>
<%--            </ul>--%>
<%--        </div>--%>
<%--        <div class="bft_f_2">--%>
<%--            <ul>--%>
<%--                <li><span>西站</span></li>--%>
<%--                <li>八达企业管理顾问有限公司招聘业务员</li>--%>
<%--                <li>150元/天</li>--%>
<%--                <li>安装电话和网络模块</li>--%>
<%--                <li><a href="zzy.jsp"><img src="images/shenqing.jpg" /></a></li>--%>
<%--            </ul>--%>
<%--        </div>--%>
<%--        <div class="bft_f_2">--%>
<%--            <ul>--%>
<%--                <li><span>卢氏</span></li>--%>
<%--                <li>弱电工人</li>--%>
<%--                <li>120元/天</li>--%>
<%--                <li>新装修办公楼内桥架管内敷设线路</li>--%>
<%--                <li><a href="zzy.jsp"><img src="images/shenqing.jpg" /></a></li>--%>
<%--            </ul>--%>
<%--        </div>--%>
<%--        <div class="bft_f_2">--%>
<%--            <ul>--%>
<%--                <li><span>渑池</span></li>--%>
<%--                <li>电脑维修工程师电脑技术员</li>--%>
<%--                <li>200元/天</li>--%>
<%--                <li>熟练操作电脑，熟悉网络</li>--%>
<%--                <li><a href="zzy.jsp"><img src="images/shenqing.jpg" /></a></li>--%>
<%--            </ul>--%>
<%--        </div>--%>
<%--        <div class="bft_f_2">--%>
<%--            <ul>--%>
<%--                <li><span>义马</span></li>--%>
<%--                <li>模板专业苹果电脑系统维护</li>--%>
<%--                <li>50/小时</li>--%>
<%--                <li>安装机柜内网络配线架和110配线架</li>--%>
<%--                <li><a href="zzy.jsp"><img src="images/shenqing.jpg" /></a></li>--%>
<%--            </ul>--%>
<%--        </div>--%>
    </div>
    <!--   -->
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
</div>
<!-- 内容结束 -->
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
</body>

</html>