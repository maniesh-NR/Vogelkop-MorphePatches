package androidx.recyclerview.widget;

import android.os.Trace;
import defpackage.au9;
import defpackage.bu9;
import defpackage.vph;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class b implements Runnable {
    public static final ThreadLocal e = new ThreadLocal();
    public static final au9 f = new au9(0);
    public long b;
    public long c;
    public final ArrayList a = new ArrayList();
    public final ArrayList d = new ArrayList();

    public static i c(RecyclerView recyclerView, int i, long j) {
        int iH = recyclerView.f.h();
        for (int i2 = 0; i2 < iH; i2++) {
            i iVarU = RecyclerView.U(recyclerView.f.g(i2));
            if (iVarU.mPosition == i && !iVarU.isInvalid()) {
                return null;
            }
        }
        g gVar = recyclerView.c;
        if (j == Long.MAX_VALUE) {
            try {
                if (Trace.isEnabled()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } finally {
                recyclerView.h0(false);
                Trace.endSection();
            }
        }
        recyclerView.g0();
        i iVarL = gVar.l(i, j);
        if (iVarL != null) {
            if (!iVarL.isBound() || iVarL.isInvalid()) {
                gVar.a(iVarL, false);
            } else {
                gVar.i(iVarL.itemView);
            }
        }
        return iVarL;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.s) {
            int[] iArr = RecyclerView.C0;
            if (this.b == 0) {
                this.b = System.nanoTime();
                recyclerView.post(this);
            }
        }
        a aVar = recyclerView.g0;
        aVar.a = i;
        aVar.b = i2;
    }

    public final void b(long j) {
        bu9 bu9Var;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        bu9 bu9Var2;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            int windowVisibility = recyclerView3.getWindowVisibility();
            a aVar = recyclerView3.g0;
            if (windowVisibility == 0) {
                aVar.b(recyclerView3, false);
                i += aVar.d;
            }
        }
        ArrayList arrayList2 = this.d;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i3);
            if (recyclerView4.getWindowVisibility() == 0) {
                a aVar2 = recyclerView4.g0;
                int iAbs = Math.abs(aVar2.b) + Math.abs(aVar2.a);
                int i5 = z ? 1 : 0;
                while (i5 < (aVar2.d << 1)) {
                    if (i4 >= arrayList2.size()) {
                        bu9Var2 = new bu9();
                        arrayList2.add(bu9Var2);
                    } else {
                        bu9Var2 = (bu9) arrayList2.get(i4);
                    }
                    int[] iArr = aVar2.c;
                    int i6 = iArr[i5 + 1];
                    if (i6 <= iAbs) {
                        z = true;
                    }
                    bu9Var2.a = z;
                    bu9Var2.b = iAbs;
                    bu9Var2.c = i6;
                    bu9Var2.d = recyclerView4;
                    bu9Var2.e = iArr[i5];
                    i4++;
                    i5 += 2;
                    z = false;
                }
            }
            i3++;
            z = false;
        }
        Collections.sort(arrayList2, f);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (bu9Var = (bu9) arrayList2.get(i7)).d) != null; i7++) {
            i iVarC = c(recyclerView, bu9Var.e, bu9Var.a ? Long.MAX_VALUE : j);
            if (iVarC != null && iVarC.mNestedRecyclerView != null && iVarC.isBound() && !iVarC.isInvalid() && (recyclerView2 = iVarC.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.D && recyclerView2.f.h() != 0) {
                    g gVar = recyclerView2.c;
                    e eVar = recyclerView2.M;
                    if (eVar != null) {
                        eVar.f();
                    }
                    f fVar = recyclerView2.n;
                    if (fVar != null) {
                        fVar.removeAndRecycleAllViews(gVar);
                        recyclerView2.n.removeAndRecycleScrapInt(gVar);
                    }
                    gVar.a.clear();
                    gVar.g();
                }
                a aVar3 = recyclerView2.g0;
                aVar3.b(recyclerView2, true);
                if (aVar3.d != 0) {
                    try {
                        Trace.beginSection(j == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                        vph vphVar = recyclerView2.h0;
                        d dVar = recyclerView2.m;
                        vphVar.d = (byte) 1;
                        vphVar.e = dVar.getItemCount();
                        vphVar.g = false;
                        vphVar.h = false;
                        vphVar.i = false;
                        for (int i8 = 0; i8 < (aVar3.d << 1); i8 += 2) {
                            c(recyclerView2, aVar3.c[i8], j);
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
            }
            bu9Var.a = false;
            bu9Var.b = 0;
            bu9Var.c = 0;
            bu9Var.d = null;
            bu9Var.e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.c);
                }
            }
        } finally {
            this.b = 0L;
            Trace.endSection();
        }
    }
}
