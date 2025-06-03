import java.util.HashMap;
import java.util.Set;

public class HaspMap_Implementation {


    public static void Implementation(){

     HashMap<String,Integer> map = new HashMap<>();

     map.put("abc",1);
     map.put("def",2);


     System.out.println(map.size());

     if(map.containsKey("abc")){
         System.out.println(map.get("abc"));

         map.remove("abc");
     }
     Set<String> keys = map.keySet();
     for(String key:keys){
         System.out.println(key);
     }

    }



}
