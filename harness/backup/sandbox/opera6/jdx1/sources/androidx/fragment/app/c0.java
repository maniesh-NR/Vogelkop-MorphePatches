package androidx.fragment.app;

import android.view.ViewGroup;
import defpackage.hyj;
import defpackage.p3p;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class c0 {
    public int a;
    public int b;
    public final Fragment c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final ArrayList j;
    public final ArrayList k;
    public final z l;

    public c0(int i, int i2, z zVar) {
        Fragment fragment = zVar.c;
        this.a = i;
        this.b = i2;
        this.c = fragment;
        this.d = new ArrayList();
        this.i = true;
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        this.k = arrayList;
        this.l = zVar;
    }

    public final void a(ViewGroup viewGroup) {
        this.h = false;
        if (this.e) {
            return;
        }
        this.e = true;
        if (this.j.isEmpty()) {
            b();
            return;
        }
        for (hyj hyjVar : CollectionsKt.k0(this.k)) {
            if (!hyjVar.b) {
                hyjVar.b(viewGroup);
            }
            hyjVar.b = true;
        }
    }

    public final void b() {
        this.h = false;
        if (!this.f) {
            if (w.N(2)) {
                toString();
            }
            this.f = true;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
        }
        this.c.mTransitioning = false;
        this.l.i();
    }

    public final void c(hyj hyjVar) {
        ArrayList arrayList = this.j;
        if (arrayList.remove(hyjVar) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(int i, int i2) {
        int iA = vep.A(i2);
        Fragment fragment = this.c;
        if (iA == 0) {
            if (this.a != 1) {
                if (w.N(2)) {
                    Objects.toString(fragment);
                }
                this.a = i;
                return;
            }
            return;
        }
        if (iA != 1) {
            if (iA == 2) {
                if (w.N(2)) {
                    Objects.toString(fragment);
                }
                this.a = 1;
                this.b = 3;
                this.i = true;
                return;
            }
            return;
        }
        if (this.a == 1) {
            if (w.N(2)) {
                Objects.toString(fragment);
            }
            this.a = 2;
            this.b = 2;
            this.i = true;
        }
    }

    public final String toString() {
        StringBuilder sbS = p3p.s("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        int i = this.a;
        String str = "null";
        sbS.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED");
        sbS.append(" lifecycleImpact = ");
        int i2 = this.b;
        if (i2 == 1) {
            str = "NONE";
        } else if (i2 == 2) {
            str = "ADDING";
        } else if (i2 == 3) {
            str = "REMOVING";
        }
        sbS.append(str);
        sbS.append(" fragment = ");
        sbS.append(this.c);
        sbS.append('}');
        return sbS.toString();
    }
}
