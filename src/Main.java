public class Main {
    public static void main(String[] args) {
        //Первая задача
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Вторая задача
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Третья задача
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Четвертая задача
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        //Пятая задача
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        //Шестая задача
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println(totalWeight);
        var differenceBetweenScales = secondBoxerWeight - firstBoxerWeight;
        System.out.println(differenceBetweenScales);
        // Седьмая задача
        var weightDifference = secondBoxerWeight % firstBoxerWeight;
        System.out.println(weightDifference);
        //Восьмая задача
        var time = 640;
        var timeOfOneEmployee = 8;
        var theNumberOfEmployees = time / timeOfOneEmployee;
        System.out.println("Всего работников в компании " + theNumberOfEmployees + " человек");
        theNumberOfEmployees = theNumberOfEmployees + 94;
        var  numberOfWorkingHours = time / theNumberOfEmployees;
        System.out.println("Если в компании работает " + theNumberOfEmployees + " человек, то всего " + numberOfWorkingHours + " часа работы может быть поделено между сотрудниками" );
    }
}