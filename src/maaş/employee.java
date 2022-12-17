public class employee {
    String name;
    int workh;
    int salary;
    int hire;
    int fee;
    int bonus;
    int salaryinc;

    employee(String name, int salary, int workh, int hire) {
        this.name = name;
        this.salary = salary;
        this.workh = workh;
        this.hire = hire;
    }

    int tax() {
        if (this.salary <= 1000) {
            this.fee = salary;
        } else if (this.salary >= 1000) {
            this.fee = (salary) * 3 / 100;
        }
        return this.fee;
    }

    int raiseSalary() {
        if (2021 - this.hire < 10) {
            this.salaryinc = this.salary * 5 / 100;
        } else if (2021 - this.hire >= 10 && 2021 - this.hire < 20) {
            this.salaryinc = salary * 10 / 100;
        }
        return this.salaryinc;

    }

    int bonus() {
        if (this.workh >= 40) {
            this.bonus = (this.workh - 40) * 30;
        }
        return this.bonus;
    }

    void employeeInf() {
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Work Hour: " + this.workh);
        System.out.println("Started: " + this.hire);
        System.out.println("Tax: " + this.tax());
        System.out.println("Bonus: " + this.bonus());
        System.out.println("Salary Increase: " + this.raiseSalary());
        int i = this.salary + this.bonus() - this.tax();
        System.out.println("Salary with tax and bonus: " + " " + i);
        int j = this.salary + this.raiseSalary();
        System.out.println("Total Salary: " + j);

    }
}

