package de.tooltime.webbff.controller

import de.tooltime.webbff.controller.dto.TimeTrackingResponse
import de.tooltime.webbff.controller.dto.UserResponse
import de.tooltime.webbff.controller.dto.UserTimeTrackingResponse
import de.tooltime.webbff.controller.mapper.fromModel
import de.tooltime.webbff.service.TimeTrackingService
import de.tooltime.webbff.service.UserService
import de.tooltime.webbff.service.UserTimeTrackingAggregator
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class WebBffController(
        val userService: UserService,
        val timeTrackingService: TimeTrackingService,
        val userTimeTrackingAggregator: UserTimeTrackingAggregator
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
    fun timeEntriesByUsername(): ResponseEntity<List<UserTimeTrackingResponse>> {
        userTimeTrackingAggregator.list()
        return ResponseEntity(HttpStatus.OK)
    }
}
