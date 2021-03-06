package com.baozi.demo.demo.shoptablist;

import com.baozi.demo.R;
import com.baozi.demo.demo.shoptablist.bean.ShopTabBean;
import com.baozi.treerecyclerview.adpater.ViewHolder;
import com.baozi.treerecyclerview.view.TreeItem;

/**
 * Created by baozi on 2017/5/10.
 */

public class TabItem extends TreeItem<ShopTabBean> {
    @Override
    protected int initLayoutId() {
        return R.layout.item_shoptablist_tab;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder) {
        viewHolder.setText(R.id.tv_tab,data.getName());
    }
}
