<jsp:useBean id= "complaint " class= "model.Complaint" scope="request">
<%
   String complaintData=complaint.getcomplaint();
    out.print("Thanks! Your complaint is successfully captured");%>
</jsp:useBean>

