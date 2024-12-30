package com.saima.expense.service.impl;

import com.saima.expense.dto.ExpenseDto;
import com.saima.expense.entity.Category;
import com.saima.expense.entity.Expense;
import com.saima.expense.exceptions.ResourceNotFoundException;
import com.saima.expense.mapper.ExpenseMapper;
import com.saima.expense.repository.CategoryRepository;
import com.saima.expense.repository.ExpensesRepository;
import com.saima.expense.service.ExpenseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class ExpenseServiceImpl implements ExpenseService {
    private ExpensesRepository expensesRepository;
    private CategoryRepository categoryRepository;

    @Override
    public ExpenseDto createExpense(ExpenseDto expenseDto) {
        Expense expense = ExpenseMapper.mapToExpense(expenseDto);

        Expense savedExpense = expensesRepository.save(expense);

        return ExpenseMapper.mapToExpenseDto(savedExpense);
    }

    @Override
    public ExpenseDto getExpenseById(Long expenseId) {
        Expense expense = expensesRepository.findById(expenseId)
                .orElseThrow(() -> new ResourceNotFoundException("Expense not found with id: " + expenseId));

        return ExpenseMapper.mapToExpenseDto(expense);
    }

    @Override
    public List<ExpenseDto> getAllExpenses() {
        List<Expense> expenses = expensesRepository.findAll();

        return expenses.stream()
                .map((expense) -> ExpenseMapper.mapToExpenseDto(expense))
                .collect(Collectors.toList());
    }

    @Override
    public ExpenseDto updateExpense(Long expenseId, ExpenseDto expenseDto) {
        Expense expense = expensesRepository.findById(expenseId)
                .orElseThrow(() -> new ResourceNotFoundException("Expense not found with id: " + expenseId));

        expense.setAmount(expenseDto.amount());
        expense.setExpenseDate(expenseDto.expenseDate());

        if(expenseDto.categoryDto() != null) {
            Category category = categoryRepository.findById(expenseDto.categoryDto().id())
                    .orElseThrow(() -> new ResourceNotFoundException("Category not found with id: " +
                            expenseDto.categoryDto().id()));

            expense.setCategory(category);
        }

        Expense updatedExpense = expensesRepository.save(expense);

        return ExpenseMapper.mapToExpenseDto(updatedExpense);
    }

    @Override
    public void deleteExpense(Long expenseId) {
        Expense expense = expensesRepository.findById(expenseId)
                .orElseThrow(() -> new ResourceNotFoundException("Expense not found with id: " + expenseId));

        expensesRepository.delete(expense);
    }
}
