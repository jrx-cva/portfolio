package modelos;
// Generated 31 ene. 2021 21:38:34 by Hibernate Tools 5.4.21.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Orders generated by hbm2java
 */
public class Orders implements java.io.Serializable {
	private int orderNumber;
	private Customers customers;
	private Date orderDate;
	private Date requiredDate;
	private Date shippedDate;
	private String status;
	private String comments;
	private Set<Orderdetails> orderdetailses = new HashSet<Orderdetails>(0);

	public Orders() {
	}

	public Orders(int orderNumber, Customers customers, Date orderDate, Date requiredDate, String status) {
		this.orderNumber = orderNumber;
		this.customers = customers;
		this.orderDate = orderDate;
		this.requiredDate = requiredDate;
		this.status = status;
	}

	public Orders(int orderNumber, Customers customers, Date orderDate, Date requiredDate, Date shippedDate,
			String status, String comments, Set orderdetailses) {
		this.orderNumber = orderNumber;
		this.customers = customers;
		this.orderDate = orderDate;
		this.requiredDate = requiredDate;
		this.shippedDate = shippedDate;
		this.status = status;
		this.comments = comments;
		this.orderdetailses = orderdetailses;
	}

	public int getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Customers getCustomers() {
		return this.customers;
	}

	public void setCustomers(Customers customers) {
		this.customers = customers;
	}

	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getRequiredDate() {
		return this.requiredDate;
	}

	public void setRequiredDate(Date requiredDate) {
		this.requiredDate = requiredDate;
	}

	public Date getShippedDate() {
		return this.shippedDate;
	}

	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Set getOrderdetailses() {
		return this.orderdetailses;
	}

	public void setOrderdetailses(Set orderdetailses) {
		this.orderdetailses = orderdetailses;
	}

	@Override
	public String toString() {
		return "Orders [orderNumber=" + orderNumber + ", orderDate=" + orderDate
				+ ", requiredDate=" + requiredDate + ", shippedDate=" + shippedDate + ", status=" + status
			    + "]";
	}
}
