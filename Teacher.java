class Teacher extends Person {
    private String subject;    // subject the teacher teaches
    private double salary;     // teacher's annual salary

    public Teacher(String name, int age, String gender, String subject, double salary)  {
        // use the super class’ constructor
        super(name, age, gender);
        // initialize what’s new to Teacher
        this.subject = subject;
        this.salary = salary;
    }

    // Getter methods
    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    // Setter methods
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Subject: " + this.subject + ", Salary: $" + this.salary;
    }
}