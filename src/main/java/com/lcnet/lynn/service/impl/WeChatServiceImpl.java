package com.lcnet.lynn.service.impl;

import com.lcnet.lynn.dao.WeChatDao;
import com.lcnet.lynn.model.CustInfo;
import com.lcnet.lynn.model.CustWx;
import com.lcnet.lynn.model.vo.RegisterForm;
import com.lcnet.lynn.service.WeChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xusha on 2017/4/27.
 */
@Service
public class WeChatServiceImpl implements WeChatService{

    @Autowired
    private WeChatDao weChatDao;

    @Override
    public CustWx findCustWxByOpenId(String openid) {
        return weChatDao.findCustWxByOpenId(openid);
    }

    @Override
    public CustWx insertCustWx(CustWx user) throws Exception {
        return weChatDao.insertCustWx(user);
    }

    @Override
    public CustInfo insertCustInfo(RegisterForm form) {
        CustInfo custInfo = new CustInfo();
        custInfo.setCustName(form.getUserName());
        custInfo.setIdCard(form.getIdCode());
        custInfo.setTel(form.getPhone());
        custInfo.setAddr(form.getAddress());
        return weChatDao.insertCustInfo(custInfo);
    }
}
