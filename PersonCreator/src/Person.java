public class Person {
    //list all attributes here : name, age, height, weight
    private String name;
    private int age;
    private int height;
    private double weight;

    //constructor method
    public Person(String name, int age, int height, double weight){ //Passing on parameters
        setName (name);
        setAge (age);
        setHeight (height);
        setWeight (weight);
        }
        //Alt + Ins to set Getter/Setter select Getter/Setter, Highlight options and enter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // create behavioral method, GrowOlder

    public void growOlder() {
        setAge(getAge() +1); // increasing the age by 1
        setHeight(getHeight() -1); //decreasing the height by 1
        setWeight(getWeight() -0.5); //decreasing weight by 0.5

    }
}
