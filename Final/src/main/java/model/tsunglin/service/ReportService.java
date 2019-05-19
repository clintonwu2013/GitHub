package model.tsunglin.service;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.POJO.Member;
import model.POJO.Report;
import model.tsunglin.dao.ReportDAO;
import model.tsunglin.dao.memberDAO;

@Service
public class ReportService {
	@Autowired
	ReportDAO reportDAO;
	@Autowired
	memberDAO memberDAO;

	public List<Report> findAll() {

		return reportDAO.findAll();
	}

	public void updateReport(Integer messageId, String status, String response1, Date responseTime) {

		reportDAO.update(messageId, status, response1, responseTime);
		// Integer vCount = memberDAO.findByPK(memberEmail).getVcount();

		// memberDAO.updateVcount(memberEmail, vCount+1);
	}

	public void updateMember(String memberEmail) {

		
		Integer vCount = memberDAO.findByPK(memberEmail).getVcount();

		memberDAO.updateVcount(memberEmail, vCount+1);
	}
}
