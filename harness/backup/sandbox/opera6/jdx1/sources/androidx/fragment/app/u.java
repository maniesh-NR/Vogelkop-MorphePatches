package androidx.fragment.app;

import defpackage.am9;
import defpackage.gcf;
import defpackage.hyj;
import defpackage.jz2;
import defpackage.o95;
import defpackage.xm9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class u extends gcf {
    public final /* synthetic */ w Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(w wVar) {
        super(false);
        this.Y = wVar;
    }

    @Override // defpackage.gcf
    public final void handleOnBackCancelled() {
        boolean zN = w.N(3);
        w wVar = this.Y;
        if (zN) {
            Objects.toString(wVar);
        }
        if (w.N(3)) {
            Objects.toString(wVar.h);
        }
        a aVar = wVar.h;
        if (aVar != null) {
            aVar.u = false;
            aVar.g();
            a aVar2 = wVar.h;
            ld9 ld9Var = new ld9(wVar, (byte) 6);
            ArrayList arrayList = aVar2.s;
            if (arrayList == null) {
                arrayList = new ArrayList();
                aVar2.s = arrayList;
            }
            arrayList.add(ld9Var);
            wVar.h.h();
            wVar.i = true;
            wVar.D();
            wVar.i = false;
            wVar.h = null;
        }
    }

    @Override // defpackage.gcf
    public final void handleOnBackPressed() {
        boolean zN = w.N(3);
        w wVar = this.Y;
        if (zN) {
            Objects.toString(wVar);
        }
        u uVar = wVar.j;
        ArrayList arrayList = wVar.o;
        wVar.i = true;
        wVar.A(true);
        int i = 0;
        wVar.i = false;
        if (wVar.h == null) {
            if (uVar.isEnabled()) {
                wVar.X();
                return;
            } else {
                wVar.g.d();
                return;
            }
        }
        if (!arrayList.isEmpty()) {
            LinkedHashSet<Fragment> linkedHashSet = new LinkedHashSet(w.H(wVar.h));
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                am9 am9Var = (am9) obj;
                for (Fragment fragment : linkedHashSet) {
                    am9Var.getClass();
                }
            }
        }
        ArrayList arrayList2 = wVar.h.c;
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            Fragment fragment2 = ((xm9) obj2).b;
            if (fragment2 != null) {
                fragment2.mTransitioning = false;
            }
        }
        Iterator it = wVar.f(new ArrayList(Collections.singletonList(wVar.h)), 0, 1).iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            ArrayList arrayList3 = hVar.c;
            hVar.m(arrayList3);
            hVar.c(arrayList3);
        }
        ArrayList arrayList4 = wVar.h.c;
        int size3 = arrayList4.size();
        while (i < size3) {
            Object obj3 = arrayList4.get(i);
            i++;
            Fragment fragment3 = ((xm9) obj3).b;
            if (fragment3 != null && fragment3.mContainer == null) {
                wVar.g(fragment3).i();
            }
        }
        wVar.h = null;
        wVar.o0();
        if (w.N(3)) {
            uVar.getClass();
            wVar.toString();
        }
    }

    @Override // defpackage.gcf
    public final void handleOnBackProgressed(jz2 jz2Var) {
        boolean zN = w.N(2);
        w wVar = this.Y;
        if (zN) {
            Objects.toString(wVar);
        }
        if (wVar.h != null) {
            int i = 0;
            Iterator it = wVar.f(new ArrayList(Collections.singletonList(wVar.h)), 0, 1).iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                if (w.N(2)) {
                    hVar.getClass();
                }
                ArrayList arrayList = hVar.c;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    o95.t(((c0) obj).k, arrayList2);
                }
                List listK0 = CollectionsKt.k0(CollectionsKt.n0(arrayList2));
                int size2 = listK0.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((hyj) listK0.get(i3)).d(jz2Var);
                }
            }
            ArrayList arrayList3 = wVar.o;
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj2 = arrayList3.get(i);
                i++;
                ((am9) obj2).getClass();
            }
        }
    }

    @Override // defpackage.gcf
    public final void handleOnBackStarted(jz2 jz2Var) {
        boolean zN = w.N(3);
        w wVar = this.Y;
        if (zN) {
            Objects.toString(wVar);
        }
        wVar.x();
        wVar.y(new v(wVar), false);
    }
}
