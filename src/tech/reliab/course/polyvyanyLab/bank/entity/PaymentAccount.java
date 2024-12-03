package tech.reliab.course.polyvyanyLab.bank.entity;

public class PaymentAccount extends Account {
    private double balance;

    public PaymentAccount() {
        super();
        balance = 0.0;
    }

    public PaymentAccount(PaymentAccount paymentAccount) {
        super(paymentAccount.id, paymentAccount.user, paymentAccount.bank);
        balance = paymentAccount.balance;
    }

    public PaymentAccount(User user, Bank bank, double _balance) {
        super(user, bank);
        balance = _balance;
    }

    public PaymentAccount(int id, User user, Bank bank, double _balance) {
        super(id, user, bank);
        balance = _balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double _balance) {
        balance = _balance;
    }

    @Override
    public String toString() {
        return "PaymentAccount:{" +
                "\n account='" + super.toString() + "'" +
                ",\n balance='" + String.format("%.2f", getBalance()) + "'" +
                "\n}";
    }
}