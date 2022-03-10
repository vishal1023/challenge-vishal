package de.tooltime.webbff.controller

import de.tooltime.webbff.controller.dto.TimeTrackingResponse
import de.tooltime.webbff.controller.dto.UserTimeTrackingResponse
import de.tooltime.webbff.service.TimeTrackingService
import de.tooltime.webbff.service.UserService
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.junit.jupiter.MockitoExtension
import org.springframework.http.HttpStatus
import java.time.LocalDateTime
import java.util.*
import java.util.List

@ExtendWith(MockitoExtension::class)
class WebBffControllerTest {
    @InjectMocks
    private val webBffController: WebBffController? = null

    @Mock
    private val userService: UserService? = null

    @Mock
    private val timeTrackingService: TimeTrackingService? = null

    @Test
    fun shouldReturnListOfTimeTrackingEntities() {
        val userTimeTrackingResponse = webBffController!!.timeEntriesByUsername()
        val timeTrackingUUID = UUID.randomUUID()
        val userId = UUID.randomUUID()
        val expectedResult = List.of(
            UserTimeTrackingResponse(
                TimeTrackingResponse(
                    timeTrackingUUID, LocalDateTime.now().minusHours(2),
                    LocalDateTime.now(), userId
                ), "smith"
            )
        )
        Assertions.assertEquals(HttpStatus.OK, userTimeTrackingResponse.statusCode)
        val userTimeTrackings = userTimeTrackingResponse.body!!
        Assertions.assertEquals(expectedResult, userTimeTrackings)
    }
}