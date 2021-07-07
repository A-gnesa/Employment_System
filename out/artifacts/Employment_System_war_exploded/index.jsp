<%--
  Created by IntelliJ IDEA.
  User: hanhan
  Date: 2021/7/7
  Time: 10:56 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
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
          <a href="bz.html">
            <li>个人中心</li>
          </a>
          <a href="zp.html">
            <li>发布中心</li>
          </a>
          <a href="bj.html">
            <li>分类</li>
          </a>
          <a href="index.html">
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
<div class="search">
  <div class="search_blank"></div>
  <div class="search_c">
    <input class="s_t" style="width:690px; height:17px; padding:8px; font-size:14px; color:#b8b8b8; letter-spacing:2px;margin-top: 10px" onblur="if(this.value==''){this.value='请输入职位名、公司名等关键词';this.style.color='#aaa'}" onfocus="if(this.value=='请输入职位名 公司名等关键字'){this.value='';this.style.color='#666'}" value="请输入职位名 公司名等关键字" name="keyword" >
  </div>
  <div class="search_btn"><a href="bft_more.jsp"><img src="images/search_btn.jpg"></a></div>
</div>
<!-- 搜索内容结束 -->
<!-- 公告和介绍开始  -->
<div class="center_a" style="width: 1400px !important;">
  <div class="center_blank"></div>
  <div class="center_b" style="width: 1250px !important;">
    <div class="itab" style="width: 600px !important; height: 300px !important;">
          <div class="zhuce">
            <div class="zhuce_name">
              <div class="zhuce_name">
                <div class="zhuce_balnk"></div>
                <form action="/userLogin" method="post">
                <div class="zhuce_nam">

                  <label style="
                        font-style: normal;
                        color: black;
                    ">用户名:</label>
                  <input type="text" name="account">
                </div>
                <div class="zhuce_balnk1"></div>
                <div class="zhuce_nam" style="color: black;">
                  <label>密码:</label>
                  <input type="password" name="password">
                </div>
                <div class="zhuce_balnk2"></div>
                <input class="zhuce_nam" style="color: black;" value="登陆/注册" type="submit">&nbsp;&nbsp;&nbsp;&nbsp;</input></br>
                </form>
              </div>

              <div class="zhuce_balnk2"></div>

            </div>
          </div>

    </div>
    <div class="center_gg" style="width: 620px !important;">
      <div class="center_gga">
        <div class="center_gga_1">精选事务公告</div>
        <div class="more"><a href="bft_more.jsp">更多&gt;&gt;</a></div>
      </div>
      <div class="center_ggb">
        <ul>
          <li><a href="zzy.jsp"><span>11-6 08：24</span>职前台接待及前台接待及活活动支活动活活动支活动</a></li>
          <li><a href="zzy.jsp"><span>11-6 08：24</span>聘模板营业员前营业员前台接待及活动宝山万达</a></li>
          <li><a href="zzy.jsp"><span>11-6 08：24</span>业余网拍前台接待及活模拍前台接待及活模特幕结200-600</a></li>
          <li><a href="zzy.jsp"><span>11-6 08：24</span>薪500急聘打字员,前台接待及资资日结前台接待</a></li>
          <li><a href="zzy.jsp"><span>11-6 08：24</span>时尚精品服前台接接待及待及动饰模特待及待饰模特</a></li>
          <li><a href="zzy.jsp"><span>11-6 08：24</span>直前台接待及待及待及动饰模特活兼动招模板模特</a></li>
          <li><a href="zzy.jsp"><span>11-6 08：24</span>规淘宝网拍模正规淘宝特杂志模特直招待及待及动饰模特</a></li>
          <li><a href="zzy.jsp"><span>11-6 08：24</span>职前待及待及动饰模特待及饰模接待及前台接待及活活动支活动</a></li>
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
    <div class="center_ggc"><a href="bft_more.jsp">c++/c</a><a href="bft_more.jsp">java</a><a href="bft_more.jsp">python</a><a href="bft_more.jsp"><a href="bft_more.jsp">web</a><a href="bft_more.jsp">其他</a>
      web</a><a href="bft_more.jsp"></a>
    </div>
  </div>
  <div class="bz_a">
    <div class="bz_a_1">c++/c</div>
    <div class="bz_a_2">
      <ul>
        <li><a href="zzy.jsp">地板、面砖的铺设 </a></li>
        <li><a href="zzy.jsp">粉刷工</a></li>
        <li><a href="zzy.jsp">油漆工</a></li>
      </ul>
    </div>
  </div>
  <div class="bz_a">
    <div class="bz_a_1">java</div>
    <div class="bz_a_2">
      <ul>
        <li><a href="zzy.jsp">地暖的铺设</a></li>
        <li><a href="zzy.jsp">给、排水路的设计安装</a></li>
        <li><a href="zzy.jsp">城市供暖入户安装</a></li>
      </ul>
    </div>
  </div>
  <div class="bz_a">
    <div class="bz_a_1">python</div>
    <div class="bz_a_2">
      <ul>
        <li><a href="zzy.jsp">线路设计安装</a></li>
        <li><a href="zzy.jsp">开关、插座的安装</a></li>
        <li><a href="zzy.jsp">灯具的安装</a></li>
        <li><a href="zzy.jsp">电器的运送、安装 </a></li>
      </ul>
    </div>
  </div>
  <div class="bz_a">
    <div class="bz_a_1">web</div>
    <div class="bz_a_2">
      <ul>
        <li><a href="zzy.jsp">装修设计施工</a></li>
        <li><a href="zzy.jsp">附属装饰安装</a></li>
        <li><a href="zzy.jsp">各种门类安装</a></li>
        <li><a href="zzy.jsp">家具的运送、安装</a></li>
      </ul>
    </div>
  </div>
  <div class="bz_a" style="border:none">
    <div class="bz_a_1">其他</div>
    <div class="bz_a_2">
      <ul>
        <li><a href="zzy.jsp">家居室内清洁</a></li>
        <li><a href="zzy.jsp">零工</a></li>
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
