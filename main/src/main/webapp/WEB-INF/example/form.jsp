<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <div class="container">
        <s:form action="example/Signin" class="form">
            <h3>Sign in</h3>
            <s:textfield name="userName" placeholder="Username" class="form-control" />
            <s:password name="passWord" class="form-control" placeholder="Password" />
            <s:submit value="Submit" class="btn-submit" />
        </s:form>
       
    </div>
</body>
</html>