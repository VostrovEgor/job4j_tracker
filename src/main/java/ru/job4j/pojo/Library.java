package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book one = new Book("One", 28);
        Book two = new Book("Two", 1128);
        Book three = new Book("Clean code", 928);
        Book four = new Book("Four", 28);
        Book[] libra = new Book[4];
        libra[0] = one;
        libra[1] = two;
        libra[2] = three;
        libra[3] = four;

        for (int index = 0; index < libra.length; index++) {
            Book name = libra[index];
            System.out.println(name.getName() + " " + name.getPages());
        }
        System.out.println(System.lineSeparator() + "Меняем местами индексы 0 и 3");
        Book temp = libra[0];
        libra[0] = libra[3];
        libra[3] = temp;
        for (int index = 0; index < libra.length; index++) {
            Book name = libra[index];
            System.out.println(name.getName() + " " + name.getPages());
        }
        System.out.println(System.lineSeparator() + "Найти чистый код");
        for (int index = 0; index < libra.length; index++) {
            Book name = libra[index];
            if ("Clean code".equals(name.getName())) {
                System.out.println(name.getName() + " " + name.getPages());
            }
        }
    }
}
