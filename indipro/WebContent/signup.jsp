<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Sign up</title>
  <link rel="stylesheet" href="./signup.css">
</head>
<body>
<form action=SignupServlet method=post>

  <div class="body">
    <div class="container">
        <form>
            <div class="head">
                <span>Sign up</span>
                <p>Let's create a free account with your email.</p>
            </div>
            <div class="inputs">
                <input name="name" type="text" placeholder="Full Name">
                <input name="email" type="email" placeholder="Email">
                <input name="phno" type="text" placeholder="Phone Number">
                <input name="age" type="text" placeholder="Age">
                <input name="gender" type="text" placeholder="Gender">
                <input name="password" type="password" placeholder="Password">
            </div>
            <button>Register</button>
        </form>
        <div class="form-footer">
            <p>Have an account? <a href="./login.jsp">Log in</a></p> 
        </div>

    </div>

</div>
</form>
</body>
</html>