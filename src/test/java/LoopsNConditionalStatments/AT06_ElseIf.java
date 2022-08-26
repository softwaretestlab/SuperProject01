package LoopsNConditionalStatments;

import org.junit.Test;

public class AT06_ElseIf {
    @Test
    public void ElseIfLoopLearn() {
        String browser = "FireFox";
        if(browser.equalsIgnoreCase("chrome")){
            System.out.println("test case will execute on chrome");
        }
        else if (browser.equalsIgnoreCase("IE")){
            System.out.println("test case will execute on IE");
        }
        else if(browser.equalsIgnoreCase("firefox")){
            System.out.println("test case will execute on firefox");
        }

        else{
            System.out.println("Browser is not in the list ");
        }


    }

    }
