package de.tooltime.timetracking.persistence

import de.tooltime.timetracking.model.TimeTracking
import de.tooltime.timetracking.persistence.dao.TimeTrackingDao
import org.jetbrains.exposed.sql.transactions.transaction
import org.springframework.stereotype.Repository
import java.time.LocalDateTime
import java.util.UUID

@Repository
class TimeTrackingRepository(
    val timeTrackingDao: TimeTrackingDao
) {

    fun save(startDateTime: LocalDateTime, endDateTime: LocalDateTime, userId: UUID) {
        transaction {
            timeTrackingDao.insert(startDateTime, endDateTime, userId)
        }
    }

    fun list(): List<TimeTracking> =
        transaction {
            return@transaction timeTrackingDao.selectAll()
        }
}
