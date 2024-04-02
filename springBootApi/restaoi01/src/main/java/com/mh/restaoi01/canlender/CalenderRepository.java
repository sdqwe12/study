package com.mh.restaoi01.canlender;
import com.mh.restaoi01.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface CalenderRepository extends JpaRepository<User, String> {


    @Query(value = "SELECT (d.dcalories - COALESCE(e.ecalories * r.rmin, 0)) AS calorie_difference, r.rdate\n" +
            "FROM diet d\n" +
            "LEFT JOIN record r ON (d.id = r.id AND d.ddate = r.rdate)\n" +
            "LEFT JOIN exercise e ON (r.ename = e.ename AND r.id = :id)\n" +
            "WHERE d.id = :id\n" +
            "ORDER BY r.rdate", nativeQuery = true)
    public List<Object[]> findCalorieDifferencePerDay(@Param("id") String id);

    @Query(value = "SELECT dname FROM diet WHERE id = :id", nativeQuery = true)
    String abc(@Param("id") String id);

//    @Query(value = "SELECT (d.dcalories - COALESCE(e.ecalories * r.rmin, 0)) AS calorie_difference, r.rdate\n" +
//            "FROM diet d\n" +
//            "LEFT JOIN record r ON (d.id = r.id AND d.ddate = r.rdate)\n" +
//            "LEFT JOIN exercise e ON (r.ename = e.ename AND r.id = :id)\n" +
//            "ORDER BY r.rdate", nativeQuery = true)
//    public List<Object[]> findCalorieDifferencePerDay(@Param("id") String id);

//    @Query(value = "SELECT ecalories*rmin AS calresult FROM exercise e , record r WHERE e.ename = r.ename AND id ='ab001'",nativeQuery = true)
//    public List<String> calenderFKsql(String id);
//
//    @Query(value = "SELECT dcalories FROM diet WHERE id = 'ab001' ORDER BY ddate",nativeQuery = true)
//    public List<String> calenderfoodsql(String id);
}
