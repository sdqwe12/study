//package com.mh.restaoi01.canlender;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//@RequiredArgsConstructor
//public class CalenderService {
//
//    private final CalenderRespository calenderRespository;
//
//
//    public List<Calender> findRecordPermonth(String id) {
//        List<Calender> recordList = calenderRespository.findAllById(id).orElseThrow(
//                () -> new RuntimeException("정보가 없습니다.")
//        );
//
//
//    }
//
//
//}
