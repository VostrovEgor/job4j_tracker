package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean activate, int status, String message) {
        this.active = activate;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Ошибка: " + active);
        System.out.println("Статус ошибки: " + status);
        System.out.println("Сообщение ошибки: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error error1 = new Error(false, 404, "Страница не найдена");
        Error error2 = new Error(true, 111, "Неизвестная команда");
        error.printInfo();
        error1.printInfo();
        error2.printInfo();
    }
}
