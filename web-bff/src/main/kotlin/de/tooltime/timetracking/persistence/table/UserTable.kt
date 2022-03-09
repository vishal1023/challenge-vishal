package de.tooltime.timetracking.persistence.table

import org.jetbrains.exposed.dao.id.UUIDTable

object UserTable : UUIDTable("user") {
    val firstName = text("first_name")
    val lastName = text("last_name")
}
