package com.winter.app.products;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class ProductDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.winter.app.products.ProductDAO.";

	//insert
	public int add (ProductDTO productDTO) throws Exception {
	   return sqlSession.insert(NAMESPACE+"add" , productDTO);
	
		
	}
	
	//detail
	public ProductDTO getDetail(ProductDTO productDTO) throws Exception {
		//statement => mapper의 id값
		

		return sqlSession.selectOne(NAMESPACE+"getDetail",productDTO);
		
		
	}
	
		//list
		public List<ProductDTO > getList() throws Exception{
				return sqlSession.selectList(NAMESPACE+"getList");
		}
		
		public int delete(ProductDTO productDTO) throws Exception {
			return sqlSession.delete(NAMESPACE+"delete",productDTO);
		}
		public int update(ProductDTO productDTO)throws Exception{
			return sqlSession.update(NAMESPACE+"update",productDTO);
		}
//		public void test() throws Exception {
//			return sqlSession.selectOne(NAMESPACE+"test");
//			
//		}
//		public Map test2 (String, Object) throws Exception {
//			return sqlSession.selectOne(NAMESPACE+"test2");
//			
//		}

}
