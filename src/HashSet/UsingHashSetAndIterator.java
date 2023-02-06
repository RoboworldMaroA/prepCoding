package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class UsingHashSetAndIterator {
    public static void main(String[] args) {


        HashSet<Integer> hashPosition = new HashSet<Integer>();
        hashPosition.add(11);
        hashPosition.add(11);//if you add another 11 or other repeated number than it will display only one time
        hashPosition.add(13);
        hashPosition.add(1);
        hashPosition.add(14);
        hashPosition.add(15);
        hashPosition.add(6);

        //Hash is automatically set from smaller to the biggest
        System.out.println(hashPosition);

        //crete iterator called it using Iterator java.util library
        Iterator<Integer> it = hashPosition.iterator();
        //check if there is any value in the hash Set and if there is that just print this element
        while(it.hasNext()){
            System.out.println(it.next());

        }




    }






}
