package Strings;

import java.util.ArrayList;
import java.util.List;

public class Problem929 {
    public static void main(String[] args) {

        //example 1:
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emails));

        //example 2:
        String[] emails1 = {"test.email+alex@leetcode.com", "test.email@leetcode.com"};
        System.out.println(numUniqueEmails(emails1));

    }

    public static int numUniqueEmails(String[] emails) {

        List<String> list = new ArrayList<>();

        for ( String email : emails ) {

            String[] parts = email.split("@");

            String id = parts[0];
            String domain = parts[1];

            String[] idParts = id.split("\\+");

            id = idParts[0];
            id = id.replaceAll("[.]", "");

            String newEmail = id + '@'+ domain;

            if ( !list.contains(newEmail) ) {
                list.add(newEmail);
            }

        }

        return list.size();
    }
}
