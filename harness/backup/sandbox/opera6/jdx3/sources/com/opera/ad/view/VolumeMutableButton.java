package com.opera.ad.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import defpackage.ecn;

/* loaded from: classes.dex */
public class VolumeMutableButton extends ImageButton implements View.OnClickListener {
    public final Drawable a;
    public final Drawable b;
    public boolean c;
    public ecn d;

    public VolumeMutableButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, -1);
        this.c = true;
        this.a = sgb.F(2131232994, context);
        this.b = sgb.F(2131233294, context);
        setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z = this.c;
        this.c = !z;
        setImageDrawable(!z ? this.a : this.b);
        ecn ecnVar = this.d;
        if (ecnVar != null) {
            ecnVar.a(this.c);
        }
    }
}
