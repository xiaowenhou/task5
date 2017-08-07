<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<header>
    <div class="top container">
        <p class="hidden-xs">客服热线：010-594-78634</p>
        <img src="../view/images/12321.gif">
    </div>

    <div role="navigation" class="nav1 navbar navbar-default">
        <div class="container">
            <div class="header-logo">
                <div class="logo-middle"><img src="../view/images/logo.png"></div>
            </div>
            <div class="navbar-header marginTop">
                <button data-target="#example-navbar-collapse" data-toggle="collapse" class="navbar-toggle" type="button">
                    <span class="sr-only">切换导航</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
            </div>

            <div id="example-navbar-collapse" class=" collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <a href="${pageContext.request.contextPath}/home"><li>首 页</li></a>
                    <a href="${pageContext.request.contextPath}/u/profession"><li class="border">职 业</li></a>
                    <a href=""><li>推 荐</li></a>
                    <a href=""><li>关 于</li></a>
                </ul>
            </div>
        </div>
    </div>
</header>