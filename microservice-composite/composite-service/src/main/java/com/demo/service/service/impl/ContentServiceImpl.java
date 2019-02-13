package com.demo.service.service.impl;

import com.demo.common.client.ContentQueryClient;
import com.demo.common.dto.inside.GetContentReq;
import com.demo.common.dto.inside.GetContentRsp;
import com.demo.common.dto.outside.GetPlayDownloadUrlReqOut;
import com.demo.common.dto.outside.GetPlayDownloadUrlRspOut;
import com.demo.common.dto.outside.QueryContentReqOut;
import com.demo.common.dto.outside.QueryContentRspOut;
import com.demo.service.service.IContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ContentServiceImpl extends BaseServiceImpl implements IContentService {

    @Qualifier("contentQueryClient")
    @Autowired
    private ContentQueryClient contentQueryClient;

    @Override
    public QueryContentRspOut queryContent(QueryContentReqOut req) {
        System.out.println("before client invoke getContent...");
        
        GetContentReq contentReq = new GetContentReq(req.getRequestHeader(), req.getContentCode());
        GetContentRsp contentRsp = contentQueryClient.getContent(contentReq);
        return new QueryContentRspOut(contentRsp.getResult(), contentRsp.getContent());
    }

    @Override
    public GetPlayDownloadUrlRspOut getPlayDownloadUrl(GetPlayDownloadUrlReqOut req) {
        System.out.println("before client invoke getPlayDownloadUrl...");
        return null;
    }
}
