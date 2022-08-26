package JavaOOPSconcepts;

import org.junit.Test;

public class AT04_Encapsulation02 {

    @Test
    public void envMethod03(){
        AT03_Encapsulation01 obj = new AT03_Encapsulation01();
        // this is first method which will return the sys out statment
        obj.evnMethod01(10,20);
        obj.evnMethod01(100,200);




    }

    @Test
    public void envMethod04(){
        AT03_Encapsulation01 obj = new AT03_Encapsulation01();
        int v  = obj.evnMethod02(30,40); // 70 is returned
        int j = v*10; //700
        System.out.println("value of j is : "+j);

    }
}
