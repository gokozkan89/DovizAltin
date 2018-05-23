package com.example.gokhan.dovizaltin;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;


public class OzelAdapter extends BaseAdapter {
    private LayoutInflater mInflater;
    private List<Kisi> mKisilistesi;
    private List<Currency> mCurrency;
    public OzelAdapter(Activity activity,List<Currency> currencies){
        mInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mCurrency = currencies;

    }
    @Override
    public int getCount() {
        return mCurrency.size();
    }

    @Override
    public Object getItem(int position) {
        return mCurrency.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View satirView;
        satirView = mInflater.inflate(R.layout.satir,null);
        TextView txtCode = (TextView)satirView.findViewById(R.id.txtCode);
        TextView txtSelling = (TextView)satirView.findViewById(R.id.txtSelling);
        TextView txtBuying = (TextView)satirView.findViewById(R.id.txtBuying);
        TextView txtChangeRate = (TextView)satirView.findViewById(R.id.txtChangeRate);

        Currency currency = mCurrency.get(position);
        txtCode.setText(currency.getCode());
        txtSelling.setText(currency.getSelling());
        txtBuying.setText(currency.getBuying());
        txtChangeRate.setText(currency.getChange_rate());

        return  satirView;
    }
}
