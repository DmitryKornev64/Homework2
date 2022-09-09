public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1-3 ");

        var dog = 8.1;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);

        System.out.println("Задание 4 ");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задание 5 ");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задание 6 ");
        var weightOfOneBoxer = 78.2;
        var weightOfTheSecondBoxer = 82.7;
        var totalWeightOfFighters = weightOfOneBoxer + weightOfTheSecondBoxer;
        System.out.println("Общий вес двух бойцов " + totalWeightOfFighters + " кг!");
        var weightDifference = weightOfTheSecondBoxer - weightOfOneBoxer;
        System.out.println("Разница между весами бойцов " + weightDifference + " кг!");


        System.out.println("Задание 7 ");
        var weightOfOneBoxer1 = 78.2;
        var weightOfTheSecondBoxer1 = 82.7;
        var weightDifference1 = weightOfOneBoxer1 - weightOfTheSecondBoxer1;
        System.out.println("Разница в весе бойцов " + weightDifference1 + " кг!");
        var weightDifference2 = weightOfTheSecondBoxer1 % weightOfOneBoxer1;
        System.out.println("Разница в весе бойцов " + weightDifference2 + " кг!");

        System.out.println("Задание 8 ");
        var ttotalHours = 680;
        var personHours = 8;
        var employees = ttotalHours / personHours ;
        System.out.println("Всего в компании " + employees + " сотрудников.");
        var newEmployees = 94;
        var withTheArrivalOfNewEmployees = newEmployees + employees;
        System.out.println("В компании стало сотрудников " + withTheArrivalOfNewEmployees + " с приходом новых.");
        var nevPersonHours = ttotalHours / withTheArrivalOfNewEmployees;
        System.out.println("Если в компании работает " + withTheArrivalOfNewEmployees + " человек, то всего " + nevPersonHours + " часа работы может быть поделено между сотрудниками");



        }
    }

