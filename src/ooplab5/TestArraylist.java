package ooplab5;

import java.util.ArrayList;

public class TestArraylist {
    public static void main(String[] args) {

        ArrayList list=new ArrayList();
        list.add("MOOK");
        list.add("joy");
        list.add("far");
        System.out.println(list);
        System.out.println(list.size());
        list.remove(1);
        System.out.println(list);
        list.add(1,"wan");
        System.out.println(list);

        //print with for loop

        for (int i=0;i<list.size();i++) {


            System.out.println(list.get(i));

        } //for i
            System.out.println(list.indexOf("wan"));
        list.set(1, "baby");
        System.out.println(list);
    }//main
}//class
