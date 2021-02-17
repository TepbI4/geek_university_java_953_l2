package ru.geekbrains.alekseiterentev;

public class Cat extends Participant implements Runable, Jumpable {
    @Override
    public void jumpOver(Barrier barrier) {
        System.out.println("Кот перепрыгнул через стену");
    }

    @Override
    public void runThrough(RunningTrack runningTrack) {
        System.out.println("Кот пробежал по дорожке");
    }
}
