<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1">
  <title>Complaint Form</title>
</head>
<body>

<form method="get" action="ComplaintController"  ENCTYPE="multipart/form-data">
  Name:<br>
  <input type="text" name="name">
  <br>
  Email:<br>
  <input type="text" name="email" >
  <br><br>
  Contact Information:<br>
  <input type="text" name="phone" >
  <br><br>
  Complaint Text:<br>
  <textarea name="complaint" rows="10" cols="10">Please enter your complaint</textarea>
  Attachment: <INPUT TYPE="file" NAME="attachedfile" MAXLENGTH=50  >

  <img src=?/CaptchaAuth">
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