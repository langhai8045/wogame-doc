<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>demo</title>
</head>
<body>
<div class="row wrapper border-bottom white-bg page-heading">
    <div class="col-lg-10">
        <h2>接口管理</h2>
        <ol class="breadcrumb">
            <li>
                Home
            </li>
            <li>
                Forms
            </li>
            <li class="active">
                <strong>Basic Form</strong>
            </li>
        </ol>
    </div>
    <div class="col-lg-2">
    </div>
</div>
<div class="wrapper wrapper-content animated fadeInRight">
    <div class="col-lg-7">
        <div class="ibox float-e-margins">
            <div class="ibox-title">
                <h5>Basic form <small>Simple login form example</small></h5>
            </div>
            <div class="ibox-content">
                <div class="row">
                    <div class="col-sm-6 b-r">
                        <h3 class="m-t-none m-b">Sign in</h3>
                        <p>Sign in today for more expirience.</p>
                        <form role="form">
                            <div class="form-group">
                                <label>Email</label>
                                <input type="email" placeholder="Enter email" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>Password</label>
                                <input type="password" placeholder="Password" class="form-control">
                            </div>
                            <div>
                                <button class="btn btn-sm btn-primary pull-right m-t-n-xs" type="submit"><strong>Log in</strong>
                                </button>
                                <label>
                                    <input type="checkbox" class="i-checks"> Remember me </label>
                            </div>
                        </form>
                    </div>
                    <div class="col-sm-6">
                        <h4>Not a member?</h4>
                        <p>You can create an account:</p>
                        <p class="text-center">
                            <a href=""><i class="fa fa-sign-in big-icon"></i></a>
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
