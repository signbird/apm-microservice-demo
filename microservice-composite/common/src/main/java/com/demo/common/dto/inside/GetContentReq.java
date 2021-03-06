package com.demo.common.dto.inside;

import org.hibernate.validator.constraints.Length;

import com.demo.common.dto.BaseReq;
import com.demo.common.dto.Header;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * 查询内容详情信息请求
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class GetContentReq extends BaseReq{
    
    private static final long serialVersionUID = 1L;

    @Builder
    public GetContentReq(Header requestHeader, String contentCode) {
        super(requestHeader);
        this.contentCode = contentCode;
    }
    
	/**
	 * 内容唯一标识
	 */
	@Length(max = 32,message = "内容标识长度不能超过32位")
	private String contentCode;
}
