package com.mh.green2nd.order;


import com.mh.green2nd.user.Resign;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "p_id", nullable = false)
    @Schema(title = "p_id",description = "제품의 고유한 id입니다")
    private int p_id;
    @Column()
    @Schema(title = "제품종류",description = "음료,음식,굿즈의 구분")
    private String p_category;
    @Column()
    @Schema(title = "제품이름",description = "제품의 이름")
    private String p_name;
    @Column()
    @Schema(title = "제품영어이름",description = "제품의 영어이름")
    private String p_ename;
    @Column()
    @Schema(title = "음료옵션",description = "상품의 옵션")
    private int p_op1;
    @Column()
    @Schema(title = "음식옵션",description = "상품의 옵션")
    private int p_op2;
    @Column()
    @Schema(title = "굿즈옵션",description = "상품의 옵션")
    private int p_op3;
    @Column()
    @Schema(title = "제품설명",description = "제품설명")
    private String p_explain;
    @Column()
    @Schema(title = "제품원산지",description = "제품원산지")
    private String p_origin;
    @Column()
    @Schema(title = "제품사이즈",description = "제품사이즈")
    private int p_size;





}
