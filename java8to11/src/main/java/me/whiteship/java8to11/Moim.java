package me.whiteship.java8to11;

public class Moim {
    int maxNumberOfAttendees;
    int numberOfEnrollment;

    public boolean isEnrollmentFull() {
        if (maxNumberOfAttendees == 0) {
            return false;
        }

        return numberOfEnrollment >= maxNumberOfAttendees;
    }
}

