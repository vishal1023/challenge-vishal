package de.tooltime.webbff.service

import de.tooltime.webbff.persistence.TimeTrackingRepository
import org.springframework.stereotype.Service

@Service
class TimeTrackingService(
    val timeTrackingRepository: TimeTrackingRepository
) {

    fun list() =
        timeTrackingRepository.list()
}
