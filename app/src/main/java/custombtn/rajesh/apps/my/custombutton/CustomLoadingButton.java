package custombtn.rajesh.apps.my.custombutton;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

/**
 * Created by Rajesh on 18-Mar-18.
 */

public class CustomLoadingButton extends android.support.v7.widget.AppCompatButton {

    Context context;
    private boolean isLoading = false;
    int textColor = android.R.color.white;
    int buttonBackgroundDrawable = R.drawable.rounded_corner_drawable;
    int buttonBackgroundDrawableLoading = R.drawable.rounder_corner_loading_drawable;

    public CustomLoadingButton(Context context) {
        super(context);
    }

    public CustomLoadingButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        //setBackgroundColor(ContextCompat.getColor(context, R.color.colorPrimary));
        setBackgroundDrawable(ContextCompat.getDrawable(context, buttonBackgroundDrawable));
        setTextColor(ContextCompat.getColor(context, textColor));
    }

    public CustomLoadingButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public boolean isLoading() {
        return isLoading;
    }

    public void setLoading(boolean isLoad) {
        isLoading = isLoad;
        if (isLoad) {
            setClickable(false);
            setBackgroundDrawable(ContextCompat.getDrawable(context, buttonBackgroundDrawableLoading));
            //setBackgroundColor(ContextCompat.getColor(context, R.color.ash));
        } else {
            setClickable(true);
            setBackgroundDrawable(ContextCompat.getDrawable(context, buttonBackgroundDrawable));
            // setBackgroundColor(ContextCompat.getColor(context, R.color.colorPrimary));
        }

    }
}
