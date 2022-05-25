<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Struts 2 Website Sample</title>
</head><s:include value="Menu.jsp"/>
<style>
body {
  background-color: lightblue;
}

h1 {
  color: rgb(0, 0, 0);
  text-align: left;
}

p {
  font-family: verdana;
  font-size: 20px;
}
</style>
    <s:form action="Home" namespace="/example">
        <h1><s:property value="introductionMessage"/></h1>
        <s:textfield key="username"/>
        <s:textfield key="password"/>
        <s:submit key="submit"/>
<main>
    <div class="texts">
          <s:if test='%{userName != null || passWord != null}' >
             <h3>Invalid Username or Password! Please Try Again</h3>
              </s:if>
              <h5><s:property value="userName" /></h5>
              <h5><s:property value="passWord" /></h5>
          </div>
          <s:include value="form.jsp" />
    </main>
  </body>
</html>