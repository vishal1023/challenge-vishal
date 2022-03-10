package de.tooltime.webbff.service

import de.tooltime.webbff.controller.dto.UserTimeTrackingResponse

class UserTimeTrackingAggregator(
    val userService: UserService,
    val timeTrackingService: TimeTrackingService,
) {

    fun list(): List<UserTimeTrackingResponse> {
        val numberOfEntitiesRequired = 5;
        val sortedUsers = userService.list();//sorted users
    }

}