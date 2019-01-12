package com.iamvickyav.data

import org.springframework.data.jpa.repository.JpaRepository

interface MyRepo extends JpaRepository<Student, Integer> {
}
