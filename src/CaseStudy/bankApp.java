package CaseStudy;

public class bankApp {
    public static void main(String[] args) {
        //object customer
        Customer cus1 = new Customer();
        cus1.setName("sasitorn ohcuai");

        //object bankAccount
        bankAccount acc = new bankAccount("111-1-11111-1",
                500.00,cus1);

        System.out.println(acc.getInfo());
        acc.doposit(2000.00);
        System.out.println(acc.getInfo());
        acc.withdarw(1000.00);
        System.out.println(acc.getInfo());

    }//main
}//class
