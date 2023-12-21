package murraco.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import murraco.model.Role;

import java.util.List;

@Data
@NoArgsConstructor
public class UserDataDTO {

    @ApiModelProperty(position = 0)
    private String username;
    @ApiModelProperty(position = 1)
    private String email;
    @ApiModelProperty(position = 2)
    private String password;
    @ApiModelProperty(position = 3)
    private String firstname;
    @ApiModelProperty(position = 4)
    private String lastname;
    @ApiModelProperty(position = 5)
    List<Role> roles;

}
