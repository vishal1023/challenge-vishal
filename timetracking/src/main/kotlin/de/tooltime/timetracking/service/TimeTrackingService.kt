package de.tooltime.timetracking.service

import de.tooltime.timetracking.persistence.TimeTrackingRepository
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import java.util.UUID

@Service
class TimeTrackingService(
    val timeTrackingRepository: TimeTrackingRepository
) {

    fun save(startDate: LocalDateTime, endDate: LocalDateTime, userId: UUID) {
        timeTrackingRepository.save(startDate, endDate, userId)
    }

    fun list() =
        timeTrackingRepository.list()
}
