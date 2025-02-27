package com.example.infrastructure.persistence.r2dbc.repository

import com.example.infrastructure.persistence.r2dbc.entity.UserEntity
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserR2dbcRepository : CoroutineCrudRepository<UserEntity, Long>
