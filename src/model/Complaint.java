package model;

public class Complaint {
    private String name, email, phone,complaint;
    Complaint(){
    }
    public Complaint(String name, String email, String phone, String complaint){
        this.name=name;
        this.phone=phone;
        this.email=email;
        this.complaint=complaint;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getcomplaint() {
        return complaint;
    }
    public void setcomplaint(String complaint) {
        this.complaint = complaint;
    }
}
