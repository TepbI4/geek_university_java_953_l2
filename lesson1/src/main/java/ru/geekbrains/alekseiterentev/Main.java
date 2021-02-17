package ru.geekbrains.alekseiterentev;

public class Main {

    public static void main(String[] args) {
        Participant[] team = {new Cat(), new Robot(), new Human()};

        ObstacleCourseItem[] obstacleCourse = {new RunningTrack(), new Barrier(),
                new RunningTrack(), new Barrier(), new RunningTrack()};

        for (Participant participant : team) {
            System.out.println();
            participant.runThroughObstacleCourse(obstacleCourse);
        }
    }
}
