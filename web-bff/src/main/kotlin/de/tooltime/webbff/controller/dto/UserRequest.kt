package de.tooltime.webbff.controller.dto

import java.util.UUID

data class UserRequest(
    val userId: UUID,
    val firstName: String,
    val lastName: String
)
