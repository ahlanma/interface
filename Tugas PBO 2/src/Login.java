public class Login {

    private String userName;
    private String Password;

    public Login(){
        userName = "mhs";
        Password = "mhs";
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return Password;
    }

}
