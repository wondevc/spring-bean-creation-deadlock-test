package com.example.infrastructure.persistence.r2dbc.repository

import com.example.infrastructure.persistence.r2dbc.entity.UserEntity
import org.springframework.data.r2dbc.repository.R2dbcRepository
import org.springframework.stereotype.Repository

@Repository
interface UserR2dbcRepository : R2dbcRepository<UserEntity, Long>
