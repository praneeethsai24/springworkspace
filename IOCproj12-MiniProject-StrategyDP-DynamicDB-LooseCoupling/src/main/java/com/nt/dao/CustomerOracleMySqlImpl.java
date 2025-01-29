package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Customer;

@Repository("custDAO-mysql")
public class CustomerOracleMySqlImpl implements ICustomerDAO {
	private static final String CUSTOMER_INFO_INSERT_QUERY = "INSERT INTO SPRING_CUSTOMER_INFO(CNAME,CADDRS,BILLAMOUNT,DISCOUNT,FINALAMOUNT)VALUES(?,?,?,?,?)";
	@Autowired
	private DataSource ds;
	int count = 0;

	@Override
	public int insert(Customer cust) throws Exception {
		try (Connection con = ds.getConnection();

				PreparedStatement ps = con.prepareStatement(CUSTOMER_INFO_INSERT_QUERY);) {

			ps.setString(1, cust.getCname());
			ps.setString(2, cust.getAdds());
			ps.setDouble(3, cust.getBillamount());
			ps.setDouble(4, cust.getDiscount());
			ps.setDouble(5, cust.getFinalAmount());

			count = ps.executeUpdate();

		} catch (SQLException se) {
			se.printStackTrace();
			throw se;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return count;
	}

}
