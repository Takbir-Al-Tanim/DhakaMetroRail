package cse213.Metro;

public class User {
    private String id, name, password, email, phoneNo,type;

    public User(String name, String password, String email, String phoneNo,String type) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.phoneNo = phoneNo;
        this.id = generateId(type);
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNo;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNo = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNo + '\'' +
                '}';
    }
    public String generateId(String type){
      String  id=" ";

          id=this.type.substring(0,2);
          id = this.name.substring(0, 3);
          id += this.email.substring(0, 3);
          id += this.phoneNo.substring(this.getPhoneNumber().length());



        return id;
    }
    public boolean loginVR(String id ,String password){
        if(this.getId().equals(id) && this.getPassword().equals(password)){
            return true;

        }
        return false;
    }

}




