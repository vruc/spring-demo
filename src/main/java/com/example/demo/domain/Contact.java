package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


/**
 * 这是一个实体对象。
 *
 * 对象在映射数据库列时，可以通过在属性上分别配置@Column
 *
 */

@Data
@Entity

//@SqlResultSetMapping(
//        name = "conatctMapping",
//        entities = @EntityResult(
//                entityClass = Contact.class,
//                fields = {
//                        @FieldResult(name = "name", column = "name"),
//                        @FieldResult(name = "phone", column = "phone"),
//                        @FieldResult(name = "mail", column = "mail")})
//)

@AllArgsConstructor
@NoArgsConstructor
public class Contact {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

//    @Column(name = "name")
    private String name;

//    @Column(name = "phone")
    private String phone;

//    @Column(name = "mail")
    private String mail;

    public Contact(String name, String phone, String mail) {
        this.name = name;
        this.phone = phone;
        this.mail = mail;
    }
}
