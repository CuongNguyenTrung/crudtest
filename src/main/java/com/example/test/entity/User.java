package com.example.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "`user`")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String email;

    private String password;

    @CreationTimestamp
    @Column(name = "created_date")
    private Date createDate;

    @UpdateTimestamp
    @Column(name = "updated_date")
    private Date updateDate;

    private boolean enabled;

    @Column(name = "verification_code")
    private String verificationCode;

    @JoinColumn(name = "user_detail_id")
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private UserDetail userDetail;
}
