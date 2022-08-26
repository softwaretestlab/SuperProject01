package JavaOOPSconcepts;

import org.junit.Test;

//using extends keyword we are inherting all the parent methods
public class AT06_InHeritance02 extends AT05_InHeritance01{

    @Test
    public void inhMethod04(){
        System.out.println(" THis is inhMethod04");
    }

    // if child and parent have same method names, then child will over right the parent method
    // this is also called as method overiding
    @Test
    public void inhMethod03(){
        System.out.println(" THis is inhMethod05");
    }


}
