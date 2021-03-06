<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8">
  <title>UI Design</title>
  <!-- Description, Keywords and Author -->
  <meta name="description" content="Your description">
  <meta name="keywords" content="Your,Keywords">
  <meta name="author" content="ResponsiveWebInc">

  <meta name="viewport" content="width=device-width, initial-scale=1.0">

  <!-- Styles -->
  <!-- Bootstrap CSS -->
  <link href="css/bootstrap.min.css" rel="stylesheet">
  <!-- Font awesome CSS -->
  <link href="css/font-awesome.min.css" rel="stylesheet">


  <!-- Main CSS -->
  <link href="css/style-105.css" rel="stylesheet">

  <!-- Favicon -->
  <link rel="shortcut icon" href="ui-105.html#">
</head>
<body>


<!-- UI # -->

<div class="ui-105">
  <!-- Combined Form Content -->
  <div class="ui-105-content">
    <ul class="nav nav-tabs nav-justified">
      <li class="active link-one"><a href="ui-105.html#login-block" data-toggle="tab"><i class="fa fa-sign-in"></i>Sign In</a></li>
      <li class="link-two"><a href="ui-105.html#register-block" data-toggle="tab"><i class="fa fa-pencil"></i>Sign Up</a></li>
      <li class="link-three"><a href="ui-105.html#contact-block" data-toggle="tab"><i class="fa fa-envelope"></i>Contact</a></li>
    </ul>
    <div class="tab-content">
      <div class="tab-pane active fade in" id="login-block">
        <!-- Login Block Form -->
        <div class="login-block-form">
          <!-- Heading -->
          <h4>Sign In to your Account</h4>
          <!-- Border -->
          <div class="bor bg-green"></div>
          <!-- Form -->
          <form action="/jobs/login" method="post" class="form" role="form">
            <!-- Form Group -->
            <div class="form-group">
              <!-- Label -->
              <label class="control-label">Login</label>
              <!-- Input -->
              <input class="form-control" name="login" type="text" placeholder="Enter Login"/>
            </div>
            <div class="form-group">
              <label class="control-label">Password</label>
              <input class="form-control" name="password" type="password" placeholder="Enter Password"/>
            </div>
            <div class="form-group">
              <div class="checkbox">
                <label>
                  <input type="checkbox"> Remember
                </label>
              </div>
            </div>
            <div class="form-group">
              <!-- Button -->
              <button type="submit" class="btn btn-red" value="Login">Sign In</button>&nbsp;
              <button type="submit" class="btn btn-lblue">Reset</button>
            </div>
            <div class="form-group">
              <a href="ui-105.html#" class="black">Forget Password ?</a>
            </div>
          </form>
        </div>
      </div>
      <div class="tab-pane fade" id="register-block">
        <div class="register-block-form">
          <!-- Heading -->
          <h4>Create the New Account</h4>
          <!-- Border -->
          <div class="bor bg-lblue"></div>
          <!-- Form -->
          <form class="form" role="form">
            <!-- Form Group -->
            <div class="form-group">
              <!-- Label -->
              <label class="control-label">First Name</label>
              <!-- Input -->
              <input type="text" class="form-control"  placeholder="Enter First Name">
            </div>
            <div class="form-group">
              <!-- Label -->
              <label class="control-label">Last Name</label>
              <!-- Input -->
              <input type="text" class="form-control"  placeholder="Enter Last Name">
            </div>
            <div class="form-group">
              <label class="control-label">Age</label>
              <input type="text" class="form-control" placeholder="Enter Age">
            </div>
            <div class="form-group">
              <label class="control-label">Login</label>
              <input type="text" class="form-control" placeholder="Enter Login">
            </div>
            <div class="form-group">
              <label class="control-label">Password</label>
              <input type="password" class="form-control" placeholder="Enter Password">
            </div>
            <div class="form-group">
              <label class="control-label">Role</label>
              <select class="form-control" id="country">
                <option>Select Role</option>
                <option>User</option>
                <option>Admin</option>
              </select>
            </div>
            <div class="form-group">
              <!-- Checkbox -->
              <div class="checkbox">
                <label>
                  <input type="checkbox"> Agree with terms and conditions
                </label>
              </div>
            </div>
            <div class="form-group">
              <!-- Buton -->
              <button type="submit" class="btn btn-red">Submit</button>&nbsp;
              <button type="submit" class="btn btn-lblue">Reset</button>
            </div>
          </form>
        </div>
      </div>
      <div class="tab-pane fade" id="contact-block">
        <!-- Contact Block Form -->
        <div class="contact-block-form">
          <h4>Contact Form</h4>
          <!-- Border -->
          <div class="bor bg-purple"></div>
          <!-- Form -->
          <form class="form" role="form">
            <!-- Form Group -->
            <div class="form-group">
              <label class="control-label">Name</label>
              <input type="text" class="form-control" placeholder="Enter Name">
            </div>
            <div class="form-group">
              <label class="control-label">Email</label>
              <input type="text" class="form-control" placeholder="Enter Email">
            </div>
            <div class="form-group">
              <label for="comments" class="control-label">Comments</label>
              <textarea class="form-control" id="comments" rows="5" placeholder="Enter Comments"></textarea>
            </div>
            <div class="form-group">
              <!-- Button -->
              <button type="submit" class="btn btn-red">Submit</button>&nbsp;
              <button type="submit" class="btn btn-lblue">Reset</button>
            </div>
          </form>
        </div>
      </div>
    </div>
  </div>
</div>

<!-- Javascript files -->
<!-- jQuery -->
<script src="js/jquery.js"></script>
<!-- Bootstrap JS -->
<script src="js/bootstrap.min.js"></script>
<!-- Placeholder JS -->
<script src="js/placeholder.js"></script>
<!-- Respond JS for IE8 -->
<script src="js/respond.min.js"></script>
<!-- HTML5 Support for IE -->
<script src="js/html5shiv.js"></script>

</body>
</html>
