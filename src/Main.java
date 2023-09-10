import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

        //Задача 1

        System.out.println("Задача 1");
        {

            int deposit = 15000;
            int goal = 2_459_000;
            float total = 0f;
            int month = 0;
            float ratio = 0.01f;

            while (total < goal) {
                total = deposit + total + total * ratio;
                month++;
                System.out.println("Месяц " + month + " , сумма накоплений равна " + numberFormat.format(total)); //В консоль вывели по порядку суммы накоплений за каждый месяц с учетом % по вкладу.
            }
            System.out.println("Потребуется " + month + " месяцев, для накопления нужной суммы с учетом процентов по вкладу");
        }

        //Задача 2

        System.out.println("Задача 2");

        int n = 1;
        while (n <= 10) {
            System.out.print(n + " ");
            n++;
        }
        System.out.println();
        for (n = 10; n > 0; n--) {
            System.out.print(n + " ");
        }
        System.out.println("");

        //Задача 3

        System.out.println("Задача 3");

        int population = 12_000_000;
        int birthPer1000 = 17;
        int deadPer1000 = 8;
        int year = 0;
        int yearCheck = 10;
        int birthPerYear = population / 1000 * birthPer1000;
        int deadPerYear = population / 1000 * deadPer1000;

        while (year < yearCheck) {
            population = population + birthPerYear - deadPerYear;
            year++;
            System.out.println("Год " + year + " , численность населения составляет " + population);
        }

        //Задача 4

        System.out.println("Задача 4");

        {
            float ratio = 0.07f;
            int deposit = 15000;
            int goal = 12_000_000;
            int month = 0;
            float total = 0f;

            total+=deposit;
            while (total < goal) {
                total =total + total * ratio;
                month++;
                System.out.println("Месяц " + month + " , сумма накоплений равна " + numberFormat.format(total));
            }
            System.out.println("Для накопления " + goal + " рублей, потребуется " + month + " месяцев");
        }

        //Задача 5

        System.out.println("Задача 5");
        {
            float ratio = 0.07f;
            int deposit = 15000;
            int goal = 12_000_000;
            int month = 0;
            float total = 0f;
            int interval = 6;

            total+=deposit;
            while (total < goal) {
                total =total + total * ratio;
                month++;
                if (month % interval == 0) {
                    System.out.println("Месяц " + month + " , сумма накоплений равна " + numberFormat.format(total));
                }
            }
            System.out.println("Для накопления " + goal + " рублей, потребуется " + month + " месяцев");
        }

        //Задача 6

        System.out.println("Задача 6");
        float ratio = 0.07f;
        int deposit = 15000;
        int goalMonth = 9 * 12;
        int month = 0;
        float total = 0f;

        total+=deposit;
        while (month < goalMonth) {
            total =total + total * ratio;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " , сумма накоплений равна " + numberFormat.format(total));
            }
        }
        System.out.println("За 9 лет сумма накоплений равна " + numberFormat.format(total));

        //Задача 7

        System.out.println("Задача 7");

        int daysWeek = 7;
        int dayFriday = 5; //например май 2023
        for (int day = 0; day <= 31; day++) {
            if (day % daysWeek == dayFriday) {
                System.out.println("Сегодня пятница, " + day + "-e число. Необходимо подготовить отчет.");
            }
        }

        //Задача 8

        System.out.println("Задача 8");

        int yearActual = 2023;
        int yearStartCalculation = yearActual - 200;
        int yearOverCalculation = yearActual + 100;
        int yearCometJourney = 0;
        int yearInterval = 79;


        while (yearCometJourney <= yearOverCalculation) {
            if (yearCometJourney > yearStartCalculation) {
                System.out.println(yearCometJourney);
            }
            yearCometJourney+=yearInterval;
        }
    }
}
