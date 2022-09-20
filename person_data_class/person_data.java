public class person_data {
    private String firstName,lastName;
    private int age=0;
    public String getFirstName()
    {
        return this.firstName;
    }
    public String getLastName()
    {
        return this.lastName;
    }
    public int getAge()
    {
        return this.age;
    }
    public void setLastName(String la)
    {
        this.lastName=la;
    }
    public void setFirstName(String fa)
    {
        this.firstName=fa;
    }
    public void setAge(int age)
    {
        if(age<0||age>100)
        {
            this.age =0;
        }
        else{
        this.age=age;}
    }
    public boolean isTeen(){
        // if(age>12 && age<20) return true;
        // return false;
        return (age>12 && age<20); // ternary operator only in function but doesn't write out the ? true : false;
    }
    public String getFullName(){
        // if(firstName.isEmpty() && lastName.isEmpty()) return "";
        // if(firstName.isEmpty()) return lastName;
        // if(lastName.isEmpty()) return firstName;
        // return firstName + " " + lastName;
        return (firstName.isEmpty() && lastName.isEmpty()) ? "" : (firstName.isEmpty()) ? lastName : (lastName.isEmpty()) ? firstName : firstName + " " + lastName; // ternary operator
    }
}
