package com.skipthedishes.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

/**
 * Created by adriano on 18/03/18.
 *
 * @author Adriano Oliveira
 */

@Validated
@NoArgsConstructor
@Data
@Document
public class Product {
  @ApiModelProperty(value = "the product id")
  @Id
  private String id;

  @ApiModelProperty(value = "the product name")
  private String name;

  @ApiModelProperty(value = "the product description")
  private String description;

  @ApiModelProperty(value = "the product price")
  private Double price;

  @ApiModelProperty(value = "The order creation datetime")
  @CreatedDate
  @JsonIgnore
  private DateTime createdAt;

  @ApiModelProperty(value = "The order last modified datetime")
  @LastModifiedDate
  @JsonIgnore
  private DateTime modifiedAt;
}

