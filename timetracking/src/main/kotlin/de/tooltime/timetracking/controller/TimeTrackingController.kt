package de.tooltime.timetracking.controller

import de.tooltime.timetracking.controller.dto.TimeTrackingRequest
import de.tooltime.timetracking.controller.dto.TimeTrackingResponse
import de.tooltime.timetracking.controller.mapper.fromModel
import de.tooltime.timetracking.service.TimeTrackingService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController()
class TimeTrackingController(
    val timeTrackingService: TimeTrackingService
) {

    @PostMapping("/timetracking")
    fun save(@RequestBody timeTrackingRequest: TimeTrackingRequest): ResponseEntity<String> {
        timeTrackingService.save(timeTrackingRequest.startTime, timeTrackingRequest.endTime, timeTrackingRequest.userId)
        return ResponseEntity("OK", HttpStatus.CREATED)
    }

    @GetMapping("/timetracking")
    fun list(): ResponseEntity<List<TimeTrackingResponse>> {
        return ResponseEntity(
            timeTrackingService.list()
                .map(TimeTrackingResponse::fromModel),
            HttpStatus.OK
        )
    }

    @GetMapping("/timetracking/") {

    }
}
