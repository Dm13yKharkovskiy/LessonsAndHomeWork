package alishevbasic;

public class Lesson30_Casting {
    public static void main(String[] args) {
        int i = 23565675;
        short s = 1230;
        byte b = 127;
        long l = 3434353534545454545L;
        double d = 12.4;
        float f = 44.5F;

        double d1 = (double) f;
        int i1 = (int) l;
        System.out.println(i1);
        long l1 = i;
        System.out.println(l1);
        byte b1 = (byte) 128;
        System.out.println(b1);
    }
}
