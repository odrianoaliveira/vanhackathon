package com.skipthedishes.vanhacsaopaulofair.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Created by adriano on 18/03/18.
 *
 * @author Adriano Oliveira
 */

@Validated
@NoArgsConstructor
@Data
public class OrderItem   {
  @ApiModelProperty(value = "The order intem id")
  private Long id;

  @ApiModelProperty(required = true, value = "The order id")
  @NotNull
  private Long orderId;

  @ApiModelProperty(required = true, value = "")
  @NotNull
  private Long productId;

  @ApiModelProperty(value = "")
  @Valid
  private Product product;

  @ApiModelProperty(required = true, value = "")
  @NotNull
  private Double price;

  @ApiModelProperty(required = true, value = "")
  @NotNull
  private Long quantity;

  @ApiModelProperty(value = "")
  private Double total;

}

