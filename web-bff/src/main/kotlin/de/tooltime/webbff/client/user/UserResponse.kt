package de.tooltime.webbff.client.user

import java.util.UUID

data class UserResponse(
    val id: UUID,
    val firstName: String,
    val lastName: String,
) {
    companion object
}

