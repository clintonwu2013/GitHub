package model.tsunglin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import model.POJO.Activity;
import model.tsunglin.dao.activityDAO;
import model.tsunglin.service.activityService;
@Controller
public class ActivityController {
	@Autowired
	private activityDAO activityDAO;
	@Autowired
	private activityService activityService;
	
	@RequestMapping(path= {"/findUnreviewed"} )
	public String method3(Model model) {
		List<Activity> unreviewedActivities = activityService.findUnreviewed();
//		System.out.println("ccccccccc");
		model.addAttribute("unreviewedActivities",unreviewedActivities);
		return "backstage";
	}
	
	@RequestMapping(path= {"/findActivityByPK"} )
	public String method4(Integer unreviewedActivityId, Model model) {
		Activity activity = activityService.findByPK(unreviewedActivityId);
//		System.out.println(activity.getAcontent());
		return "backstage";
	}
	
	
}
