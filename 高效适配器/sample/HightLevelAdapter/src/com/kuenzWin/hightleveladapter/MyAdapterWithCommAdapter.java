package com.kuenzWin.hightleveladapter;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;

import com.kuenzWin.hightleveladapter.bean.Msg;
import com.kuenzWin.hightleveladapter.utils.CommonAdapter;
import com.kuenzWin.hightleveladapter.utils.ViewHolder;

public class MyAdapterWithCommAdapter extends CommonAdapter<Msg> {

	public MyAdapterWithCommAdapter(Context context, List<Msg> datas,
			int layoutId) {
		super(context, datas, layoutId);
	}

	@Override
	public void setData(ViewHolder holder, final Msg bean) {
		// ((TextView) holder.getView(R.id.tv_title)).setText(bean.getTitle());
		// ((TextView) holder.getView(R.id.tv_desc)).setText(bean.getDesc());
		// ((TextView) holder.getView(R.id.tv_time)).setText(bean.getTime());
		// ((TextView) holder.getView(R.id.tv_phone)).setText(bean.getPhone());
		holder.setText(R.id.tv_title, bean.getTitle())
				.setText(R.id.tv_desc, bean.getDesc())
				.setText(R.id.tv_time, bean.getTime())
				.setText(R.id.tv_phone, bean.getPhone());
		final CheckBox cBox = (CheckBox) (holder.getView(R.id.cb));
		if (cBox != null) {
			cBox.setChecked(bean.isChecked());

			cBox.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					bean.setChecked(cBox.isChecked());
				}
			});
		}
	}

}
