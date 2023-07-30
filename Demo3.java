public class Demo3 {
    public static void main(String[] args) {
        int phNumbFirstPart = 123;
        int phNumbSecondPart = 456;
        int phNumbThirdPart = 7890;

        final String COLOURSET = "\033[33;1m";
        final String RESET = "\033[2;0m";

        System.out.printf("%s(%d)%s%d-%d.\n", COLOURSET, phNumbFirstPart, RESET, phNumbSecondPart,
                phNumbThirdPart);
    }
}
