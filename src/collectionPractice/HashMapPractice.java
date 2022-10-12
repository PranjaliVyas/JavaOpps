package collectionPractice;


import java.util.HashMap;

// Import Hashmap class
public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer,String>ColourCode = new HashMap<>();
        //
        ColourCode.put(2,"red");
        ColourCode.put(3,"yellow");// value can be duplicate but key can't be
        ColourCode.put(4,"Purple");
        ColourCode.put(8,"Green");
        ColourCode.put(6,"Green");
        ColourCode.put(9,"orange");
        System.out.println(ColourCode);
        ColourCode.remove(4,"Purple");
        System.out.println(ColourCode);
     ColourCode.replace(6,"green","pink");
        System.out.println(ColourCode);
        System.out.println(ColourCode.get(4)); // removed key will be come through null
        System.out.println(ColourCode.get(10));// we can't get new key through get null
        System.out.println(ColourCode.get(2));// We can get only get key whatever we have
        System.out.println(ColourCode.containsKey(3));
        System.out.println(ColourCode.containsValue("purple"));
       ColourCode.replace(9,"orange","brown");// VALUE CAN BE REPLACE AND KEY NEEDS TO BE UNIQUE CAN NPT BE SAME
        System.out.println(ColourCode);



            }
        }



