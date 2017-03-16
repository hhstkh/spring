package com.springtutorial.entity;

import java.io.Serializable;
import java.util.Base64;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Entity
@Table(name = "product")
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2921127431540375777L;
	
	@Id
    @Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	
	@Column(name = "product_name", length = 255, nullable = false)
    private String productName;
	
	@Column(name = "price", nullable = false)
    private double price;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_date", nullable = false)
	private Date createdDate = new Date();
	
	private String description;
	
	@Column(name = "product_img")
	private byte[] productImg;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "category_id", nullable = false, foreignKey = @ForeignKey(name = "FK_PRODUCT_CATEGORY"))
	private Category category;
	
	@Transient
	private CommonsMultipartFile[] multipartFiles;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public byte[] getProductImg() {
		return productImg;
	}

	public void setProductImg(byte[] productImg) {
		this.productImg = productImg;
	}

	public CommonsMultipartFile[] getMultipartFiles() {
		return multipartFiles;
	}

	public void setMultipartFiles(CommonsMultipartFile[] multipartFiles) {
		this.multipartFiles = multipartFiles;
	}

	public String getImageBase64() {
		return new String(Base64.getEncoder().encode(this.getProductImg()));
	}
	
}
