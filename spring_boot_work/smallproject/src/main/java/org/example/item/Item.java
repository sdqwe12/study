package org.example.item;

import lombok.Builder;
import lombok.Data;
// @Data가 
// @getter @setter @allargconstructor 다 포함된거임 @ToString도 포함
@Data
@Builder
public class Item {
    private long item_id; //자동증가
    private String reg_time;//현재시간 now

    private String update_time;//수정시간
    private String created_by;//로그인했는사람
    private String modified_by;
    private String item_detail;
    private String item_nm;
    private String item_sell_status;
    private int price;
    private int stock_number;
}
