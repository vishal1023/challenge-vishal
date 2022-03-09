package de.tooltime.timetracking.controller

import de.tooltime.timetracking.controller.dto.TimeTrackingResponse
import de.tooltime.timetracking.controller.dto.UserResponse
import de.tooltime.timetracking.controller.mappers.fromModel
import de.tooltime.timetracking.service.TimeTrackingService
import de.tooltime.timetracking.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(
    val userService: UserService,
    val timeTrackingService: TimeTrackingService
) {

    @GetMapping("/user")
    fun listUsers(): ResponseEntity<List<UserResponse>> {
        return ResponseEntity(
            userService.list()
                .map(UserResponse::fromModel),
            HttpStatus.OK
        )
    }

    @GetMapping("/timetracking")
    fun listTimeTracking(): ResponseEntity<List<TimeTrackingResponse>> {
        return ResponseEntity(
            timeTrackingService.list()
                .map(TimeTrackingResponse::fromModel),
            HttpStatus.OK
        )
    }

    @GetMapping("/time-entries-by-username")
    fun timeEntriesByUsername(@RequestParam pageSize: Int, @RequestParam username: String): ResponseEntity<TimeTrackingResponse> {
        return ResponseEntity(HttpStatus.OK)
    }
}
