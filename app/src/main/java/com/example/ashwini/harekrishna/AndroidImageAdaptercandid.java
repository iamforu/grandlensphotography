package com.example.ashwini.harekrishna;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by ASHWINI on 12/17/2017.
 */

public class AndroidImageAdaptercandid extends PagerAdapter {
    Context mContext;

    AndroidImageAdaptercandid(Context context) {
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return sliderImagesId.length;
    }

    private int[] sliderImagesId = new int[]{
            R.drawable.cand1, R.drawable.cand2, R.drawable.cand3,R.drawable.cand4,R.drawable.cand5,R.drawable.cand6,R.drawable.cand7,
            R.drawable.cand1, R.drawable.cand2, R.drawable.cand3,R.drawable.cand4,R.drawable.cand5,R.drawable.cand6,R.drawable.cand7,

    };

    @Override
    public boolean isViewFromObject(View v, Object obj) {
        return v == ((ImageView) obj);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int i) {
        ImageView mImageView = new ImageView(mContext);
        mImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        mImageView.setImageResource(sliderImagesId[i]);
        ((ViewPager) container).addView(mImageView, 0);
        return mImageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int i, Object obj) {
        ((ViewPager) container).removeView((ImageView) obj);
    }
}