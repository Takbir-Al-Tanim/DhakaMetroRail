package cse213.Metro;

import java.io.Serializable;

public class User implements Serializable {
    private String id, name, password, email, phoneNo, type;

    public User(String name, String password, String email, String phoneNo, String type) {
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

    public String generateId(String type) {
        if (type == null || name == null || email == null || phoneNo == null) {
            return "INVALID";
        }
        if (!email.contains("@") || !email.contains(".")) {
            return "INVALID_EMAIL";
        }

        if (!phoneNo.contains("+880") ) {
            return "INVALID_PHONE";
        }

        int phoneLength = phoneNo.length();
        if (phoneLength != 14) {
                return "INVALID_PHONE_LENGTH";
            }



            String id = type.substring(0, Math.min(2, type.length())).toUpperCase();
            id += email.substring(0, Math.min(7, email.length())).toUpperCase();


            return id;
        }


    public boolean loginVR(String id, String password) {
        if (this.getId().equals(id) && this.getPassword().equals(password)) {
            return true;

        }
        return false;
    }


}






