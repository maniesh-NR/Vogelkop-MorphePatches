package androidx.recyclerview.widget;

import defpackage.jph;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements jph {
    public int a;
    public int b;
    public int[] c;
    public int d;

    public final void a(int i, int i2) {
        if (i < 0) {
            qp2.o("Layout positions must be non-negative");
            return;
        }
        if (i2 < 0) {
            qp2.o("Pixel distance must be non-negative");
            return;
        }
        int i3 = this.d;
        int i4 = i3 << 1;
        int[] iArr = this.c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 << 2];
            this.c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.c;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.d++;
    }

    public final void b(RecyclerView recyclerView, boolean z) {
        this.d = 0;
        int[] iArr = this.c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        f fVar = recyclerView.n;
        if (recyclerView.m == null || fVar == null || !fVar.isItemPrefetchEnabled()) {
            return;
        }
        if (z) {
            if (!recyclerView.e.s()) {
                fVar.collectInitialPrefetchPositions(recyclerView.m.getItemCount(), this);
            }
        } else if (!recyclerView.Z()) {
            fVar.collectAdjacentPrefetchPositions(this.a, this.b, recyclerView.h0, this);
        }
        int i = this.d;
        if (i > fVar.mPrefetchMaxCountObserved) {
            fVar.mPrefetchMaxCountObserved = i;
            fVar.mPrefetchMaxObservedInInitialPrefetch = z;
            recyclerView.c.n();
        }
    }
}
