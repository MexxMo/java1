public class Main {
    public static void main(String[] args) {
        //задание 1

        System.out.println("Задание 1");
        double dog = 8;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // задание 2
        System.out.println("Задание 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //задание 3
        System.out.println("Задание 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper -  7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // задание 4
        System.out.println("Задание 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;

        System.out.println(friend);

        // задание 5

        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // Задание 6

        System.out.println("Задание 6");

        var oneBoxer = 78.2;
        var twoBoxer = 82.7;

        var over = oneBoxer + twoBoxer;

        System.out.println("Общий вес " + over);

        var odds = twoBoxer - oneBoxer;
        System.out.println("Разница " + odds);

        // Задание 7
        System.out.println("Задание 7");

        var odds1 = twoBoxer - oneBoxer;
        System.out.println("Разнинца " + odds1);

        var odds2 = twoBoxer % oneBoxer;

        System.out.println("Разнинца " + odds2);

        // Задание 8
        System.out.println("Задание 8");

        var totalWorkingHours = 640;
        var workingHours = 8;
        var totalEmployers = totalWorkingHours / workingHours;
        System.out.println("Всего работников в компании " + totalEmployers + " человек");

        totalEmployers = totalEmployers + 94;
        System.out.println("если в компании работает " + totalEmployers + " человек");
        var hoursTotal = totalEmployers * workingHours;
        System.out.println("то всего " + hoursTotal + " часов работы может быть поделенно между сотрудниками");

    }


}