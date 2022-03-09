package de.tooltime.webbff.controller.mapper

import de.tooltime.webbff.controller.dto.UserResponse
import de.tooltime.webbff.model.User

fun UserResponse.Companion.fromModel(user: User) =
    UserResponse(
        id = user.id,
        firstName = user.firstName,
        lastName = user.lastName
    )
