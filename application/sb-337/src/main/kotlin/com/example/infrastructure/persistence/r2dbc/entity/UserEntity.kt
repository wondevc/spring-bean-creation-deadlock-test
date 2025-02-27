package com.example.infrastructure.persistence.r2dbc.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime

@Table(schema = "sb337", name = "user")
data class UserEntity(
    @Id
    @Column(value = "id")
    val id: Long,
    @Column(value = "email")
    val email: String,
    @Column(value = "password")
    val password: String,
    @Column(value = "first_name")
    val firstName: String,
    @Column(value = "last_name")
    val lastName: String,
    @Column(value = "register_dt")
    val registerDt: LocalDateTime,
    @Column(value = "created_dt")
    val createdDt: LocalDateTime,
    @Column(value = "updated_dt")
    val updatedDt: LocalDateTime,
)
