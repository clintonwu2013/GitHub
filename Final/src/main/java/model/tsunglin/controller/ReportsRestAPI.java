package model.tsunglin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import model.POJO.Activity;
import model.POJO.ActivityMessage;
import model.tsunglin.service.ActivityMessageService;
@RestController
public class ReportsRestAPI {
	
	@Autowired
	ActivityMessageService activityMessageService; 
	@GetMapping(path = { "/reports/{messageId}" }, produces = { "application/json", "application/xml" })
	public ResponseEntity<Object> findByPK(@PathVariable(value = "messageId") String temp) {
		System.out.println("method21() id=GGGGGGGGGGGGGGGGGGGGGGGGGG" + temp);
//		成功：200 (OK)、message body包含1個resource的資料
//		失敗(resource不存在)：404 (Not Found)
		try {
			int messageId = Integer.parseInt(temp);
			
			ActivityMessage rs = activityMessageService.findByPK(messageId);
			
			ActivityMessageSimple activityMessage = new ActivityMessageSimple();
			activityMessage.setActivityId(rs.getActivity().getAid());
			activityMessage.setActivityName(rs.getActivity().getAname());
			activityMessage.setEmail(rs.getMember().getEmail());
			activityMessage.setMemberName(rs.getMember().getMname());
			
			activityMessage.setMessage(rs.getMessage());
			activityMessage.setMessageId(rs.getMessageId());
			activityMessage.setMessageTime(rs.getMessageTime());
			
			
			if (rs != null) {
				return ResponseEntity.ok(activityMessage);
			} else {
				return ResponseEntity.notFound().build();
			}
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
			return ResponseEntity.badRequest().build();
		}
		
		
	}
}
