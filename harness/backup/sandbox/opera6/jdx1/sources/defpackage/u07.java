package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class u07 implements zrm {
    public final n7h a;
    public final ctm b;
    public volatile ism c;
    public final AtomicBoolean d = new AtomicBoolean(false);

    public u07(n7h n7hVar, ctm ctmVar) {
        this.a = n7hVar;
        this.b = ctmVar;
    }

    @Override // defpackage.zrm
    public final h07 a(List list, List list2, List list3, jyc jycVar, y10 y10Var, long j) {
        ism ismVar = this.c;
        return ismVar != null ? ismVar.a(list, list2, list3, jycVar, y10Var, j) : na2.g(this.b.f, null, null, new s07(this, null, list, list2, list3, jycVar, y10Var, j), 3);
    }

    @Override // defpackage.zrm
    public final Object b(kuk kukVar) {
        ism ismVar = this.c;
        return ismVar != null ? ismVar.b(kukVar) : na2.Z(fr3.I(this.b.e), new n07(this, null, (byte) 0), kukVar);
    }

    @Override // defpackage.zrm
    public final List c(ArrayList arrayList, int i, int i2, int i3) {
        int size = arrayList.size();
        ism ismVar = this.c;
        if (ismVar != null) {
            return ismVar.c(arrayList, i, i2, i3);
        }
        i07 i07VarG = na2.g(this.b.f, null, null, new o07(this, null, arrayList, i, i2, i3), 3);
        ArrayList arrayList2 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            arrayList2.add(na2.g(this.b.f, null, null, new p07(i07VarG, i4, null), 3));
        }
        return arrayList2;
    }

    @Override // defpackage.zrm
    public final void close() {
        if (this.d.getAndSet(true)) {
            return;
        }
        na2.B(this.b.f, null, null, new bz1((mt5) null, this), 3);
    }

    @Override // defpackage.zrm
    public final h07 d(LinkedHashSet linkedHashSet, boolean z) {
        ism ismVar = this.c;
        return ismVar != null ? ismVar.d(linkedHashSet, z) : na2.g(this.b.f, null, null, new t07(this, (mt5) null, z, linkedHashSet), 3);
    }

    @Override // defpackage.zrm
    public final h07 e() {
        ism ismVar = this.c;
        if (ismVar != null) {
            return ismVar.e();
        }
        return na2.g(this.b.f, null, null, new n07(this, null, (byte) 1), 3);
    }

    @Override // defpackage.zrm
    public final h07 f() {
        ism ismVar = this.c;
        if (ismVar != null) {
            return ismVar.f();
        }
        return na2.g(this.b.f, null, null, new n07(this, null, (byte) 2), 3);
    }

    @Override // defpackage.zrm
    public final h07 g(List list, List list2, List list3) {
        ism ismVar = this.c;
        return ismVar != null ? ismVar.g(list, list2, list3) : na2.g(this.b.f, null, null, new s71(this, (mt5) null, list, list2, list3), 3);
    }

    @Override // defpackage.zrm
    public final h07 i(eb4 eb4Var, Map map) {
        ism ismVar = this.c;
        return ismVar != null ? ismVar.i(eb4Var, map) : na2.g(this.b.f, null, null, new s3(this, (mt5) null, eb4Var, map), 3);
    }

    @Override // defpackage.zrm
    public final h07 j(int i) {
        ism ismVar = this.c;
        return ismVar != null ? ismVar.j(i) : na2.g(this.b.f, null, null, new r07(this, (mt5) null, i), 3);
    }

    @Override // defpackage.zrm
    public final h07 k(List list) {
        yrm yrmVar = yrm.a;
        ism ismVar = this.c;
        return ismVar != null ? ismVar.k(list) : na2.g(this.b.f, null, null, new fg6(this, (mt5) null, list), 3);
    }

    @Override // defpackage.zrm
    public final h07 l(Map map, sj5 sj5Var) {
        yrm yrmVar = yrm.a;
        ism ismVar = this.c;
        return ismVar != null ? ismVar.l(map, sj5Var) : na2.g(this.b.f, null, null, new q07(this, null, map, sj5Var, (byte) 0), 3);
    }

    @Override // defpackage.zrm
    public final h07 m(Map map, sj5 sj5Var) {
        yrm yrmVar = yrm.a;
        ism ismVar = this.c;
        return ismVar != null ? ismVar.m(map, sj5Var) : na2.g(this.b.f, null, null, new q07(this, null, map, sj5Var, (byte) 1), 3);
    }

    public final ism n() {
        if (this.d.get()) {
            throw new CancellationException("UseCaseCameraRequestControl is closed");
        }
        ism ismVar = this.c;
        if (ismVar != null) {
            return ismVar;
        }
        ism ismVar2 = (ism) this.a.get();
        if (this.d.get()) {
            ismVar2.close();
            throw new CancellationException("UseCaseCameraRequestControl closed during initialization");
        }
        this.c = ismVar2;
        return ismVar2;
    }
}
