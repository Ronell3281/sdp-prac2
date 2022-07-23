package sdp.prac2;

import java.util.*;


public class SimpleFunctions {
    // public static void main(String[] args) {
    //     List<Integer> list = new ArrayList<>();
    //     List<Integer> index = new ArrayList<>();
    //     list.add(3);
    //     index.add(0);
    //     list.add(3);
    //     index.add(1);
    //     list.add(3);
    //     index.add(2);

    //     System.out.println(Task1(list, index));
    // }
    public SimpleFunctions() {}

    public static int Task1(List<Integer> a, List<Integer> b) {

        int sum = 0;
        for (int i = 0; i < b.size(); i++) {
            if (b.get(i) < (a.size())) {
                sum = sum + a.get(b.get(i));
            }

        }
        return sum;

    }

  
    public static boolean Task5(List<Integer> numbers) {
        Boolean sorted = true;
         
        // check if list is sorted assending order
       for (int i = 0; i < numbers.size() ; i++) {
           
           if((i+1 < numbers.size()) && numbers.get(i) > numbers.get(i+1)){
               sorted = false;
               break;
           }
       }
       //descending order
       if(sorted == false) {
       for (int i = 0; i < numbers.size(); i++) {

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

