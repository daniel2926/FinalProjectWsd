//package LIFE.Coffee2.demo.entity;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "Member")
//public class Member {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY  )
//    private Long id;
//    @Column(name = "RegisterName", nullable = false)
//    private String name;
//    @Column(name = "EmailMember" )
//    private String memberEmail;
//    @Column(name = "PasswordMember")
//    private String password;
//
//
//
//    public String getMemberEmail() {
//        return memberEmail;
//    }
//
//    public Member() {
//    }
//
//    public void setMemberEmail(String memberEmail) {
//        this.memberEmail = memberEmail;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//
//
//}