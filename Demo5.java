public class Demo5{
    public static void main(String[] args) {
        int isbnNumBlock1=978;
        int isbnNumBlock2=3;
        int isbnNumBlock3=16;
        int isbnNumBlock4=1484100;
        final String COLOR="\033[30;1m";
        final String REST="\033[2;0m";

        System.out.printf("\"%s%d-%d-%d-%d%s\"\n",COLOR,isbnNumBlock1,isbnNumBlock2,isbnNumBlock3,isbnNumBlock4,REST);
        
    }
}
