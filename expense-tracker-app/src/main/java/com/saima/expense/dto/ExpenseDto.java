package com.saima.expense.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.time.LocalDate;

@Schema(
        description = "Expense DTO (Data Transfer Object) to transfer the data between client and server"
)
public record ExpenseDto(Long id,
                         @Schema(
                                 name = "Expense amount"
                         )
                         BigDecimal amount,
                         @Schema(
                                 name = "Expense created date"
                         )
                         LocalDate expenseDate,
                         @Schema(
                                 name = "Associated Expense Category"
                         )
                         CategoryDto categoryDto) {
}
