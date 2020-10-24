package com.colt.enigma.bottomnav;

import android.graphics.Typeface;
import com.colt.enigma.bottomnav.BubbleNavigationChangeListener;

public interface IBubbleNavigation {
    void setNavigationChangeListener(BubbleNavigationChangeListener navigationChangeListener);

    int getCurrentActiveItemPosition();

    void setCurrentActiveItem(int position);
}
