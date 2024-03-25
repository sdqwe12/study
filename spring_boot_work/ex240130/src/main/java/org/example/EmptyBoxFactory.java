package org.example;

public class EmptyBoxFactory {
    public static <T> Box<T> makeBox(){
        Box<T> box = new Box<T>();
        return box;
    }

    public static void outBox(Box <? extends Toy> box,Toy n){
        Toy toy = box.getObj();
        System.out.println(box);
//        box.setObj(new toy());
    }
// 익스텐즈는 겟만 되고 슈퍼는 셋만 된다
    public static void inBox(Box <? super Toy> box,Toy n){
      //  Toy toy = box.getObj();
      //  System.out.println(box);
        box.setObj(new Toy());
    }

//    public static <T> void peekBox(Box<T> int a) {
//        System.out.println(box);
//    }
//    public static void peekBox(Box<?> box) {
//        System.out.println(box);
//
//    }
}




