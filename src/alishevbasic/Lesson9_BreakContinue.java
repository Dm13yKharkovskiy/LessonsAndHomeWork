package alishevbasic;

public class Lesson9_BreakContinue {
    public static void main(String[] args) {
        for(int i = 0; i <= 15; i++){
            if(i%2 == 0){
                System.out.println(i + " - " + "Четное чило");
                continue;
            }
            System.out.println(i + " - " + "Нечетное чило");
        }
    }
}
