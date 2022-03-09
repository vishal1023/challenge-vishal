package de.tooltime.timetracking.persistence.dao

import de.tooltime.timetracking.model.TimeTracking
import de.tooltime.timetracking.persistence.mapper.fromRow
import de.tooltime.timetracking.persistence.table.TimeTrackingTable
import org.jetbrains.exposed.sql.insertAndGetId
import org.jetbrains.exposed.sql.selectAll
import org.springframework.stereotype.Repository
import java.time.LocalDateTime
import java.util.UUID

@Repository
class TimeTrackingDao {

    fun insert(startDate: LocalDateTime, endDate: LocalDateTime, userId: UUID): UUID = TimeTrackingTable.insertAndGetId {
        it[TimeTrackingTable.userId] = userId
        it[TimeTrackingTable.startDate] = startDate
        it[TimeTrackingTable.endDate] = endDate
    }.value

    fun selectAll(): List<TimeTracking> = TimeTrackingTable.selectAll()
        .map { TimeTracking.fromRow(it) }
}
