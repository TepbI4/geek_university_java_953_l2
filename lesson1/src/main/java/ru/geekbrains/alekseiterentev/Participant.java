package ru.geekbrains.alekseiterentev;

public class Participant {

    void runThroughObstacleCourse(ObstacleCourseItem[] obstacleCourse) {
        for (ObstacleCourseItem obstacleCourseItem : obstacleCourse) {
            if (obstacleCourseItem instanceof RunningTrack && this instanceof Runable) {
                ((Runable) this).runThrough((RunningTrack) obstacleCourseItem);
            }

            if (obstacleCourseItem instanceof Barrier && this instanceof Jumpable) {
                ((Jumpable) this).jumpOver((Barrier) obstacleCourseItem);
            }
        }
    }
}
