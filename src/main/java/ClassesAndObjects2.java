public class ClassesAndObjects2 {
    public static void main(String[] args) {
        Person2 person1 = new Person2();
        person1.name = "Роман";
        person1.age = 58;
        person1.sayHello();
        Person2 person2 = new Person2();
        person2.name = "Вова";
        person2.age = 20;
        person2.speak();
        person2.sayHello();
    }
}
