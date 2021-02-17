package ru.geekbrains.alekseiterentev;

public class Human extends Participant implements Jumpable, Runable {

    @Override
    public void jumpOver(Barrier barrier) {
        System.out.println("Человек перепрыгнул через стену");
    }

    @Override
    public void runThrough(RunningTrack runningTrack) {
        System.out.println("Человек пробежал по дорожке");
    }
}
