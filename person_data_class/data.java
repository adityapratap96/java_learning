public class data {
    public static void main(String[] args) {
        int age=10;
        String fa="aditya",la="prajapati";
        person_data person = new person_data();
        person.setFirstName(fa);
        person.setLastName(la);
        person.setAge(age);
        System.out.println(person.getFullName());
    }
}
