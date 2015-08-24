package com.kuenzWin.hightleveladapter;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.kuenzWin.hightleveladapter.bean.Msg;

public class MainActivity extends Activity {

	private ListView mListView;
	private List<Msg> mDatas;
	private MyAdapterWithCommViewHolder mAdapterWithCommViewHolder;
	private MyAdapterWithCommAdapter myAdapterWithCommAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initDatas();
		initView();
	}

	/**
	 * 初始化数据和适配器
	 * 
	 * @return void
	 * @author Yann
	 * @date 2015-8-5 下午10:15:03
	 */
	private void initDatas() {
		mDatas = new ArrayList<Msg>();
		Msg Msg = new Msg("Android新技能 Get 1",
				"Android-打造万能的ListView和GridView适配器", "2015-08-05", "10086");
		mDatas.add(Msg);
		Msg = new Msg("Android新技能 Get 2", "Android-打造万能的ListView和GridView适配器",
				"2015-08-05", "10086");
		mDatas.add(Msg);
		Msg = new Msg("Android新技能 Get 3", "Android-打造万能的ListView和GridView适配器",
				"2015-08-05", "10086");
		mDatas.add(Msg);
		Msg = new Msg("Android新技能 Get 4", "Android-打造万能的ListView和GridView适配器",
				"2015-08-05", "10086");
		mDatas.add(Msg);
		Msg = new Msg("Android新技能 Get 5", "Android-打造万能的ListView和GridView适配器",
				"2015-08-05", "10086");
		mDatas.add(Msg);

		Msg = new Msg("Android新技能 Get 6", "Android-打造万能的ListView和GridView适配器",
				"2015-08-05", "10086");
		mDatas.add(Msg);
		Msg = new Msg("Android新技能 Get 7", "Android-打造万能的ListView和GridView适配器",
				"2015-08-05", "10086");
		mDatas.add(Msg);
		Msg = new Msg("Android新技能 Get 8", "Android-打造万能的ListView和GridView适配器",
				"2015-08-05", "10086");
		mDatas.add(Msg);
		Msg = new Msg("Android新技能 Get 9", "Android-打造万能的ListView和GridView适配器",
				"2015-08-05", "10086");
		mDatas.add(Msg);

		Msg = new Msg("Android新技能 Get 10", "Android-打造万能的ListView和GridView适配器",
				"2015-08-05", "10086");
		mDatas.add(Msg);
		Msg = new Msg("Android新技能 Get 11", "Android-打造万能的ListView和GridView适配器",
				"2015-08-05", "10086");
		mDatas.add(Msg);
		Msg = new Msg("Android新技能 Get 12", "Android-打造万能的ListView和GridView适配器",
				"2015-08-05", "10086");
		mDatas.add(Msg);
		Msg = new Msg("Android新技能 Get 13", "Android-打造万能的ListView和GridView适配器",
				"2015-08-05", "10086");
		mDatas.add(Msg);

		mAdapterWithCommViewHolder = new MyAdapterWithCommViewHolder(this,
				mDatas, R.layout.item);
		myAdapterWithCommAdapter = new MyAdapterWithCommAdapter(this, mDatas,
				R.layout.item);
	}

	/**
	 * 为列表设置适配器
	 * 
	 * @return void
	 * @author Yann
	 * @date 2015-8-5 下午10:15:04
	 */
	private void initView() {
		mListView = (ListView) findViewById(R.id.lv);
		// mListView.setAdapter(mAdapterWithCommViewHolder);
		mListView.setAdapter(myAdapterWithCommAdapter);
	}
}
