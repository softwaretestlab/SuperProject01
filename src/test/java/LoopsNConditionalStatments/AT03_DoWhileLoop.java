package LoopsNConditionalStatments;

import org.junit.Test;

public class AT03_DoWhileLoop {
    @Test
    public void DoWhileLoopLearn() {
        // Here we declared a variable
        int ticket=74;

        do{
            System.out.println("current ticket number is  : "+ticket);
            ticket++;
        }while(ticket<80);
    }


}
