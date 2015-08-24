/*
 * @Title CommonAdapter.java
 * @Copyright Copyright 2010-2015 Yann Software Co,.Ltd All Rights Reserved.
 * @Description£º
 * @author Yann
 * @date 2015-8-5 ÏÂÎç10:39:05
 * @version 1.0
 */
package com.kuenzWin.hightleveladapter.utils;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Àà×¢ÊÍ
 * 
 * @author Yann
 * @date 2015-8-5 ÏÂÎç10:39:05
 */
public abstract class CommonAdapter<T> extends BaseAdapter {
	protected Context mContext;
	protected List<T> mDatas;
	protected LayoutInflater mInflater;
	protected int mlayoutId;

	public CommonAdapter(Context context, List<T> datas, int layoutId) {
		this.mContext = context;
		this.mDatas = datas;
		this.mlayoutId = layoutId;
		mInflater = LayoutInflater.from(context);
	}

	/**
	 * @see android.widget.Adapter#getCount()
	 */
	@Override
	public int getCount() {
		return mDatas.size();
	}

	/**
	 * @see android.widget.Adapter#getItem(int)
	 */
	@Override
	public T getItem(int position) {
		return mDatas.get(position);
	}

	/**
	 * @see android.widget.Adapter#getItemId(int)
	 */
	@Override
	public long getItemId(int position) {
		return position;
	}

	/**
	 * @see android.widget.Adapter#getView(int, android.view.View,
	 *      android.view.ViewGroup)
	 */
	// @Override
	// public abstract View getView(int position, View convertView,
	// ViewGroup parent);

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder = ViewHolder.get(mContext, convertView, parent,
				mlayoutId, position);
		setData(holder, getItem(position));
		return holder.getConvertView();
	}

	public abstract void setData(ViewHolder holder, T t);

}
