package Productcrud.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Productcrud.dao.ProductDao;
import Productcrud.model.Product;

@Controller
public class ProductController {


	@Autowired  
	ProductDao dao;
	
	@RequestMapping("/index")
	public String index() 
	{
		return "index";	
	}
	
    @RequestMapping("/productform")    
    public String showform(Model m){    
        m.addAttribute("command", new Product());  
        return "productform";   
    }   
    
    @RequestMapping(value="/save",method = RequestMethod.POST)    
    public String save(@ModelAttribute("p")  Product p){    
        dao.save(p);    
        return "redirect:/viewproduct";   
    }    
    
    @RequestMapping("/viewproduct")    
    public String viewproduct(Model m){    
        List<Product> list=dao.getProduct();    
        m.addAttribute("list",list);  
        return "viewproduct";    
    }   
    
    @RequestMapping(value="/editproduct/{id}")    
    public String edit(@PathVariable int id, Model m){    
      Product p=dao.getproductById(id);    
        m.addAttribute("command",p);  
        return "producteditform";    
    }    

    @RequestMapping(value="/editsave",method = RequestMethod.POST)    
    public String editsave(@ModelAttribute("p")  Product p){    
        dao.update(p);    
        return "redirect:/viewproduct";    
    }    
 
    @RequestMapping(value="/deleteproduct/{id}",method = RequestMethod.GET)    
    public String delete(@ModelAttribute("p")  Product p){    
        dao.delete(p);    
        return "redirect:/viewproduct"; 
    } 
}
