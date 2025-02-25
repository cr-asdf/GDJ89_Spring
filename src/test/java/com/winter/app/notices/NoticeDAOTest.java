package com.winter.app.notices;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.winter.app.SampleTestCase;
import com.winter.app.notice.NoticeDAO;
import com.winter.app.notice.NoticeDTO;

public class NoticeDAOTest extends SampleTestCase {
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	@Test
	public void getListTest() throws Exception {
		System.out.println("getListTest");
		List<NoticeDTO> ar = noticeDAO.getList();
		
		assertNotEquals(0, ar.size());
	}
	@Test
	public void getDetailTest () throws Exception {
		System.out.println("getDetail Test");
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setBoardNum(2L);
		
		noticeDTO = noticeDAO.getDetail(noticeDTO);
		
		assertNull(noticeDTO);		
	}

}
