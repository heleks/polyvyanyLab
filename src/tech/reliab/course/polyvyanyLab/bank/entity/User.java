package tech.reliab.course.polyvyanyLab.bank.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class User extends Person {
    private String placeOfWork;
    private double monthlyIncome;
    private Bank bank;
    private double creditRating;

    public User() {
        placeOfWork = "Null";
        monthlyIncome = 0.0;
        bank = null;
        creditRating = 0.0;
    }

    public User(User user) {
        super(user.id, user.name, user.birthDate);
        placeOfWork = user.placeOfWork;
        monthlyIncome = user.monthlyIncome;
        bank = new Bank(user.bank);
        creditRating = user.creditRating;
    }

    public User(int id, String name, LocalDate birthDate, String _placeOfWork, double _monthlyIncome, Bank _bank,
                double _creditRating) {
        super(id, name, birthDate);
        placeOfWork = _placeOfWork;
        monthlyIncome = _monthlyIncome;
        bank = _bank;
        creditRating = _creditRating;
    }

    public String getPlaceOfWork() {
        return placeOfWork;
    }

    public void setPlaceOfWork(String _placeOfWork) {
        placeOfWork = _placeOfWork;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double _monthlyIncome) {
        monthlyIncome = _monthlyIncome;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank _bank) {
        bank = _bank;
    }

    public double getCreditRating() {
        return creditRating;
    }

    public void setCreditRating(double _creditRating) {
        creditRating = _creditRating;
    }

    @Override
    public String toString() {
        return "Client:{" +
                "\n person='" + super.toString() + "'" +
                ",\n placeOfWork='" + getPlaceOfWork() + "'" +
                ",\n monthlyIncome='" + String.format("%.2f", getMonthlyIncome()) + "'" +
                ",\n bank='" + getBank().getName() + "'" +
                ",\n creditRating='" + String.format("%.2f", getCreditRating()) + "'" +
                "\n}";
    }
}