package alishevbasic;

public class Lesson43_NestedClasses {
    public static void main(String[] args) {
        ElectroCar electroCar = new ElectroCar(1);
        electroCar.start();
        ElectroCar.Battery battery = new ElectroCar.Battery();
        battery.charge();

    }
}
class ElectroCar {
    private int id;

    private class Motor {
        public void startMotor() {
            System.out.println("Motor " + id + " is starting...");
        }
    }
    public static class Battery{
        public void charge(){
            System.out.println("Battery is charging...");
        }
    }

    public ElectroCar(int id) {
        this.id = id;
    }

    public void start() {
        Motor motor = new Motor();
        motor.startMotor();
        final int X = 1;
        class SomeClass{
            public void someMethod(){
                System.out.println(X);
                System.out.println(id);
            }
        }
        System.out.println("ElectroCar " + id + " is starting...");
    }
}
