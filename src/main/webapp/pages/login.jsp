<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <form action="/jobs/login" method="post">

        <div class="row">
            <label class="form-label col-4">Login: <input class="form-control col-6" name="login" type="text"/></label>
        </div>

        <div class="row">
            <label class="form-label col-4">Password: <input class="form-control col-6" name="password" type="password"/></label>
        </div>

        <div class="col-auto">
            <input type="submit" value="Login">
            <input type="reset" value="Clear">
        </div>
    </form>

</body>
</html>
