package com.saima.expense.controller;

import com.saima.expense.dto.ExpenseDto;
import com.saima.expense.service.ExpenseService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {
    private ExpenseService expenseService;

    @PostMapping
    public ResponseEntity<ExpenseDto> createExpense(
            @RequestBody ExpenseDto expenseDto) {
        ExpenseDto expense = expenseService.createExpense(expenseDto);

        return new ResponseEntity<>(expense, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<ExpenseDto> getExpenseById(@PathVariable("id") Long expenseId) {
        ExpenseDto expense = expenseService.getExpenseById(expenseId);

        return ResponseEntity.ok(expense);
    }

    @GetMapping
    public ResponseEntity<List<ExpenseDto>> getAllExpenses() {
        List<ExpenseDto> expenses = expenseService.getAllExpenses();

        return ResponseEntity.ok(expenses);
    }

    @PutMapping("{id}")
    public ResponseEntity<ExpenseDto> updateExpense(@PathVariable("id") Long expenseId,
                                                    @RequestBody ExpenseDto expenseDto) {
        ExpenseDto updatedExpense = expenseService.updateExpense(expenseId, expenseDto);

        return ResponseEntity.ok(updatedExpense);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteExpense(@PathVariable("id") Long expenseId) {
        expenseService.deleteExpense(expenseId);

        return ResponseEntity.ok("Expense deleted successfully.");
    }
}
