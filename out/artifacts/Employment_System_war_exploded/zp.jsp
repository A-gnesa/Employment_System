<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="en">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
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
<!-- 公告和介绍开始  -->
<!-- 公告和介绍结束  -->
<!-- 内容开始 -->
<div class="nr">
    <div class="bzz">
        <div class="center_gga">
            <div class="center_gga_1">&nbsp;管&nbsp;&nbsp;理</div>
        </div>
        <div class="bzz_a">
            <div class="bzz_left">
                <div class="bzz_b">
                    <p><span>招聘中心</span></p>
                    <p>★ 在本页面中进行发布招聘信息</p>
                    <p>★ 填写相应的招聘需求</p>
                </div>
                <form action="/addRecruit">
                <div class="bzz_d">
                    <p><span>填写信息</span></p>
                    <p>
                        <label>
                        公司名称：<input type="text" class="border" name = "companyname"/>
                        </label><br/>
                        <label>
                            所在城市：<input type="text" class="border" name = "city"/>
                        </label><br/>
                        应聘要求：<br/>
                        <label>
                            <textarea rows="5" cols="21" name = "requirement" class="border textarea"></textarea><br/>
                        </label>
                        <label>
                            职业薪资：<input type="text" class="border" name="salary"/>
                        </label><br/>
                        <label>
                            工作类型：<select class="border" name="job">
                                <option selected="selected">--请选择--</option>
                                <option>Java</option>
                                <option>C++</option>
                                <option>Python</option>
                                <option>Web</option>
                            </select></label>
                        </label><br/>
                        公司信息：<br/>
                        <label>
                            <textarea rows="5" cols="21" name ="companyInformation" class="border textarea"></textarea><br/>
                        </label>
                        <label>
                            <input type="submit" class="border zp_bottom" value="提交"
                                   onclick="alert('提交成功')"/>
                        </label>
                        <label>
                            <input type="reset" class="border zp_bottom" value="重置"
                                    onclick="alert('重置成功')"/>
                        </label>
                    </p>
                </div>
                </form>
            </div>
            <div class="bzz_left"><img src="images/bzz_1.jpg" alt=""/></div>
        </div>
    </div>
    <!-- 友情链接开始 -->
    <div class="blank"></div>
    <div class="link">
        <div class="link_a">&nbsp;&nbsp;&nbsp;友情链接</div>
        <div class="link_b">
            <ul>
                <li><a href=""><img src="images/link_pic.jpg" alt=""/></a></li>
                <li><a href=""><img src="images/link_pic2.jpg" alt=""/></a></li>
                <li><a href=""><img src="images/link_pic3.jpg" alt=""/></a></li>
                <li><a href=""><img src="images/link_pic4.jpg" alt=""/></a></li>
                <li><a href=""><img src="images/link_pic.jpg" alt=""/></a></li>
                <li><a href=""><img src="images/link_pic2.jpg" alt=""/></a></li>
                <li><a href=""><img src="images/link_pic3.jpg" alt=""/></a></li>
            </ul>
        </div>
    </div>
    <!-- 友情链接结束 -->
    <!-- 底部内容开始 -->
    <div class="blank"></div>
    <div class="blank"></div>
    <div class="button">
        <a href="">关于我们</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="">商务合作</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="">网站声明</a>&nbsp;&nbsp;|&nbsp;&nbsp;
        <a href="">联系方式</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="">服务中心</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="">加入我们</a>
    </div>
    <!-- 底部内容结束 -->
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
<!-- alpha div end -->
</body>

</html>