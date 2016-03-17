package com.example.ruchitdutt.trulia;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by ruchitdutt on 17/03/16.
 */
public class CustomSwipeAdapter extends PagerAdapter {
    private int [] image_resouse= {R.drawable.feature11, R.drawable.feature22, R.drawable.feature3};
    private Context context;
    private LayoutInflater layoutInflater;
    public CustomSwipeAdapter(Context context){

        this.context =context;
    }
    @Override
    public int getCount() {
        return image_resouse.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return (view==(LinearLayout)o);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflater.inflate(R.layout.swipe_layout,container,false);
        ImageView imageView = (ImageView) item_view.findViewById(R.id.image_view);
        imageView.setImageResource(image_resouse[position]);
        container.addView(item_view);
        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}
