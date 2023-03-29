package exercises;

import java.awt.desktop.SystemEventListener;
import java.util.*;

public class Try {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList);// [Tom, Jim, Clara, Angie, Mark]

        Iterator<String> myItr = myList.iterator(); // [ Tom,   Jim,   Clara,   Angie,   Mark ]

        while(myItr.hasNext()){
            myItr.next();
            myItr.remove();
        }
        System.out.println(myList);


    }

  }



