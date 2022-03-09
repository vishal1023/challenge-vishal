package de.tooltime.timetracking.controller.mappers

import de.tooltime.timetracking.controller.dto.UserResponse
import de.tooltime.timetracking.model.User

fun UserResponse.Companion.fromModel(user: User) =
    UserResponse(
        id = user.id,
        firstName = user.firstName,
        lastName = user.lastName
    )
