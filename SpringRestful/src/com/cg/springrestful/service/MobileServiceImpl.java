package com.cg.springrestful.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springrestful.dao.IMobileDao;
import com.cg.springrestful.dto.Mobile;

@Service("mobileservice")
public class MobileServiceImpl implements IMobileService {
    @Autowired
    IMobileDao mobiledao;
    
	@Override
	public List<Mobile> getAllData() {
		// TODO Auto-generated method stub
		
		return mobiledao.getAllData();
	}

}
