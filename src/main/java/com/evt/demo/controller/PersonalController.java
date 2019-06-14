package com.evt.demo.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evt.demo.model.PersonalInfo;
import com.evt.demo.model.DexLogger;
import com.evt.demo.model.Logfile;



@RestController
public class PersonalController {
	@Autowired
	private Logfile dexLogger;

	@RequestMapping("/")
    public List<PersonalInfo> getPersonalInfo() 
    {
		List<PersonalInfo> PersonalInfoList = new ArrayList<PersonalInfo>();
		PersonalInfoList.add(new PersonalInfo(1,"nathan","test","test@gmail.com"));
		dexLogger.logLevel(DexLogger.INFO,this.getClass().toString(),"This is a INFO log testing message");
		return PersonalInfoList;
    }

}
