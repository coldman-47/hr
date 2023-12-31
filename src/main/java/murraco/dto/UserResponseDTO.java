package murraco.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import murraco.model.Role;

import java.util.List;

@Data
public class UserResponseDTO {

    @ApiModelProperty(position = 0)
    private Integer id;
    @ApiModelProperty(position = 1)
    private String username;
    @ApiModelProperty(position = 2)
    private String email;
    @ApiModelProperty(position = 3)
    private String firstname;
    @ApiModelProperty(position = 4)
    private String lastname;
    @ApiModelProperty(position = 5)
    List<Role> roles;

}
