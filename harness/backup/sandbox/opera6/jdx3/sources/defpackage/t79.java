package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class t79 extends k8 {
    public final /* synthetic */ byte o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t79(RecyclerView recyclerView, GridLayoutManager gridLayoutManager, int i, int i2, int i3, int i4, int i5, byte b) {
        super(recyclerView, gridLayoutManager);
        this.o = b;
        switch (b) {
            case 1:
                super(recyclerView, gridLayoutManager);
                this.p = i;
                this.q = i2;
                this.r = i3;
                this.s = i4;
                this.t = i5;
                gridLayoutManager.getOrientation();
                break;
            default:
                this.p = i;
                this.q = i2;
                this.r = i3;
                this.s = i4;
                this.t = i5;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    @Override // defpackage.k8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Rect T(int r12) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t79.T(int):android.graphics.Rect");
    }

    public final int s0() {
        int measuredHeight;
        int i;
        boolean zB0 = b0();
        RecyclerView recyclerView = (RecyclerView) this.a;
        int i2 = this.t;
        if (zB0) {
            measuredHeight = ((recyclerView.getMeasuredWidth() - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight()) / i2;
            i = (((i2 - 1) * this.p) + (this.r << 1)) / i2;
        } else {
            measuredHeight = ((recyclerView.getMeasuredHeight() - recyclerView.getPaddingTop()) - recyclerView.getPaddingBottom()) / i2;
            i = (((i2 - 1) * this.q) + (this.s << 1)) / i2;
        }
        return measuredHeight - i;
    }

    public final int t0(int i, boolean z) {
        GridLayoutManager gridLayoutManager = (GridLayoutManager) this.b;
        int i2 = gridLayoutManager.b;
        int i3 = this.t;
        int i4 = i2 / i3;
        int iF = gridLayoutManager.g.f(i);
        int iE = gridLayoutManager.g.e(i, gridLayoutManager.b);
        int i5 = this.r;
        int i6 = this.p;
        int i7 = i6 - ((((i3 - 1) * i6) + (i5 << 1)) / i3);
        if (z) {
            iE = (gridLayoutManager.b - iE) - iF;
        }
        return v0g.h(i7, iE, i4, i5);
    }

    public final int u0(int i, boolean z) {
        GridLayoutManager gridLayoutManager = (GridLayoutManager) this.b;
        int i2 = gridLayoutManager.b;
        int i3 = this.t;
        int i4 = i2 / i3;
        int iF = gridLayoutManager.g.f(i);
        int iE = gridLayoutManager.g.e(i, gridLayoutManager.b);
        RecyclerView recyclerView = (RecyclerView) this.a;
        int measuredWidth = (recyclerView.getMeasuredWidth() - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight();
        int i5 = this.r;
        int i6 = (((measuredWidth / i3) + (i5 * (-2))) - this.p) / (i3 - 1);
        if (z) {
            iE = (gridLayoutManager.b - iE) - iF;
        }
        return v0g.h(i6, iE, i4, i5);
    }

    public final int v0(int i) {
        GridLayoutManager gridLayoutManager = (GridLayoutManager) this.b;
        int i2 = gridLayoutManager.b;
        int i3 = this.t;
        int i4 = i2 / i3;
        int iE = gridLayoutManager.g.e(i, i2);
        int i5 = this.s;
        int i6 = this.q;
        return (((i6 - ((((i3 - 1) * i6) + (i5 << 1)) / i3)) * iE) / i4) + i5;
    }
}
