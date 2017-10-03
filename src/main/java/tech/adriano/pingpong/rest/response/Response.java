package tech.adriano.pingpong.rest.response;

import lombok.Builder;
import lombok.Data;

/**
 * Created by adriano on 03/10/17.
 */
@Data
@Builder
public class Response {
    private String status;
    private Integer success;
    private Integer failure;
    private String data;
}
