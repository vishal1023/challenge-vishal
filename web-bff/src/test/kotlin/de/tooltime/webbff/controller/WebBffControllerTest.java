package de.tooltime.webbff.controller;

import de.tooltime.webbff.controller.dto.TimeTrackingResponse;
import de.tooltime.webbff.controller.dto.UserTimeTrackingResponse;
import de.tooltime.webbff.service.TimeTrackingService;
import de.tooltime.webbff.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class WebBffControllerTest {

    @InjectMocks
    private WebBffController webBffController;

    @Mock
    private UserService userService;
    @Mock
    private TimeTrackingService timeTrackingService;

    @Test
    void shouldReturnListOfTimeTrackingEntities() {
        ResponseEntity<List<UserTimeTrackingResponse>> userTimeTrackingResponse = webBffController.timeEntriesByUsername();
        UUID timeTrackingUUID = UUID.randomUUID();
        UUID userId = UUID.randomUUID();
        List<UserTimeTrackingResponse> expectedResult = List.of(
                new UserTimeTrackingResponse(new TimeTrackingResponse(timeTrackingUUID, LocalDateTime.now().minusHours(2),
                        LocalDateTime.now(), userId), "smith")
        );

        assertEquals(HttpStatus.OK, userTimeTrackingResponse.getStatusCode());
        List<UserTimeTrackingResponse> userTimeTrackings = userTimeTrackingResponse.getBody();
        assertEquals(expectedResult, userTimeTrackings);
    }
}
