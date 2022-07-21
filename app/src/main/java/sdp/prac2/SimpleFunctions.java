package sdp.prac2;

import java.util.*;


public class SimpleFunctions {
    public static void main(String[] args) {
        System.out.println(Task5());
    }
    public SimpleFunctions() {}


  
    public static boolean Task5(List<Integer> numbers) {
        Boolean sorted = true;
         
        // check if list is sorted assending order
       for (int i = 0; i < numbers.size() ; i++) {
           System.out.println(numbers.get(i));
           
           if((i+1 < numbers.size()) && numbers.get(i) > numbers.get(i+1)){
               sorted = false;
               break;
           }
       }
       //descending order
       if(sorted == false) {
       for (int i = 0; i < numbers.size(); i++) {
           System.out.println(numbers.get(i));

          if ((i+1) >= numbers.size()) {
               break;
           }//out of range

           if(numbers.get(i) > numbers.get(i+1)){
               sorted = true;
           }else {
               sorted = false;   
               break;
           }
           
       }
       }
        return sorted;
    }
}

