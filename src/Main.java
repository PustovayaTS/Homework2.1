public class Main {
    public static void main(String[] args) {
        int age = 27;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека от 2 до 6 лет, то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека от 7 до 18 лет, то ему нужно ходить в школу");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека от 18 до 24 лет, то ему нужно ходить в университет");
        }
        if (age > 24) {
            System.out.println("Если возраст человека больше 24 лет, то ему нужно ходить на работу");
        }
    }
}