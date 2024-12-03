package tech.reliab.course.polyvyanyLab.bank.entity;

import java.time.LocalDate;

public class CreditAccount extends Account {
    private LocalDate dateStart;
    private LocalDate dateEnd;
    private int monthCount;
    private double creditAmount;
    private double remainingCreditAmount;
    private double monthlyPayment;
    private double interestRate;
    private Employee employee;
    private PaymentAccount paymentAccount;

    public CreditAccount() {
        super();
        dateStart = null;
        dateEnd = null;
        monthCount = 0;
        creditAmount = 0.0;
        remainingCreditAmount = 0.0;
        monthlyPayment = 0.0;
        interestRate = 0.0;
        employee = null;
        paymentAccount = null;
    }

    public CreditAccount(CreditAccount creditAccount) {
        super(creditAccount.id, creditAccount.user, creditAccount.bank);
        dateStart = creditAccount.dateStart;
        dateEnd = creditAccount.dateEnd;
        monthCount = creditAccount.monthCount;
        creditAmount = creditAccount.creditAmount;
        remainingCreditAmount = creditAccount.remainingCreditAmount;
        monthlyPayment = creditAccount.monthlyPayment;
        interestRate = creditAccount.interestRate;
        employee = new Employee(creditAccount.employee);
        paymentAccount = new PaymentAccount(creditAccount.paymentAccount);
    }

    public CreditAccount(User user, Bank bank, LocalDate dateStart, LocalDate dateEnd, int monthCount,
                         double creditAmount, double remainingCreditAmount, double monthlyPayment,
                         double interestRate, Employee employee, PaymentAccount paymentAccount) {
        super(user, bank);
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.monthCount = monthCount;
        this.creditAmount = creditAmount;
        this.remainingCreditAmount = remainingCreditAmount;
        this.monthlyPayment = monthlyPayment;
        this.interestRate = interestRate;
        this.employee = employee;
        this.paymentAccount = paymentAccount;
    }

    public CreditAccount(int id, User user, Bank bank, LocalDate dateStart, LocalDate dateEnd, int monthCount,
                         double creditAmount, double remainingCreditAmount, double monthlyPayment,
                         double interestRate, Employee employee, PaymentAccount paymentAccount) {
        super(id, user, bank);
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.monthCount = monthCount;
        this.creditAmount = creditAmount;
        this.remainingCreditAmount = remainingCreditAmount;
        this.monthlyPayment = monthlyPayment;
        this.interestRate = interestRate;
        this.employee = employee;
        this.paymentAccount = paymentAccount;
    }

    public LocalDate getDateStart() {
        return this.dateStart;
    }

    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }

    public LocalDate getDateEnd() {
        return this.dateEnd;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    public int getMonthCount() {
        return this.monthCount;
    }

    public void setMonthCount(int monthCount) {
        this.monthCount = monthCount;
    }

    public double getCreditAmount() {
        return this.creditAmount;
    }

    public void setCreditAmount(double creditAmount) {
        this.creditAmount = creditAmount;
    }

    public double getRemainingCreditAmount() {
        return this.remainingCreditAmount;
    }

    public void setRemainingCreditAmount(double remainingCreditAmount) {
        this.remainingCreditAmount = remainingCreditAmount;
    }

    public double getMonthlyPayment() {
        return this.monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public PaymentAccount getPaymentAccount() {
        return this.paymentAccount;
    }

    public void setPaymentAccount(PaymentAccount paymentAccount) {
        this.paymentAccount = paymentAccount;
    }

    @Override
    public String toString() {
        return "CreditAccount:{" +
                "\n account='" + super.toString() + "'" +
                ",\n dateStart='" + getDateStart() + "'" +
                ",\n dateEnd='" + getDateEnd() + "'" +
                ",\n monthCount='" + getMonthCount() + "'" +
                ",\n creditAmount='" + String.format("%.2f", getCreditAmount()) + "'" +
                ",\n remainingCreditAmount='" + String.format("%.2f", getRemainingCreditAmount()) + "'" +
                ",\n montlyPayment='" + String.format("%.2f", getMonthlyPayment()) + "'" +
                ",\n interestRate='" + String.format("%.2f", getInterestRate()) + "'" +
                ",\n employee='" + getEmployee() + "'" +
                ",\n paymentAccount='" + getPaymentAccount() + "'" +
                "\n}";
    }
}