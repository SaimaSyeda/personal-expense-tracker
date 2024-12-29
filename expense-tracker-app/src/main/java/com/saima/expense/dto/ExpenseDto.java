package com.saima.expense.dto;

import com.saima.expense.entity.Category;

import java.math.BigDecimal;
import java.time.LocalDate;

public record ExpenseDto(Long id,
                         BigDecimal amount,
                         LocalDate expenseDate,
                         Category category) {
}
