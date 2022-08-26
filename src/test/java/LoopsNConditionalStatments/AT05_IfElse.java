package LoopsNConditionalStatments;

import org.junit.Test;

public class AT05_IfElse {

    @Test
    public void IfconditionLearn(){

        String browser = "CHROME";
        if(browser.equalsIgnoreCase("chromes")){
            System.out.println(" you are using chrome browser");
        }
        else
        {
            System.out.println(" you are not using chrome browser");
        }
    }
}
