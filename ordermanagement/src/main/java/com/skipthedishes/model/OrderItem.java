package com.skipthedishes.model;

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

  @ApiModelProperty(required = true, value = "The order item product id")
  @NotNull
  private Long productId;

  @ApiModelProperty(value = "The order item product")
  @Valid
  private Product product;

  @ApiModelProperty(required = true, value = "The order item price")
  @NotNull
  private Double price;

  @ApiModelProperty(required = true, value = "The order item quantity")
  @NotNull
  private Long quantity;

  @ApiModelProperty(value = "the oder item total")
  private Double total;

}

