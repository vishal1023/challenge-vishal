package de.tooltime.user.service

import de.tooltime.user.persistence.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
    val userRepository: UserRepository
) {

    fun save(firstName: String, lastName: String) {
        userRepository.save(firstName, lastName)
    }

    fun list() =
        userRepository.list()
}
