package com.winter.app.notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NoticeDAO {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.winter.app.notices.NoticeDAO.";
	
	public int add(NoticeDTO noticeDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"add",noticeDTO);
		
	}
	public NoticeDTO getDetail(NoticeDTO noticeDTO)throws Exception {
		return sqlSession.selectOne(NAMESPACE+"getDetail",noticeDTO);
	
	
			
	}
	public List<NoticeDTO>getList() throws Exception {
		return sqlSession.selectList(NAMESPACE+"getList");
				
	}
	public int update (NoticeDTO noticeDTO) throws Exception {
		return sqlSession.update(NAMESPACE+"update", noticeDTO);
	}
	public int delete (NoticeDTO noticeDTO) throws Exception {
		return sqlSession.delete(NAMESPACE+"delete",noticeDTO);
	}
	public int updateHit(NoticeDTO noticeDTO) throws Exception{
		return sqlSession.update(NAMESPACE+"updatehit",noticeDTO);
	}
}
