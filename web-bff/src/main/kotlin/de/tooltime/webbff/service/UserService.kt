package de.tooltime.webbff.service

import de.tooltime.webbff.persistence.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
    val userRepository: UserRepository
) {

    fun list() =
        userRepository.list()
}
