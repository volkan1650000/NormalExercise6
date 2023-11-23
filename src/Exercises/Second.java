package Exercises;

//Two codes, explanations are above them

public class Second {
    public static void main(String[] args) {

        //A way to find the length of a string without using the length method at all
        String a = "Hello guys";
        int i = 0;
        while (true) {
            try{
                a.charAt(i);
                i++;
            }catch (IndexOutOfBoundsException e){
                break;
            }
        }
        System.out.println(i);
    }
}
