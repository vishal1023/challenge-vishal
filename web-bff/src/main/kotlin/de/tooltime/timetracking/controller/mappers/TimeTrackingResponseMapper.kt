package de.tooltime.timetracking.controller.mappers

import de.tooltime.timetracking.controller.dto.TimeTrackingResponse
import de.tooltime.timetracking.model.TimeTracking

fun TimeTrackingResponse.Companion.fromModel(timeTracking: TimeTracking) =
    TimeTrackingResponse(
        id = timeTracking.id,
        startDateTime = timeTracking.startDateTime,
        endDateTime = timeTracking.endDateTime,
        userId = timeTracking.userId
    )
