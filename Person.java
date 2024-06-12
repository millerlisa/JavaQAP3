class Person {
	// instance variables
    protected String myName;   // name of the person
    protected int myAge;       // person's age
    protected String myGender; // "M" for male, "F" for female

	// constructor
    public Person(String name, int age, String gender) {
        this.myName = name;
        this.myAge = age;
        this.myGender = gender;
    }

    // Getter methods
    public String getName() {
        return myName;
    }

    public int getAge() {
        return myAge;
    }

    public String getGender() {
        return myGender;
    }

    // Setter methods
    public void setName(String name) {
        this.myName = name;
    }

    public void setAge(int age) {
        this.myAge = age;
    }

    public void setGender(String gender) {
        this.myGender = gender;
    }

    public String toString() {
        return "Name: " + this.myName + ", Age: " + this.myAge + ", Gender: " + this.myGender;
    }
}
