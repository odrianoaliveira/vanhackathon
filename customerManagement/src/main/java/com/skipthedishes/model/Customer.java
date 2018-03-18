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

/**
 * Created by adriano on 18/03/18.
 *
 * @author Adriano Oliveira
 */

@Validated
@NoArgsConstructor
@Data
@Document
public class Customer  {
    @ApiModelProperty(value = "the customer id")
    @Id
    private String id;

    @ApiModelProperty(required = true, value = "the customer email")
    @NotEmpty
    private String email;

    @ApiModelProperty(required = true, value = "the customer name")
    @NotEmpty
    private String name;

    @ApiModelProperty(required = true, value = "the customer address")
    @NotEmpty
    private String address;

    @ApiModelProperty(value = "the customer creation")
    private DateTime creation;

    @ApiModelProperty(required = true, value = "the customer password")
    @NotEmpty
    private String password;

    @ApiModelProperty(value = "the customer creation datetime")
    @CreatedDate
    private DateTime createdAt;

    @ApiModelProperty(value = "the customer last modified datetime")
    @LastModifiedDate
    private DateTime modifiedAt;

}