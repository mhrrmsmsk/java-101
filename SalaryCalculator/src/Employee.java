public class Employee {
    String name;
    double salary;
    int workHours;
    int  hireYear;
    double bonus;
    double tax;
    double salaryRaise;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    void tax(){
        if (this.salary<1000){
            this.salary=salary;
        }
        if (this.salary>1000){
            tax=(this.salary*3)/100;
        }
    }
    void bonus(){
        if (this.workHours>40){
            bonus=(this.workHours-40)*30;
        }
    }
    void raiseSalary(){
        if (2021-this.hireYear<10){
            salaryRaise=(this.salary*5)/100;
        }
        if (2021-this.hireYear<20 && 2021-this.hireYear>9){
            salaryRaise=(this.salary*10)/100;
        }
        if (2021-this.hireYear>19){
            salaryRaise=(this.salary*15)/100;
        }
    }
    public String toString(){
        tax();
        bonus();
        raiseSalary();
        System.out.println("Adı: "+this.name);
        System.out.println("Maaşı: "+this.salary);
        System.out.println("Çalışma Saati: "+this.workHours);
        System.out.println("Başlangıç yılı: "+this.hireYear);
        System.out.println("Vergi: "+tax);
        System.out.println("Bonus: "+bonus);
        System.out.println("Maasş Artışı: "+salaryRaise);
        System.out.println("Vergiler ve Bonuslar ile birlikte maaş: "+((salary+bonus)-tax));
        System.out.println("Toplam Maaş: "+(salary+salaryRaise));
        return null;
    }

}
