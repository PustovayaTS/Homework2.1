public class Main {
    public static void main(String[] args) {
        int age = 3;
        if (age < 5) {
            System.out.println("Ребенок не может кататься на аттракционе");
        }
        else if (age >= 5 && age < 14) {
            System.out.println("Ребенок может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else {
            System.out.println("Ребенок может кататься без сопровождения взрослого");
        }
    }
}