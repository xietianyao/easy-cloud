package com.dq.easy.cloud.pay.zfb.pojo.dto;

import java.util.Map;

import com.dq.easy.cloud.pay.common.payment.pojo.dto.DqPayResultDTO;

/**
 * 
 * <p>
 * 微信支付结果数据传输对象
 * </p>
 *
 * @author daiqi 创建时间 2018年2月24日 下午2:51:35
 */
public class DqZfbPayResultDTO extends DqPayResultDTO {
	public DqZfbPayResultDTO() {

	}

	public DqZfbPayResultDTO(Map<String, Object> rspResult) {
		super(rspResult);
	}
}
