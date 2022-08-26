package BasicOfJava;

import org.junit.Test;

public class AT04_GlobalVariables {
    //global variables
    int i=10;
    int j=20;
    String abc = "testlab";

    @Test
    public void test05() {
        // local variable
        int l =30;
        int k = i+l+j; //output 60
        System.out.println("Value of k is : "+k);

    }

    @Test
    public void test06() {
        //Here k is the local variables
        int k = i * j; // output 200
        System.out.println("value of k is  : " + k); //output 200
        System.out.println(" value of abc is : " + abc); //output is testlab
    }

}
