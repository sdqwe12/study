package org.example.cart;

import lombok.Data;

@Data
public class Cart {
    private long cart_id;
    private String reg_time;
    private String update_time;
    private String created_by;
    private String Modified_by;
    private long member_id;
}
