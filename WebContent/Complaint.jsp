<jsp:useBean id="captcha" class="model.Captcha" scope="session"></jsp:useBean>
<jsp:useBean id="complaint" class="model.Complaint" scope="request"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1">
  <title>Complaint Form</title>
</head>
<body>

<form method="get" action="ComplaintController"  ENCTYPE="multipart/form-data">
  Name:<br>
  <input type="text" name="name" value="<%=complaint.setName(request.getParameter("name"))%>">
  <br>
  Email:<br>
  <input type="text" name="email" value="<%=complaint.setEmail(request.getParameter("email"))%>">
  <br><br>
  Contact Information:<br>
  <input type="text" name="phone" value="<%=complaint.setPhone(request.getParameter("phone"))%>">
  <br><br>
  Complaint Text:<br>
  <textarea name="complaint" rows="10" cols="10" >Please enter your complaint</textarea>
  Attachment: <INPUT TYPE="file" NAME="attachedfile" MAXLENGTH=50  >

  <img src=/CaptchaDisplay">
  <br>
  Please enter fruit name in image :<br>
  <select id="fruit">
    <option value="Apple">Apple</option>
    <option value="Mango">Mango</option>
    <option value="DragonFruit">DragonFruit</option>

  </select>

  <input type="submit" value="Submit">
  <br> <br>


</form>


</body>
</html>