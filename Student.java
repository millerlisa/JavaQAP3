class Student extends Person {
	// instance variables
    protected String myIdNum;    // Student Id Number
    protected double myGPA;      // grade point average

	// constructor
    public Student(String name, int age, String gender, String idNum, double gpa)  {
        // use the super class’ constructor
        super(name, age, gender);
        // initialize what’s new to Student
        this.myIdNum = idNum;
        this.myGPA = gpa;
    }

    // Getter methods
    public String getIdNum() {
        return myIdNum;
    }

    public double getGPA() {
        return myGPA;
    }

    // Setter methods
    public void setIdNum(String idNum) {
        this.myIdNum = idNum;
    }

    public void setGPA(double gpa) {
        this.myGPA = gpa;
    }

	@Override 
    public String toString() {
        return super.toString() + ", Id Num: " + this.myIdNum + ", GPA " +this.myGPA;
    }
}
