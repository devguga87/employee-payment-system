package entities;

public class OutsourcedEmployee extends Employee{
    private Double aditionalCharge;

    public OutsourcedEmployee(){
        super();
    }

    public OutsourcedEmployee(String name, Integer hours, Double valeuPerHour, Double aditionalCharge){
        super(name, hours, valeuPerHour);
        this.aditionalCharge = aditionalCharge;
    }

    public Double getAditionalCharge(){
        return aditionalCharge;
    }

    public void setAditionalCharge(Double aditionalCharge){
        this.aditionalCharge = aditionalCharge;
    }

    @Override
    public Double payment() {
        return super.payment() + aditionalCharge * 1.1;
    }
}
