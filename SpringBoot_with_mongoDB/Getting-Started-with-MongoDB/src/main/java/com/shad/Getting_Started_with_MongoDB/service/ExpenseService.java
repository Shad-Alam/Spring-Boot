package com.shad.Getting_Started_with_MongoDB.service;

import com.shad.Getting_Started_with_MongoDB.model.Expense;
import com.shad.Getting_Started_with_MongoDB.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }


    public void addExpense(Expense expense){
        expenseRepository.insert(expense);
    }

    public List<Expense> getAllExpense(){
        return expenseRepository.findAll();
    }

    public void updateExpense(Expense expense){
        Expense savedExpense = expenseRepository.findById(expense.getId()).orElseThrow(() -> new RuntimeException(String.format("Cannot find Expense by Id %s", expense.getId())));
        savedExpense.setExpenseName(expense.getExpenseName());
        savedExpense.setExpenseCategory(expense.getExpenseCategory());
        savedExpense.setExpenseAmount(expense.getExpenseAmount());
        expenseRepository.save(expense);
    }

    public Expense getExpenseByName(String name){
        return expenseRepository.findByName(name).orElseThrow(
                () -> new RuntimeException(String.format("Cannot find Expense by Name %s", name)));
    }

    public void deleteExpense(String id){
        expenseRepository.deleteById(id);
    }
}
