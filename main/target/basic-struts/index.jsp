<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
</head>
<style type=text/css>   
body   
{  
height: 125vh;  
margin-top: 80px;  
padding: 30px;  
background-size: cover;  
font-family: sans-serif;  
}  
header {  
background-color: green;  
position: fixed;  
left: 0;  
right: 0;  
top: 6px;  
height: 30px;  
display: flex;  
align-items: center;  
box-shadow: 0 0 30px 0 black;  
}  
header * {  
display: inline;  
}  
header li {  
margin: 20px;  
}  
header li a {  
color: blue;  
text-decoration: none;  
}  
body {
  background-color: lightblue;
}

h1 {
  color: rgb(15, 15, 15);
  text-align: center;
}

p {
  font-family: verdana;
  font-size: 20px;
}
</style>   
<title>Struts 2 Website Sample</title>
<body>
    <h1>Struts 2 - Connecting to Database</h1>
    <s:form action="login">
      <s:textfield name="username" label="Username" />
      <s:textfield name="password" label="Password" />
      <s:submit/>
    </s:form>

    <p><a href="register.jsp">Register a user here.</a></p>
    <p><a href="<s:url action='list'/>">Display user list</a></p>
  </body>
</html>