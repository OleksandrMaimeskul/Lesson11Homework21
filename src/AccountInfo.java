class AccountInfo {
    public final int YEAR_COUNT = 2020;
    private final String name;
    private final int birthDay;
    private final int birthMonth;
    private final int birthYear;
    private final String email;
    private final long phoneNumber;
    private final int age;
    private String surname;
    private int weight;
    private String bloodPressure;
    private int stepsCount;



    public AccountInfo(String name, int birthDay, int birthMonth, int birthYear, String email,
                       long phoneNumber) {
        this.name = name;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = birthYear - YEAR_COUNT;
    }

    public String getName() {
        return name;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public void setStepsCount(int stepsCount) {
        this.stepsCount = stepsCount;
    }

    public void printAccountInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + surname);
        System.out.println("Date of Birth: " + getBirthDay()+ "/" + getBirthMonth() + "/" + getBirthYear());
        System.out.println("Age: " + age);
        System.out.println("Email: " + getEmail());
        System.out.println("Phone: +" + getPhoneNumber());
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Blood Pressure: " + bloodPressure);
        System.out.println("Steps per Day: " + stepsCount);
    }
}

