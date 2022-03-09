package de.tooltime.timetracking.persistence.mapper

import de.tooltime.timetracking.model.User
import de.tooltime.timetracking.persistence.table.UserTable
import org.jetbrains.exposed.sql.ResultRow

fun User.Companion.fromRow(resultRow: ResultRow) = User(
    id = resultRow[UserTable.id].value,
    firstName = resultRow[UserTable.firstName],
    lastName = resultRow[UserTable.lastName]
)
