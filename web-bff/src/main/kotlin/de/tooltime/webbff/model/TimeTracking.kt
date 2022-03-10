package de.tooltime.webbff.model

import java.time.LocalDateTime
import java.util.UUID

data class TimeTracking(
    val id: UUID,
    val startDateTime: LocalDateTime,
    val endDateTime: LocalDateTime,
    val userId: UUID
)
