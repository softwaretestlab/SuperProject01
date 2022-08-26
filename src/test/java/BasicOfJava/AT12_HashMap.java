package BasicOfJava;

import org.junit.Test;

import java.util.HashMap;

public class AT12_HashMap {

    @Test
    public void test16(){
        // here we created an object of Hashmap and this hashmap takes Stringer and Integer as Key:Value
        HashMap<String, Integer> map=new HashMap<>();
        map.put("Ricky",11);
        map.put("Bianca",8);
        map.put("Sophy",13);
        System.out.println("print map on console : "+map);
        //size of hasmap
        int mapsize=map.size();
        System.out.println("hasmap size is  : "+mapsize );

        if(map.containsKey("Bianca")){
            int keyVal=map.get("Bianca");
            System.out.println(" Keyvalue for  "+" Bianca is "+keyVal);


        }

    }
}
