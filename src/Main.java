public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }
        System.out.println("Задача 2");
        for (int i1 = 10; i1 >= 1; i1 = i1 - 1) {
            System.out.println(i1);
        }
        System.out.println("Задача 3 ");
        for (int i2 = 0; i2 < 17; i2 = i2 + 2) {
            System.out.println(i2);
        }
        System.out.println("Задача 4");
        for (int i3 = 10; i3 >= -10; i3 = i3 - 1) {
            System.out.println(i3);
        }
        System.out.println("Задача 5");
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year + "Год является високосным");
        }
        System.out.println("Задача 6");
        for (int i4 = 7; i4 <= 98; i4 = i4 + 7) {
            System.out.println(i4);
        }
        System.out.println("Задача 7");
        for (int i5 = 1; i5 <= 512; i5 = i5 * 2) {
            System.out.println(i5);
        }

        System.out.println("Задача 8");
        double deposit = 29000;
        double total = 0;
        for (int i6 = 1; i6 <= 12; i6++) {
            total = total + deposit;
            System.out.println("Месяц " + i6 + " ,сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Задача 9");
        int deposit1 = 29000;
        double total1 = 0d;
        for (int i7 = 1; i7 <= 12; i7++) {
            total1 = total1 + (total1 * 0.01);
            total1 = total1 + deposit1;
            System.out.println("Месяц " + i7 + " сумма накоплений равна " + total1 + " рублей");
        }
        System.out.println("Задача 10");
        for (int i8 = 1; i8 <= 10; i8 = i8 + 1) {
            System.out.println("2* " + i8 + "=" + i8 * 2);
        }
        System.out.println("Циклы 2, задача 1");
        double sum = 15000;
        double total2 = 0d;
        int i9 = 0;
        double percent = 0.01;
        while (total2 <= 2459000) {
            total2 = total2 + (total2 * percent);
            total2 = total2 + sum;
            i9++;
            System.out.println("Месяц " + i9 + " ,сумма накоплений равна " + total2 + " рублей");
        }
        System.out.println("Циклы 2, задача 2");
        int i10 = 1;
        do {
            System.out.print(i10 + " ");
            i10 = i10 + 1;
        }
        while (i10 <= 10);
        System.out.println();
        for (int i11 = 10; i11 >= 0; i11 = i11 - 1) {
            System.out.print(i11 + " ");
        }
        System.out.println();
        System.out.println("Циклы 2, задача 3");
        double people = 12000000d;
        int birthrate = 17;
        int mortality = 8;
        percent = 0.01;
        int i = 0;
        i = 0;
        for (i = 0; i <= 10; i = i + 1) {
            people = people + percent * people * (birthrate - mortality);
            System.out.println("Год " + i + " ,численность населения составляет " + people);
        }
        System.out.println("Циклы 2, задача 4");
        int deposit4 = 15000;
        int i4 = 0;
        double sum4 = 0d;
        percent = 1.07;
        while (sum4 <= 12000000) {
            sum4 = (sum4 + deposit4) * percent;
            i4++;
            System.out.println("В месяце " + i4 + " накоплений " + sum4);
        }

        System.out.println();
        System.out.println("Циклы 2, задача 5");
        double deposit2 = 15000d;
        double percent2 = 0.07d;
        int sum2 = 12000000;
        int i20;
        for (i20 = 0; deposit2 < sum2; i20++) {
            deposit2 = deposit2 + deposit2 * percent2;
            if (i20 % 6 == 0) {
                System.out.println("Сумма " + deposit2 + " ,месяц " + i20);
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("Циклы 2, задача 6");
        double deposit3 = 15000d;
        double percent3 = 0.07d;
        for (int i21 = 0; i21 <= 108; i21++) {
            deposit3 = deposit3 + deposit3 * percent3;
            if (i21 % 6 == 0) {
                System.out.println("Сумма " + deposit3 + " , месяц " + i21);
            }
            for (int i22 = 1; i22 <= 31; i22 += 7) {
                System.out.println("Сегодня пятница, " + i22 + " -е число." + " Необходимо подготовить отчет");
                System.out.println();
            }
            int year = 2100;
            int time = 200;
            for (int i23 = 0; i23 < year + 100; i23 += 79) {
                if (i23 > year - time) {
                    System.out.println(i23);
                }
            }
        }
    }
}


