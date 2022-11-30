public class java2 {
    public static void main(String[] args) {
        System.out.println("Задание 1");

    int peopleOnClass =  564654652;
    System.out.println("Тип данных int " + peopleOnClass);
    byte apple = 127;
    System.out.println("Тип переменной byte " + apple);
    short or = 32767;
    System.out.println("Тип переменной short " + or);
    long people = 8_000_000_000_000L;
    System.out.println("Тип переменной long " + people);
    float a = 3.12312F;
    System.out.println("Тип данных float " + a);
    double b = 123.31231;
    System.out.println("Тип данных double "+ b);


    System.out.println("Задание 2");

    float dlina = 27.12F;
    long dlina1 = 987_678_965_549L;
    double dlina2 = 2.786;
    boolean dlina3 = false;
    short dlina4 = 589;
    short dlina5 = -159;
    short dlina6 = 27897;
    byte dlina7 = 67;

    System.out.println("Задание 3");

    int ludPadl = 23;
    int annaSer = 27;
    int ekatAndr = 30;
    int overPaper = 480;
    int paper =  overPaper/ (ludPadl+ annaSer+ekatAndr);
    System.out.println("На каждого ученика рассчитано " +  paper +" листов бумаги");

        System.out.println("Задание 4");

    int bottle = 16;
    int minute = 2;
    int poroizv = bottle/minute;
    int min20 = 20;
        System.out.println("За "+ min20 + " минут машина произвела бутылок "+ poroizv*20+ " штук ");
    int day = 24*60;
        System.out.println("За "+ day +" минут машина произвела бутылок "+ day*poroizv+" штук");
    int theeDay = day * 3;
        System.out.println("За "+ theeDay +" минут машина произвела бутылок "+ theeDay*poroizv+" штук");
    int month = day * 30;
        System.out.println("За "+ month +" минут машина произвела бутылок "+ month*poroizv+" штук");


        System.out.println("Задание 5");
    int total = 120;
    int whiteDye = 2;
    int brownDye = 4;
    int totalClass = total/(whiteDye + brownDye);
    int totalWhite = totalClass * whiteDye;
    int totalBrown = totalClass * brownDye;
        System.out.println("В школе, где " + totalClass + " классов, нужно "+totalWhite +" белой краски и " +totalBrown +" банок коричневой краски");

        System.out.println("Задание 6");
        int banana = 80;
        int milk = 105;
        int iceCream = 100;
        int eggs = 70;
        int sportPit = banana*5+milk*2+iceCream*2+eggs*4;
        System.out.println("Спорт-завтрак "+ sportPit + " грамм" + " или " + (float)sportPit/1000 + " килограмм" );


        System.out.println("Задание 7");

        int poterya250 = 250;
        int poterya500 = 500;
        int kilo = 7*1000;
        System.out.println("При потери 250 грамм в день, можно сбросить вес за "+ kilo/poterya250+ " дней");
        System.out.println("При потери 500 грамм в день, можно сбросить вес за "+ kilo/poterya500+ " дней");


        System.out.println("Задание 8");

        int masha = 67760;
        int procMasha = masha / 10;
        int premiyaMasha = masha+procMasha;
        int denis = 83690;
        int procDenis = denis / 10;
        int premiyaDenis = denis + (procDenis);
        int kristina = 76230;
        int procKrist = kristina / 10;
        int premiyaKrist = kristina+(denis/10);
        System.out.println("Маша теперь получает "+premiyaMasha +" рублей. Годовой доход вырос на "+procMasha*12 + " рублей");
        System.out.println("Денис теперь получает "+premiyaDenis +" рублей. Годовой доход вырос на "+procDenis*12 + " рублей");
        System.out.println("Кристина теперь получает "+premiyaKrist +" рублей. Годовой доход вырос на "+procKrist*12 + " рублей");

        }



}
