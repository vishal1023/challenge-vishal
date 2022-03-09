package de.tooltime.user.controller.mappers

import de.tooltime.user.controller.dto.UserResponse
import de.tooltime.user.model.User

fun UserResponse.Companion.fromModel(user: User) =
    UserResponse(
        id = user.id,
        firstName = user.firstName,
        lastName = user.lastName
    )
