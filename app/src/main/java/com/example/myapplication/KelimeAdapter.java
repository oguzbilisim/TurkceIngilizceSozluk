package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class KelimeAdapter extends BaseAdapter {

    private Context mContext;
    private List<Kelime> lsKelime;
    private LayoutInflater inflater;

    public KelimeAdapter(Context context,List<Kelime> lsKelime){
        this.mContext = context;
        this.lsKelime = lsKelime;
        inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return lsKelime.size();
    }

    @Override
    public Object getItem(int position) {
        return lsKelime.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder viewHolder;
        if(view ==null){
            view = inflater.inflate(R.layout.layout_list_item,null);
            viewHolder = new ViewHolder();
            viewHolder.avatar=view.findViewById(R.id.avatar);
            viewHolder.kelimeingilizcesi=view.findViewById(R.id.kelimeniningilizcesi);
            viewHolder.kelimeturkcesi=view.findViewById(R.id.kelimeninturkcesi);
            view.setTag(viewHolder);

        }
        else{
            viewHolder = (ViewHolder) view.getTag();
        }
        Kelime kelime = lsKelime.get(position);
        viewHolder.avatar.setImageDrawable(mContext.getResources().getDrawable(kelime.getAvatar()));
        viewHolder.kelimeingilizcesi.setText(kelime.getKelimeingilizcesi());
        viewHolder.kelimeturkcesi.setText(kelime.getKelimeturkcesi());
        return view;
    }

    public class ViewHolder{
        ImageView avatar;
        TextView kelimeturkcesi,kelimeingilizcesi;
    }

}
