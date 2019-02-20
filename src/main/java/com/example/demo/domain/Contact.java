package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@SqlResultSetMapping(
        name = "conatctMapping",
        entities = @EntityResult(
                entityClass = Contact.class,
                fields = {
                        @FieldResult(name = "name", column = "name"),
                        @FieldResult(name = "phone", column = "phone"),
                        @FieldResult(name = "mail", column = "mail")})
)
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "getContactsLikeName",
                procedureName = "proc_get_contacts_like_name",
                resultClasses = {Contact.class},
                parameters = {
                        @StoredProcedureParameter(
                                mode = ParameterMode.IN,
                                name = "name",
                                type = String.class)
                }
        )
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contact {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private String phone;

    @Column(name = "mail")
    private String mail;

    public Contact(String name, String phone, String mail) {
        this.name = name;
        this.phone = phone;
        this.mail = mail;
    }
}
