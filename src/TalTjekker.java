public class TalTjekker {

    /**
     * checks the size of the number
     *
     *  @param tal the number to be checked
     */
    public void f(int tal) {
        //printer hvis tallet er mindre ne d 7, ikke 7
        if(tal<7)
            System.out.println("1");
        // printer hvis tallet er mindre end 9, men ikke mindre end 7
        else if(tal<9)
            System.out.println("2");
        //printer hves tallet er mindre end 13 men ikke mindre end 9
        else if(tal<13)
            System.out.println("3");
        //printer hvis tallet er 13 eller større
        else
            System.out.println("4");
    }


    /**
     * checking for two parameter and prints dependent on the parameters
     * @param nr
     * @param besked
     */
    public void udskriv(int nr,String besked) {
        // prints if less than 100 and "ja"
        if (nr < 100) {
            if (besked == "ja")
                System.out.println("Godkendt 1");
        }
        // prints if more than 100 and "ja"
        if (nr > 100) {
            if (besked == "ja")
                System.out.println("Godkendt 2");
        }
        // prints if less than 100 and "nej"
        if (nr < 100) {
            if (besked == "nej")
                System.out.println("Ikke Godkendt 4");
        }
        // prints if greater than 100 and "nej"
        if (nr > 100) {
            if (besked == "nej")
                System.out.println("Ikke Godkendt 5");
        }
        // prints if equal to 100
        if (nr == 100) {
            System.out.println("Godkendt");
        }

    }


}
