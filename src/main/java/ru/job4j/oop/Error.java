package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Состояние " + active);
        System.out.println("Ошибка " + status);
        System.out.println("Причина " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error error1 = new Error(true, 404, "Сайт упал");
        error1.printInfo();
        Error error2 = new Error(true, 111, "Неизвестная ошибка");
        error2.printInfo();
    }
}
