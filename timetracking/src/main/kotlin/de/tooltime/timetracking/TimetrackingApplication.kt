package de.tooltime.timetracking

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class TimetrackingApplication

fun main(args: Array<String>) {
    runApplication<TimetrackingApplication>(*args)
}
