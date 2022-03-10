package de.tooltime.webbff.service

import de.tooltime.webbff.persistence.TimeTrackingRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class TimeTrackingService(
    val timeTrackingRepository: TimeTrackingRepository
) {

    fun list(userIds: List<UUID>) =
        timeTrackingRepository.list()
}
