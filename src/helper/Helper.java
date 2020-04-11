/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: Abhishek
 *   Date: 11-04-2020
 *   Time: 05:32 PM
 */


package helper;

import user.UserDetails;

public class Helper {

    UserDetails userDetails = new UserDetails();

    public String createUserEmail() {
        return String.format("%s_%d@%s.com", userDetails.getUserName().toLowerCase(), userDetails.getYearOfJoining(), userDetails.getCompanyName().toLowerCase());
    }

    private int generateRandomIntegerFromLimit(int limit) {
        return (int) (Math.random() * limit);
    }

    private char generateRandomCharacter() {
        return (char) ('a' + generateRandomIntegerFromLimit(26));
    }

    private String getFirstFiveCharacterFromUserName() {
        if (userDetails.getUserName().length() < 5) {
            StringBuilder pass = new StringBuilder();
            int difference = 5 - userDetails.getUserName().length();
            pass.append("0".repeat(Math.max(0, difference)));
            return pass.toString();
        } else {
            return userDetails.getUserName().substring(0, 5);
        }
    }

    private char getGenerateRandomSpecialSymbol() {
        char[] specialSymbol = {
                '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '-', '{', '}', '[', ']', '\\', '\'', '\"',
                '<', '>', '?', '/', ',', '.'
        };
        int randomNumber = generateRandomIntegerFromLimit(specialSymbol.length);
        return specialSymbol[randomNumber];
    }

    public String createUserPassword() {
        StringBuilder pass = new StringBuilder();
        pass.append(generateRandomCharacter());
        int j = 0;
        while (j < 4) {
            pass.append((int) (Math.random() * 10));
            j++;
        }
        pass.append(getFirstFiveCharacterFromUserName());
        pass.append(getGenerateRandomSpecialSymbol());
        return pass.toString();
    }
}
