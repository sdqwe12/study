package com.mh.green2nd.order;

import com.mh.green2nd.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<User, String> {

    @Query(value = "SELECT p_name FROM product WHERE p_category = :category", nativeQuery = true)
        // p_name만 반환하도록 수정
    List<String> viewmenu(@Param("category") String category); // Optional<String> -> List<String>으로 변경

//    List<Order> findByP_category(String category);
}
