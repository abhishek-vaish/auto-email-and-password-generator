package user;

import helper.Helper;

public class UserDetails {
    public String UserName;
    public String CompanyName;
    public int YearOfJoining;
    public String Email;
    public String Password;

    Helper helper = new Helper();

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        this.UserName = userName;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        this.CompanyName = companyName;
    }

    public int getYearOfJoining() {
        return YearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.YearOfJoining = yearOfJoining;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public void UserDetails(String UserName, String CompanyName, int YearOfJoining) {
        this.UserName = UserName;
        this.CompanyName = CompanyName;
        this.YearOfJoining = YearOfJoining;
        this.Email = helper.createUserEmail();
        this.Password = helper.createUserPassword();
    }
}


