package JavaOOPSconcepts;

import org.junit.Test;

public class AT09_Polymorphism_MethodOverLoading02 {
    @Test
    public void obj() {
        AT08_Polymorphism_MethodOverLoading01 obj = new AT08_Polymorphism_MethodOverLoading01();
        obj.SumOfNum();
        obj.SumOfNum(10);
        obj.SumOfNum(10,20);
    }

}
