public class Worker {

    private String name;
    private int salary;
    private int age;
    private int identificator;
    private static int count =0;
    /*
        Задача 3
    */
    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    /*
        Задача 2,8
    */
    public Worker(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        identificator =count++ ;
    }

    public int getIdentificator() {
        return identificator;
    }

    public static void main(String[] args) {
        /*
                Задача 4
        */

        Worker man = new Worker("Ivanov Ivan Ivanovich",21,60000);
        System.out.println("salary = "+man.salary+"руб.");
        System.out.println("age:"+man.age);
        /*
                Задача 5
        */

            Worker[] masiv = new Worker[5];
            masiv[0] = new Worker("asdasd",41,10000);
            masiv[1] = new Worker("asasd",32,11000);
            masiv[2] = new Worker("ewowejgijg",40,10000000);
            masiv[3] = new Worker("gwiormhg",54,1234567);
            masiv[4] = new Worker("erjhoierh",28,12456789);
        for (int i = 0; i < masiv.length; i++) {
            if(masiv[i].age>40) System.out.println(masiv[i].name);
        }

        upSalary(masiv);
        /*
            Задача 7
        */

        System.out.println(average(masiv));

        /*
            Задача 8
        */

        for (int i = 0; i < masiv.length; i++) {
            System.out.println("id:"+masiv[i].getIdentificator());
        }

    }
        /*
            Задача 6
         */
    public static void upSalary(Worker[] masiv) {
        for (int i = 0; i < masiv.length ; i++) {
            if (masiv[i].age>45) masiv[i].age+=5;
        }
    }

    public static int average(Worker[] masiv){
       double average1 = 0;
        for (int i = 0; i < masiv.length; i++) {
            average1 += masiv[i].salary;
        }
         return (int) (average1/= masiv.length);
    }
}
