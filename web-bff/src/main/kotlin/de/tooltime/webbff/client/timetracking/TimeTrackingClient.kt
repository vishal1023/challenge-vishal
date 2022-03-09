package de.tooltime.webbff.client.timetracking

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "timeTrackingClient", url = "http://timetracking-service:8080")
interface TimeTrackingClient {

    @GetMapping("/timetracking")
    fun listTimeEntries(): List<TimeTrackingResponse>
}
