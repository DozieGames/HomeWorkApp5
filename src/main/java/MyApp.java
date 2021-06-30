public class MyApp {
    public static void main(String[] args) {

        Users[] persArray = new Users[5];
        persArray[0] = new Users("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "8923237184", 30000, 31);
        persArray[1] = new Users("Petrov Petya", "Driver Bus", "Pert0Petya@mailbox.com", "892364253", 25000, 45);
        persArray[2] = new Users("Andreev Andrey", "Teacher", "Andre2Andr@mail.ru", "891725356", 28000, 41);
        persArray[3] = new Users("Maximov Maxim", "Engineer", "MaxsMax@gmail.com", "863325535", 30000, 29);
        persArray[4] = new Users("Bydko Vlad", "Programmer", "BodkoVladislvv@mailbox.com", "8923237184", 90000, 26);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                persArray[i].info();
            }
        }
    }
}
