package de.tooltime.timetracking.persistence

import de.tooltime.timetracking.client.user.UserClient
import de.tooltime.timetracking.model.User
import org.springframework.stereotype.Repository

@Repository
class UserRepository(
    val userClient: UserClient
) {

    fun list(): List<User> = userClient.listUsers().map {
        User(
            firstName = it.firstName,
            lastName = it.lastName,
            id = it.id
        )
    }
}
