package com.opera.android.undo;

import android.app.Activity;
import defpackage.ami;
import defpackage.gtj;
import defpackage.guh;
import defpackage.kkm;
import defpackage.l46;
import defpackage.mkm;
import defpackage.qhc;
import defpackage.vwh;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public class UndoBar {
    public final Activity a;
    public final ami b;
    public final mgh c;
    public final lkm d;
    public final kkm e;
    public boolean f;
    public boolean g;
    public int h = 2132022002;
    public int i;
    public final boolean j;
    public boolean k;

    public UndoBar(Activity activity, vwh vwhVar, lkm lkmVar, kkm kkmVar, boolean z) {
        this.a = activity;
        this.d = lkmVar;
        this.e = kkmVar;
        kkmVar.O(new l46(this, (byte) 5));
        mgh mghVar = new mgh(this);
        this.c = mghVar;
        ami amiVar = new ami(vwhVar);
        this.b = amiVar;
        String string = activity.getString(this.h);
        amiVar.e = string;
        gtj gtjVar = (gtj) amiVar.c;
        if (gtjVar != null) {
            ((na3) gtjVar.a).i.getChildAt(0).a.setText(string);
        }
        amiVar.d = mghVar;
        this.j = z;
    }

    public final void a(boolean z) {
        if (z) {
            this.c.f();
        }
        ami amiVar = this.b;
        gtj gtjVar = (gtj) amiVar.c;
        if (gtjVar == null) {
            return;
        }
        gtjVar.a();
        amiVar.c = null;
    }

    public void b(mkm mkmVar) {
    }

    public final void c(List list) {
        int size = list.size();
        if (list.isEmpty()) {
            return;
        }
        this.g = true;
        e5d e5dVarN = this.e.N(list);
        if (!((ArrayList) e5dVarN.c).isEmpty()) {
            ((mhk) this.c.b).g(new mkm(e5dVarN, size));
            f();
            this.b.u();
        }
        this.g = false;
    }

    public final void d(qhc qhcVar) {
        guh guhVar;
        LinkedList linkedList = (LinkedList) ((mhk) this.c.b).c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            ListIterator listIterator2 = ((ArrayList) ((mkm) listIterator.next()).a.c).listIterator();
            while (true) {
                if (!listIterator2.hasNext()) {
                    guhVar = null;
                    break;
                }
                guhVar = (guh) listIterator2.next();
                if (guhVar.a.equals(qhcVar)) {
                    listIterator2.remove();
                    while (listIterator2.hasPrevious()) {
                        guh guhVar2 = (guh) listIterator2.previous();
                        int i = guhVar2.b;
                        int i2 = guhVar.b;
                        if (i > i2) {
                            guhVar2.b = i - 1;
                        } else {
                            guhVar.b = i2 + 1;
                        }
                    }
                }
            }
            if (guhVar != null) {
                listIterator.previous();
                while (listIterator.hasPrevious()) {
                    ArrayList arrayList = (ArrayList) ((mkm) listIterator.previous()).a.c;
                    ListIterator listIterator3 = arrayList.listIterator(arrayList.size());
                    while (listIterator3.hasPrevious()) {
                        guh guhVar3 = (guh) listIterator3.previous();
                        int i3 = guhVar3.b;
                        int i4 = guhVar.b;
                        if (i3 > i4) {
                            guhVar3.b = i3 - 1;
                        } else {
                            guhVar.b = i4 + 1;
                        }
                    }
                }
                r0.b--;
                if (linkedList.isEmpty()) {
                    a(false);
                    return;
                } else {
                    f();
                    return;
                }
            }
        }
    }

    public final void e(int i) {
        if (this.i != i) {
            this.i = i;
            f();
        }
    }

    public void f() {
        int i = ((mhk) this.c.b).b;
        if (i > 0) {
            int i2 = this.i;
            Activity activity = this.a;
            String string = i2 == 0 ? activity.getString(this.h, Integer.valueOf(i)) : activity.getResources().getQuantityString(this.i, i, Integer.valueOf(i));
            ami amiVar = this.b;
            amiVar.e = string;
            gtj gtjVar = (gtj) amiVar.c;
            if (gtjVar != null) {
                ((na3) gtjVar.a).i.getChildAt(0).a.setText(string);
            }
        }
    }
}
