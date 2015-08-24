package com.kuenzWin.googleplay.base;

import java.util.List;

import com.kuenzWin.googleplay.utils.LogUtils;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public abstract class MyBaseAdapter<T> extends BaseAdapter {

	private List<T> mDatas;
	private BaseHolder holder;

	public MyBaseAdapter(List<T> mDatas) {
		setData(mDatas);
	}

	public void setData(List<T> mDatas) {
		this.mDatas = mDatas;

	}

	public List<T> getData() {
		return mDatas;
	}

	@Override
	public int getCount() {
		return mDatas.size();
	}

	@Override
	public Object getItem(int position) {
		return mDatas.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView != null) {
			holder = (BaseHolder) convertView.getTag();
		} else {
			holder = getHolder();
		}
		holder.setData(mDatas.get(position));
		return holder.getRootView();
	}

	protected abstract BaseHolder getHolder();
}
