//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //1
        double sum = 0;
        int month = 1;
        while (sum < 2459000) {
            sum += 15000;
            System.out.println("Месяц" + month + ",сумма накоплений равна " + sum + " рублей");
            month++;
        }

        //2
        int n = 0;
        while (n < 10) {
            n++;
            System.out.println(n + " ");
        }
        System.out.println();
        for (; n >= 1; n--) {
            System.out.println(n + " ");
        }
        System.out.println();
    }

    //3
    double population = 12000000;
    int birthRate = 17;
    int deathRate = 8;
    for (int year = 1; year <= 10; year++){
        double birth = population / 1000 * birthRate;
        double death = population / 1000 * deathRate;
        population = population + birth - death;
        System.out.println("Год" + year + ",численность населения составляет" + (long) population);
    }

    //4
    sum=15000;
    month=1;
    while (sum<12000000){
        sum=sum+sum*7/100;
        month++;
        System.out.println("месяц="+ month + " сумма =" +(int)sum);
    }

    //5
    sum=15000;
    month=1;
    while (sum<12000000){
        sum=sum+sum*7/100;
        month++;
        if (month%6==0){
        System.out.println("месяц="+ month + " сумма =" +(int)sum);
    }
        //6
        sum=15000;
        month=1;
        while (month<9*12){
            sum=sum+sum*7/100;
            month++;
            if (month%6==0){
                System.out.println("месяц="+ month + " сумма =" +(int)sum);
            }

            //7
            int friday=1;
            while (friday<=31){
                System.out.println("Сегодня пятница,"+friday+"-е число. Необходимо подготовить отчет");
                friday+=7;
            }

            //8
}for (int year=2024-200; year<2024+100; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }