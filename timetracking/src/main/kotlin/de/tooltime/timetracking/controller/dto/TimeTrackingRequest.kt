package de.tooltime.timetracking.controller.dto

import java.time.LocalDateTime
import java.util.UUID

data class TimeTrackingRequest(
    val userId: UUID,
    val startTime: LocalDateTime,
    val endTime: LocalDateTime
)
