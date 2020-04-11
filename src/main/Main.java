/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: Abhishek
 *   Date: 11-04-2020
 *   Time: 05:38 PM
 */


package main;

import helper.Helper;
import user.UserDetails;

public class Main {
    public static void main(String[] args) {
        UserDetails userDetails = new UserDetails();
        Helper helper = new Helper();
        userDetails.UserName = "Abhishek";
        userDetails.CompanyName = "GLA";
        userDetails.YearOfJoining = 2018;

        System.out.println(helper.createUserEmail() + "\n" + helper.createUserPassword());

    }
}
