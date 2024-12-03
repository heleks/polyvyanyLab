package tech.reliab.course.polyvyanyLab.bank;

import java.util.List;
import java.time.LocalDate;
import java.util.Random;

import tech.reliab.course.polyvyanyLab.bank.entity.*;
import tech.reliab.course.polyvyanyLab.bank.service.*;
import tech.reliab.course.polyvyanyLab.bank.service.impl.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        BankService bankService = new BankServiceImpl();
        BankOfficeService bankOfficeService = new BankOfficeServiceImpl(bankService);
        bankService.setBankOfficeService(bankOfficeService);
        EmployeeService employeeService = new EmployeeServiceImpl(bankOfficeService);
        AtmService atmService = new AtmServiceImpl(bankOfficeService);
        UserService userService = new UserServiceImpl(bankService);
        //bankService.setUserService(userService);
        PaymentAccountService paymentAccountService = new PaymentAccountServiceImpl(userService);
        CreditAccountService creditAccountService = new CreditAccountServiceImpl(userService);

        bankService.create(new Bank("Bank #1"));
        bankService.create(new Bank("Bank #2"));
        bankService.create(new Bank("Bank #3"));
        bankService.create(new Bank("Bank #4"));
        bankService.create(new Bank("Bank #5"));

        List<Bank> banks = bankService.getAllBanks();
        for (Bank bank : banks) {
            for (int i = 1; i <= 3; i++) {
                bankOfficeService.create(new BankOffice(
                        "Office #" + i + " of " + bank.getName(),
                        "Street, " + i,
                        bank,
                        true,
                        true,
                        0,
                        true,
                        true,
                        true,
                        20000.0,
                        100.0 * i));
            }
        }

        List<BankOffice> offices = bankOfficeService.getAllOffices();
        for (BankOffice office : offices) {
            for (int i = 1; i <= 5; i++) {
                employeeService.create(new Employee(
                        "Employee " + i,
                        LocalDate.of(random.nextInt(1990, 2003), random.nextInt(1, 13),
                                random.nextInt(1, 29)),
                        Employee.Job.getRandom(),
                        office.getBank(),
                        true,
                        office,
                        true,
                       300.0));
            }
        }

        // Добавление банкоматов в каждый офис
        for (BankOffice office : offices) {
            for (int i = 1; i <= 3; i++) {
                atmService.create(new BankAtm(
                        "Atm " + i,
                        office.getAddress(),
                        BankAtm.Status.WORKING,
                        office.getBank(),
                        office,
                        bankOfficeService.getAllEmployeesByOfficeId(office.getId())
                                .get(random.nextInt(bankOfficeService
                                        .getAllEmployeesByOfficeId(
                                                office.getId())
                                        .size())),
                        true,
                        true,
                       0,
                        random.nextDouble() * 25));
            }
        }
        // Добавление клиентов в каждый банк
        for (Bank bank : banks) {
            for (int i = 1; i <= 5; i++) {
                userService.create(
                        new User(
                                1,
                                "People" + i,
                                LocalDate.of(random.nextInt(200, 300),
                                        random.nextInt(1, 13),
                                        random.nextInt(1, 29)),
                                "Company" + i,
                                random.nextDouble() * 10000,
                                bank,
                                random.nextInt(10000)));
            }
        }

        // Добавление платежных счетов каждому клиенту
        List<User> users = userService.getAllUsers();
        for (User user : users) {
            for (int i = 1; i <= 2; i++) {
                paymentAccountService.create(new PaymentAccount(
                        user,
                        user.getBank(),
                        random.nextDouble() * 10000));
            }
        }
    }
}
