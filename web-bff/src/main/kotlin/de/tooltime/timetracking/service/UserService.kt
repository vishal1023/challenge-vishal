package de.tooltime.timetracking.service

import de.tooltime.timetracking.persistence.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
    val userRepository: UserRepository
) {

    fun list() =
        userRepository.list()
}
