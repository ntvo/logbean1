package com.evt.demo.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evt.demo.model.PersonalInfo;
import com.evt.demo.model.DexLoggerLevel;
import com.evt.demo.model.DexLogger;



@RestController
public class PersonalController {
	@Autowired
	private DexLogger dexLogger;

	@RequestMapping("/")
    public List<PersonalInfo> getPersonalInfo() 
    {
		List<PersonalInfo> PersonalInfoList = new ArrayList<PersonalInfo>();
		PersonalInfoList.add(new PersonalInfo(1,"nathan","test","test@gmail.com"));
		dexLogger.dexlogger(DexLoggerLevel.INFO,this.getClass(),"This is a INFO log testing message");
		return PersonalInfoList;
    }

}
