package com.iamvickyav.data

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="STUDENT")
class Student {

    @Id
    Integer id

    @Column(name = "name")
    String name
}
