public class Homework21 {
    public static void main(String[] args) {
        AccountInfo user1 = new AccountInfo("John", 27, 12, 2021,
                "johntravolta@gmail.com", 18094657838L, "Travolta", 81,
                "120/80", 12455);
        System.out.println("User 1 Information Before Changes:");
        user1.printAccountInfo();
        System.out.println();

        user1.setSurname("Travoltavich");
        user1.setWeight(82);
        user1.setBloodPressure("130/75");
        user1.setStepsCount(12000);
        System.out.println("User 1 Information After Changes:");
        user1.printAccountInfo();
        System.out.println();


        AccountInfo user2 = new AccountInfo("Tom", 13, 11, 2023,
                "tomcat@gmail.com", 15647939498L, "Cat", 11, "110/70",
                11350);
        System.out.println("User 2 Information Before Changes:");
        user2.printAccountInfo();
        System.out.println();

        user2.setSurname("Cat-Dog-Mouth");
        user2.setWeight(170);
        user2.setBloodPressure("120/80");
        user2.setStepsCount(12400);
        System.out.println("User 2 Information After Changes:");
        user2.printAccountInfo();
    }
}
