package com.opera.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import defpackage.nb6;
import defpackage.nud;
import defpackage.sgb;
import defpackage.t3p;
import defpackage.w1h;

/* loaded from: classes.dex */
public class MenuSettingsListItem extends LinearLayout {
    public final nud a;
    public or2 b;

    public MenuSettingsListItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        if (attributeSet == null) {
            this.a = null;
            return;
        }
        nud nudVar = new nud();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.p, 0, 0);
        nudVar.a = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        nudVar.b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        nudVar.c = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        nudVar.d = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        nudVar.e = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.a = nudVar;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        View viewInflate = LayoutInflater.from(getContext()).inflate(2131559057, (ViewGroup) this, false);
        addView(viewInflate);
        int i = 2131362248;
        StylingTextView stylingTextViewJ = w1h.j(2131362248, viewInflate);
        if (stylingTextViewJ != null) {
            i = 2131362366;
            StylingImageView stylingImageViewJ = w1h.j(2131362366, viewInflate);
            if (stylingImageViewJ != null) {
                i = 2131362594;
                StylingImageView stylingImageViewJ2 = w1h.j(2131362594, viewInflate);
                if (stylingImageViewJ2 != null) {
                    i = 2131363525;
                    StylingTextView stylingTextViewJ2 = w1h.j(2131363525, viewInflate);
                    if (stylingTextViewJ2 != null) {
                        this.b = new or2((LinearLayout) viewInflate, stylingTextViewJ, stylingImageViewJ, stylingImageViewJ2, stylingTextViewJ2);
                        nud nudVar = this.a;
                        if (nudVar != null) {
                            int i2 = nudVar.e;
                            int i3 = nudVar.d;
                            int i4 = nudVar.c;
                            int i5 = nudVar.a;
                            if (i5 != 0) {
                                stylingTextViewJ2.setText(i5);
                            }
                            int i6 = nudVar.b;
                            if (i6 != 0) {
                                ((StylingTextView) this.b.b).setText(i6);
                            }
                            if (i4 != 0) {
                                ((StylingImageView) this.b.e).setImageDrawable(sgb.F(i4, getContext()));
                            }
                            if (i3 != 0) {
                                ((StylingImageView) this.b.e).c(nb6.v(i3, getContext()));
                            }
                            if (i2 != 0) {
                                ((StylingImageView) this.b.d).c(nb6.v(i2, getContext()));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        ((LinearLayout) this.b.c).setOnClickListener(onClickListener);
    }
}
