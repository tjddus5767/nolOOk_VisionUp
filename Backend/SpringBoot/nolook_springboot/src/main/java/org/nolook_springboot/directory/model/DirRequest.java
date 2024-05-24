package org.nolook_springboot.directory.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.NotEmpty;
import jdk.jfr.Timestamp;
import lombok.*;
import org.nolook_springboot.user.db.UserEntity;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class DirRequest {

     @NotEmpty
     private Long userId;
     @NotEmpty
     private String directoryName;

}
