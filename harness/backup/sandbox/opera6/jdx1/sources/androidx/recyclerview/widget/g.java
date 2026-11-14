package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.view.View;
import defpackage.f8;
import defpackage.p3p;
import defpackage.pph;
import defpackage.r5n;
import defpackage.ro9;
import defpackage.vph;
import defpackage.wph;
import defpackage.z5i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class g {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    public ro9 f;
    public final /* synthetic */ RecyclerView g;

    public g(RecyclerView recyclerView) {
        this.g = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.e = 2;
    }

    public final void a(i iVar, boolean z) {
        RecyclerView.q(iVar);
        View view = iVar.itemView;
        RecyclerView recyclerView = this.g;
        wph wphVar = recyclerView.n0;
        if (wphVar != null) {
            wph wphVar2 = (wph) wphVar.f;
            r5n.l(view, wphVar2 != null ? (f8) ((WeakHashMap) wphVar2.f).remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.o;
            if (arrayList.size() > 0) {
                throw fki.n(0, arrayList);
            }
            d dVar = recyclerView.m;
            if (dVar != null) {
                dVar.onViewRecycled(iVar);
            }
            if (recyclerView.h0 != null) {
                recyclerView.g.G(iVar);
            }
        }
        iVar.mBindingAdapter = null;
        iVar.mOwnerRecyclerView = null;
        c().F(iVar);
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.g;
        vph vphVar = recyclerView.h0;
        if (i >= 0 && i < vphVar.b()) {
            return !vphVar.g ? i : recyclerView.e.l(i, 0);
        }
        StringBuilder sbO = p3p.o(i, "invalid position ", ". State item count is ");
        sbO.append(vphVar.b());
        sbO.append(recyclerView.F());
        throw new IndexOutOfBoundsException(sbO.toString());
    }

    public final ro9 c() {
        if (this.f == null) {
            this.f = new ro9((byte) 28);
            e();
        }
        return this.f;
    }

    public final View d(int i) {
        return l(i, Long.MAX_VALUE).itemView;
    }

    public final void e() {
        RecyclerView recyclerView;
        d dVar;
        ro9 ro9Var = this.f;
        if (ro9Var == null || (dVar = (recyclerView = this.g).m) == null || !recyclerView.s) {
            return;
        }
        ((Set) ro9Var.d).add(dVar);
    }

    public final void f(d dVar, boolean z) {
        ro9 ro9Var = this.f;
        if (ro9Var != null) {
            SparseArray sparseArray = (SparseArray) ro9Var.c;
            Set set = (Set) ro9Var.d;
            set.remove(dVar);
            if (set.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((pph) sparseArray.get(sparseArray.keyAt(i))).a;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    z5i.r(((i) arrayList.get(i2)).itemView);
                }
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.C0;
        a aVar = this.g.g0;
        int[] iArr2 = aVar.c;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        aVar.d = 0;
    }

    public final void h(int i) {
        int[] iArr = RecyclerView.C0;
        ArrayList arrayList = this.c;
        a((i) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final void i(View view) {
        i iVarU = RecyclerView.U(view);
        boolean zIsTmpDetached = iVarU.isTmpDetached();
        RecyclerView recyclerView = this.g;
        if (zIsTmpDetached) {
            recyclerView.removeDetachedView(view, false);
        }
        if (iVarU.isScrap()) {
            iVarU.unScrap();
        } else if (iVarU.wasReturnedFromScrap()) {
            iVarU.clearReturnedFromScrapFlag();
        }
        j(iVarU);
        if (recyclerView.M == null || iVarU.isRecyclable()) {
            return;
        }
        recyclerView.M.e(iVarU);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0090, code lost:
    
        r6 = r6 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(androidx.recyclerview.widget.i r12) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.g.j(androidx.recyclerview.widget.i):void");
    }

    public final void k(View view) {
        e eVar;
        i iVarU = RecyclerView.U(view);
        boolean zHasAnyOfTheFlags = iVarU.hasAnyOfTheFlags(12);
        RecyclerView recyclerView = this.g;
        if (!zHasAnyOfTheFlags && iVarU.isUpdated() && (eVar = recyclerView.M) != null && !eVar.b(iVarU, iVarU.getUnmodifiedPayloads())) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            iVarU.setScrapContainer(this, true);
            this.b.add(iVarU);
            return;
        }
        if (iVarU.isInvalid() && !iVarU.isRemoved() && !recyclerView.m.hasStableIds()) {
            qp2.o("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.F()));
        } else {
            iVarU.setScrapContainer(this, false);
            this.a.add(iVarU);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0483 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.i l(int r28, long r29) {
        /*
            Method dump skipped, instructions count: 1197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.g.l(int, long):androidx.recyclerview.widget.i");
    }

    public final void m(i iVar) {
        if (iVar.mInChangeScrap) {
            this.b.remove(iVar);
        } else {
            this.a.remove(iVar);
        }
        iVar.mScrapContainer = null;
        iVar.mInChangeScrap = false;
        iVar.clearReturnedFromScrapFlag();
    }

    public final void n() {
        f fVar = this.g.n;
        this.e = 2 + (fVar != null ? fVar.mPrefetchMaxCountObserved : 0);
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.e; size--) {
            h(size);
        }
    }
}
