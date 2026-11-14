package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ve4 {
    public final unb a;
    public final Object b = new Object();
    public final ArrayList c = new ArrayList();
    public final Object d = new Object();
    public final ArrayList e = new ArrayList();
    public final Object f = new Object();
    public final ArrayList g = new ArrayList();

    public ve4(unb unbVar) {
        this.a = unbVar;
    }

    public final void a(te4 te4Var, Runnable runnable) {
        boolean zAdd;
        int iOrdinal = te4Var.ordinal();
        if (iOrdinal == 0) {
            synchronized (this.b) {
                zAdd = this.c.add(runnable);
            }
        } else if (iOrdinal == 1) {
            synchronized (this.d) {
                zAdd = this.e.add(runnable);
            }
        } else if (iOrdinal != 2) {
            h9o.p();
            return;
        } else {
            synchronized (this.f) {
                zAdd = this.g.add(runnable);
            }
        }
        if (zAdd) {
            return;
        }
        te4Var.toString();
        runnable.run();
    }

    public final void b() {
        int i;
        synchronized (this.b) {
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((Runnable) obj).run();
            }
        }
        synchronized (this.d) {
            ArrayList arrayList2 = this.e;
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                ((Runnable) obj2).run();
            }
        }
        synchronized (this.f) {
            ArrayList arrayList3 = this.g;
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj3 = arrayList3.get(i);
                i++;
                ((Runnable) obj3).run();
            }
        }
    }
}
