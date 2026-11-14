package defpackage;

import com.opera.android.favorites.PushedSpeedDialFavorite;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ydh extends tq8 {
    public final int h;
    public int i;
    public final ghf j;
    public final ArrayList k = new ArrayList();
    public final kdh l = new kdh();
    public boolean m;

    public ydh(int i, int i2, ghf ghfVar) {
        this.h = i;
        this.i = i2;
        this.j = ghfVar;
    }

    public final void D() {
        int i;
        kdh kdhVar = this.l;
        ArrayList arrayList = kdhVar.e;
        while (true) {
            i = 0;
            if (arrayList.size() <= 0) {
                break;
            } else {
                kdhVar.A(kdhVar.u(0));
            }
        }
        for (hq8 hq8Var : CollectionsKt.k0(this)) {
            if (!Intrinsics.a(hq8Var, kdhVar)) {
                A(hq8Var);
            }
        }
        ArrayList arrayList2 = this.k;
        int size = arrayList2.size();
        int i2 = this.i;
        int i3 = this.h;
        int i4 = size > (i2 * i3) - (this.m ? 1 : 0) ? 1 : 0;
        int size2 = arrayList2.size();
        int i5 = ((this.i * i3) - (this.m ? 1 : 0)) - i4;
        if (size2 > i5) {
            size2 = i5;
        }
        int size3 = arrayList2.size() - size2;
        for (int i6 = 0; i6 < size2; i6++) {
            s(i6, (hq8) arrayList2.get(i6));
        }
        for (Object obj : CollectionsKt.f0(size3, arrayList2)) {
            int i7 = i + 1;
            if (i < 0) {
                j95.n();
                throw null;
            }
            kdhVar.s(i, (PushedSpeedDialFavorite) obj);
            i = i7;
        }
        if (arrayList.isEmpty() && kdhVar.b != null) {
            A(kdhVar);
        } else {
            if (arrayList.isEmpty() || kdhVar.b != null) {
                return;
            }
            s(this.e.size(), kdhVar);
        }
    }

    public final void E(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(k95.o(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new PushedSpeedDialFavorite(((PushedSpeedDialFavorite) it.next()).e, this.j));
        }
        ArrayList arrayList2 = this.k;
        if (arrayList2.equals(arrayList)) {
            return;
        }
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        D();
    }

    @Override // defpackage.hq8
    public final String c() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.hq8
    public final long e() {
        return -1L;
    }

    @Override // defpackage.hq8
    public final String g() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.hq8
    public final String h() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.hq8
    public final String i(p6l p6lVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.hq8
    public final void q(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.tq8
    public final Date z() {
        throw new UnsupportedOperationException();
    }
}
