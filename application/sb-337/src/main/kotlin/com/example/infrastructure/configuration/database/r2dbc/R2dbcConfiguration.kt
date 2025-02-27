package com.example.infrastructure.configuration.database.r2dbc

import org.springframework.context.annotation.Configuration
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories

@EnableR2dbcRepositories(
    basePackages = [
        "com.example.infrastructure.persistence.r2dbc.repository",
    ]
)
@Configuration
class R2dbcConfiguration
