package design;

/**
 * Created by Mizan on 4/28/2017.
 */
public abstract class FullTimeEmployee implements Employee {
    private int num;
    private String name;
    private String address;

    public void mailCheck() {
        this.name = " Liton";
        this.address = " 32 5th Ave";
        System.out.println("Mail a check to " + this.name + " " + this.address);
    }

    public abstract double computPay();
}
