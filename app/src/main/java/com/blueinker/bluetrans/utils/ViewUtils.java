package com.blueinker.bluetrans.utils;

import android.content.Context;
import android.util.TypedValue;

/**
 * Created by Jesson_Yi on 2017/7/5.
 */

public class ViewUtils {


    public static float dp2px(Context context, float dpValue) {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dpValue, context.getResources().getDisplayMetrics());
    }

    public static float sp2px(Context context, float spValue) {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, spValue, context.getResources().getDisplayMetrics());
    }
}
