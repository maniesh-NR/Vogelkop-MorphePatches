package com.opera.android.downloads;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.opera.android.custom_views.LayoutDirectionRelativeLayout;

/* loaded from: classes.dex */
public class SaveSheet$OptionTextAreaLayout extends LayoutDirectionRelativeLayout {
    public TextView d;
    public TextView e;
    public TextView f;
    public View g;

    public SaveSheet$OptionTextAreaLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void d(TextView textView, String str, ColorStateList colorStateList) {
        int i = 8;
        if (str != null) {
            textView.setText(str);
            if (colorStateList == null) {
                colorStateList = f03.F(getContext());
            }
            textView.setTextColor(colorStateList);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        if (this.e.getVisibility() == 0 && this.f.getVisibility() == 0) {
            i = 0;
        }
        this.g.setVisibility(i);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.d = (TextView) findViewById(2131363525);
        this.e = (TextView) findViewById(2131362596);
        this.f = (TextView) findViewById(2131363220);
        this.g = findViewById(2131362215);
    }
}
