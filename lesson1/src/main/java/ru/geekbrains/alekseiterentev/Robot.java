package ru.geekbrains.alekseiterentev;

public class Robot extends Participant implements Jumpable, Runable {

    @Override
    public void jumpOver(Barrier barrier) {
        System.out.println("Робот перепрыгнул через стену");
    }

    @Override
    public void runThrough(RunningTrack runningTrack) {
        System.out.println("Робот пробежал по дорожке");
    }
}
