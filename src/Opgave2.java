import java.util.Arrays;

public class Opgave2 {

    /**
     * Metode der returnerer det mindste tal af 2 input fra parameterliste
     * @param num1 first parameter to be checked
     * @param num2 second parameter to be checked
     * @return the smallest number, returns -1 if equal
     */
    int smallerOfTwo(int num1, int num2){
       if (num1 < num2)         return num1; //return smallest
       else if (num1 > num2)    return num2; //return smallest
                                return -1;   //return -1 when equal
    }

    /**
     * Metode der returnerer det største tal af 2 input fra parameterliste
     * @param num1 first parameter to be checked
     * @param num2 second parameter to be checked
     * @return the greatest number, returns -1 if equal
     */
    int greaterOfTwo(int num1, int num2){
        if (num1 < num2) return num2;
        if (num1 > num2) return num1;
        return -1;
    }

    /**
     * Metode der returnerer det mindste tal af 3 input fra parameterliste
     * @param num1 fist parameter to be checked
     * @param num2 second parameter to be checked
     * @param num3 thisr parameter to be checked
     * @return the smallest number, return -1 if the two smallest are equal
     */
    int smallestOfThree(int num1, int num2, int num3){
        if(num1 < num2 & num1 < num3) return num1;
        if(num2 < num1 & num2 < num3) return num2;
        if(num3 < num1 & num3 < num2) return num3;
        return -1;
    }

    /**
     * Metode der returnerer det største tal af 3 input fra parameterliste
     * @param num1 fist parameter to be checked
     * @param num2 second parameter to be checked
     * @param num3 third parameter to be checked
     * @return the greatest number, return -1 if the two greatest are equal
     */
    int greatestOfThree(int num1, int num2, int num3){
        if(num1 > num2 & num1 > num3) return num1;
        if(num2 > num1 & num2 > num3) return num2;
        if(num3 > num1 & num3 > num2) return num3;
        return -1;
    }

    /**
     * Metode der returnerer det mindste tal i et array input fra parameterliste
     * @param numberarray array of numbers
     * @return the smallest number in the array
     */
    int smallestOfArray(int numberarray[]){
        Arrays.sort(numberarray);
        return numberarray[0];
    }

    /**
     * Metode der returnerer det største tal i et array input fra parameterliste
     * @param numberarray array of numbers
     * @return the greatest number in the array
     */
    int greatestOfArray(int numberarray[]){
        Arrays.sort(numberarray);
        return numberarray[numberarray.length-1];
    }

    /**
     * Metode der returnerer summen af tal i et array input fra parameterliste
     * @param numberarray array of numbers
     * @return the sum of the array
     */
    int sumOfArray(int numberarray[]){
       return Arrays.stream(numberarray).sum();
    }

    /**
     * Metode der returnerer gennemsnittet tal i et array input fra parameterliste
      * @param numberarray array og numbers
     * @return the average of the array
     */
    int averageOfArray(int numberarray[]){
        return Arrays.stream(numberarray).sum()/ numberarray.length;

    }

    public static void main(String[] args) {
        Opgave2 p = new Opgave2();

        System.out.println(p.smallerOfTwo(1,-9));
        System.out.println(p.greaterOfTwo(1,-9));
        System.out.println(p.smallestOfThree(-8,100,80));
        System.out.println(p.greatestOfThree(-8,100,80));
        System.out.println(p.smallestOfArray(new int[]{9, 8, 7, 6, 5, 100, -5}));
        System.out.println(p.greatestOfArray(new int[]{9, 8, 7, 6, 5, 100, -5}));
        System.out.println(p.sumOfArray(new int[]{9, 8, 7, 6, 5, 100, -5}));
        System.out.println(p.averageOfArray(new int[]{9, 8, 7, 6, 5, 100, -5}));
    }

}
