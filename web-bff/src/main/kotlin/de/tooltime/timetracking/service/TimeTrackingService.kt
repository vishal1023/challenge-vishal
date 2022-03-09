package de.tooltime.timetracking.service

import de.tooltime.timetracking.persistence.TimeTrackingRepository
import org.springframework.stereotype.Service

@Service
class TimeTrackingService(
    val timeTrackingRepository: TimeTrackingRepository
) {

    fun list() =
        timeTrackingRepository.list()
}
