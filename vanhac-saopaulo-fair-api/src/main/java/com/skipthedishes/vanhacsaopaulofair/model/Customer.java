package com.skipthedishes.vanhacsaopaulofair.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.DateTime;
import org.springframework.validation.annotation.Validated;

/**
 * Created by adriano on 18/03/18.
 *
 * @author Adriano Oliveira
 */

@Validated
@NoArgsConstructor
@Data
public class Customer   {
  @ApiModelProperty(value = "")
  private Long id;

  @ApiModelProperty(required = true, value = "")
  @NotEmpty
  private String email;

  @ApiModelProperty(required = true, value = "")
  @NotEmpty
  private String name;

  @ApiModelProperty(required = true, value = "")
  @NotEmpty
  private String address;

  @ApiModelProperty(value = "")
  private DateTime creation;

  @ApiModelProperty(required = true, value = "")
  @NotEmpty
  private String password;

}

