class Teacher extends Person {
    protected String subject;
    protected double salary;

    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    public String getSubject() {
        return this.subject;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return myName + " age: " + myAge + " gender: " + myGender + " subject: " + subject + " salary: $" + salary;
    }
}