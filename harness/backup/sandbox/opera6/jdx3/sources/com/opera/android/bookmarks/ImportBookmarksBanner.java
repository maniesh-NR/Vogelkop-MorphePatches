package com.opera.android.bookmarks;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.opera.android.custom_views.StylingImageView;
import defpackage.ov0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/opera/android/bookmarks/ImportBookmarksBanner;", "Landroid/widget/FrameLayout;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImportBookmarksBanner extends FrameLayout {
    public final ov0 a;

    public ImportBookmarksBanner(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public ImportBookmarksBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        LayoutInflater.from(context).inflate(2131558933, this);
        int i2 = 2131362353;
        StylingImageView stylingImageView = (StylingImageView) w1h.j(2131362353, this);
        if (stylingImageView != null) {
            i2 = 2131362512;
            TextView textView = (TextView) w1h.j(2131362512, this);
            if (textView != null) {
                i2 = 2131363039;
                MaterialButton materialButtonJ = w1h.j(2131363039, this);
                if (materialButtonJ != null) {
                    i2 = 2131363183;
                    if (((ImageView) w1h.j(2131363183, this)) != null) {
                        i2 = 2131363525;
                        if (((TextView) w1h.j(2131363525, this)) != null) {
                            this.a = new ov0(this, stylingImageView, textView, materialButtonJ);
                            textView.setText(context.getString(2132019303, context.getString(2132017591)));
                            setLayoutParams(new ViewGroup.LayoutParams(new ViewGroup.LayoutParams(-1, -2)));
                            return;
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }
}
