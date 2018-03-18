package com.skipthedishes.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by adriano on 18/03/18.
 *
 * @author Adriano Oliveira
 */

@Validated
@NoArgsConstructor
@Data
public class Order   {
  @ApiModelProperty(value = "The order id")
  private Long id;

  @ApiModelProperty(value = "The order date")
  private DateTime date;

  @ApiModelProperty(value = "The customer id")
  private Long customerId;

  @NotNull
  @ApiModelProperty(required = true, value = "The order delivery address")
  private String deliveryAddress;

  @ApiModelProperty(required = true, value = "The order contact")
  @NotNull
  private String contact;

  @ApiModelProperty(required = true, value = "The order store id")
  @NotNull
  private Long storeId;

  @ApiModelProperty(required = true, value = "The order items")
  @NotNull
  @Valid
  private List<OrderItem> orderItems;

  @ApiModelProperty(value = "The order total value")
  private Double total;

  @ApiModelProperty(required = true, value = "The order status")
  @NotNull
  private String status;

  @ApiModelProperty(value = "The order last update datetime")
  private DateTime lastUpdate;

}

