<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title><decorator:title default="Spring Travel" /></title>
<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.css" />" type="text/css" media="screen, projection" />
<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap-responsive.css" />" type="text/css" media="screen, projection" />

<decorator:head />



<!-- Le styles -->

<style type="text/css">
body {
	padding-top: 20px;
	padding-bottom: 60px;
}

.logo {
	height: 65px;
}

/* Custom container */
.container {
	margin: 0 auto;
	max-width: 1000px;
}

.container>hr {
	margin: 60px 0;
}

/* Main marketing message and sign up button */
.jumbotron {
	margin: 80px 0;
	text-align: center;
}

.jumbotron h1 {
	font-size: 100px;
	line-height: 1;
}

.jumbotron .lead {
	font-size: 24px;
	line-height: 1.25;
}

.jumbotron .btn {
	font-size: 21px;
	padding: 14px 24px;
}

/* Supporting marketing content */
.marketing {
	margin: 60px 0;
}

.marketing p+h4 {
	margin-top: 28px;
}

/* Customize the navbar links to be fill the entire space of the .navbar */
.navbar .navbar-inner {
	padding: 0;
}

.navbar .nav {
	margin: 0;
}

.navbar .nav li {
	display: table-cell;
	width: 1%;
	float: none;
}

.navbar .nav li a {
	font-weight: bold;
	text-align: center;
	border-left: 1px solid rgba(255, 255, 255, .75);
	border-right: 1px solid rgba(0, 0, 0, .1);
}

.navbar .nav li:first-child a {
	border-left: 0;
	border-radius: 3px 0 0 3px;
}

.navbar .nav li:last-child a {
	border-right: 0;
	border-radius: 0 3px 3px 0;
}
</style>


<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
</head>

<body>

	<div class="container">

		<div class="row">
			<div class="span4 logo">
				<img alt="" src="<c:url value="/resources/img/Home-green-48.png" />" />
			</div>
		</div>


		<div class="navbar">
			<div class="navbar-inner">
				<div class="container">
					<ul class="nav">
						<li class="active"><a href="#">Home</a></li>
						<li><a href="#">Wohnen</a></li>
						<li><a href="#">Gewerbe</a></li>
						<li><a href="#">About</a></li>
						<li><a href="#">Kontakt</a></li>
					</ul>
					<ul class="nav pull-right">
						<li><a href="#">Sign In</a></li>
					</ul>
					<ul class="nav pull-right">
						<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"> Social <b class="caret"></b>
						</a>
							<ul class="dropdown-menu">
								<li class="socials">
									<!-- Place this tag where you want the +1 button to render --> <g:plusone annotation="inline" width="150"></g:plusone>
								</li>
								<li class="socials"><div class="fb-like" data-send="false" data-width="150" data-show-faces="true"></div></li>
								<li class="socials"><a href="https://twitter.com/share" class="twitter-share-button">Tweet</a> <script>
									!function(d, s, id) {
										var js, fjs = d.getElementsByTagName(s)[0];
										if (!d.getElementById(id)) {
											js = d.createElement(s);
											js.id = id;
											js.src = "//platform.twitter.com/widgets.js";
											fjs.parentNode
													.insertBefore(js, fjs);
										}
									}(document, "script", "twitter-wjs");
								</script></li>
							</ul></li>
					</ul>
				</div>
			</div>
		</div>
		<!-- /.navbar -->

		<div class="row">
			<div class="span4"></div>
		</div>


		<div class="footer">
			<p>&copy; Company 2012</p>
		</div>
	</div>
	<!-- /container -->


	<script type="text/javascript" src="<c:url value="/resources/js/boostrap.js" />"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/boostrap-responsive.js" />"></script>
</body>
</html>