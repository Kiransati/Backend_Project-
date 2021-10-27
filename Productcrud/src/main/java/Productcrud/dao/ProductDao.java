package Productcrud.dao;

import java.util.List;
import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import Productcrud.model.Product;

@Transactional
@Repository
public class ProductDao {

HibernateTemplate template;  
    
	public void setTemplate(HibernateTemplate template) {    
	    this.template = template;    
	} 

	public void save(Product p){    
	    template.save(p);    
	}    
	public void update(Product p){    
	   template.update(p);    
	}    
	public void delete(Product p){    
	   template.delete(p);    
	}    


	public Product getproductById(int id){    
	    Product p = (Product)this.template.get(Product.class, id);
	    return p;  
	}    
	
	
	public List<Product> getProduct(){    
		List<Product> list=new ArrayList<Product>();  
	    list=template.loadAll(Product.class);  
	    return list;     
	}  
}
