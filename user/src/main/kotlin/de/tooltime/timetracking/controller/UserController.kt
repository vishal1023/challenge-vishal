package de.tooltime.timetracking.controller

import de.tooltime.timetracking.controller.dto.UserRequest
import de.tooltime.timetracking.controller.dto.UserResponse
import de.tooltime.timetracking.controller.mappers.fromModel
import de.tooltime.timetracking.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(
    val userService: UserService
) {

    @PostMapping("/user")
    fun save(@RequestBody userRequest: UserRequest): ResponseEntity<String> {
        userService.save(userRequest.firstName, userRequest.lastName)
        return ResponseEntity("OK", HttpStatus.CREATED)
    }

    @GetMapping("/user")
    fun list(): ResponseEntity<List<UserResponse>> {
        return ResponseEntity(
            userService.list()
                .map(UserResponse::fromModel),
            HttpStatus.OK
        )
    }
}
