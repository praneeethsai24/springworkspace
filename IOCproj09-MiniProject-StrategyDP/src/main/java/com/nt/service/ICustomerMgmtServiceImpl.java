package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.ICustomerDAO;
import com.nt.model.Customer;

@Service("custService")
public class ICustomerMgmtServiceImpl implements ICustomerMgmtService {
	@Autowired
	private ICustomerDAO custDAO;

	@Override
	public String registerCustomer(Customer customer) throws Exception {
		double discountAmount = (customer.getBillamount() * customer.getDiscount() / 100);
		double finalamount = customer.getBillamount() - discountAmount;
		customer.setFinalAmount(finalamount);
		int count = custDAO.insert(customer);
		return count == 0 ? "Customer regisrataion failed"
				: "Customer registered having bill::" + customer.getBillamount() + "cutomer having discout:"
						+ discountAmount + "final amount:" + customer.getFinalAmount();
	}

}
