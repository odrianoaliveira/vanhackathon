package com.skipthedishes.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.DateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

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

  @ApiModelProperty(value = "the product store id")
  @NotEmpty
  private String storeId;

  @ApiModelProperty(value = "the product name")
  @NotEmpty
  private String name;

  @ApiModelProperty(value = "the product description")
  @NotEmpty
  private String description;

  @ApiModelProperty(value = "the product price")
  @NotNull
  private Double price;

  @ApiModelProperty(value = "the product creation datetime")
  @CreatedDate
  private DateTime createdAt;

  @ApiModelProperty(value = "the product last modified datetime")
  @LastModifiedDate
  private DateTime modifiedAt;
}

