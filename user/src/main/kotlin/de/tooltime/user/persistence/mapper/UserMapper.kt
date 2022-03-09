package de.tooltime.user.persistence.mapper

import de.tooltime.user.model.User
import de.tooltime.user.persistence.table.UserTable
import org.jetbrains.exposed.sql.ResultRow

fun User.Companion.fromRow(resultRow: ResultRow) = User(
    id = resultRow[UserTable.id].value,
    firstName = resultRow[UserTable.firstName],
    lastName = resultRow[UserTable.lastName]
)
