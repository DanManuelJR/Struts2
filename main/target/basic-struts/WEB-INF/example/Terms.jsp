<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Struts 2 Website Sample</title>
</head>
<style>
    body {
  background-color: lightblue;
}

h1 {
  color: rgb(8, 8, 8);
  text-align: center;
}

p {
  font-family: verdana;
  font-size: 20px;
}
</style>
<body>
    <s:include value="Menu.jsp"/>
    <h1><s:property value="term"/></h1>
</body>
</html>