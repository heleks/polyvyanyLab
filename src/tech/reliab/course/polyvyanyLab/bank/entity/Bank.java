package tech.reliab.course.polyvyanyLab.bank.entity;

import tech.reliab.course.polyvyanyLab.utils.Random;

public class Bank {
    private static int currentId;
    private int id;
    private String name;
    private int officeCount;
    private int atmCount;
    private int employeeCount;
    private int clientCount;
    private int rating;
    private double totalMoney;
    private double interestRate;

    public Bank() {
        id = currentId++;
        name = "Null";
        officeCount = 0;
        atmCount = 0;
        employeeCount = 0;
        clientCount = 0;
        rating = Random.getRandomNumber(100);
        totalMoney = Random.getRandomNumber(1000000);
        interestRate = rating / 5.0;
    }

    public Bank(Bank bank) {
        id = bank.id;
        name = bank.name;
        officeCount = bank.officeCount;
        atmCount = bank.atmCount;
        employeeCount = bank.employeeCount;
        clientCount = bank.clientCount;
        rating = bank.rating;
        totalMoney = bank.totalMoney;
        interestRate = bank.interestRate;
    }

    public Bank(String _name) {
        this( );
        name = _name;
    }

    public Bank(int _id, String _name) {
        this( );
        id = _id;
        name = _name;
    }

    public int getId() {
        return id;
    }

    public void setId(int _id) {
        id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        name = _name;
    }

    public int getOfficeCount() {
        return officeCount;
    }

    public void setOfficeCount(int _officeCount) {
        officeCount = _officeCount;
    }

    public int getAtmCount() {
        return atmCount;
    }

    public void setAtmCount(int _atmCount) {
        atmCount = _atmCount;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int _employeeCount) {
        employeeCount = _employeeCount;
    }

    public int getClientCount() {
        return clientCount;
    }

    public void setClientCount(int _clientCount) {
        clientCount = _clientCount;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int _rating) {
        rating = _rating;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double _totalMoney) {
        totalMoney = _totalMoney;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double _interestRate) {
        interestRate = _interestRate;
    }

    @Override
    public String toString() {
        return "Bank:{" +
                "\n id='" + getId() + "'" +
                ",\n name='" + getName() + "'" +
                ",\n officeCount='" + getOfficeCount() + "'" +
                ",\n atmCount='" + getAtmCount() + "'" +
                ",\n employeeCount='" + getEmployeeCount() + "'" +
                ",\n clientCount='" + getClientCount() + "'" +
                ",\n rating='" + getRating() + "'" +
                ",\n totalMoney='" + String.format("%.2f", getTotalMoney()) + "'" +
                ",\n interestRate='" + String.format("%.2f", getInterestRate()) + "'" +
                "\n}";
    }
}