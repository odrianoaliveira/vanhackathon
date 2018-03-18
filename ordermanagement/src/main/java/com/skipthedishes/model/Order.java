package com.skipthedishes.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.DateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
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
@Data
@Document
@JsonIgnoreProperties(value = {"createdAt", "lastUpdate"}, allowGetters = true)
public class Order {
  @ApiModelProperty(value = "The order id")
  @Id
  private String id;

  @ApiModelProperty(value = "The customer id")
  @NotEmpty
  private String customerId;

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
  private String status;

  @ApiModelProperty(value = "The order creation datetime")
  @CreatedDate
  private DateTime createdAt;

  @ApiModelProperty(value = "The order last modified datetime")
  @LastModifiedDate
  private DateTime lastModified;

}

