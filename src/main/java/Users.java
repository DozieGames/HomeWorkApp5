public class Users {

    public static String className = "Person";
    String name;
    String position;
    String email;
    String telephoneNumber;
    int pay;
    int age;

    public int getAge() {
        return age;
    }

    public Users(String name, String position, String email, String telephoneNumber, int pay, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.pay = pay;
        this.age = age;
    }

    public void info() {
        System.out.printf("name: %s\n position = %s\n email = %s\n telephoneNumber = %s\n pay = %d\n age = %d", name, position, email, telephoneNumber, pay, age);
    }
}