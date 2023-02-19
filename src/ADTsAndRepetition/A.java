package ADTsAndRepetition;

public class A {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(getRandomNumber());
        }
    }

        public static int getRandomNumber() {
            return (int) (Math.random() * 10) + 1;
        }
}
