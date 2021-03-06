package de.tooltime.timetracking.model

import java.time.LocalDateTime
import java.util.UUID

data class TimeTracking(
    val id: UUID,
    val userId: UUID,
    val startTime: LocalDateTime,
    val endTime: LocalDateTime
) {
    companion object
}
