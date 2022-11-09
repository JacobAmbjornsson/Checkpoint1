public class Main {
    public static void main(String[] args) {

        System.out.println("Hello from checkpoint 1");

        Student name = new Student();
        name.setFirstName("Jacob");
        name.setLastName("Ambjörnsson");

        System.out.println("\nMy name is " + name.getFirstName() + " " + name.getLastName() +".");
    }
}