package com.opera.android.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.rtd;

/* loaded from: classes.dex */
public class CheckableItemView extends LinearLayout implements rtd {
    public ImageView a;
    public TextView b;
    public ImageView c;

    public CheckableItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.rtd
    public final void a() {
    }

    @Override // defpackage.rtd
    public final void c(ptd ptdVar) {
        this.b.setText(ptdVar.e);
        Drawable icon = ptdVar.getIcon();
        ImageView imageView = this.a;
        if (icon != null) {
            imageView.setImageDrawable(icon);
            this.a.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        this.c.setVisibility(ptdVar.isChecked() ? 0 : 8);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) findViewById(2131362594);
        this.b = (TextView) findViewById(2131363525);
        this.c = (ImageView) findViewById(2131362305);
    }
}
