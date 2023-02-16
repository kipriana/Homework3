public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Task 1");
        byte studentsInClass1 = 12;
        System.out.println("A variable studentsInClass1 of type byte equals " + studentsInClass1);
        short schoolCapacity = 1350;
        System.out.println("A variable schoolCapacity of a type short equals " + schoolCapacity);
        int lessonsPerYear = 108000;
        System.out.println("A variable lessonsPerYear of type int equals " + lessonsPerYear);
        long starsInTheMilkyWay = 200000000000L;
        System.out.println("A variable starsInTheMilkyWay of type long equals " + starsInTheMilkyWay);
        float studentsPerTeacher = 12.67f;
        System.out.println("A variable studentsPerTeacher of type float equals " + studentsPerTeacher);
        double chinaPopulation2023InThousands = 1453826.024;
        System.out.println("A variable chinaPopulation2023InThousands of type double equals " + chinaPopulation2023InThousands);
    }
    public static void task2() {
        System.out.println("Task 2");
        float variable1 = 27.12f;
        System.out.println("float variable1 = " + variable1);
        long variable2 = 987678965549L;
        System.out.println("long variable2 = " + variable2);
        short variable3 = 2786;
        System.out.println("short variable3 = " + variable3);
        short variable4 = 569;
        System.out.println("short variable4 = " + variable4);
        short variable5 = -159;
        System.out.println("short variable5 = " + variable5);
        short variable6 = 27897;
        System.out.println("short variable6 = " + variable6);
        byte variable7 = 67;
        System.out.println("byte variable7 = " + variable7);
    }
    public static void task3() {
        System.out.println("Task 3");
        byte ludmilaP = 23;
        byte annaS = 27;
        byte ekaterinaA = 30;
        int totalNumber = ludmilaP + annaS + ekaterinaA;
        short paperSheets = 480;
        float sheetsPerStudent = (float) paperSheets / totalNumber;
        System.out.println("There are " + sheetsPerStudent + " sheets of paper prepared for each student.");
    }
    public static void task4() {
        System.out.println("Task 4");
        byte bottles = 16;
        byte minutes = 2;
        float machineProductivityPerMinute = (float) bottles / minutes;
        System.out.println("The machine productivity for 20 minutes is " + machineProductivityPerMinute * 20 + " bottles.");
        System.out.println("The machine productivity for 24 hours is " + machineProductivityPerMinute * 60 * 24 + " bottles.");
        System.out.println("The machine productivity for 3 days minutes is " + machineProductivityPerMinute * 60 * 24 * 3 + " bottles.");
        System.out.println("The machine productivity for a month minutes is " + machineProductivityPerMinute * 60 * 24 * 30 + " bottles.");
    }
    public static void task5() {
        System.out.println("Task 5");
        short cans = 120;
        byte whiteForRoom = 2;
        byte blackForRoom = 4;
        int totalForRoom = whiteForRoom + blackForRoom;
        float rooms = (float) cans / totalForRoom;
        System.out.println("Needed " + rooms * whiteForRoom + " cans of white paint and " + rooms * blackForRoom + " cans of black paint for a school with " + rooms + " rooms.");
    }
    public static void task6() {
        System.out.println("Task 6");
        short bananasWeight = 80 * 5;
        float milkWeight = 200 / 100f * 105;
        short iceCreamWeight = 2 * 100;
        short eggsWeight = 4 * 70;
        float breakfastWeightG = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        float breakfastWeightKg = breakfastWeightG / 1000f;
        System.out.println("The weight of this sportive breakfast is " + breakfastWeightG + " g. or " + breakfastWeightKg + " kg.");
    }
    public static void task7() {
        System.out.println("Task 7");
        short weightToLose = 7 * 1000;
        short diet1 = 250;
        short diet2 = 500;
        int plan1 = weightToLose / diet1;
        System.out.println("The sportsman will lose 7 kg in " + plan1 + " days on a diet 1.");
        int plan2 = weightToLose / diet2;
        System.out.println("The sportsman will lose 7 kg in " + plan2 + " days on a diet 2.");
        int averagePlan = (plan1 + plan2) / 2;
        System.out.println("The sportsman will lose 7 kg in " + averagePlan + " days on average.");
    }
    public static void task8() {
        System.out.println("Task 8");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int cristinaSalary = 76230;
        float newMashaSalary = mashaSalary * 1.1f;
        float newDenisSalary = denisSalary * 1.1f;
        float newCristinaSalary = cristinaSalary * 1.1f;
        float mashaAnnualRaise = (newMashaSalary - mashaSalary) * 12;
        float denisAnnualRaise = (newDenisSalary - denisSalary) * 12;
        float cristinaAnnualRaise = (newCristinaSalary - cristinaSalary) * 12;
        System.out.println("The new Masha's salary is " + newMashaSalary + " rub. The annual raise is " + mashaAnnualRaise + " rub.");
        System.out.println("The new Denis's salary is " + newDenisSalary + " rub. The annual raise is " + denisAnnualRaise + " rub.");
        System.out.println("The new Masha's salary is " + newCristinaSalary + " rub. The annual raise is " + cristinaAnnualRaise + " rub.");
    }
}