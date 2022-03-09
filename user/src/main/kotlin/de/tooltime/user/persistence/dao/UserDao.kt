package de.tooltime.user.persistence.dao

import de.tooltime.user.model.User
import de.tooltime.user.persistence.mapper.fromRow
import de.tooltime.user.persistence.table.UserTable
import org.jetbrains.exposed.sql.insertAndGetId
import org.jetbrains.exposed.sql.selectAll
import org.springframework.stereotype.Repository
import java.time.LocalDateTime
import java.util.UUID

@Repository
class UserDao {

    fun insert(firstName: String, lastName: String): UUID = UserTable.insertAndGetId {
        it[UserTable.firstName] = firstName
        it[UserTable.lastName] = lastName
    }.value

    fun selectAll(): List<User> = UserTable.selectAll()
        .map { User.fromRow(it) }
}
