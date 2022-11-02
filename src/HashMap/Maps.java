package HashMap;

import java.sql.Statement;
import java.util.HashMap;

public class Maps {
    public static void main(String[] args){

        HashMap<String,Integer> employeIds = new HashMap<>();
        employeIds.put("Marek", 1);
        employeIds.put("Betawi",2);

        System.out.println(employeIds);

        //this print id for employee
        System.out.println(employeIds.get("Marek"));


        //this check if key exist (name in our case) when Gorge then should be false
        System.out.println(employeIds.containsKey("Gorge"));

        System.out.println(employeIds.containsValue(1));


}


}
