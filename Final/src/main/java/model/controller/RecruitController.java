package model.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import model.dao.RecruitInfoDAO;

@Controller
@RequestMapping("/recruit")
public class RecruitController {
	@RequestMapping("/addRecruitInformation")
	public @ResponseBody List addRecruitInformation(
			HttpServletRequest request,
			@RequestParam("file")CommonsMultipartFile file){
		
		RecruitInfoDAO recruitInfoDAO = new RecruitInfoDAO();
		recruitInfoDAO.insertFile(request.getParameter("name"),
				request.getParameter("phone"),file.getBytes());
		HashMap rs = new HashMap();
		rs.put("name", request.getParameter("name"));
		rs.put("phone", request.getParameter("phone"));
		
		List list = new ArrayList();
		list.add(rs);
	return list;
}
}
