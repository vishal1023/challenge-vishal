package de.tooltime.timetracking.service

import de.tooltime.timetracking.persistence.UserRepository
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
