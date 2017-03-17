package com.example.pankaj.viewpager;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Pankaj on 16-03-2017.
 */

public class SwipeAdapter extends PagerAdapter {

    int[] img_res={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g};
    private Context context;
    private LayoutInflater layoutInflater;
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(RelativeLayout)object);
    }

    public SwipeAdapter(Context context)
   {
       this.context=context;
   }

    @Override
    public int getCount() {
        return img_res.length;
    }



    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView=layoutInflater.inflate(R.layout.page_fragment_layout,container,false);
        ImageView imageView=(ImageView)itemView.findViewById(R.id.image_view);
        TextView textView=(TextView)itemView.findViewById(R.id.textView);
        imageView.setImageResource((img_res[position]));
        textView.setText("image:"+position);
        container.addView(itemView);
        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout)object);
    }
}
