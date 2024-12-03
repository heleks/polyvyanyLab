package tech.reliab.course.polyvyanyLab.bank.entity;

public class BankOffice {
    private static int currentId;
    private int id;
    private String name;
    private String address;
    private Bank bank;
    private boolean isWorking;
    private boolean isAtmPlaceable;
    private int atmCount;
    private boolean isCreditAvailable;
    private boolean isCashWithdrawalAvailable;
    private boolean isCashDepositAvailable;
    private double totalMoney;
    private double rentPrice;

    public BankOffice(String _name, String _address) {
        id = currentId++;
        name = _name;
        address = _address;
        bank = null;
        isWorking = false;
        isAtmPlaceable = false;
        atmCount = 0;
        isCreditAvailable = false;
        isCashWithdrawalAvailable = false;
        isCashDepositAvailable = false;
        totalMoney = 0.0;
        rentPrice = 0.0;
    }

    public BankOffice(int _id, String _name, String _address, Bank _bank, boolean _isWorking, boolean _isAtmPlaceable,
                      int _atmCount, boolean _isCreditAvailable, boolean _isCashWithdrawalAvailable, boolean _isCashDepositAvailable,
                      double _totalMoney, double _rentPrice) {
        id = _id;
        name = _name;
        address = _address;
        bank = _bank;
        isWorking = _isWorking;
        isAtmPlaceable = _isAtmPlaceable;
        atmCount = _atmCount;
        isCreditAvailable = _isCreditAvailable;
        isCashWithdrawalAvailable = _isCashWithdrawalAvailable;
        isCashDepositAvailable = _isCashDepositAvailable;
        totalMoney = _totalMoney;
        rentPrice = _rentPrice;
    }

    public BankOffice(String _name, String _address, Bank _bank, boolean _isWorking, boolean _isAtmPlaceable,
                      int _atmCount, boolean _isCreditAvailable, boolean _isCashWithdrawalAvailable, boolean _isCashDepositAvailable,
                      double _totalMoney, double _rentPrice) {
        id = currentId++;
        name = _name;
        address = _address;
        bank = _bank;
        isWorking = _isWorking;
        isAtmPlaceable = _isAtmPlaceable;
        atmCount = _atmCount;
        isCreditAvailable = _isCreditAvailable;
        isCashWithdrawalAvailable = _isCashWithdrawalAvailable;
        isCashDepositAvailable = _isCashDepositAvailable;
        totalMoney = _totalMoney;
        rentPrice = _rentPrice;
    }

    public BankOffice(BankOffice bankOffice) {
        id = bankOffice.id;
        name = bankOffice.name;
        address = bankOffice.address;
        bank = new Bank(bankOffice.bank);
        isWorking = bankOffice.isWorking;
        isAtmPlaceable = bankOffice.isAtmPlaceable;
        atmCount = bankOffice.atmCount;
        isCreditAvailable = bankOffice.isCreditAvailable;
        isCashWithdrawalAvailable = bankOffice.isCashWithdrawalAvailable;
        isCashDepositAvailable = bankOffice.isCashDepositAvailable;
        totalMoney = bankOffice.totalMoney;
        rentPrice = bankOffice.rentPrice;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String _address) {
        address = _address;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank _bank) {
        bank = _bank;
    }

    public boolean isIsWorking() {
        return isWorking;
    }

    public void setIsWorking(boolean _isWorking) {
        isWorking = _isWorking;
    }

    public boolean isIsAtmPlaceable() {
        return isAtmPlaceable;
    }

    public void setIsAtmPlaceable(boolean _isAtmPlaceable) {
        isAtmPlaceable = _isAtmPlaceable;
    }

    public int getAtmCount() {
        return atmCount;
    }

    public void setAtmCount(int _atmCount) {
        atmCount = _atmCount;
    }

    public boolean isIsCreditAvailable() {
        return isCreditAvailable;
    }

    public void setIsCreditAvailable(boolean _isCreditAvailable) {
        isCreditAvailable = _isCreditAvailable;
    }

    public boolean isIsCashWithdrawalAvailable() {
        return isCashWithdrawalAvailable;
    }

    public void setIsCashWithdrawalAvailable(boolean _isCashWithdrawalAvailable) {
        isCashWithdrawalAvailable = _isCashWithdrawalAvailable;
    }

    public boolean isIsCashDepositAvailable() {
        return isCashDepositAvailable;
    }

    public void setIsCashDepositAvailable(boolean _isCashDepositAvailable) {
        isCashDepositAvailable = _isCashDepositAvailable;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double _totalMoney) {
        totalMoney = _totalMoney;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(double _rentPrice) {
        rentPrice = _rentPrice;
    }

    @Override
    public String toString() {
        return "BankOffice:{" +
                "\n id='" + getId() + "'" +
                ",\n name='" + getName() + "'" +
                ",\n address='" + getAddress() + "'" +
                ",\n bank='" + getBank().getName() + "'" +
                ",\n isWorking='" + isIsWorking() + "'" +
                ",\n isAtmPlaceable='" + isIsAtmPlaceable() + "'" +
                ",\n atmCount='" + getAtmCount() + "'" +
                ",\n isCreditAvailable='" + isIsCreditAvailable() + "'" +
                ",\n isCashWithdrawalAvailable='" + isIsCashWithdrawalAvailable() + "'" +
                ",\n isCashDepositAvailable='" + isIsCashDepositAvailable() + "'" +
                ",\n totalMoney='" + String.format("%.2f", getTotalMoney()) + "'" +
                ",\n rentPrice='" + String.format("%.2f", getRentPrice()) + "'" +
                "\n}";
    }
}