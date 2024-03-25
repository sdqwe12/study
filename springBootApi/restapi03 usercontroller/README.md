MVC 기본설정 
============================================================
이해...(듣는거) 외우기...(적어보기) 응용...(적어보기)

=============================================================
Controller -> 주소 맵핑
Service -> 기능구현..
regist() .. 해당하는 USER 검색 by email
USER 저장..
Repository -> JPA
insert select update delete
Entity
-> DB Table 설계
Dto
-> 프론트쪽에서 넘어오는 파라메타 설계
=============================================================
-> DTO -> ENTITY
Builder of 함수를 호출해서
BeanUtils.copyproperties() 속성값복사
ModelMapper속성값 복사
<dependency>
    <groupId>org.modelmapper</groupId>
    <artifactId>modelmapper</artifactId>
    <version>3.2.0</version>
</dependency>
=============================================================
프론트 쪽에서 데이터인 DTO 클래스를 넘겨줄때... 유효성검사를 도와주는 클래스
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-validation</artifactId>
</dependency>
DTO 클래스 안에... NotNull Max Min
=============================================================
@ControllerAdvice
AOP 활용한...
예외 발생했을때에 프론트 쪽에 어떤 결과를 보내는 역활..
ErrorResponse 객체 생성
 ErrorCode 있는 내용으로 설정해서 보냅니다.

================================================================
CorsConfig --> 다른 504호 PC 에서 404호 서버에 요청시에
크롬브라우저 허용하지않는데... CORS  
@Override
public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**")
    .allowedOrigins("*")
    .allowedMethods("GET","POST","PUT","DELETE")
    .allowedHeaders("*");
}
==================================================================












