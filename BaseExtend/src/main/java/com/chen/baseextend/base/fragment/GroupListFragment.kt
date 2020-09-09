package com.chen.baseextend.base.fragment

import androidx.lifecycle.ViewModelProvider
import com.chen.baseextend.repos.MainViewModel
import com.chen.basemodule.allroot.RootBean
import com.chen.basemodule.mlist.BaseGListFragment

/**
 * 分组布局列表
 *
 *  Created by chen on 2019/6/6
 **/
abstract class GroupListFragment<P : RootBean, C : RootBean> : BaseGListFragment<P, C>() {

    override val viewModel by lazy { ViewModelProvider(this).get(MainViewModel::class.java).apply { owner = activity!! } }

}