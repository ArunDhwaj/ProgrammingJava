/*
@Author: Arun Dhwaj
@Date: 23rd Jan, 2019
@Purpose: The "ForEach" feature introduced in Java8, in Iterable interface 
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.lang.Integer;

public class Java8ForEach 
{
    public static void main(String[] args) 
    {
        //1) creating sample Collection
        List<Integer> myList = new ArrayList<Integer>();
        for(int i=0; i<10; i++) myList.add(i);
    
        //2) Traversing using Iterator
        Iterator<Integer> it = myList.iterator();
        while(it.hasNext())
        {
            Integer i = it.next();
            System.out.println("Iterator Value::"+i);
        }

        //3) Traversing through forEach method of Iterable with anonymous class
        myList.forEach(new Consumer<Integer>() 
        {
            public void accept(Integer t) 
            {
                System.out.println("forEach anonymous class Value::"+t);
            }
        });
        
        //4) Traversing with Consumer interface implementation
        MyConsumer action = new MyConsumer();
        myList.forEach(action);
    }

    //5) Consumer implementation that can be reused
    static class MyConsumer implements Consumer<Integer>
    {
        public void accept(Integer t) 
        {
            System.out.println("Consumer impl Value::"+t);
        }
    }
}
