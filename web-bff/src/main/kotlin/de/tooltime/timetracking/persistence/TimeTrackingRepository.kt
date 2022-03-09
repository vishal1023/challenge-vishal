package de.tooltime.timetracking.persistence

import de.tooltime.timetracking.client.timetracking.TimeTrackingClient
import de.tooltime.timetracking.model.TimeTracking
import org.springframework.stereotype.Repository

@Repository
class TimeTrackingRepository(
    val timeTrackingClient: TimeTrackingClient
) {

    fun list(): List<TimeTracking> = timeTrackingClient.listTimeEntries().map {
        TimeTracking(
            id = it.id,
            startDateTime = it.startDateTime,
            endDateTime = it.endDateTime,
            userId = it.userId
        )
    }
}
