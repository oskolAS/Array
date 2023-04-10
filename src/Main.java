public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task4();

    }

    public static void task1(){
        int[] arrayOne = new int[3];
        arrayOne[0] = 1;
        arrayOne[1] = 2;
        arrayOne[2] = 3;
        System.out.println(arrayOne[0] + ", " + arrayOne[1] + ", " + arrayOne[2]);
        System.out.println(arrayOne[2] + ", " + arrayOne[1] + ", " + arrayOne[0]);
    }

    public static void task2() {
        float[] arrayTwo = new float[3];
        arrayTwo[0] = 1.57f;
        arrayTwo[1] = 7.654f;
        arrayTwo[2] = 9.986f;
        System.out.println(arrayTwo[0] + ", " + arrayTwo[1] + ", " + arrayTwo[2]);
        System.out.println(arrayTwo[2] + ", " + arrayTwo[1] + ", " + arrayTwo[0]);
    }

    public static void task4() {
        int[] arrayOne = {1, 2, 3};
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] % 2 != 0) {
                arrayOne[i] = arrayOne[i] + 1;
                System.out.println(arrayOne[i]);
            }else System.out.println(arrayOne[i]);

        }
    }
}