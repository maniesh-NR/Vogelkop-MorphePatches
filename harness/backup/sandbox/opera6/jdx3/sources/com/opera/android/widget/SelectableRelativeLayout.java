package com.opera.android.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.custom_views.LayoutDirectionRelativeLayout;
import defpackage.dll;
import defpackage.hjf;
import defpackage.kkf;
import defpackage.q9n;
import defpackage.u8n;

/* loaded from: classes.dex */
public class SelectableRelativeLayout extends LayoutDirectionRelativeLayout {
    public static final /* synthetic */ int h = 0;
    public final Paint d;
    public boolean e;
    public int f;
    public int g;

    public SelectableRelativeLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a(context, attributeSet);
        this.d = new Paint();
        kkf kkfVar = new kkf(this, (byte) 16);
        l5b l5bVar = q9n.c;
        dll dllVarV = hjf.v(getContext());
        if (dllVarV != null) {
            u8n.b(dllVarV, this, kkfVar);
        }
        this.f = f03.t(2130969315, getContext(), 2131101243);
    }

    public final void d(boolean z) {
        if (this.e != z) {
            this.e = z;
            if (isSelected()) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.e && isSelected()) {
            int i = this.g;
            if (i == 0) {
                i = this.f;
            }
            Paint paint = this.d;
            paint.setColor(i);
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
    }
}
