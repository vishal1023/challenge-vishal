package de.tooltime.webbff.persistence

import de.tooltime.webbff.client.user.UserClient
import de.tooltime.webbff.model.User
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
