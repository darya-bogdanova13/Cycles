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
        int deposit = 29000;
        int total = 0;
        for (int i6 = 1; i6 <= 12; i6++) {
            total = total + deposit;
            System.out.println("Месяц " + i6 + " ,сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Задача 9");
        int deposit1 = 29000;
        double total1 = 0d;
        for (int i7 = 1; i7 <=12; i7++) {
            total1 = total1 + (total1*0.01);
            total1 = total1 + deposit1;
            System.out.println("Месяц " + i7 + " сумма накоплений равна " + total1 + " рублей");
        }
        System.out.println("Задача 10");
        for (int i8 = 1; i8 <=10; i8 = i8+1){
            System.out.println("2* " + i8 + "=" + i8*2);
        }
    }
}

