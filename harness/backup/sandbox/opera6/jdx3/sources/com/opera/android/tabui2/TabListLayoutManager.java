package com.opera.android.tabui2;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a3c;
import defpackage.j1k;
import defpackage.q5l;
import defpackage.qsh;
import defpackage.s5l;
import defpackage.y1c;
import defpackage.y2c;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/opera/android/tabui2/TabListLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Lq5l;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TabListLayoutManager extends LinearLayoutManager implements q5l {
    public final int a;
    public final j1k b;
    public final s5l c;

    public TabListLayoutManager(int i, j1k j1kVar, s5l s5lVar) {
        super(1, false);
        this.a = i;
        this.b = j1kVar;
        this.c = s5lVar;
    }

    @Override // defpackage.q5l
    public final y2c a() {
        return new a3c((byte) 1);
    }

    public final void calculateExtraLayoutSpace(vph vphVar, int[] iArr) {
        super.calculateExtraLayoutSpace(vphVar, iArr);
        int i = iArr[0];
        int i2 = this.a;
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
        if (obj instanceof TabListLayoutManager) {
            return this.a == ((TabListLayoutManager) obj).a;
        }
        return false;
    }

    /* renamed from: hashCode, reason: from getter */
    public final int getA() {
        return this.a;
    }

    public final void offsetChildrenVertical(int i) {
        super/*androidx.recyclerview.widget.f*/.offsetChildrenVertical(i);
        this.b.invoke();
    }

    public final void onLayoutCompleted(vph vphVar) {
        super.onLayoutCompleted(vphVar);
        this.b.invoke();
    }

    public final void smoothScrollToPosition(RecyclerView recyclerView, vph vphVar, int i) {
        qsh qshVar = this.c.b.w;
        if (i == -1 || qshVar == null) {
            super.smoothScrollToPosition(recyclerView, vphVar, i);
            return;
        }
        y1c y1cVar = new y1c(recyclerView, this, qshVar);
        y1cVar.setTargetPosition(i);
        startSmoothScroll(y1cVar);
    }
}
