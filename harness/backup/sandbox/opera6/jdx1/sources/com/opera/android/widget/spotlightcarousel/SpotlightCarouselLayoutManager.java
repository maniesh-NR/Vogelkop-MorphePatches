package com.opera.android.widget.spotlightcarousel;

import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.g;
import defpackage.cs5;
import defpackage.lph;
import defpackage.vph;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/opera/android/widget/spotlightcarousel/SpotlightCarouselLayoutManager;", "Landroidx/recyclerview/widget/f;", "u1k", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SpotlightCarouselLayoutManager extends f {
    public final int a;
    public final Function0 b;
    public final u1k c;
    public final PathInterpolator d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public final em3 i;

    public SpotlightCarouselLayoutManager(int i, Function0 function0) {
        u1k u1kVar = u1k.a;
        this.a = i;
        this.b = function0;
        this.c = u1kVar;
        this.d = (PathInterpolator) sz7.a.getValue();
        this.i = new em3(this, (byte) 5);
    }

    @Override // androidx.recyclerview.widget.f
    public final lph generateDefaultLayoutParams() {
        return new lph(-2, -1);
    }

    @Override // androidx.recyclerview.widget.f
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.f
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        recyclerView.n(this.i);
    }

    @Override // androidx.recyclerview.widget.f
    public final void onDetachedFromWindow(RecyclerView recyclerView, g gVar) {
        onDetachedFromWindow(recyclerView);
        recyclerView.s0(this.i);
    }

    @Override // androidx.recyclerview.widget.f
    public final void onLayoutChildren(g gVar, vph vphVar) {
        int iIntValue;
        if (vphVar.b() == 0) {
            removeAndRecycleAllViews(gVar);
            return;
        }
        detachAndScrapAttachedViews(gVar);
        View viewD = gVar.d(0);
        addView(viewD);
        measureChildWithMargins(viewD, 0, 0);
        lph lphVar = (lph) viewD.getLayoutParams();
        this.e = lphVar.getMarginEnd() + lphVar.getMarginStart() + viewD.getMeasuredWidth();
        detachAndScrapView(viewD, gVar);
        if (this.e > 0) {
            if (!this.h && !vphVar.i && (iIntValue = ((Number) this.b.invoke()).intValue()) >= 0 && iIntValue < vphVar.b()) {
                this.g = Math.min(r() * iIntValue, q(vphVar.b()));
            }
            t(gVar, vphVar);
        }
    }

    public final int p(int i) {
        if (i == 0) {
            return 0;
        }
        return cs5.t((int) Math.ceil(q(i) / r()), 0, i - 1);
    }

    public final int q(int i) {
        int iR = r() * (i - 1);
        int iOrdinal = this.c.ordinal();
        if (iOrdinal == 0) {
            return cs5.t(((r() * i) - this.a) - ((getWidth() - getPaddingStart()) - getPaddingEnd()), 0, iR);
        }
        if (iOrdinal == 1) {
            return iR;
        }
        h9o.p();
        return 0;
    }

    public final int r() {
        return this.e + this.a;
    }

    public final int s() {
        int iOrdinal = this.c.ordinal();
        if (iOrdinal == 0) {
            return getPaddingStart();
        }
        if (iOrdinal == 1) {
            return (getWidth() - this.e) / 2;
        }
        h9o.p();
        return 0;
    }

    @Override // androidx.recyclerview.widget.f
    public final int scrollHorizontallyBy(int i, g gVar, vph vphVar) {
        if (vphVar.b() == 0 || this.e == 0) {
            return 0;
        }
        int iQ = q(vphVar.b());
        int i2 = this.g;
        if (getLayoutDirection() == 1) {
            i = -i;
        }
        int iT = cs5.t(this.g + i, 0, iQ);
        this.g = iT;
        int i3 = iT - i2;
        if (i3 != 0) {
            detachAndScrapAttachedViews(gVar);
            t(gVar, vphVar);
        }
        return getLayoutDirection() == 1 ? -i3 : i3;
    }

    @Override // androidx.recyclerview.widget.f
    public final void scrollToPosition(int i) {
        if (this.e > 0) {
            this.g = Math.min(r() * i, q(getItemCount()));
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.f
    public final void smoothScrollToPosition(RecyclerView recyclerView, vph vphVar, int i) {
        int iMin;
        int i2 = this.e;
        if (i2 > 0) {
            if (i2 == 0) {
                iMin = 0;
            } else {
                iMin = Math.min(r() * i, q(getItemCount())) - this.g;
                if (getLayoutDirection() == 1) {
                    iMin = -iMin;
                }
            }
            recyclerView.G0(iMin, 0, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b2 A[PHI: r2
      0x00b2: PHI (r2v7 int) = (r2v6 int), (r2v21 int) binds: [B:19:0x00a1, B:21:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(androidx.recyclerview.widget.g r18, defpackage.vph r19) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.widget.spotlightcarousel.SpotlightCarouselLayoutManager.t(androidx.recyclerview.widget.g, vph):void");
    }
}
