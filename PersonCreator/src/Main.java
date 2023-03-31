public class Main {
    public static void main(String[] args) {
        System.out.println("=== CENCUS 2089, CITY OF BROKENHEARTED ===");
        Person person00 = new Person("James Peterson", 34, 180, 73.5);
        Person person01 = new Person("Bob Thornley", 25, 171, 68.2);
        System.out.println("Name = " + person00.getName());
        System.out.println("Age = " + person00.getAge());
        System.out.println("Height = " + person00.getHeight());
        System.out.println("WeAight = " + person00.getWeight() + "lbs" + "\n");

        //call the growOlder method to make person00 older
        person00.growOlder();
        System.out.println("A year after .....");
        System.out.println("Name = " + person00.getName());
        System.out.println("Age = " + person00.getAge());
        System.out.println("Height = " + person00.getHeight());
        System.out.println("WeAight = " + person00.getWeight() + "lbs" + "\n");

        System.out.println("Name = " + person01.getName());
        System.out.println("Age = " + person01.getAge());
        System.out.println("Height = " + person01.getHeight());
        System.out.println("Weight = " + person01.getWeight() + "lbs" + "\n");
        //call the growOlder method to make person01 older
        person01.growOlder();
        System.out.println("A year after .....");
        System.out.println("Name = " + person01.getName());
        System.out.println("Age = " + person01.getAge());
        System.out.println("Height = " + person01.getHeight());
        System.out.println("Weight = " + person01.getWeight() + "lbs" + "\n");



        // CREATE PERSON01 AND PERSON02 OBJECTS AND PRINT THEM
    }
}
