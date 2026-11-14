package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class vpk implements f7f {
    public final ipk c;
    public final h42 d;
    public int f;
    public final zzh a = new zzh(this, 17);
    public final ode b = new ode(new upk(Collections.EMPTY_LIST, -1));
    public int e = 0;

    public vpk(ipk ipkVar) {
        this.c = ipkVar;
        h42 h42Var = (h42) ipkVar.s.b;
        this.d = h42Var;
        h42Var.k(this);
    }

    public final void a() {
        List list;
        kpk kpkVar = (kpk) this.d.g();
        Object obj = kpkVar.a;
        int iOrdinal = ((npk) kpkVar.b).ordinal();
        if (iOrdinal == 0) {
            return;
        }
        if (iOrdinal != 1) {
            return;
        }
        lpk lpkVar = (lpk) obj;
        if (this.f == 0) {
            lpkVar.getClass();
            list = Collections.EMPTY_LIST;
        } else {
            list = lpkVar.c;
        }
        b(-1, list);
    }

    public final void b(int i, List list) {
        zzh zzhVar;
        ipk ipkVar;
        ode odeVar = this.b;
        h1b h1bVar = ((upk) odeVar.g()).a;
        odeVar.r(new upk(list, i));
        int size = h1bVar.size();
        int i2 = 0;
        while (true) {
            zzhVar = this.a;
            ipkVar = this.c;
            if (i2 >= size) {
                break;
            }
            Object obj = h1bVar.get(i2);
            i2++;
            ook ookVar = (ook) obj;
            ipkVar.getClass();
            if (ookVar.d == 3) {
                r8f r8fVar = ipkVar.q;
                i7f i7fVar = (i7f) r8fVar.b.get(ookVar.h);
                if (i7fVar != null) {
                    i7fVar.c(new q8f(ookVar, zzhVar));
                }
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ook ookVar2 = (ook) it.next();
            ipkVar.getClass();
            if (ookVar2.d == 3) {
                r8f r8fVar2 = ipkVar.q;
                String str = ookVar2.h;
                HashMap map = r8fVar2.b;
                i7f i7fVar2 = (i7f) map.get(str);
                if (i7fVar2 == null) {
                    i7fVar2 = new i7f();
                    map.put(str, i7fVar2);
                }
                i7fVar2.b(new q8f(ookVar2, zzhVar));
            }
        }
    }

    public final void d0(Object obj) {
        List list;
        kpk kpkVar = (kpk) obj;
        Object obj2 = kpkVar.a;
        int iOrdinal = ((npk) kpkVar.b).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                lpk lpkVar = (lpk) obj2;
                int i = this.e;
                if (i == -1) {
                    return;
                }
                this.e = -1;
                if (this.f == 0) {
                    lpkVar.getClass();
                    list = Collections.EMPTY_LIST;
                } else {
                    list = lpkVar.c;
                }
                b(i, list);
                return;
            }
            return;
        }
        int i2 = ((mpk) obj2).c;
        ArrayList arrayList = new ArrayList(i2);
        while (true) {
            int i3 = i2 - 1;
            if (i2 <= 0) {
                b(-1, arrayList);
                return;
            } else {
                arrayList.add(new ook(11, 0, "", sko.i(i3, "https://www.opera.com?"), ""));
                i2 = i3;
            }
        }
    }
}
