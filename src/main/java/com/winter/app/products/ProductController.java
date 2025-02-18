package com.winter.app.products;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/products/*")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	
		@RequestMapping(value = "list", method =RequestMethod.GET)
		public String getList() throws Exception {
			System.out.println("Product List");	
			productService.getList();
			
			return "products/list";
		}
		@RequestMapping(value = "detail", method =RequestMethod.GET) 
		public String getDetail () throws Exception {
			System.out.println("Products Detail");
			
			return "products/detail";
		}
		@RequestMapping(value = "add", method = RequestMethod.GET)
		public String add () throws Exception {
			System.out.println("Products add");
			
			return "products/add";
			
		}
		@RequestMapping(value = "add", method = RequestMethod.POST)
		public String add2 (ProductDTO productDTO) throws Exception {
			System.out.println("Products add");
			
	
			System.out.println("ProductName  : "+ productDTO.getProductName());
			System.out.println("ProductRate  : "+productDTO.getProductRate());
			
			return "products/add";
}
}