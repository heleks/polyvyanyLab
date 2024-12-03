package tech.reliab.course.polyvyanyLab.bank.entity;
public class BankAtm {
    public enum Status {
        NOT_WORKING,
        WORKING,
        NO_MONEY
    }

    private static int currentId;
    private int id;
    private String name;
    private String address;
    private Status status;
    private Bank bank;
    private BankOffice bankOffice;
    private Employee employee;
    private boolean isCashWithdrawalAvailable;
    private boolean isCashDepositAvailable;
    private double totalMoney;
    private double maintenanceCost;

    public BankAtm(BankAtm bankAtm) {
        id = bankAtm.id;
        name = bankAtm.name;
        address = bankAtm.address;
        status = bankAtm.status;
        bank = new Bank(bankAtm.bank);
        bankOffice = new BankOffice(bankAtm.bankOffice);
        employee = new Employee(bankAtm.employee);
        isCashWithdrawalAvailable = bankAtm.isCashWithdrawalAvailable;
        isCashDepositAvailable = bankAtm.isCashDepositAvailable;
        totalMoney = bankAtm.totalMoney;
        maintenanceCost = bankAtm.maintenanceCost;
    }

    public BankAtm() {
        id = currentId++;
        name = "Null";
        address = "Null";
        status = Status.NOT_WORKING;
        bank = null;
        bankOffice = null;
        employee = null;
        isCashWithdrawalAvailable = false;
        isCashDepositAvailable = false;
        totalMoney = 0.0;
        maintenanceCost = 0.0;
    }

    public BankAtm(String _name, String _address) {
        this( );
        name = _name;
        address = _address;
    }

    public BankAtm(String _name, String _address, Status _status, Bank _bank, BankOffice _bankOffice,
                   Employee _employee, boolean _isCashWithdrawalAvailable, boolean _isCashDepositAvailable, double _totalMoney,
                   double _maintenanceCost) {
        id = currentId++;
        name = _name;
        address = _address;
        status = _status;
        bank = _bank;
        bankOffice = _bankOffice;
        employee = _employee;
        isCashWithdrawalAvailable = _isCashWithdrawalAvailable;
        isCashDepositAvailable = _isCashDepositAvailable;
        totalMoney = _totalMoney;
        maintenanceCost = _maintenanceCost;
    }

    public BankAtm(int _id, String _name, String _address, Status _status, Bank _bank, BankOffice _bankOffice,
                   Employee _employee, boolean _isCashWithdrawalAvailable, boolean _isCashDepositAvailable, double _totalMoney,
                   double _maintenanceCost) {
        id = _id;
        name = _name;
        address = _address;
        status = _status;
        bank = _bank;
        bankOffice = _bankOffice;
        employee = _employee;
        isCashWithdrawalAvailable = _isCashWithdrawalAvailable;
        isCashDepositAvailable = _isCashDepositAvailable;
        totalMoney = _totalMoney;
        maintenanceCost = _maintenanceCost;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status _status) {
        status = _status;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank _bank) {
        bank = _bank;
    }

    public BankOffice getBankOffice() {
        return bankOffice;
    }

    public void setBankOffice(BankOffice _bankOffice) {
        bankOffice = _bankOffice;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee _employee) {
        employee = _employee;
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

    public double getMaintenanceCost() {
        return maintenanceCost;
    }

    public void setMaintenanceCost(double _maintenanceCost) {
        maintenanceCost = _maintenanceCost;
    }

    @Override
    public String toString() {
        return "BankAtm:{" +
                "\n id='" + getId() + "'" +
                ",\n name='" + getName() + "'" +
                ",\n address='" + getAddress() + "'" +
                ",\n status='" + getStatus() + "'" +
                ",\n bank='" + getBank().getName() + "'" +
                ",\n bankOffice='" + getBankOffice() + "'" +
                ",\n employee='" + getEmployee() + "'" +
                ",\n isCashWithdrawalAvailable='" + isIsCashWithdrawalAvailable() + "'" +
                ",\n isCashDepositAvailable='" + isIsCashDepositAvailable() + "'" +
                ",\n totalMoney='" + String.format("%.2f", getTotalMoney()) + "'" +
                ",\n maintenanceCost='" + String.format("%.2f", getMaintenanceCost()) + "'" +
                "\n}";
    }
}