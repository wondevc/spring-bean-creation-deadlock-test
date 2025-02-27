package com.example.presentation.controller

import com.example.infrastructure.persistence.r2dbc.entity.UserEntity
import com.example.infrastructure.persistence.r2dbc.repository.UserR2dbcRepository
import jakarta.annotation.PostConstruct
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.reactive.asFlow
import kotlinx.coroutines.runBlocking
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller

@Controller
abstract class AbstractPostConstructTestController {
    @Autowired
    private lateinit var userR2dbcRepository: UserR2dbcRepository

    private lateinit var users: List<UserEntity>

    @PostConstruct
    fun init() {
        runBlocking {
            users = userR2dbcRepository.findAll().asFlow().toList()
        }
    }
}
