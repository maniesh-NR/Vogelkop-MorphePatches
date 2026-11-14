package com.opera.android.tabui2;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.i4l;
import defpackage.j1k;
import defpackage.q5l;
import defpackage.qsh;
import defpackage.s5l;
import defpackage.y2c;
import defpackage.z2c;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/opera/android/tabui2/TabGridLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "Lq5l;", "i4l", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TabGridLayoutManager extends GridLayoutManager implements q5l {
    public final byte m;
    public final int n;
    public final j1k o;
    public final s5l p;

    /* JADX WARN: Multi-variable type inference failed */
    public TabGridLayoutManager(int i, int i2, j1k j1kVar, s5l s5lVar) {
        super(i);
        this.m = i;
        this.n = i2;
        this.o = j1kVar;
        this.p = s5lVar;
    }

    @Override // defpackage.q5l
    public final y2c a() {
        return new z2c(this.m, ((GridLayoutManager) this).g);
    }

    public final void calculateExtraLayoutSpace(vph vphVar, int[] iArr) {
        super/*androidx.recyclerview.widget.LinearLayoutManager*/.calculateExtraLayoutSpace(vphVar, iArr);
        int i = iArr[0];
        int i2 = this.n;
        if (i < i2) {
            i = i2;
        }
        iArr[0] = i;
        int i3 = iArr[1];
        if (i3 >= i2) {
            i2 = i3;
        }
        iArr[1] = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabGridLayoutManager)) {
            return false;
        }
        TabGridLayoutManager tabGridLayoutManager = (TabGridLayoutManager) obj;
        return this.m == tabGridLayoutManager.m && this.n == tabGridLayoutManager.n;
    }

    public final int hashCode() {
        return (this.m * 31) + this.n;
    }

    public final void offsetChildrenVertical(int i) {
        super/*androidx.recyclerview.widget.f*/.offsetChildrenVertical(i);
        this.o.invoke();
    }

    public final void onLayoutCompleted(vph vphVar) {
        super.onLayoutCompleted(vphVar);
        this.o.invoke();
    }

    public final void smoothScrollToPosition(RecyclerView recyclerView, vph vphVar, int i) {
        qsh qshVar = this.p.b.w;
        if (i == -1 || qshVar == null) {
            super/*androidx.recyclerview.widget.LinearLayoutManager*/.smoothScrollToPosition(recyclerView, vphVar, i);
            return;
        }
        i4l i4lVar = new i4l(recyclerView, this, qshVar, ((GridLayoutManager) this).g, this.m);
        i4lVar.setTargetPosition(i);
        startSmoothScroll(i4lVar);
    }
}
