package com.opera.android.custom_views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import defpackage.ssi;

/* loaded from: classes.dex */
public class SmoothProgressBar extends ProgressBar {
    public boolean a;
    public int b;
    public int c;
    public final ssi d;

    public SmoothProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 1;
        this.d = new ssi(this, (byte) 3);
        setMax(100);
    }

    public void a(int i) {
        super.setProgress(i);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int progress = getProgress();
        int i5 = this.c;
        int i6 = this.b / i5;
        int iMax = Math.max(1, (i + 99) / 100);
        this.c = iMax;
        setMax(iMax * 100);
        a((progress / i5) * this.c);
        setProgress(i6);
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        int i2 = i * this.c;
        if (this.b == i2) {
            return;
        }
        this.b = i2;
        removeCallbacks(this.d);
        boolean z = this.a;
        ssi ssiVar = this.d;
        if (z) {
            postOnAnimation(ssiVar);
        } else {
            ssiVar.run();
        }
    }
}
