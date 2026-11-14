package com.opera.android.custom_views.swipe_to_refresh;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import defpackage.dll;
import defpackage.hjf;
import defpackage.kkf;
import defpackage.laj;
import defpackage.q9n;
import defpackage.u8n;
import defpackage.wth;
import defpackage.z9h;

/* loaded from: classes.dex */
public class RefreshView extends View {
    public static final /* synthetic */ int e = 0;
    public final int[] a;
    public final wth b;
    public int c;
    public laj d;

    public RefreshView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, 0);
        this.a = new int[4];
        Paint paint = new Paint();
        this.c = 0;
        this.d = laj.e;
        setVisibility(8);
        context.getResources().getDimensionPixelSize(2131167371);
        context.getResources().getDimensionPixelSize(2131167366);
        this.b = new wth(context);
        paint.setAntiAlias(true);
        paint.setTextSize(context.getResources().getDimension(2131167374));
        a();
        kkf kkfVar = new kkf(this, (byte) 11);
        l5b l5bVar = q9n.c;
        dll dllVarV = hjf.v(getContext());
        if (dllVarV == null) {
            return;
        }
        u8n.b(dllVarV, this, kkfVar);
    }

    public final void a() {
        Context context = getContext();
        f03.t(2130970632, context, 2131099830);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{2130970629});
        typedArrayObtainStyledAttributes.getInteger(0, 255);
        typedArrayObtainStyledAttributes.recycle();
        ((z9h) this.b.b).c = context.getColor(2131099815);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(new int[]{2130970631});
        typedArrayObtainStyledAttributes2.getInteger(0, 255);
        typedArrayObtainStyledAttributes2.recycle();
        f03.t(2130970630, context, 2131099815);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Resources resources = getResources();
        int dimensionPixelSize = 0 - getResources().getDimensionPixelSize(2131167363);
        int[] iArr = this.a;
        iArr[0] = dimensionPixelSize;
        iArr[1] = 0;
        iArr[2] = 0 - resources.getDimensionPixelSize(2131167367);
        iArr[3] = 0 - resources.getDimensionPixelSize(2131167377);
        invalidate();
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
    }
}
