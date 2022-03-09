package de.tooltime.timetracking.model

import java.util.UUID

data class User(
    val id: UUID,
    val firstName: String,
    val lastName: String
) {
    companion object
}
