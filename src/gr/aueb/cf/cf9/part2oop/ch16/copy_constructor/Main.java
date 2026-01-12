package gr.aueb.cf.cf9.part2oop.ch16.copy_constructor;

public class Main {

    public static void main(String[] args) {
        // 1. Setup
        City athens = new City("Athens");
        Student alice = new Student("Alice", athens);

        // 2. Create a Copy (Deep Copy)
        Student aliceClone = new Student(alice);

        // 3. Modify the original city of the clone
        // Since we used Deep Copy, modifying one should not affect the other.
        athens.setDescription("Paris");

        System.out.println("Original City Variable changed to Paris.");
        System.out.println("Alice's City: " + alice.getCity());
        System.out.println("Clone's City: " + aliceClone.getCity());
    }
}