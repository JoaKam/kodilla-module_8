package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void challengeExeptionHandler(double x, double y) {

        SecondChallenge challenge = new SecondChallenge();

        try {
            challenge.probablyIWillThrowException(x, y);
            System.out.println("exception isn't caught");
        } catch (Exception exception) {
            System.out.println("exception caught");
        } finally {
            System.out.println("try-catch finished");
        }
    }

}
