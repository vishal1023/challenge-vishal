package de.tooltime.webbff.controller.mapper

import de.tooltime.webbff.controller.dto.TimeTrackingResponse
import de.tooltime.webbff.model.TimeTracking

fun TimeTrackingResponse.Companion.fromModel(timeTracking: TimeTracking) =
    TimeTrackingResponse(
        id = timeTracking.id,
        startDateTime = timeTracking.startDateTime,
        endDateTime = timeTracking.endDateTime,
        userId = timeTracking.userId
    )
