package de.tooltime.webbff

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class WebBffApplication

fun main(args: Array<String>) {
    runApplication<WebBffApplication>(*args)
}
