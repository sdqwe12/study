package com.mh.fileex.user;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {
    //테이블 정의
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;
    
    @Column(name ="email", nullable = false, length = 50, unique = true)
    private String email;
    //여기서 정규식 쓰지는 마셈 유효성 검사는 dto에서 해야함
    private String password;
    private String role;
    private String imagePath;

}
