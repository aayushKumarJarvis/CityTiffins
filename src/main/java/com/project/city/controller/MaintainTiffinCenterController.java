package com.project.city.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.city.bo.TiffinCenterBO;
import com.project.city.model.TiffinCenterData;

@Controller
@RequestMapping("/tiffincenter")
public class MaintainTiffinCenterController {
	
	@Autowired
	TiffinCenterBO tiffinCenterBo;
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	@ResponseBody
	public void addTiffinCenter(@RequestBody TiffinCenterData tiffinCenter){
		tiffinCenterBo.saveNewTiffinCenter(tiffinCenter);
	}
	
	@RequestMapping(value="/modify", method=RequestMethod.PUT)
	@ResponseBody
	public void modifyTiffinCenter(@RequestBody TiffinCenterData tiffinCenter){
		tiffinCenterBo.editTiffinCenter(tiffinCenter);
	}
	
	@RequestMapping(value="/delete/{tiffincenterid}", method=RequestMethod.DELETE)
	@ResponseBody
	public void deleteTiffinCenter(@PathVariable("tiffincenterid") long tiffinCenterId){
		tiffinCenterBo.deleteTiffinCenter(tiffinCenterId);
	}

}
