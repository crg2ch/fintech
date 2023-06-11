package com.minsoo.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@EntityScan(basePackages = ["com.minsoo.domain"])
@ComponentScan(basePackages = ["com.minsoo"])
class ApiApplication

fun main(args: Array<String>) {
    runApplication<ApiApplication>(*args)
}