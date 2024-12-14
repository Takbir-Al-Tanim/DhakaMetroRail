public class CustomerExperienceModel {

    private String userId;
    private String password;
    private String feedback;
    private String loginStatus;
    private String thankYouMessage;

    // Constructor
    public CustomerExperienceModel(String userId, String password, String feedback, String loginStatus, String thankYouMessage) {
        this.userId = userId;
        this.password = password;
        this.feedback = feedback;
        this.loginStatus = loginStatus;
        this.thankYouMessage = thankYouMessage;
    }

    // Getters and Setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;
    }

    public String getThankYouMessage() {
        return thankYouMessage;
    }

    public void setThankYouMessage(String thankYouMessage) {
        this.thankYouMessage = thankYouMessage;
    }

    // toString Method
    @Override
    public String toString() {
        return "CustomerExperienceModel{" +
                "userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", feedback='" + feedback + '\'' +
                ", loginStatus='" + loginStatus + '\'' +
                ", thankYouMessage='" + thankYouMessage + '\'' +
                '}';
    }
}

