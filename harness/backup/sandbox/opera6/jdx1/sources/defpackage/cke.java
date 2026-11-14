package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class cke {
    public final nak a = z4o.f(dke.j);
    public final nak b;
    public final rlh c;
    public final i72 d;
    public final i72 e;
    public zje f;
    public int g;
    public bke h;
    public final LinkedHashSet i;
    public final LinkedHashSet j;
    public final LinkedHashSet k;
    public boolean l;
    public boolean m;
    public boolean n;

    public cke() {
        nak nakVarF = z4o.f(new ake());
        this.b = nakVarF;
        this.c = a26.j(nakVarF);
        this.d = new i72();
        this.e = new i72();
        this.i = new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
    }

    public final void a(xje xjeVar, bke bkeVar, int i) {
        if (bkeVar.a == null) {
            (i != 0 ? i != 1 ? this.i : this.j : this.k).add(bkeVar);
            bkeVar.a = xjeVar;
            bkeVar.d(i != 0 ? i != 1 ? this.n : this.l : this.m);
            return;
        }
        StringBuilder sb = new StringBuilder("Input '");
        sb.append(bkeVar);
        xje xjeVar2 = bkeVar.a;
        sb.append("' is already added to dispatcher ");
        sb.append(xjeVar2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final void b() {
        boolean z;
        boolean z2;
        ake akeVar;
        i72 i72Var = this.d;
        if (i72Var.isEmpty()) {
            z = false;
        } else {
            Iterator it = i72Var.iterator();
            while (it.hasNext()) {
                if (((zje) it.next()).d) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        i72 i72Var2 = this.e;
        if (i72Var2.isEmpty()) {
            z2 = false;
        } else {
            Iterator it2 = i72Var2.iterator();
            while (it2.hasNext()) {
                if (((zje) it2.next()).d) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        boolean z3 = z || z2;
        boolean z4 = this.m != z;
        boolean z5 = this.l != z2;
        boolean z6 = this.n != z3;
        LinkedHashSet linkedHashSet = this.k;
        if (z4) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((bke) it3.next()).d(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.j;
        if (z5) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((bke) it4.next()).d(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.i;
        if (z6) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((bke) it5.next()).d(z3);
            }
        }
        this.m = z;
        this.l = z2;
        this.n = z3;
        zje zjeVarC = this.f;
        if (zjeVarC == null) {
            zjeVarC = c(0);
        }
        zje zjeVarC2 = this.f;
        if (zjeVarC2 == null) {
            zjeVarC2 = c(0);
        }
        if (Intrinsics.a(zjeVarC2, zjeVarC)) {
            if (zjeVarC2 == null) {
                akeVar = new ake();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it6 = i72Var.iterator();
                while (it6.hasNext()) {
                    zje zjeVar = (zje) it6.next();
                    if (zjeVar.d) {
                        zjeVar.b.getClass();
                    }
                }
                Iterator it7 = i72Var2.iterator();
                while (it7.hasNext()) {
                    zje zjeVar2 = (zje) it7.next();
                    if (zjeVar2.d) {
                        zjeVar2.b.getClass();
                    }
                }
                alo aloVar = zjeVarC2.a;
                l08 l08Var = zjeVarC2.c;
                ehc ehcVarB = a.b();
                o95.t(arrayList, ehcVarB);
                ehcVarB.add(aloVar);
                o95.t(l08Var, ehcVarB);
                akeVar = new ake(a.a(ehcVarB), arrayList.size());
            }
            nak nakVar = this.b;
            if (Intrinsics.a((ake) nakVar.getValue(), akeVar)) {
                return;
            }
            nakVar.k((Object) null, akeVar);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((bke) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((bke) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((bke) it10.next()).getClass();
            }
        }
    }

    public final zje c(int i) {
        Object next;
        Object next2;
        i72 i72Var = this.e;
        i72 i72Var2 = this.d;
        Object obj = null;
        if (i == -1) {
            Iterator it = i72Var2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((zje) next).d) {
                    break;
                }
            }
            zje zjeVar = (zje) next;
            if (zjeVar != null) {
                return zjeVar;
            }
            Iterator it2 = i72Var.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next3 = it2.next();
                if (((zje) next3).d) {
                    obj = next3;
                    break;
                }
            }
            return (zje) obj;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it3 = i72Var2.iterator();
            while (it3.hasNext()) {
                ((zje) it3.next()).getClass();
            }
            Iterator it4 = i72Var.iterator();
            while (it4.hasNext()) {
                ((zje) it4.next()).getClass();
            }
            return null;
        }
        Iterator it5 = i72Var2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it5.next();
            if (((zje) next2).d) {
                break;
            }
        }
        zje zjeVar2 = (zje) next2;
        if (zjeVar2 != null) {
            return zjeVar2;
        }
        Iterator it6 = i72Var.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next4 = it6.next();
            if (((zje) next4).d) {
                obj = next4;
                break;
            }
        }
        return (zje) obj;
    }
}
