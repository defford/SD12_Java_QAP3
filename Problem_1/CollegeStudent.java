class CollegeStudent extends Student {
    protected String major;
    protected int year;

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);
        this.year = year;
        this.major = major;
    }

    public int getYear() {
        return this.year;
    }

    public String getMajor() {
        return this.major;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return myName + " age: " + myAge + " gender: " + myGender + " id: " + myIdNum + " gpa" + myGpa + " year: " + year + " major: " + major;
    }
}