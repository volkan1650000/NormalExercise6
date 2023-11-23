package Exercises;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

//Taken from Google coding interview, in old phones the letters were written using numbers and each number
//included some letters in them like shown below in the static block. The method returns a hashmap with strings
//being keys and with the values of the keys being true or false depending on if the words can be written with the
//numbers input.


public class First {
    static LinkedHashMap<Byte, String> letterRepresent = new LinkedHashMap<>();
    static{
        letterRepresent.put((byte)0,"");
        letterRepresent.put((byte)1,"");
        letterRepresent.put((byte)2,"abc");
        letterRepresent.put((byte)3,"def");
        letterRepresent.put((byte)4,"ghi");
        letterRepresent.put((byte)5,"jkl");
        letterRepresent.put((byte)6,"mno");
        letterRepresent.put((byte)7,"pqrs");
        letterRepresent.put((byte)8,"tuv");
        letterRepresent.put((byte)9,"wxyz");
    }

    public static void main(String[]args){
        LinkedHashSet<String> words = new LinkedHashSet<>();
        words.add("clen");
        words.add("clemdot");
        words.add("ajfodnu");

        String nr = "2536368";
        System.out.println(writable(nr,words));
    }

    public static LinkedHashMap<String, Boolean> writable(String phone, LinkedHashSet<String>words){
        LinkedHashMap<String,Boolean> outcome = new LinkedHashMap<>();
        int length = phone.length();
        outerLoop:
        for(String w : words){
            if(w.length()!=length){
                outcome.put(w,false);
                continue;
            }
            for(int i = 0; i<length; i++){
                Byte digit = Byte.valueOf(phone.charAt(i)+"");
                if(!letterRepresent.get(digit).contains(w.charAt(i)+"")){
                    outcome.put(w,false);
                    continue outerLoop;
                }
            }
            outcome.put(w,true);
        }
        return outcome;
    }
}
