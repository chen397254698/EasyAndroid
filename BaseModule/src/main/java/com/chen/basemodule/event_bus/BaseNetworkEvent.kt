package com.chen.basemodule.event_bus

/**
 *  Created by chen on 2019/9/10
 **/
class BaseNetworkEvent(fromClassName: String, val isConnect: Boolean, vararg target: String) : BaseLiveBusEvent(fromClassName, target)