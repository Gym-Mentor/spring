# 스프링 스터디 프로젝트

## 요구사항
- **request를 받아서 알맞은 method를 호출하고 response를 반환하는 Controller 구현**
  - @redisController 커스텀 어노테이션 생성
    - request를 받아서 method를 호출하는 역할
    - command, message
  - @redisCommand 커스텀 어노테이션 생성
    - method를 명시하는 역할
 

- **AutoConfiguration 어노테이션 구현**
  - application.yaml에서 설정값을 가져와서 설정
  - @value 어노테이션으로 설정하지 않음

결과
![image](https://github.com/user-attachments/assets/7be539d0-b97d-4f87-8cad-0086e1b4b38b)



참고
- https://pplenty.tistory.com/7
- https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/servlet/mvc/method/annotation/RequestMappingHandlerMapping.html
- https://porolog.tistory.com/m/39
- https://www.oracle.com/technical-resources/articles/java/javareflection.html
- https://hackernoon.com/creating-custom-controller-annotation-with-spring-boot
