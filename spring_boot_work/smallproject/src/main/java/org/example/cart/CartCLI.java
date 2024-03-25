package org.example.cart;

import java.util.Scanner;

public class CartCLI {
    public int inputItem() {
        Scanner scan = new Scanner(System.in);
        System.out.println("넣고 싶은 상품 번호 입력하세요");
        String nm = scan.nextLine();
        int idx = scan.nextInt();
        return idx;

    }
}
