public class allFactors {
    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);

    }

    private static void printFactors(int number) {
        if(number < 1){
            System.out.println("Invalid Value");
           // return -1; it cannot return -1 as it is a void function
        }

        for(int i = 1; i <= number; i++){
            if(number % i == 0){ //I cannot be set to 0 as you cannot mod by 0.
                System.out.print(i);
                System.out.print(" ");
            }
        }

            System.out.println(" ");
    }
}
