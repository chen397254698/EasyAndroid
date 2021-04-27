package com.chen.app.ui.simple

import com.alibaba.android.arouter.facade.annotation.Launch
import com.chen.app.R
import com.chen.app.databinding.Fragment1Binding
import com.chen.app.databinding.FragmentPrintBinding
import com.chen.baseextend.base.fragment.BaseSimpleFragment
import com.chen.basemodule.extend.doBinding
import com.chen.basemodule.extend.listenClick
import kotlinx.android.synthetic.main.fragment_print.*

@Launch
class PrintFragment : BaseSimpleFragment() {


//    override val contentLayoutId = R.layout.fragment_print
    override val binding by doBinding(FragmentPrintBinding::inflate)
    override fun initAndObserve() {

        toolbar.run{
            center("打印")
            left(R.mipmap.ic_back) { activity?.finish() }
        }

        listenClick(_print) {
            when (it) {
                _print -> {
                    println(_edit.text)
                }
                else -> {
                }
            }
        }
    }

}