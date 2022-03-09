package de.tooltime.timetracking.persistence.table

import org.jetbrains.exposed.dao.id.UUIDTable
import org.jetbrains.exposed.sql.javatime.datetime

object TimeTrackingTable : UUIDTable("timetracking") {
    val startDate = datetime("start_date")
    val endDate = datetime("end_date")
    val userId = uuid("user_id")
}
