package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wse extends ha2 {
    public final z8b k;
    public final h42 l;
    public lwc m;
    public String n;
    public final bte o;
    public final zse p;
    public avc q;

    public wse(bte bteVar, zse zseVar, tni tniVar, z8b z8bVar) {
        super(tniVar);
        this.k = z8bVar;
        this.l = new h42(l08.a);
        this.o = bteVar;
        this.p = zseVar;
    }

    public final ewc Y(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return null;
        }
        ate ateVar = (ate) arrayList.get(0);
        return arrayList.size() == 1 ? new kwc(ateVar, new use(this, ateVar, (byte) 3)) : new jwc(ateVar, arrayList.size(), new vse(this, ateVar, arrayList, (byte) 1));
    }

    public final void Z() {
        bte bteVar = this.o;
        bteVar.getClass();
        kze kzeVar = bteVar.b;
        if (!((Boolean) bteVar.c.g()).booleanValue()) {
            this.n = null;
            this.l.r(bteVar.a.g());
        } else {
            if (Intrinsics.a(this.n, kzeVar.g())) {
                return;
            }
            String str = (String) kzeVar.g();
            this.n = str;
            lwc lwcVar = this.m;
            (lwcVar != null ? lwcVar : null).filter(str);
        }
    }

    public final List b0(List list) {
        l08 l08Var;
        if (list.isEmpty()) {
            return l08.a;
        }
        ArrayList arrayList = new ArrayList();
        bte bteVar = this.o;
        bteVar.getClass();
        if (((Boolean) bteVar.c.g()).booleanValue()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ate ateVar = (ate) it.next();
                arrayList.add(new iwc(ateVar, new use(this, ateVar, (byte) 0)));
            }
            return arrayList;
        }
        ArrayList arrayList2 = bteVar.d;
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ate ateVar2 = (ate) obj;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : list) {
                if (Intrinsics.a(((ate) obj2).a, ateVar2.a)) {
                    arrayList4.add(obj2);
                }
            }
            ewc kwcVar = arrayList4.contains(ateVar2) ? arrayList4.size() == 1 ? new kwc(ateVar2, new use(this, ateVar2, (byte) 1)) : new fwc(ateVar2, new use(this, ateVar2, (byte) 2), new vse(this, ateVar2, arrayList4, (byte) 0)) : null;
            if (kwcVar != null) {
                arrayList3.add(kwcVar);
            }
        }
        if (!arrayList3.isEmpty()) {
            arrayList.add(new pwc(2132020008));
            arrayList.addAll(arrayList3);
            arrayList.add(new pwc(2132019993));
        }
        if (list.isEmpty()) {
            l08Var = l08.a;
        } else {
            l08 arrayList5 = new ArrayList();
            String str = ((ate) list.get(0)).a;
            ArrayList arrayList6 = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ate ateVar3 = (ate) it2.next();
                if (Intrinsics.a(ateVar3.a, str)) {
                    arrayList6.add(ateVar3);
                } else {
                    ewc ewcVarY = Y(arrayList6);
                    if (ewcVarY != null) {
                        arrayList5.add(ewcVarY);
                    }
                    str = ateVar3.a;
                    arrayList6 = j95.j(new ate[]{ateVar3});
                }
            }
            ewc ewcVarY2 = Y(arrayList6);
            if (ewcVarY2 != null) {
                arrayList5.add(ewcVarY2);
            }
            l08Var = arrayList5;
        }
        arrayList.addAll((Collection) l08Var);
        return arrayList;
    }
}
