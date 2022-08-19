public class Main {
    public static void main(String[] args) {
        int age = 19;
        int salary = 81000;
        int WantedSum = 330000;
        double WantedSum1;
        double take = 10.0;
        double take1;
        int s;
        if(age < 23 && salary > 80000){
            take = take+1.0; //Ставка от возвраста
            take1 = take-0.7; //Ставка от зп
            s = salary/2; //Максим от зп 50%
            WantedSum1=WantedSum/12; //Платеж в месяц
            System.out.println("Текущая ставка:"+take1+"\nМаксимальный платеж при ЗП = "+salary+",равен = "+s+"\tрублей."+"\nПлатеж по кредиту = "+WantedSum1+" рублей.");
            if(s > WantedSum1){
                System.out.println("Кредит одобрен!");
            }else System.out.println("Кредит отказан!");
        }
        if (age > 23 && age < 30 && salary > 80000){
            take = take+0.5;
            take1 = take-0.7;
            s = salary/2; //Максим от зп 50%
            WantedSum1=WantedSum/12; //Платеж в месяц
            System.out.println("Текущая ставка:"+take1+"\nМаксимальный платеж при ЗП = "+salary+",равен = "+s+"\tрублей."+"\nПлатеж по кредиту = "+WantedSum1+" рублей.");
            if(s > WantedSum1){
                System.out.println("Кредит одобрен!");
            }else System.out.println("Кредит отказан!");
        }
        if(age > 30 && salary > 80000){
            take = 10.0;
            take1 = take - 0.7;
            s = salary/2; //Максим от зп 50%
            WantedSum1=WantedSum/12; //Платеж в месяц
            System.out.println("Текущая ставка:"+take1+"\nМаксимальный платеж при ЗП = "+salary+",равен = "+s+"\tрублей."+"\nПлатеж по кредиту = "+WantedSum1+" рублей.");
            if(s > WantedSum1){
                System.out.println("Кредит одобрен!");
            }else System.out.println("Кредит отказан!");
        }

    }
}
