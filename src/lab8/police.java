package lab8;

public class police extends Person{
    private String workCountry;

    //constructor

    public police(String pID, String name, String yearBoen, String police) {
        super(pID, name, yearBoen);
        this.workCountry = workCountry;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I am police work at "+this.workCountry);
    }

    public String getPolice() {
        return workCountry;
    }

    public void setPolice(String police) {
        workCountry = police;
    }
}//class