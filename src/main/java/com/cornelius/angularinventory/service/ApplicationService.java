package com.cornelius.angularinventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cornelius.angularinventory.repositories.ActivitylogRepository;
import com.cornelius.angularinventory.repositories.BrandRepository;
import com.cornelius.angularinventory.repositories.CategoryRepository;
import com.cornelius.angularinventory.repositories.PaymentMethodRepo;
import com.cornelius.angularinventory.repositories.ProductRepository;
import com.cornelius.angularinventory.repositories.StatusRepository;
import com.cornelius.angularinventory.repositories.TransactionRepository;
import com.cornelius.angularinventory.repositories.UserRepository;
import com.cornelius.angularinventory.repositories.UsertypeRepository;

@Service
@Transactional
public class ApplicationService {

	@Autowired
	ActivitylogRepository activitylogRepository;
	@Autowired
	BrandRepository brandRepository;
	@Autowired
	CategoryRepository categoryRepository;
	@Autowired
	PaymentMethodRepo paymentMethodRepo;
	@Autowired
	ProductRepository productRepository;
	@Autowired
	StatusRepository statusRepository;
	@Autowired
	TransactionRepository transactionRepository;
	@Autowired
	UserRepository userRepository;
	@Autowired
	UsertypeRepository usertypeRepository;
	public ActivitylogRepository getActivitylogRepository() {
		return activitylogRepository;
	}
	public void setActivitylogRepository(ActivitylogRepository activitylogRepository) {
		this.activitylogRepository = activitylogRepository;
	}
	public BrandRepository getBrandRepository() {
		return brandRepository;
	}
	public void setBrandRepository(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}
	public CategoryRepository getCategoryRepository() {
		return categoryRepository;
	}
	public void setCategoryRepository(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	public PaymentMethodRepo getPaymentMethodRepo() {
		return paymentMethodRepo;
	}
	public void setPaymentMethodRepo(PaymentMethodRepo paymentMethodRepo) {
		this.paymentMethodRepo = paymentMethodRepo;
	}
	public ProductRepository getProductRepository() {
		return productRepository;
	}
	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	public StatusRepository getStatusRepository() {
		return statusRepository;
	}
	public void setStatusRepository(StatusRepository statusRepository) {
		this.statusRepository = statusRepository;
	}
	public TransactionRepository getTransactionRepository() {
		return transactionRepository;
	}
	public void setTransactionRepository(TransactionRepository transactionRepository) {
		this.transactionRepository = transactionRepository;
	}
	public UserRepository getUserRepository() {
		return userRepository;
	}
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	public UsertypeRepository getUsertypeRepository() {
		return usertypeRepository;
	}
	public void setUsertypeRepository(UsertypeRepository usertypeRepository) {
		this.usertypeRepository = usertypeRepository;
	}
	
}
