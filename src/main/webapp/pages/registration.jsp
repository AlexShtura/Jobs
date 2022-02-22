<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <form action="/jobs/registration" method="post">

        <div class="row">
            <label class="form-label col-4">First Name: <input class="form-control col-6" name="first_name" type="text"/></label>
        </div>

        <div class="row">
            <label class="form-label col-4">Last Name: <input class="form-control col-6" name="last_name" type="text"/></label>
        </div>

        <div class="row">
            <label class="form-label col-4">Age: <input class="form-control col-6" name="age" type="text"/></label>
        </div>

        <div class="row">
            <label class="form-label col-4">Login: <input class="form-control col-6" name="login" type="text"/></label>
        </div>

        <div class="row">
            <label class="form-label col-4">Password: <input class="form-control col-6" name="password" type="password"/></label>
        </div>

        <p class="col-2">Select Role: </p>
        <label>User: <input name="role" type="radio" value="user" checked/></label>
        <label>Admin: <input name="role" type="radio" value="admin"/></label>
        <br>
        <div class="col-auto">
            <input type="submit" value="Registration">
            <input type="reset" value="Clear">
        </div>
    </form>
</div>

</body>
</html>
