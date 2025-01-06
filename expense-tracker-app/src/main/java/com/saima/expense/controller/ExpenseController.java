package com.saima.expense.controller;

import com.saima.expense.dto.ExpenseDto;
import com.saima.expense.service.ExpenseService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(
        name = "CRUD REST APIs for Expense Resource",
        description = "CRUD REST APIs for Expense Resource - " +
                "Create Expense, Update Expense, Get Expense and Delete Expense"
)
@AllArgsConstructor
@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {
    private ExpenseService expenseService;

    @Operation(
            summary = "Create Expense REST API",
            description = "Create Expense REST API to save expense into the database"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP STATUS 201 CREATED"
    )
    @PostMapping
    public ResponseEntity<ExpenseDto> createExpense(
            @RequestBody ExpenseDto expenseDto) {
        ExpenseDto expense = expenseService.createExpense(expenseDto);

        return new ResponseEntity<>(expense, HttpStatus.CREATED);
    }

    @Operation(
            summary = "Get Expense REST API",
            description = "Get Expense REST API to get expense from the database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP STATUS 200 OK"
    )
    @GetMapping("{id}")
    public ResponseEntity<ExpenseDto> getExpenseById(@PathVariable("id") Long expenseId) {
        ExpenseDto expense = expenseService.getExpenseById(expenseId);

        return ResponseEntity.ok(expense);
    }

    @Operation(
            summary = "Get all Expenses REST API",
            description = "Get all Expenses REST API to get all expenses from the database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP STATUS 200 OK"
    )
    @GetMapping
    public ResponseEntity<List<ExpenseDto>> getAllExpenses() {
        List<ExpenseDto> expenses = expenseService.getAllExpenses();

        return ResponseEntity.ok(expenses);
    }

    @Operation(
            summary = "Update Expense REST API",
            description = "Update Expense REST API to update an existing expense in the database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP STATUS 200 OK"
    )
    @PutMapping("{id}")
    public ResponseEntity<ExpenseDto> updateExpense(@PathVariable("id") Long expenseId,
                                                    @RequestBody ExpenseDto expenseDto) {
        ExpenseDto updatedExpense = expenseService.updateExpense(expenseId, expenseDto);

        return ResponseEntity.ok(updatedExpense);
    }

    @Operation(
            summary = "Delete Expense REST API",
            description = "Delete Expense REST API to Delete an expense from the database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP STATUS 200 OK"
    )
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteExpense(@PathVariable("id") Long expenseId) {
        expenseService.deleteExpense(expenseId);

        return ResponseEntity.ok("Expense deleted successfully.");
    }
}
