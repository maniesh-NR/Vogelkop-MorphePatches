package androidx.work.impl;

import defpackage.b37;
import defpackage.d5o;
import defpackage.d6i;
import defpackage.esg;
import defpackage.i5o;
import defpackage.mkh;
import defpackage.pjb;
import defpackage.t4o;
import defpackage.uzk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    public volatile i5o l;
    public volatile c37 m;
    public volatile k5o n;
    public volatile vzk o;
    public volatile c5o p;
    public volatile d5o q;
    public volatile esg r;

    @Override // androidx.work.impl.WorkDatabase
    public final c5o A() {
        c5o c5oVar;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            if (this.p == null) {
                c5o c5oVar2 = new c5o();
                c5oVar2.a = this;
                c5oVar2.b = new b37(this, (byte) 3);
                this.p = c5oVar2;
            }
            c5oVar = this.p;
        }
        return c5oVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final d5o B() {
        d5o d5oVar;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            if (this.q == null) {
                d5o d5oVar2 = new d5o();
                d5oVar2.a = this;
                new b37(this, (byte) 4);
                d5oVar2.b = new uzk(this, (byte) 2);
                d5oVar2.c = new uzk(this, (byte) 3);
                this.q = d5oVar2;
            }
            d5oVar = this.q;
        }
        return d5oVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final i5o C() {
        i5o i5oVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new i5o(this);
            }
            i5oVar = this.l;
        }
        return i5oVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final k5o D() {
        k5o k5oVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new k5o(this);
            }
            k5oVar = this.n;
        }
        return k5oVar;
    }

    @Override // defpackage.y5i
    public final pjb e() {
        return new pjb(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // defpackage.y5i
    public final qsk g(ng6 ng6Var) {
        return ng6Var.c.b(new ev4(ng6Var.a, ng6Var.b, new d6i(ng6Var, new tvk(this)), false, false));
    }

    @Override // defpackage.y5i
    public final List h() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new t4o(13, 14, (byte) 0));
        arrayList.add(new t4o((byte) 1));
        arrayList.add(new t4o(16, 17, (byte) 2));
        arrayList.add(new t4o(17, 18, (byte) 3));
        arrayList.add(new t4o(18, 19, (byte) 4));
        arrayList.add(new t4o((byte) 5));
        arrayList.add(new t4o(20, 21, (byte) 6));
        arrayList.add(new t4o(22, 23, (byte) 7));
        return arrayList;
    }

    @Override // defpackage.y5i
    public final Set k() {
        return new HashSet();
    }

    @Override // defpackage.y5i
    public final Map m() {
        HashMap map = new HashMap();
        List list = Collections.EMPTY_LIST;
        map.put(i5o.class, list);
        map.put(c37.class, list);
        map.put(k5o.class, list);
        map.put(vzk.class, list);
        map.put(c5o.class, list);
        map.put(d5o.class, list);
        map.put(esg.class, list);
        map.put(mkh.class, list);
        return map;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c37 x() {
        c37 c37Var;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                c37 c37Var2 = new c37();
                c37Var2.a = this;
                c37Var2.b = new b37(this, (byte) 0);
                this.m = c37Var2;
            }
            c37Var = this.m;
        }
        return c37Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final esg y() {
        esg esgVar;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            if (this.r == null) {
                this.r = new esg(this);
            }
            esgVar = this.r;
        }
        return esgVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final vzk z() {
        vzk vzkVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                vzk vzkVar2 = new vzk();
                vzkVar2.a = this;
                vzkVar2.b = new b37(this, (byte) 2);
                vzkVar2.c = new uzk(this, (byte) 0);
                vzkVar2.d = new uzk(this, (byte) 1);
                this.o = vzkVar2;
            }
            vzkVar = this.o;
        }
        return vzkVar;
    }
}
