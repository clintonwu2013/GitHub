package model.tsunglin.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import model.POJO.Activity;
import model.POJO.ActivityMessage;
import model.POJO.Mail;
import model.POJO.Member;
import model.tsunglin.service.ActivityMessageService;
import model.tsunglin.service.ReportService;
@RestController
public class ReportsRestAPI {
	
	@Autowired
	ActivityMessageService activityMessageService;
	@Autowired
	ReportService reportService;
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
	
	
	@PostMapping(
			path = { "/reportsUpdate" }
		)
	public String update(String activityId,String activityName, String violateType,
			String memberEmail, String memberName, Integer messageNo, String messageTime,
			String messageContent, String response, HttpSession session) throws Exception {
		System.out.println(activityId);
		System.out.println(activityName);
		System.out.println("vvvvvvvvvvvv");
		System.out.println(violateType);
		System.out.println(memberEmail);
		System.out.println(memberName);
		System.out.println(messageNo);
		System.out.println(messageTime);
		System.out.println(messageContent);
		System.out.println(response);
		
		reportService.updateReport(messageNo, violateType, response, new Date());
		reportService.updateMember(memberEmail);
		
		//update 站內信
		
		//send email
//		String sendUserName = "clintonwu2013@gmail.com";
//		String sendPassword = "yavgohihafmiigbv";
//		Properties properties = new Properties();
//		properties.setProperty("mail.smtp.auth", "true");// 伺服器需要認證
//		properties.setProperty("mail.transport.protocol", "smtp");// 宣告傳送郵件使用的埠
//		properties.setProperty("mail.smtp.starttls.enable", "true");
//		
//		Session mailSession = Session.getInstance(properties);
//		mailSession.setDebug(true);// 同意在當前執行緒的控制檯列印與伺服器對話資訊
//		Message message = new MimeMessage(mailSession);// 構建傳送的資訊
//		message.setSubject(response);
//		
		
		
		//File file = new File("D:\\1.jpg");
		//FileInputStream is =new FileInputStream(file);
		//byte[] data =new byte[(int) file.length()];
		//is.read(data, 0, data.length);
		
		//String body = response ;
		//MimeBodyPart attachment01 = SendEmail.createContent(body, data); 
		//MimeMultipart allPart = new MimeMultipart("mixed"); 
		//allPart.addBodyPart(attachment01); 
		
		//message.setContent(allPart);
		//message.saveChanges(); 
		
		
//		message.setText(response);// 資訊內容
//		message.setFrom(new InternetAddress("clintonwu2013@gmail.com"));// 發件人
//		
//		
//		Transport transport = mailSession.getTransport();
//		transport.connect("smtp.gmail.com", 587, sendUserName, sendPassword);// 連線發件人使用發件的伺服器
//		transport.sendMessage(message, new Address[] { new InternetAddress("clintonwu2001@yahoo.com.tw") });// 接受郵件
//		transport.close();
		
//		if(rs !=null) {
//			return ResponseEntity.ok(activity);
//		}else {
//			return ResponseEntity.notFound().build(); 
//		}
		return response;
		
	}
	
	
	
	
	
}
