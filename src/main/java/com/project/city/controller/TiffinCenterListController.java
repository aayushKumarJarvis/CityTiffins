package com.project.city.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.city.bo.TiffinCenterBO;
import com.project.city.model.TiffinCenterData;

@Controller
@RequestMapping("tiffincenterlist")
public class TiffinCenterListController {

	@Autowired
	TiffinCenterBO tiffinCenterBo;
	
	@RequestMapping(value="/{cityname}/all", method=RequestMethod.GET)
	@ResponseBody
	public List<TiffinCenterData> getAllTiffinCenterList(@PathVariable("cityname") String cityname){
		return tiffinCenterBo.getAllTiffinCenters(cityname);
	}
	
	@RequestMapping(value="/{cityname}/location/{locationname}", method=RequestMethod.GET)
	@ResponseBody
	public List<TiffinCenterData> getTiffinCentersByLocation(@PathVariable("cityname") String cityname,
			@PathVariable("locationname") String locationname){
		return tiffinCenterBo.getAllTiffinCenters(cityname, locationname);
	}
}
