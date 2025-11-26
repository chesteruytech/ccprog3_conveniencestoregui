package com.dlsu.ccs.ccprogthree.constogui.ccprog3_conveniencestoregui;

public class ManagementViewModel {
    private Product productViewModel;
    private Employee employeeViewModel;

    public ManagementViewModel(Product productViewModel, Employee employeeViewModel) {
        this.productViewModel = productViewModel;
        this.employeeViewModel = employeeViewModel;
    }

    public Product getProductViewModel() {
        return productViewModel;
    }

    public void setProductViewModel(Product productViewModel) {
        this.productViewModel = productViewModel;
    }

    public Employee getEmployeeViewModel() {
        return employeeViewModel;
    }

    public void setEmployeeViewModel(Employee employeeViewModel) {
        this.employeeViewModel = employeeViewModel;
    }
}
