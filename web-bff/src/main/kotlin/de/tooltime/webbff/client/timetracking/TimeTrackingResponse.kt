package de.tooltime.webbff.client.timetracking

import java.time.LocalDateTime
import java.util.UUID

data class TimeTrackingResponse(
    val id: UUID,
    val startDateTime: LocalDateTime,
    val endDateTime: LocalDateTime,
    val userId: UUID
) {
    companion object
}
