public class LeadershipProgress {

    private String userId;
    private String password;
    private String guidance;
    private String dailyGoal;

    public LeadershipProgress() {
    }

    public LeadershipProgress(String userId, String password, String guidance, String dailyGoal) {
        this.userId = userId;
        this.password = password;
        this.guidance = guidance;
        this.dailyGoal = dailyGoal;
    }

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

    public String getGuidance() {
        return guidance;
    }

    public void setGuidance(String guidance) {
        this.guidance = guidance;
    }

    public String getDailyGoal() {
        return dailyGoal;
    }

    public void setDailyGoal(String dailyGoal) {
        this.dailyGoal = dailyGoal;
    }

    @Override
    public String toString() {
        return "LeadershipProgress{" +
                "userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", guidance='" + guidance + '\'' +
                ", dailyGoal='" + dailyGoal + '\'' +
                '}';
    }
}

