package com.skipthedishes.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.joda.time.DateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by adriano on 18/03/18.
 *
 * @author Adriano Oliveira
 */

@Validated
@Data
@Document
@JsonIgnoreProperties(value = {"createdAt", "modifiedAt"}, allowGetters = true)
public class OrderItem implements Serializable {
  @ApiModelProperty(value = "The order intem id")
  @Id
  private String id;

  @ApiModelProperty(value = "The order item product")
  private String productId;

  @ApiModelProperty(required = true, value = "The order item price")
  @NotNull
  private Double price;

  @ApiModelProperty(required = true, value = "The order item quantity")
  @NotNull
  private Integer quantity;

  @ApiModelProperty(value = "the oder item total")
  private Double total;

  @ApiModelProperty(value = "The order creation datetime")
  @CreatedDate
  private DateTime createdAt;

  @ApiModelProperty(value = "The order last modified datetime")
  @LastModifiedDate
  private DateTime modifiedAt;
}

