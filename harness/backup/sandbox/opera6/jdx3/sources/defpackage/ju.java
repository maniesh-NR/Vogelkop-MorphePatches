package defpackage;

import J.N;
import android.content.res.Resources;
import com.opera.android.bookmarks.BookmarksBridge;
import com.opera.android.bookmarks.h;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ju extends l7n {
    public final rq8 b;
    public final qb7 c;
    public final ot d;
    public final tw2 e;
    public final SettingsManager f;
    public final tr8 g;
    public final ode h = new ode();
    public final wjh i;
    public LinkedHashMap j;
    public st[] k;
    public st[] l;
    public st[] m;
    public st[] n;
    public final HashSet o;
    public final hu p;
    public final us q;
    public final hu r;
    public final iu s;
    public final hu t;

    /* JADX WARN: Type inference failed for: r12v0, types: [fu] */
    public ju(umi umiVar, rq8 rq8Var, h hVar, nv2 nv2Var, qb7 qb7Var, ot otVar, ipk ipkVar, tw2 tw2Var, SettingsManager settingsManager, tr8 tr8Var) {
        this.b = rq8Var;
        this.c = qb7Var;
        this.d = otVar;
        this.e = tw2Var;
        this.f = settingsManager;
        this.g = tr8Var;
        this.i = new wjh(this, umiVar);
        kze kzeVar = (kze) new tvk((l7n) this).a;
        this.o = new HashSet();
        final byte b = 0;
        final byte b2 = 2;
        this.p = new hu(umiVar, new Function1(this) { // from class: fu
            public final /* synthetic */ ju b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b3 = b;
                ju juVar = this.b;
                switch (b3) {
                    case 0:
                        List<st> list = (List) obj;
                        juVar.k = (st[]) list.toArray(new st[0]);
                        hu huVar = juVar.r;
                        ArrayList arrayList = new ArrayList();
                        for (st stVar : list) {
                            o95.t(Arrays.asList(stVar.b, stVar.g), arrayList);
                        }
                        ns.e(huVar, CollectionsKt.n0(arrayList), 0, 2);
                        juVar.f();
                        break;
                    case 1:
                        juVar.j = (LinkedHashMap) obj;
                        juVar.f();
                        break;
                    case 2:
                        juVar.l = (st[]) ((List) obj).toArray(new st[0]);
                        juVar.f();
                        break;
                    case 3:
                        juVar.m = (st[]) ((List) obj).toArray(new st[0]);
                        juVar.f();
                        break;
                    default:
                        juVar.n = (st[]) ((List) obj).toArray(new st[0]);
                        juVar.f();
                        break;
                }
                return Unit.a;
            }
        }, b2, b2);
        final byte b3 = 1;
        this.q = new us(umiVar, Integer.MAX_VALUE, false, new Function1(this) { // from class: fu
            public final /* synthetic */ ju b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b32 = b3;
                ju juVar = this.b;
                switch (b32) {
                    case 0:
                        List<st> list = (List) obj;
                        juVar.k = (st[]) list.toArray(new st[0]);
                        hu huVar = juVar.r;
                        ArrayList arrayList = new ArrayList();
                        for (st stVar : list) {
                            o95.t(Arrays.asList(stVar.b, stVar.g), arrayList);
                        }
                        ns.e(huVar, CollectionsKt.n0(arrayList), 0, 2);
                        juVar.f();
                        break;
                    case 1:
                        juVar.j = (LinkedHashMap) obj;
                        juVar.f();
                        break;
                    case 2:
                        juVar.l = (st[]) ((List) obj).toArray(new st[0]);
                        juVar.f();
                        break;
                    case 3:
                        juVar.m = (st[]) ((List) obj).toArray(new st[0]);
                        juVar.f();
                        break;
                    default:
                        juVar.n = (st[]) ((List) obj).toArray(new st[0]);
                        juVar.f();
                        break;
                }
                return Unit.a;
            }
        });
        hu huVar = new hu(umiVar, new Function1(this) { // from class: fu
            public final /* synthetic */ ju b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b32 = b2;
                ju juVar = this.b;
                switch (b32) {
                    case 0:
                        List<st> list = (List) obj;
                        juVar.k = (st[]) list.toArray(new st[0]);
                        hu huVar2 = juVar.r;
                        ArrayList arrayList = new ArrayList();
                        for (st stVar : list) {
                            o95.t(Arrays.asList(stVar.b, stVar.g), arrayList);
                        }
                        ns.e(huVar2, CollectionsKt.n0(arrayList), 0, 2);
                        juVar.f();
                        break;
                    case 1:
                        juVar.j = (LinkedHashMap) obj;
                        juVar.f();
                        break;
                    case 2:
                        juVar.l = (st[]) ((List) obj).toArray(new st[0]);
                        juVar.f();
                        break;
                    case 3:
                        juVar.m = (st[]) ((List) obj).toArray(new st[0]);
                        juVar.f();
                        break;
                    default:
                        juVar.n = (st[]) ((List) obj).toArray(new st[0]);
                        juVar.f();
                        break;
                }
                return Unit.a;
            }
        }, b2, b3);
        this.r = huVar;
        List list = (List) nv2Var.e.getValue();
        final byte b4 = 3;
        iu iuVar = new iu(list, umiVar, new Function1(this) { // from class: fu
            public final /* synthetic */ ju b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b32 = b4;
                ju juVar = this.b;
                switch (b32) {
                    case 0:
                        List<st> list2 = (List) obj;
                        juVar.k = (st[]) list2.toArray(new st[0]);
                        hu huVar2 = juVar.r;
                        ArrayList arrayList = new ArrayList();
                        for (st stVar : list2) {
                            o95.t(Arrays.asList(stVar.b, stVar.g), arrayList);
                        }
                        ns.e(huVar2, CollectionsKt.n0(arrayList), 0, 2);
                        juVar.f();
                        break;
                    case 1:
                        juVar.j = (LinkedHashMap) obj;
                        juVar.f();
                        break;
                    case 2:
                        juVar.l = (st[]) ((List) obj).toArray(new st[0]);
                        juVar.f();
                        break;
                    case 3:
                        juVar.m = (st[]) ((List) obj).toArray(new st[0]);
                        juVar.f();
                        break;
                    default:
                        juVar.n = (st[]) ((List) obj).toArray(new st[0]);
                        juVar.f();
                        break;
                }
                return Unit.a;
            }
        });
        this.s = iuVar;
        final byte b5 = 4;
        hu huVar2 = new hu(umiVar, new Function1(this) { // from class: fu
            public final /* synthetic */ ju b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b32 = b5;
                ju juVar = this.b;
                switch (b32) {
                    case 0:
                        List<st> list2 = (List) obj;
                        juVar.k = (st[]) list2.toArray(new st[0]);
                        hu huVar22 = juVar.r;
                        ArrayList arrayList = new ArrayList();
                        for (st stVar : list2) {
                            o95.t(Arrays.asList(stVar.b, stVar.g), arrayList);
                        }
                        ns.e(huVar22, CollectionsKt.n0(arrayList), 0, 2);
                        juVar.f();
                        break;
                    case 1:
                        juVar.j = (LinkedHashMap) obj;
                        juVar.f();
                        break;
                    case 2:
                        juVar.l = (st[]) ((List) obj).toArray(new st[0]);
                        juVar.f();
                        break;
                    case 3:
                        juVar.m = (st[]) ((List) obj).toArray(new st[0]);
                        juVar.f();
                        break;
                    default:
                        juVar.n = (st[]) ((List) obj).toArray(new st[0]);
                        juVar.f();
                        break;
                }
                return Unit.a;
            }
        }, b5, b);
        this.t = huVar2;
        tr8Var.a();
        iuVar.d(list);
        hVar.getClass();
        i7f i7fVar = BookmarksBridge.a;
        huVar2.d(!N.MtcDgF48() ? Collections.EMPTY_LIST : alo.r(Arrays.asList(hVar.o(), hVar.l(), hVar.n())));
        l08 l08Var = (List) xf8.W((ode) ipkVar.a.b);
        huVar.d(l08Var == null ? l08.a : l08Var);
        a26.T(rq8Var.h, kzeVar, new f7f(this) { // from class: gu
            public final /* synthetic */ ju b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b6 = b;
                ju juVar = this.b;
                switch (b6) {
                    case 0:
                        jq8 jq8Var = (jq8) obj;
                        juVar.p.d(jq8Var.a);
                        juVar.q.d(jq8Var);
                        break;
                    case 1:
                        Set set = (Set) obj;
                        ns.e(juVar.s, set, 0, 2);
                        ns.e(juVar.t, set, 0, 2);
                        hu huVar3 = juVar.r;
                        st[] stVarArr = juVar.k;
                        if (stVarArr == null) {
                            stVarArr = new st[0];
                        }
                        ArrayList arrayList = new ArrayList();
                        for (st stVar : stVarArr) {
                            o95.t(Arrays.asList(stVar.b, stVar.g), arrayList);
                        }
                        ns.e(huVar3, b5j.e(set, CollectionsKt.n0(arrayList)), 0, 2);
                        ns.e(juVar.p, set, 0, 2);
                        ns.e(juVar.q, set, 0, 2);
                        break;
                    case 2:
                        juVar.f();
                        break;
                    default:
                        ((Boolean) obj).getClass();
                        juVar.d.g(null);
                        juVar.f();
                        break;
                }
            }
        });
        a26.T(tr8Var.e, kzeVar, new f7f(this) { // from class: gu
            public final /* synthetic */ ju b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b6 = b3;
                ju juVar = this.b;
                switch (b6) {
                    case 0:
                        jq8 jq8Var = (jq8) obj;
                        juVar.p.d(jq8Var.a);
                        juVar.q.d(jq8Var);
                        break;
                    case 1:
                        Set set = (Set) obj;
                        ns.e(juVar.s, set, 0, 2);
                        ns.e(juVar.t, set, 0, 2);
                        hu huVar3 = juVar.r;
                        st[] stVarArr = juVar.k;
                        if (stVarArr == null) {
                            stVarArr = new st[0];
                        }
                        ArrayList arrayList = new ArrayList();
                        for (st stVar : stVarArr) {
                            o95.t(Arrays.asList(stVar.b, stVar.g), arrayList);
                        }
                        ns.e(huVar3, b5j.e(set, CollectionsKt.n0(arrayList)), 0, 2);
                        ns.e(juVar.p, set, 0, 2);
                        ns.e(juVar.q, set, 0, 2);
                        break;
                    case 2:
                        juVar.f();
                        break;
                    default:
                        ((Boolean) obj).getClass();
                        juVar.d.g(null);
                        juVar.f();
                        break;
                }
            }
        });
        a26.T((h42) otVar.f, kzeVar, new f7f(this) { // from class: gu
            public final /* synthetic */ ju b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b6 = b2;
                ju juVar = this.b;
                switch (b6) {
                    case 0:
                        jq8 jq8Var = (jq8) obj;
                        juVar.p.d(jq8Var.a);
                        juVar.q.d(jq8Var);
                        break;
                    case 1:
                        Set set = (Set) obj;
                        ns.e(juVar.s, set, 0, 2);
                        ns.e(juVar.t, set, 0, 2);
                        hu huVar3 = juVar.r;
                        st[] stVarArr = juVar.k;
                        if (stVarArr == null) {
                            stVarArr = new st[0];
                        }
                        ArrayList arrayList = new ArrayList();
                        for (st stVar : stVarArr) {
                            o95.t(Arrays.asList(stVar.b, stVar.g), arrayList);
                        }
                        ns.e(huVar3, b5j.e(set, CollectionsKt.n0(arrayList)), 0, 2);
                        ns.e(juVar.p, set, 0, 2);
                        ns.e(juVar.q, set, 0, 2);
                        break;
                    case 2:
                        juVar.f();
                        break;
                    default:
                        ((Boolean) obj).getClass();
                        juVar.d.g(null);
                        juVar.f();
                        break;
                }
            }
        });
        a26.T((kze) otVar.e, kzeVar, new f7f(this) { // from class: gu
            public final /* synthetic */ ju b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b6 = b4;
                ju juVar = this.b;
                switch (b6) {
                    case 0:
                        jq8 jq8Var = (jq8) obj;
                        juVar.p.d(jq8Var.a);
                        juVar.q.d(jq8Var);
                        break;
                    case 1:
                        Set set = (Set) obj;
                        ns.e(juVar.s, set, 0, 2);
                        ns.e(juVar.t, set, 0, 2);
                        hu huVar3 = juVar.r;
                        st[] stVarArr = juVar.k;
                        if (stVarArr == null) {
                            stVarArr = new st[0];
                        }
                        ArrayList arrayList = new ArrayList();
                        for (st stVar : stVarArr) {
                            o95.t(Arrays.asList(stVar.b, stVar.g), arrayList);
                        }
                        ns.e(huVar3, b5j.e(set, CollectionsKt.n0(arrayList)), 0, 2);
                        ns.e(juVar.p, set, 0, 2);
                        ns.e(juVar.q, set, 0, 2);
                        break;
                    case 2:
                        juVar.f();
                        break;
                    default:
                        ((Boolean) obj).getClass();
                        juVar.d.g(null);
                        juVar.f();
                        break;
                }
            }
        });
    }

    public final void e() {
        ((HashMap) this.c.c).clear();
    }

    public final void f() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Object ttVar;
        long jX0;
        int iNextIndex;
        Set setKeySet;
        st[] stVarArr = this.k;
        if (stVarArr != null) {
            ArrayList arrayList4 = new ArrayList(stVarArr.length);
            for (st stVar : stVarArr) {
                arrayList4.add(new is(stVar, gt.a, ds.c));
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            LinkedHashMap linkedHashMap = this.j;
            List listK0 = (linkedHashMap == null || (setKeySet = linkedHashMap.keySet()) == null) ? null : CollectionsKt.k0(setKeySet);
            if (listK0 != null) {
                st[] stVarArr2 = this.l;
                if (stVarArr2 != null) {
                    ArrayList arrayList5 = new ArrayList(stVarArr2.length);
                    for (st stVar2 : stVarArr2) {
                        arrayList5.add(new is(stVar2, gt.c, ds.c));
                    }
                    arrayList2 = arrayList5;
                } else {
                    arrayList2 = null;
                }
                if (arrayList2 != null) {
                    st[] stVarArr3 = this.m;
                    if (stVarArr3 != null) {
                        ArrayList arrayList6 = new ArrayList(stVarArr3.length);
                        for (st stVar3 : stVarArr3) {
                            arrayList6.add(new is(stVar3, gt.d, ds.c));
                        }
                        arrayList3 = arrayList6;
                    } else {
                        arrayList3 = null;
                    }
                    if (arrayList3 != null) {
                        st[] stVarArr4 = this.n;
                        if (stVarArr4 == null) {
                            stVarArr4 = new st[0];
                        }
                        ArrayList arrayList7 = new ArrayList(stVarArr4.length);
                        for (st stVar4 : stVarArr4) {
                            arrayList7.add(new is(stVar4, gt.e, ds.d));
                        }
                        ot otVar = this.d;
                        List<st> list = (List) ((h42) otVar.f).g();
                        shf shfVar = (shf) otVar.c;
                        shfVar.q();
                        esi esiVar = (esi) shfVar.a;
                        boolean zE = otVar.e();
                        if (zE) {
                            ArrayList arrayList8 = new ArrayList();
                            if (list != null) {
                                for (st stVar5 : list) {
                                    gt gtVar = gt.f;
                                    ht htVar = stVar5.e;
                                    arrayList8.add(new is(stVar5, gtVar, (htVar == ht.b || htVar == ht.f) ? ds.c : ds.d));
                                }
                            }
                            Boolean boolValueOf = list != null ? Boolean.valueOf(!list.isEmpty()) : null;
                            if (esiVar == null) {
                                arrayList8.add(0, fs.c);
                            } else {
                                ListIterator listIterator = arrayList8.listIterator(arrayList8.size());
                                while (true) {
                                    if (listIterator.hasPrevious()) {
                                        if (((js) listIterator.previous()).b == ds.c) {
                                            iNextIndex = listIterator.nextIndex();
                                            break;
                                        }
                                    } else {
                                        iNextIndex = -1;
                                        break;
                                    }
                                }
                                int i = iNextIndex + 1;
                                arrayList8.add(i, new hs(esiVar.a));
                                arrayList8.add(i, new gs(new rxh(2132017373)));
                                if (Intrinsics.a(boolValueOf, Boolean.TRUE)) {
                                    arrayList8.add(iNextIndex + 3, new gs(new rxh(2132017377)));
                                }
                            }
                            ttVar = new ut(arrayList8);
                        } else {
                            boolean z = !zE;
                            ttVar = new tt(z, z, arrayList, listK0, arrayList2, arrayList3, arrayList7);
                        }
                        wjh wjhVar = this.i;
                        wjhVar.c = ttVar;
                        boolean zA = Intrinsics.a((esi) wjhVar.e, esiVar);
                        wjhVar.e = esiVar;
                        if (!zA) {
                            on7 on7Var = pn7.b;
                            jX0 = cs5.x0(50, un7.d);
                        } else {
                            if (((oml) wjhVar.d) != null) {
                                return;
                            }
                            on7 on7Var2 = pn7.b;
                            jX0 = cs5.x0(0, un7.d);
                        }
                        oml omlVar = (oml) wjhVar.d;
                        if (omlVar != null) {
                            omlVar.cancel(true);
                        }
                        wjhVar.d = null;
                        oml omlVar2 = new oml(((umi) wjhVar.b).d(new c4(wjhVar, (byte) 10)));
                        wjhVar.d = omlVar2;
                        coh.k(omlVar2, (Object) null, jX0);
                    }
                }
            }
        }
    }

    public final st g(Resources resources, st stVar) {
        st[] stVarArr;
        st stVarU = this.c.u(resources, stVar);
        Integer numValueOf = null;
        switch (stVarU.e.ordinal()) {
            case 0:
                stVarArr = this.n;
                break;
            case 1:
                stVarArr = this.k;
                break;
            case 2:
                stVarArr = this.m;
                break;
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
                stVarArr = null;
                break;
            case 4:
                stVarArr = this.l;
                break;
            default:
                h9o.p();
                return null;
        }
        if (stVarArr != null) {
            int length = stVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                } else if (!Intrinsics.a(stVarArr[i].j, stVarU.j)) {
                    i++;
                }
            }
            numValueOf = Integer.valueOf(i);
        }
        if (numValueOf != null && numValueOf.intValue() != -1) {
            stVarArr[numValueOf.intValue()] = stVarU;
            f();
        }
        return stVarU;
    }

    public final void h(int i) {
        this.l = null;
        this.k = null;
        int i2 = i << 1;
        ns.e(this.r, null, i2, 1);
        ns.e(this.p, null, i2, 1);
        ot otVar = this.d;
        nt ntVar = otVar.k;
        if (ntVar.h != i) {
            ntVar.h = i;
            if (otVar.e()) {
                ((ysi) otVar.b).l();
            }
        }
    }
}
