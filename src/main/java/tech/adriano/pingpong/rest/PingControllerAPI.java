package tech.adriano.pingpong.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.adriano.pingpong.rest.response.Response;

/**
 * Created by adriano on 03/10/17.
 */
@RestController
public class PingControllerAPI {

    @GetMapping(value = "/ping")
    public ResponseEntity<Response> ping() {
        final Response response = Response.builder().status(HttpStatus.OK.toString()).data("pong").failure(0).success(1).build();
        return ResponseEntity.ok(response);
    }
}
