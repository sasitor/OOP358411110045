package lab8;

public class personApp {
    public static void main(String[] args) {

        //create object
        Person person1,person2,person3;
        person1 = new Person("PID001","mind","1998");
        person2 = new sheriff("PID002","sasitorn","1999","Thungsong");
        person3 = new police("PID002","ohcuai","2000","sasitorn ohcuai");
        person1.introduce();
        person2.introduce();
        person3.introduce();
    }
}//class