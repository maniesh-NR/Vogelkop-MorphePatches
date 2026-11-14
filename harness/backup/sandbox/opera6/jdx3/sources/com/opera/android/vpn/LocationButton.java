package com.opera.android.vpn;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import defpackage.vs;

/* loaded from: classes.dex */
public class LocationButton extends LinearLayout {
    public final vs a;

    public LocationButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(getContext()).inflate(2131559507, this);
        int i = 2131362594;
        AppCompatImageView appCompatImageView = (StylingImageView) w1h.j(2131362594, this);
        if (appCompatImageView != null) {
            i = 2131363296;
            StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363296, this);
            if (stylingTextView != null) {
                i = 2131363525;
                StylingTextView stylingTextView2 = (StylingTextView) w1h.j(2131363525, this);
                if (stylingTextView2 != null) {
                    this.a = new vs((ViewGroup) this, (View) appCompatImageView, (Object) stylingTextView, (Object) stylingTextView2, (byte) 24);
                    return;
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }
}
