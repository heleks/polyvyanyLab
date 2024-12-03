package tech.reliab.course.polyvyanyLab.bank.entity;

public class Account {
    private static int currentId;
    protected int id;
    protected User user;
    protected Bank bank;

    public Account() {
        id = currentId++;
        user = null;
        bank = null;
    }

    public Account(User _user, Bank _bank) {
        this();
        user = _user;
        bank = _bank;
    }

    public Account(int _id, User _user, Bank _bank) {
        id = _id;
        user = _user;
        bank = _bank;
    }

    public Account(Account account) {
        id = account.id;
        user = account.user;
        bank = account.bank;
    }

    public int getId() {
        return id;
    }

    public void setId(int _id) {
        id = _id;
    }

    public User getClient() {
        return user;
    }

    public void setClient(User _user) {
        user = _user;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank _bank) {
        bank = _bank;
    }

    @Override
    public String toString() {
        return "Account:{" +
                "\n id='" + getId() + "'" +
                ",\n client='" + getClient() + "'" +
                ",\n bank='" + getBank().getName() + "'" +
                "\n}";
    }
}