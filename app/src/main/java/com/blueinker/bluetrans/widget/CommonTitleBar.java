package com.blueinker.bluetrans.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.blueinker.bluetrans.R;
import com.blueinker.bluetrans.utils.ViewUtils;

/**
 * Created by jesson on 2017/11/12.
 */

public class CommonTitleBar extends RelativeLayout {

    private ImageView mBack;

    private TextView mTitle;

    private TextView mRightTitle;

    public CommonTitleBar(Context context) {
        this(context, null);
    }

    public CommonTitleBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public void setLeftIcon(Drawable drawable) {
        mBack.setImageDrawable(drawable);
    }

    public void setTitle(CharSequence text) {
        mTitle.setText(text);
    }

    public void setRightTitle(CharSequence cs) {
        mRightTitle.setText(cs);
    }


    public void setLeftClickListener(OnClickListener l) {
        mBack.setOnClickListener(l);
    }

    public void setRightClickListener(OnClickListener l) {
        mRightTitle.setOnClickListener(l);
    }


    public void setRightTitleVisible(boolean value){
        mRightTitle.setVisibility(value ? VISIBLE : INVISIBLE);
    }

    private void init(AttributeSet attrs) {

        setGravity(Gravity.CENTER_VERTICAL);
        setBackgroundResource(R.color.colorPrimary);

        mBack = new ImageView(getContext());
        mBack.setPadding(ViewUtils.dp2px(getContext(), 16), 0, ViewUtils.dp2px(getContext(), 27), 0);

        LayoutParams backLp = getIconLayoutParams();
        backLp.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        backLp.addRule(RelativeLayout.CENTER_VERTICAL);
        addView(mBack, backLp);

        mTitle = new TextView(getContext());
        mTitle.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        mTitle.setTextColor(getResources().getColor(R.color.common_title_color));
        mTitle.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen.common_title_size));

        LayoutParams titleLp = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        titleLp.addRule(RelativeLayout.CENTER_IN_PARENT);
        titleLp.addRule(RelativeLayout.CENTER_VERTICAL);
        addView(mTitle, titleLp);


        mRightTitle = new TextView(getContext());
        mRightTitle.setPadding(0,0,ViewUtils.dp2px(getContext(),16),0);
        mRightTitle.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        mRightTitle.setTextColor(getResources().getColor(R.color.common_title_color));
        mRightTitle.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen.common_right_title_size));


        LayoutParams icon2Lp = getIconLayoutParams();
        icon2Lp.addRule(ALIGN_PARENT_RIGHT);
        icon2Lp.addRule(RelativeLayout.CENTER_VERTICAL);
        addView(mRightTitle, icon2Lp);

        // 自定义属性
        TypedArray array = getContext().obtainStyledAttributes(attrs, R.styleable.commontitlebar);
        Drawable leftDrawable = array.getDrawable(R.styleable.commontitlebar_left_drawable);
        String titleText = (String)array.getString(R.styleable.commontitlebar_middle_title);
        String rightText = (String)array.getString(R.styleable.commontitlebar_right_title);
        if (!TextUtils.isEmpty(titleText)) {
            setTitle(titleText);
        }
        if (!TextUtils.isEmpty(rightText)) {
            setRightTitle(rightText);
        }
        if(leftDrawable!=null){
            setLeftIcon(leftDrawable);
        }
        array.recycle();
    }

    private LayoutParams getIconLayoutParams() {
        return new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, MeasureSpec.makeMeasureSpec(
                getResources().getDimensionPixelSize(R.dimen.common_titlebar_height), MeasureSpec.EXACTLY));
    }
}
