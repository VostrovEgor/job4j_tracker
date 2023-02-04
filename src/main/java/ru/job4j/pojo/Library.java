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
            Book kn = libra[index];
            System.out.println(kn.getName() + " " + kn.getPages());
        }
        System.out.println(System.lineSeparator() + "Перестановка 0 и 3 индекса");
        Book temp = libra[0];
        libra[0] = libra[3];
        libra[3] = temp;
        for (int index = 0; index < libra.length; index++) {
            Book kn = libra[index];
            System.out.println(kn.getName() + " " + kn.getPages());
        }
        System.out.println(System.lineSeparator() + "В поисках чистого кода");
        for (int index = 0; index < libra.length; index++) {
            Book kn = libra[index];
            if ("Clean code".equals(kn.getName())) {
                System.out.println(kn.getName() + " " + kn.getPages());
            }
        }

    }
}
