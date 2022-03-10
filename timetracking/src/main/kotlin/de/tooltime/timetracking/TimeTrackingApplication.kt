package de.tooltime.timetracking

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class TimeTrackingApplication

fun main(args: Array<String>) {
    runApplication<TimeTrackingApplication>(*args)
}
