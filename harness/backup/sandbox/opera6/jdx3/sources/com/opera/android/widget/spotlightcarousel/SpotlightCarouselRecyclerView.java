package com.opera.android.widget.spotlightcarousel;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import com.opera.android.theme.ThemeableRecyclerView;
import defpackage.mni;
import defpackage.v1k;
import defpackage.w1k;
import defpackage.yc3;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/opera/android/widget/spotlightcarousel/SpotlightCarouselRecyclerView;", "Lcom/opera/android/theme/ThemeableRecyclerView;", "w1k", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SpotlightCarouselRecyclerView extends ThemeableRecyclerView {
    public static final /* synthetic */ int L0 = 0;
    public final int G0;
    public final int H0;
    public final w1k I0;
    public final yc3 J0;
    public SpotlightCarouselLayoutManager K0;

    public SpotlightCarouselRecyclerView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.G0 = scaledTouchSlop;
        this.H0 = zed.b(scaledTouchSlop * 1.5f);
        this.I0 = new w1k(this);
        this.J0 = new yc3(this, (byte) 7);
    }

    public final void C0(f fVar) {
        super.C0(fVar);
        this.K0 = fVar instanceof SpotlightCarouselLayoutManager ? (SpotlightCarouselLayoutManager) fVar : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean O(int i, int i2) {
        int iFloor;
        int iCeil;
        if (isLayoutSuppressed()) {
            return false;
        }
        SpotlightCarouselLayoutManager spotlightCarouselLayoutManager = this.K0;
        if (spotlightCarouselLayoutManager == null) {
            return super.O(i, i2);
        }
        if (i == 0 || Math.abs(i) < ((RecyclerView) this).W) {
            return false;
        }
        float f = i;
        float f2 = i2;
        if (dispatchNestedPreFling(f, f2)) {
            return false;
        }
        dispatchNestedFling(f, f2, true);
        Integer numValueOf = null;
        if (getLayoutDirection() != 0 ? i >= 0 : i <= 0) {
            if (spotlightCarouselLayoutManager.e != 0 && (iCeil = ((int) Math.ceil(spotlightCarouselLayoutManager.g / spotlightCarouselLayoutManager.r())) - 1) >= 0) {
                numValueOf = Integer.valueOf(iCeil);
            }
        } else if (spotlightCarouselLayoutManager.e != 0 && (iFloor = ((int) Math.floor(spotlightCarouselLayoutManager.g / spotlightCarouselLayoutManager.r())) + 1) <= spotlightCarouselLayoutManager.p(spotlightCarouselLayoutManager.getItemCount())) {
            if (Math.min(spotlightCarouselLayoutManager.r() * iFloor, spotlightCarouselLayoutManager.q(spotlightCarouselLayoutManager.getItemCount())) > spotlightCarouselLayoutManager.g) {
                numValueOf = Integer.valueOf(iFloor);
            }
        }
        if (numValueOf == null) {
            return false;
        }
        spotlightCarouselLayoutManager.startSmoothScroll(new v1k(numValueOf.intValue(), getContext(), spotlightCarouselLayoutManager));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean canScrollHorizontally(int i) {
        f fVar = ((RecyclerView) this).n;
        return (fVar != null ? fVar.canScrollHorizontally() : false) || super/*android.view.View*/.canScrollHorizontally(i);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o(this.J0);
        n(this.I0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onConfigurationChanged(Configuration configuration) {
        super/*android.view.View*/.onConfigurationChanged(configuration);
        post(new mni(this, (byte) 20));
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t0(this.J0);
        s0(this.I0);
    }
}
