//package org.example;
//
//public class Main2 {
//    public static void main(String[] args) {
//
//        Box<String> box1 = new SteelBox<String>();
//        //Box<String> box2 = new SteelBox<Integer>();
//        // 스트링 -> 스트링 ok
//        // 스 - > 인트는 안됨
//        //반대도 마찬가지
//        Box<Integer> box2 = EmptyBoxFactory.makeBox();
//        Box<String> box3 = EmptyBoxFactory.makeBox();
//        //.makebox 앞에 <inteager> 이런거 적어도 되고 안적어도 됨
//        //알아서 가져옴 이런게 타겟뭐시기라고 함
//        // Box<Integer> box4 = EmptyBoxFactory.peekBox(box2);
//         EmptyBoxFactory.peekBox(box3);
//
//    }
//}
