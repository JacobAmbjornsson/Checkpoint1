public class Main {
    public static void main(String[] args) {

        System.out.println("Hello from checkpoint 1");

        Student student = new Student();
        student.setFirstName("Jacob");
        student.setLastName("Ambjörnsson");

        System.out.println("\nMy name is " + student.getFirstName() + " " + student.getLastName() +".");
    }
}