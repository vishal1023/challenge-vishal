package de.tooltime.user.persistence

import de.tooltime.user.model.User
import de.tooltime.user.persistence.dao.UserDao
import org.jetbrains.exposed.sql.transactions.transaction
import org.springframework.stereotype.Repository

@Repository
class UserRepository(
    val userDao: UserDao
) {

    fun save(firstName: String, lastName: String) {
        transaction {
            userDao.insert(firstName, lastName)
        }
    }

    fun list(): List<User> =
        transaction {
            return@transaction userDao.selectAll()
        }
}
