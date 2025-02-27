package com.example.presentation.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/test")
@RestController
class PostConstructTestRestController : AbstractPostConstructTestController()
