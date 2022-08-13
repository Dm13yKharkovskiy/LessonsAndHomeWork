package alishevbasic.lesson48_enam;

public class Test {

    public static void main(String[] args) {
        Animal animal = Animal.CAT;
        switch (animal) {
            case CAT:
                System.out.println("It's a cat");
                break;
            default:
                System.out.println("It's not cat");
        }
        Season season = Season.SUMMER;
        switch (season){
            case SUMMER:
                System.out.println("It's warm outside");
                break;
            case WINTER:
                System.out.println("It's cold outside");
                break;
            default:
                System.out.println("Not season");
        }
        System.out.println(season instanceof Object);
        System.out.println(season.getClass());
        Animal animal1 = Animal.CAT;
        System.out.println(animal1.getTranslation());
        System.out.println(animal1);
        Season season1 = Season.WINTER;
        System.out.println(season1.getTemperature());
        System.out.println(season1.name());
        Animal frog = Animal.valueOf("CAT");
        System.out.println(frog);
        System.out.println(season1.ordinal());
    }
}

