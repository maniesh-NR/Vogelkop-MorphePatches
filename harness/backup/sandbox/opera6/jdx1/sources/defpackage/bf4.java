package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class bf4 implements v6f {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ bf4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void b(Throwable th) {
    }

    private final void c(Throwable th) {
    }

    @Override // defpackage.v6f
    public final void a(Object obj) {
        cf4 cf4Var;
        tah tahVar;
        hf4 hf4Var;
        rn9 rn9Var;
        ArrayList arrayList;
        int i = 0;
        switch (this.a) {
            case 0:
                List list = (List) obj;
                if (!((cf4) this.b).l.get() || (tahVar = (cf4Var = (cf4) this.b).f) == null || (hf4Var = cf4Var.g) == null || (rn9Var = cf4Var.i) == null) {
                    return;
                }
                if (list != null) {
                    List list2 = list;
                    arrayList = new ArrayList(k95.o(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((td4) it.next()).a());
                    }
                } else {
                    arrayList = l08.a;
                }
                try {
                    List list3 = ((cf4) this.b).k;
                    List list4 = (Iterable) (((AtomicBoolean) tahVar.k).get() ? l08.a : CollectionsKt.k0(tahVar.j(arrayList)));
                    ArrayList arrayList2 = new ArrayList(k95.o(list4, 10));
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(y9m.v((String) it2.next(), null, null));
                    }
                    Set setD = b5j.d(CollectionsKt.n0(list3), CollectionsKt.n0(arrayList2));
                    if (!setD.isEmpty()) {
                        if (rn9Var.C(hf4Var.c(), setD)) {
                            return;
                        }
                    }
                } catch (Exception unused) {
                }
                try {
                    tahVar.A(arrayList);
                    Set setO = tahVar.o();
                    ArrayList arrayList3 = new ArrayList(k95.o(setO, 10));
                    Iterator it3 = setO.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(y9m.v((String) it3.next(), null, null));
                    }
                    if (arrayList3.equals(((cf4) this.b).k)) {
                        return;
                    }
                    cf4 cf4Var2 = (cf4) this.b;
                    List listK0 = CollectionsKt.k0(cf4Var2.k);
                    if (arrayList3.equals(listK0)) {
                        return;
                    }
                    synchronized (cf4Var2.d) {
                        ScheduledFuture scheduledFuture = cf4Var2.e;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                            cf4Var2.e = null;
                        }
                    }
                    List list5 = listK0;
                    Set setN0 = CollectionsKt.n0(list5);
                    Set setN02 = CollectionsKt.n0(arrayList3);
                    Set setD2 = b5j.d(setN02, setN0);
                    Set setD3 = b5j.d(setN0, setN02);
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList(k95.o(arrayList3, 10));
                    int size = arrayList3.size();
                    while (i < size) {
                        Object obj2 = arrayList3.get(i);
                        i++;
                        arrayList5.add(((td4) obj2).a());
                    }
                    try {
                        Iterator it4 = setD3.iterator();
                        while (it4.hasNext()) {
                            cf4Var2.c(((td4) it4.next()).a());
                        }
                        hf4 hf4Var2 = cf4Var2.g;
                        if (hf4Var2 != null) {
                            hf4Var2.a(arrayList5);
                            arrayList4.add(hf4Var2);
                        }
                        if (!cf4Var2.m.isEmpty()) {
                            cf4Var2.m.size();
                            Iterator it5 = cf4Var2.m.iterator();
                            while (it5.hasNext()) {
                                rfb rfbVar = (rfb) it5.next();
                                rfbVar.a(arrayList5);
                                arrayList4.add(rfbVar);
                            }
                        }
                        cf4Var2.k = arrayList3;
                        Iterator it6 = setD2.iterator();
                        while (it6.hasNext()) {
                            cf4Var2.a(((td4) it6.next()).a());
                        }
                        cf4Var2.b(setD2, setD3);
                        return;
                    } catch (Exception unused2) {
                        ArrayList arrayList6 = new ArrayList(k95.o(list5, 10));
                        Iterator it7 = list5.iterator();
                        while (it7.hasNext()) {
                            arrayList6.add(((td4) it7.next()).a());
                        }
                        q1i it8 = new r1i(arrayList4).iterator();
                        while (true) {
                            q1i q1iVar = it8;
                            if (!((ListIterator) q1iVar.b).hasPrevious()) {
                                Iterator it9 = setD3.iterator();
                                while (it9.hasNext()) {
                                    cf4Var2.a(((td4) it9.next()).a());
                                }
                                Iterator it10 = setD2.iterator();
                                while (it10.hasNext()) {
                                    cf4Var2.c(((td4) it10.next()).a());
                                }
                                return;
                            }
                            rfb rfbVar2 = (rfb) ((ListIterator) q1iVar.b).previous();
                            try {
                                rfbVar2.a(arrayList6);
                            } catch (Exception unused3) {
                                Objects.toString(rfbVar2);
                            }
                        }
                    }
                } catch (Exception unused4) {
                    return;
                }
                break;
            case 1:
                ((qp5) this.b).accept(obj);
                return;
            default:
                so2 so2Var = (so2) obj;
                y2n y2nVar = (y2n) this.b;
                if (so2Var == null) {
                    qp2.o("StreamInfo can't be null");
                    return;
                }
                int i2 = so2Var.a;
                if (y2nVar.y != 3) {
                    Objects.toString(y2nVar.u);
                    so2Var.toString();
                    so2 so2Var2 = y2nVar.u;
                    y2nVar.u = so2Var;
                    to2 to2Var = y2nVar.i;
                    to2Var.getClass();
                    int i3 = so2Var2.a;
                    Set set = so2.d;
                    if (!set.contains(Integer.valueOf(i3)) && !set.contains(Integer.valueOf(i2)) && i3 != i2) {
                        y2nVar.R();
                        return;
                    }
                    if (so2Var2.a == -1 ? i2 != -1 : i2 == -1) {
                        y2nVar.K(y2nVar.v, so2Var, to2Var);
                        Object[] objArr = {y2nVar.v.b()};
                        ArrayList arrayList7 = new ArrayList(1);
                        Object obj3 = objArr[0];
                        Objects.requireNonNull(obj3);
                        arrayList7.add(obj3);
                        y2nVar.G(Collections.unmodifiableList(arrayList7));
                        y2nVar.r();
                        return;
                    }
                    if (so2Var2.b != so2Var.b) {
                        y2nVar.K(y2nVar.v, so2Var, to2Var);
                        Object[] objArr2 = {y2nVar.v.b()};
                        ArrayList arrayList8 = new ArrayList(1);
                        Object obj4 = objArr2[0];
                        Objects.requireNonNull(obj4);
                        arrayList8.add(obj4);
                        y2nVar.G(Collections.unmodifiableList(arrayList8));
                        Iterator it11 = y2nVar.a.iterator();
                        while (it11.hasNext()) {
                            ((prm) it11.next()).k(y2nVar);
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.v6f
    public final void onError(Throwable th) {
        xf2 xf2Var;
        switch (this.a) {
            case 0:
                cf4 cf4Var = (cf4) this.b;
                if (cf4Var.l.get() && (xf2Var = cf4Var.h) != null) {
                    xf2Var.b();
                    break;
                }
                break;
        }
    }
}
