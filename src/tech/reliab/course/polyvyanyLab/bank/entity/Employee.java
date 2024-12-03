package tech.reliab.course.polyvyanyLab.bank.entity;

import java.time.LocalDate;

public class Employee extends Person {

    public enum Job {
        CEO,
        VaultKeeper,
        Programmer,
        Lawyer,
        Cashier,
        Manager;

        public static Job getRandom() {
            return values()[(int) (Math.random() * values().length)];
        }
    }

    private Job job;
    private Bank bank;
    private boolean isWorkingFromHome;
    private BankOffice bankOffice;
    private boolean isCreditAvailable;
    private double salary;

    public Employee() {
        super();
        job = null;
        bank = null;
        isWorkingFromHome = false;
        bankOffice = null;
        isCreditAvailable = false;
        salary = 0.0;
    }

    public Employee(Employee employee) {
        super(employee.id, employee.name, employee.birthDate);
        job = employee.job;
        bank = new Bank(employee.bank);
        isWorkingFromHome = employee.isWorkingFromHome;
        bankOffice = new BankOffice(employee.bankOffice);
        isCreditAvailable = employee.isCreditAvailable;
        salary = employee.salary;
    }

    public Employee(String _name, LocalDate _birthDate, Job _job, Bank _bank, boolean _isWorkingFromHome,
                    BankOffice _bankOffice, boolean _isCreditAvailable, double _salary) {
        super(_name, _birthDate);
        job = _job;
        bank = _bank;
        isWorkingFromHome = _isWorkingFromHome;
        bankOffice = _bankOffice;
        isCreditAvailable = _isCreditAvailable;
        salary = _salary;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job _job) {
        job = _job;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank _bank) {
        bank = _bank;
    }

    public boolean isIsWorkingFromHome() {
        return isWorkingFromHome;
    }

    public void setIsWorkingFromHome(boolean _isWorkingFromHome) {
        isWorkingFromHome = _isWorkingFromHome;
    }

    public BankOffice getBankOffice() {
        return bankOffice;
    }

    public void setBankOffice(BankOffice _bankOffice) {
        bankOffice = _bankOffice;
    }

    public boolean isIsCreditAvailable() {
        return isCreditAvailable;
    }

    public void setIsCreditAvailable(boolean _isCreditAvailable) {
        isCreditAvailable = _isCreditAvailable;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double _salary) {
        salary = _salary;
    }

    @Override
    public String toString() {
        return "Employee:{" +
                "\n person='" + super.toString() + "'" +
                ",\n job='" + getJob() + "'" +
                ",\n bank='" + getBank().getName() + "'" +
                ",\n isWorkingFromHome='" + isIsWorkingFromHome() + "'" +
                ",\n bankOffice='" + getBankOffice() + "'" +
                ",\n isCreditAvailable='" + isIsCreditAvailable() + "'" +
                ",\n salary='" + String.format("%.2f", getSalary()) + "'" +
                "\n}";
    }
}