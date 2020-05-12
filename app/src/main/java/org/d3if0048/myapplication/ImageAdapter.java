package org.d3if0048.myapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class ImageAdapter extends PagerAdapter {
    private Context mContext;
    private int[] mImageIds = new int[]{
            R.drawable.gambar1,
            R.drawable.gambar2,
            R.drawable.gambar3,
            R.drawable.gambar4,
            R.drawable.gambar5,
            R.drawable.gambar6,
            R.drawable.gambar7,
            R.drawable.gambar8,
            R.drawable.gambar9,
            R.drawable.gambar10,
            R.drawable.gambar11,
            R.drawable.gambar12,
            R.drawable.hlm,
            R.drawable.download};

    ImageAdapter(Context context){
        mContext = context;
    }
    @Override
    public int getCount() {
        return mImageIds.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(mImageIds[position]);
        container.addView(imageView, 0);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView) object);
    }
}
