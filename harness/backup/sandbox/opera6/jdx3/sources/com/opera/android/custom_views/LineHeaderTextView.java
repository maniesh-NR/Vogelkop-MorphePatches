package com.opera.android.custom_views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.dll;
import defpackage.fan;
import defpackage.hjf;
import defpackage.lzb;
import defpackage.q9n;
import defpackage.u8n;

/* loaded from: classes.dex */
public class LineHeaderTextView extends StylingTextView {
    public static final /* synthetic */ int p = 0;
    public final int m;
    public final int n;
    public final Paint o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LineHeaderTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        fan.a(8.0f, context.getResources());
        this.o = new Paint(1);
        this.m = fan.a(8.0f, getResources());
        this.n = fan.a(1.0f, context.getResources());
        lzb lzbVar = new lzb(this, (byte) 3);
        l5b l5bVar = q9n.c;
        dll dllVarV = hjf.v(getContext());
        if (dllVarV != null) {
            u8n.b(dllVarV, this, lzbVar);
        }
        setGravity(17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        this.o.setColor(f03.t(2130970698, getContext(), 2131099816));
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDraw(Canvas canvas) {
        super/*android.view.View*/.onDraw(canvas);
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        int iRound = Math.round(getLayout().getLineWidth(0));
        int width2 = (getWidth() - iRound) / 2;
        int width3 = (getWidth() + iRound) / 2;
        int i = this.m;
        int iMax = Math.max(paddingLeft, width2 - i);
        int iMin = Math.min(width, width3 + i);
        int paddingTop = getPaddingTop();
        int iD = z1m.d((getHeight() - getPaddingTop()) - getPaddingBottom(), this.n, 2, paddingTop);
        int scrollX = getScrollX();
        float f = iD;
        Paint paint = this.o;
        canvas.drawRect(paddingLeft + scrollX, f, iMax + scrollX, iD + r8, paint);
        canvas.drawRect(iMin + scrollX, f, scrollX + width, iD + r8, paint);
    }
}
