public class Main {
    public static void main(String[] args) {
        int passengers = 27;
        if (passengers <= 60) {
            System.out.println("В вагоне есть свободные сидячие и стоячие места");
        }
        if (passengers > 60 && passengers <= 102) {
            System.out.println("В вагоне есть свободные стоячие места");
        }
        if (passengers > 102) {
            System.out.println("В вагоне нет свободных места");
        }
    }
}