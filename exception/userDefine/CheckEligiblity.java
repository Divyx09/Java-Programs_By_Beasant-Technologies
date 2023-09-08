package exception.userDefine;

import java.util.Scanner;

class AgeException extends Exception {
    public AgeException(String s) {
        super(s);
    }
}

public class CheckEligiblity {
    public static int TakeInput() {
        System.out.print("Enter Your Age: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        return age;
    }

    public static void CheckEligiblityForVote(int age) throws AgeException {

        if (age < 18) {
            throw new AgeException("Not Eligible for Voting");
        } else {
            System.out.println("You are eligible to vote 18");
        }
    }

    public static void main(String[] args) {
        int age = TakeInput();
        try {
            CheckEligiblityForVote(age);
        } catch (AgeException e) {
            System.out.println("Caught The Exception");
            System.out.println("Exception Occur"+e);
        }
        finally{
            System.out.println("Your Eligible to Vote Above");
        }
    }
}