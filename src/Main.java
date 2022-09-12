public class Main {
    public static void main(String[] args) {
        int one = 10;
        int two = 20;
        int free = 9;
        if (one > two && one > free) {
            System.out.println("Самое большое число = " + one);
        }
        else if (two > one && two > free) {
            System.out.println("Самое большое число = " + two);
        }
        else {
            System.out.println("Самое большое число = " + free);
        }
    }
}