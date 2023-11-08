package com.hubindeveloper.lottery.rpc.booth;

import com.hubindeveloper.lottery.rpc.booth.req.ActivityReq;
import com.hubindeveloper.lottery.rpc.booth.res.ActivityRes;

public interface IActivityBooth {
    ActivityRes queryActivityById(ActivityReq req);
    boolean RpcTest();
}
