public class Homework21 {
    public static void main(String[] args) {
        AccountInfo user1 = new AccountInfo("John", 27, 12, 2021,
                "johntravolta@gmail.com", 18094657838L);
        user1.setSurname("Travolta");
        user1.setWeight(81);
        user1.setBloodPressure("120/80");
        user1.setStepsCount(12455);
        user1.printAccountInfo();
        System.out.println();

        AccountInfo user2 = new AccountInfo("Tom", 13, 11, 2023,
                "tomcat@gmail.com", 15647939498L);
        user2.setSurname("Cat");
        user2.setWeight(11);
        user2.setBloodPressure("110/70");
        user2.setStepsCount(11350);
        user2.printAccountInfo();
        System.out.println();

        AccountInfo user3 = new AccountInfo("Stewart", 11, 9, 2022,
                "stewartlittle@gmail.com", 136467586967L);
        user3.setSurname("Little");
        user3.setWeight(1);
        user3.setBloodPressure("110/67");
        user3.setStepsCount(3456);
        user3.printAccountInfo();
        System.out.println();

        AccountInfo user4 = new AccountInfo("John", 27, 12, 2021,
                "johntravolta@gmail.com", 18094657838L);
        user4.setSurname("Travoltavich");
        user4.setWeight(81);
        user4.setBloodPressure("130/75");
        user4.setStepsCount(12567);
        user4.printAccountInfo();
        System.out.println();

        AccountInfo user5 = new AccountInfo("Tom", 13, 11, 2023,
                "tomcat@gmail.com", 15647939498L);
        user5.setSurname("Cat-Dog-Mouse");
        user5.setWeight(170);
        user5.setBloodPressure("110/70");
        user5.setStepsCount(9999);
        user5.printAccountInfo();
        System.out.println();
    }
}
