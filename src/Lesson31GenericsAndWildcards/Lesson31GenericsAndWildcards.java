package Lesson31GenericsAndWildcards;

// advanced topic

import java.util.ArrayList;

class Automobile {
    @Override
    public String toString() {
        return "I am an automobile!";
    }

    public void start() {
        System.out.println("Machine starting.");
    }
}

class Audi extends Automobile {
    @Override
    public String toString() {
        return "I am an audi!";
    }

    public void beep() {
        System.out.println("Beep!");
    }
}

public class Lesson31GenericsAndWildcards {
    public static void main(String[] args) {

        ArrayList</*String*/Automobile> list1 = new ArrayList<>();
        // list.add("one");
        // list.add("two");
        list1.add(new Automobile());
        list1.add(new Automobile());

        ArrayList<Audi> list2 = new ArrayList<>();
        list2.add(new Audi());
        list2.add(new Audi());

        //showList(list1);
       // showList(list2); // error: in fact, ArrayList<Audi> is not a subclass of ArrayList<Automobile>
        /*
        Audi extends Automobile, but ArrayList<Audi> is not a subclass of ArrayList<Automobile>
        "?" as a parameter in showList declaration is a solution; allows to pass any kind of arrayList
         */

        showList1(list1);
        showList2(list2);
        showList3(list1);
    }

   public static void showList1(ArrayList</*String*//*Automobile*/?> list) { // "?" is called a "Wildcard" in this context
        for(/*String*//*Automobile*/Object value: list) {  // works: Object is a superclass for Audi and Automobile
             System.out.println(value);
        }
    }

    public static void showList2(ArrayList<? extends Automobile> list) {
        for(Automobile value: list) {
            System.out.println(value);
            value.start();
            // value.beep(); // extends Automobile: error; Automobile methods but not child methods
        }
    }

    public static void showList3(ArrayList<? super Audi> list) {
        for(Object value: list) {
            System.out.println(value);
        }
    }
}