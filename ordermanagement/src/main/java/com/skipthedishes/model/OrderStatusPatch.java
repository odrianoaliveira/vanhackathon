package com.skipthedishes.model;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.validation.annotation.Validated;

/**
 * Created by adriano on 18/03/18.
 *
 * @author Adriano Oliveira
 */

@Data
public class OrderStatusPatch {
    @NotEmpty
    private OrderStatus status;
}
