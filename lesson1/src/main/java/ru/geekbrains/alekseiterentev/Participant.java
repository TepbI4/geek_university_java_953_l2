package ru.geekbrains.alekseiterentev;

public class Participant {

    void runThroughObstacleCourse(ObstacleCourseItem[] obstacleCourse) {
        for (ObstacleCourseItem obstacleCourseItem : obstacleCourse) {
            if (obstacleCourseItem instanceof RunningTrack && this instanceof Runable) {
                ((Runable) this).runThrough((RunningTrack) obstacleCourseItem);
            } else {
                if (this instanceof Cat) {
                    System.out.println("Кот не смог пробежать");
                }

                if (this instanceof Human) {
                    System.out.println("Человек не смог пробежать");
                }

                if (this instanceof Robot){
                    System.out.println("Robot не смог пробежать");
                }
            }

            if (obstacleCourseItem instanceof Barrier && this instanceof Jumpable) {
                ((Jumpable) this).jumpOver((Barrier) obstacleCourseItem);
            } else {
                if (this instanceof Cat) {
                    System.out.println("Кот не смог перепрыгнуть");
                }

                if (this instanceof Human) {
                    System.out.println("Человек не смог перепрыгнуть");
                }

                if (this instanceof Robot){
                    System.out.println("Robot не смог перепрыгнуть");
                }
            }
        }
    }
}
