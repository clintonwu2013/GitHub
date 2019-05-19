package model.tsunglin.service;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.POJO.Report;
import model.tsunglin.dao.ReportDAO;
@Service
public class ReportService {
	@Autowired
	ReportDAO reportDAO;
	public List<Report> findAll() {
	
		return reportDAO.findAll();
	}
}
