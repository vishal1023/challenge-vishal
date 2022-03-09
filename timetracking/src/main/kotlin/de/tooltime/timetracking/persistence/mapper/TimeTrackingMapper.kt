package de.tooltime.timetracking.persistence.mapper

import de.tooltime.timetracking.model.TimeTracking
import de.tooltime.timetracking.persistence.table.TimeTrackingTable
import org.jetbrains.exposed.sql.ResultRow

fun TimeTracking.Companion.fromRow(resultRow: ResultRow) = TimeTracking(
    id = resultRow[TimeTrackingTable.id].value,
    startTime = resultRow[TimeTrackingTable.startDate],
    userId = resultRow[TimeTrackingTable.userId],
    endTime = resultRow[TimeTrackingTable.endDate]
)
