package de.tooltime.timetracking.controller.mapper

import de.tooltime.timetracking.controller.dto.TimeTrackingResponse
import de.tooltime.timetracking.model.TimeTracking

fun TimeTrackingResponse.Companion.fromModel(timeTracking: TimeTracking) =
    TimeTrackingResponse(
        id = timeTracking.id,
        startDateTime = timeTracking.startTime,
        endDateTime = timeTracking.endTime,
        userId = timeTracking.userId
    )
