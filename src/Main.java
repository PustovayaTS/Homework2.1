public class Main {
    public static void main(String[] args) {
        int passengers = 35;
        if (passengers <= 60) {
            System.out.println("В вагоне есть свободные сидячие и стоячие места");
        }
        else if (passengers > 60 && passengers <= 102) {
            System.out.println("В вагоне есть свободные стоячие места");
        } else {
            System.out.println("В вагоне нет свободных места");
        }
    }
}