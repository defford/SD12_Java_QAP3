class Student extends Person { 
    protected String myIdNum; // Student Id Number 
    protected double myGpa; // grade point average

    public Student(String name, int age, String gender, String idNum, double gpa) { 
        // use the super class’ constructor 
        super(name, age, gender);
        // initialize what’s new to Student
        myIdNum = idNum;
        myGpa = gpa;
    }

    // Getters
    public String getIdNum() {
        return this.myIdNum;
    }

    public double getGpa() {
        return this.myGpa;
    }

    // Setters

    public void setIdNum(String idNum) {
        this.myIdNum = idNum;
    }

    public void setGpa(double gpa) {
        this.myGpa = gpa;
    }
}