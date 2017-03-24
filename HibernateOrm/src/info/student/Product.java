package info.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT_TBLE",schema="BMS")
public class Product 
{
	
	@Id
	@Column(name="pid")
private Integer pid;

@Column(name="name")

private String name;
@Column(name="price")


private Double price;




public Integer getPid() {
	return pid;
}
public void setPid(Integer pid) {
	this.pid = pid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}

}
