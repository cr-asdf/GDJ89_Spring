package com.winter.app.notice;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class NoticeService {

	private NoticeDAO noticeDAO;
	
	public List<NoticeDTO>getList() throws Exception {
			List<NoticeDTO>  ar = noticeDAO.getList();
			System.out.println("Service List");
			return ar;
	}
	public NoticeDTO getDetail(NoticeDTO noticeDTO)throws Exception {
		return noticeDAO.getDetail(noticeDTO);
	}
	public int add(NoticeDTO noticeDTO) throws Exception {
		return noticeDAO.add(noticeDTO);
	}
	public int update(NoticeDTO noticeDTO)throws Exception {
		return noticeDAO.update(noticeDTO);
		
	}
	public int delete(NoticeDTO noticeDTO)throws Exception {
		return noticeDAO.delete(noticeDTO);
	}
}
