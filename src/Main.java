public class Main {
    public static void main(String[] args) {
        int age = 16;
        if (age >= 7 && age <18) {
            System.out.println("Ребенок ходит в школу");
        }
        else if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        else if (age < 7) {
            System.out.println("Ребенок еще не ходит в школу");
        }
        else {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
    }
}