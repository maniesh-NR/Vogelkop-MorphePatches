package com.opera.android.custom_views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.f;
import com.opera.android.theme.ThemeableRecyclerView;

/* loaded from: classes.dex */
public class RecyclerViewForScreenshot extends ThemeableRecyclerView {
    public e G0;
    public boolean H0;

    public RecyclerViewForScreenshot(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G0 = ((RecyclerView) this).M;
    }

    public final void B0(e eVar) {
        this.G0 = eVar;
        if (((RecyclerView) this).s) {
            super.B0(eVar);
        } else if (eVar == null) {
            super.B0((e) null);
        }
    }

    public void onAttachedToWindow() {
        if (this.H0) {
            this.H0 = false;
            f fVar = ((RecyclerView) this).n;
            C0((f) null);
            C0(fVar);
        }
        super.B0(this.G0);
        super.onAttachedToWindow();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        super.B0((e) null);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (((RecyclerView) this).s) {
            return;
        }
        this.H0 = true;
    }
}
