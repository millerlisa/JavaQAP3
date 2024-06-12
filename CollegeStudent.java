class CollegeStudent extends Student {
	// instance variables
    private String major;    // student's major
    private int year;        // student's year in college

	// constructor
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, String major, int year)  {
        // use the super class’ constructor
        super(name, age, gender, idNum, gpa);
        // initialize what’s new to CollegeStudent
        this.major = major;
        this.year = year;
    }

    // Getter methods
    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }

    // Setter methods
    public void setMajor(String major) {
        this.major = major;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return super.toString() + ", Major: " + this.major + ", Year: " + this.year;
    }
}

