package com.opera.android.custom_views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import defpackage.khh;
import defpackage.p73;
import defpackage.q9n;
import defpackage.uk6;
import java.util.Objects;

/* loaded from: classes.dex */
public class EmptyListView extends LayoutDirectionFrameLayout {
    public static final /* synthetic */ int e = 0;
    public int c;
    public boolean d;

    public EmptyListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View viewInflate = LayoutInflater.from(context).inflate(2131558688, this);
        FadingScrollView fadingScrollView = (FadingScrollView) viewInflate.findViewById(2131362839);
        SideMarginContainer sideMarginContainer = (SideMarginContainer) viewInflate.findViewById(2131364447);
        Objects.requireNonNull(fadingScrollView);
        sideMarginContainer.a = new uk6((Object) fadingScrollView, (byte) 20);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.k);
        try {
            g(typedArrayObtainStyledAttributes.getResourceId(2, 0));
            e(typedArrayObtainStyledAttributes.getResourceId(1, 0));
            if (!typedArrayObtainStyledAttributes.getBoolean(0, false)) {
                f(typedArrayObtainStyledAttributes.getColorStateList(3));
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static EmptyListView d(int i, Context context, int i2) {
        EmptyListView emptyListView = new EmptyListView(context, null);
        emptyListView.g(i);
        emptyListView.e(i2);
        emptyListView.f(null);
        return emptyListView;
    }

    public final void e(int i) {
        if (this.c == i) {
            return;
        }
        this.c = i;
        ((StylingImageView) findViewById(2131363336)).setImageDrawable(i != 0 ? sgb.F(i, getContext()) : null);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    public final void f(ColorStateList colorStateList) {
        ?? r0 = (StylingImageView) findViewById(2131363336);
        if (colorStateList != null) {
            r0.c(colorStateList);
        } else {
            if (this.d) {
                return;
            }
            q9n.f(r0, new p73(r0, (byte) 1));
            this.d = true;
        }
    }

    public final void g(int i) {
        TextView textView = (TextView) findViewById(2131363337);
        if (i != 0) {
            textView.setText(i);
        } else {
            textView.setText("");
        }
    }
}
