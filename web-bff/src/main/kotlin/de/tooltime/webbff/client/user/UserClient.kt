package de.tooltime.webbff.client.user

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "userClient", url = "http://user-service:8080")
interface UserClient {

    @GetMapping("/user")
    fun listUsers(): List<UserResponse>
}
