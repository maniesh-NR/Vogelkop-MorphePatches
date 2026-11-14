package defpackage;

import android.graphics.Rect;
import android.util.Size;
import androidx.core.app.NotificationCompat;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class jan implements prm {
    public final HashSet a;
    public final rg4 e;
    public final zd4 f;
    public final zd4 g;
    public final HashSet i;
    public final HashMap j;
    public final ne5 k;
    public final ne5 l;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final sb4 h = new sb4(this);

    public jan(zd4 zd4Var, zd4 zd4Var2, HashSet hashSet, rg4 rg4Var, txi txiVar) {
        this.f = zd4Var;
        this.g = zd4Var2;
        this.e = rg4Var;
        this.a = hashSet;
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            qrm qrmVar = (qrm) it.next();
            map.put(qrmVar, qrmVar.q(zd4Var.g(), null, qrmVar.h(true, rg4Var)));
        }
        this.j = map;
        HashSet hashSet2 = new HashSet(map.values());
        this.i = hashSet2;
        this.k = new ne5(zd4Var, hashSet2);
        zd4 zd4Var3 = this.g;
        if (zd4Var3 != null) {
            this.l = new ne5(zd4Var3, hashSet2);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            qrm qrmVar2 = (qrm) it2.next();
            this.d.put(qrmVar2, Boolean.FALSE);
            this.c.put(qrmVar2, new ian(zd4Var, this, txiVar));
        }
    }

    public static void t(ntk ntkVar, g07 g07Var, u3j u3jVar) {
        ntkVar.e();
        try {
            xug.i();
            ntkVar.b();
            mtk mtkVar = ntkVar.l;
            mtkVar.f(g07Var, new jtk(mtkVar, (byte) 0));
        } catch (f07 unused) {
            s3j s3jVar = u3jVar.f;
            if (s3jVar != null) {
                s3jVar.a(u3jVar);
            }
        }
    }

    public static g07 u(qrm qrmVar) {
        List listB = qrmVar instanceof ewa ? qrmVar.q.b() : Collections.unmodifiableList(qrmVar.q.g.a);
        jpo.n((String) null, listB.size() <= 1);
        if (listB.size() == 1) {
            return (g07) listB.get(0);
        }
        return null;
    }

    @Override // defpackage.prm
    public final void c(qrm qrmVar) {
        g07 g07VarU;
        xug.i();
        ntk ntkVarW = w(qrmVar);
        if (!x(qrmVar) || (g07VarU = u(qrmVar)) == null) {
            return;
        }
        t(ntkVarW, g07VarU, qrmVar.q);
    }

    @Override // defpackage.prm
    public final void j(qrm qrmVar) {
        xug.i();
        if (x(qrmVar)) {
            return;
        }
        this.d.put(qrmVar, Boolean.TRUE);
        g07 g07VarU = u(qrmVar);
        if (g07VarU != null) {
            t(w(qrmVar), g07VarU, qrmVar.q);
        }
    }

    @Override // defpackage.prm
    public final void k(qrm qrmVar) {
        xug.i();
        if (x(qrmVar)) {
            ntk ntkVarW = w(qrmVar);
            g07 g07VarU = u(qrmVar);
            if (g07VarU != null) {
                t(ntkVarW, g07VarU, qrmVar.q);
                return;
            }
            xug.i();
            ntkVarW.b();
            ntkVarW.l.a();
        }
    }

    @Override // defpackage.prm
    public final void r(qrm qrmVar) {
        xug.i();
        if (x(qrmVar)) {
            this.d.put(qrmVar, Boolean.FALSE);
            ntk ntkVarW = w(qrmVar);
            xug.i();
            ntkVarW.b();
            ntkVarW.l.a();
        }
    }

    public final co2 s(qrm qrmVar, ne5 ne5Var, zd4 zd4Var, ntk ntkVar, int i, boolean z) {
        int iC = zd4Var.a().C(i);
        boolean zE = d2m.e(ntkVar.b);
        qsm qsmVar = (qsm) this.j.get(qrmVar);
        Objects.requireNonNull(qsmVar);
        ssg ssgVarD = ne5Var.D(qsmVar, ntkVar.d, d2m.b(ntkVar.b), z);
        Rect rect = ssgVarD.a;
        Size size = ssgVarD.b;
        int iJ = d2m.j((ntkVar.i + zd4Var.a().C(((hya) qrmVar.h).u(0))) - iC);
        return new co2(UUID.randomUUID(), qrmVar instanceof swg ? 1 : qrmVar instanceof ewa ? 4 : 2, qrmVar instanceof ewa ? NotificationCompat.FLAG_LOCAL_ONLY : 34, rect, d2m.h(iJ, size), iJ, qrmVar.p(zd4Var) ^ zE);
    }

    public final HashMap v(ntk ntkVar, boolean z) {
        HashMap map = new HashMap();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            qrm qrmVar = (qrm) it.next();
            qsm qsmVar = (qsm) this.j.get(qrmVar);
            Objects.requireNonNull(qsmVar);
            Size size = this.k.D(qsmVar, ntkVar.d, d2m.b(ntkVar.b), z).c;
            map.put(qrmVar, size);
            Objects.toString(size);
            Objects.toString(qrmVar);
        }
        return map;
    }

    public final ntk w(qrm qrmVar) {
        ntk ntkVar = (ntk) this.b.get(qrmVar);
        Objects.requireNonNull(ntkVar);
        return ntkVar;
    }

    public final boolean x(qrm qrmVar) {
        Boolean bool = (Boolean) this.d.get(qrmVar);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public final void y(HashMap map, HashMap map2) {
        HashMap map3 = this.b;
        map3.clear();
        map3.putAll(map);
        for (Map.Entry entry : map3.entrySet()) {
            qrm qrmVar = (qrm) entry.getKey();
            ntk ntkVar = (ntk) entry.getValue();
            qrmVar.E(ntkVar.d);
            qrmVar.C(ntkVar.b);
            ne5 ne5VarB = ntkVar.g.b();
            Size size = (Size) map2.get(qrmVar);
            if (size != null) {
                ne5VarB.b = size;
            }
            qrmVar.H(ne5VarB.p(), null);
            qrmVar.s();
        }
    }
}
