/*
 * @Title MyAdapterWithCommViewHolder.java
 * @Copyright Copyright 2010-2015 Yann Software Co,.Ltd All Rights Reserved.
 * @Description£º
 * @author Yann
 * @date 2015-8-5 ÏÂÎç10:03:45
 * @version 1.0
 */
package com.kuenzWin.hightleveladapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.kuenzWin.hightleveladapter.bean.Msg;
import com.kuenzWin.hightleveladapter.utils.ViewHolder;

/** 
 * Àà×¢ÊÍ
 * @author Yann
 * @date 2015-8-5 ÏÂÎç10:03:45
 */
public class MyAdapterWithCommViewHolder extends BaseAdapter
{
	private LayoutInflater mInflater;
	private List<Msg> mDatas;
	private Context mContext;
	private int mLayoutId;
	
	public MyAdapterWithCommViewHolder(Context context, List<Msg> datas, int layoutId)
	{
		mContext = context;
		mDatas = datas;
		mLayoutId = layoutId;
		mInflater = LayoutInflater.from(context);
	}
	
	/**
	 * @see android.widget.Adapter#getCount()
	 */
	@Override
	public int getCount()
	{
		return mDatas.size();
	}

	/**
	 * @see android.widget.Adapter#getView(int, android.view.View, android.view.ViewGroup)
	 */
	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		ViewHolder holder = ViewHolder.get(mContext, convertView, parent, mLayoutId, position);
		Msg bean = mDatas.get(position);
		
		((TextView)holder.getView(R.id.tv_title)).setText(bean.getTitle());
		((TextView)holder.getView(R.id.tv_desc)).setText(bean.getDesc());
		((TextView)holder.getView(R.id.tv_time)).setText(bean.getTime());
		((TextView)holder.getView(R.id.tv_phone)).setText(bean.getPhone());
		
		return holder.getConvertView();
	}


	/**
	 * @see android.widget.Adapter#getItem(int)
	 */
	@Override
	public Object getItem(int position)
	{
		return null;
	}

	/**
	 * @see android.widget.Adapter#getItemId(int)
	 */
	@Override
	public long getItemId(int position)
	{
		return 0;
	}
}
