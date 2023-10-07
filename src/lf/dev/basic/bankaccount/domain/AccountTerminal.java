package lf.dev.basic.bankaccount.domain;

public class AccountTerminal {
    private String name = "";
    private int number = 0;
    private String agency = "";
    private double amount = 0.0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void showAccount(){
        System.out.println("Hello " + getName()+", thank you for choosing our Bank. Your branch is " + getAgency() + ", your account number is "+ getNumber() + " and your balance is " +getAmount());
    }

}
