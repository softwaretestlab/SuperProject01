package BasicOfJava;

import org.junit.Test;

public class AT10_ArrayLoop {

    @Test
    public void test14() {
        // variable  age is an array
        int[] age = {10, 20, 30, 40, 50, 60};
        int lengthOfArray=age.length; //output 6
        System.out.println("length of arrray is :"+lengthOfArray);
        // For Loop
        for(int i=0;i<lengthOfArray;i++){
           // System.out.println(" value of i is : "+i);
            System.out.println("Array index : "+i+" its value is : "+age[i]);

        }

    }

}
