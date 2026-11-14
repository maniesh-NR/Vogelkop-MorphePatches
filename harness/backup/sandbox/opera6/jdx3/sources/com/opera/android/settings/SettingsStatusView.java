package com.opera.android.settings;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import defpackage.khh;
import defpackage.nck;

/* loaded from: classes.dex */
public class SettingsStatusView extends LayoutDirectionLinearLayout {
    public final nck c;

    /* JADX WARN: Type inference failed for: r3v1, types: [android.widget.TextView, com.opera.android.custom_views.StylingTextView] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.widget.TextView, com.opera.android.custom_views.StylingTextView] */
    public SettingsStatusView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131559380, (ViewGroup) this, false);
        addView(constraintLayoutInflate);
        int i = 2131362248;
        ?? r3 = (StylingTextView) w1h.j(2131362248, constraintLayoutInflate);
        if (r3 != 0) {
            i = 2131363174;
            StylingImageView stylingImageView = (StylingImageView) w1h.j(2131363174, constraintLayoutInflate);
            if (stylingImageView != null) {
                i = 2131364567;
                ?? r5 = (StylingTextView) w1h.j(2131364567, constraintLayoutInflate);
                if (r5 != 0) {
                    this.c = new nck(constraintLayoutInflate, r3, stylingImageView, r5);
                    r5.setText("");
                    if (attributeSet != null) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.G);
                        if (typedArrayObtainStyledAttributes.hasValue(0)) {
                            r3.setText(typedArrayObtainStyledAttributes.getString(0));
                        }
                        typedArrayObtainStyledAttributes.recycle();
                        return;
                    }
                    return;
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }
}
