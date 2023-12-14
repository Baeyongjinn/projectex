package com.green.projectex.user.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class UserLoginedDto {
    @Schema(title = "유저Id")
    private String uid;
    @Schema(title = "유저Pw")
    private String upw;
}