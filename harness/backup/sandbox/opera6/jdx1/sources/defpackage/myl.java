package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class myl {
    public boolean A;
    public csh B;
    public int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public HashMap H;
    public HashSet I;
    public int e;
    public int f;
    public int g;
    public int h;
    public csh m;
    public csh n;
    public csh o;
    public int p;
    public csh q;
    public csh r;
    public int s;
    public int t;
    public int u;
    public csh v;
    public lyl w;
    public boolean x;
    public csh y;
    public int z;
    public int a = Integer.MAX_VALUE;
    public int b = Integer.MAX_VALUE;
    public int c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int i = Integer.MAX_VALUE;
    public int j = Integer.MAX_VALUE;
    public boolean k = true;
    public boolean l = true;

    public myl() {
        a1b a1bVar = h1b.b;
        csh cshVar = csh.e;
        this.m = cshVar;
        this.n = cshVar;
        this.o = cshVar;
        this.p = 0;
        this.q = cshVar;
        this.r = cshVar;
        this.s = 0;
        this.t = Integer.MAX_VALUE;
        this.u = Integer.MAX_VALUE;
        this.v = cshVar;
        this.w = lyl.d;
        this.x = false;
        this.y = cshVar;
        this.z = 0;
        this.A = true;
        this.B = cshVar;
        this.C = 0;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = new HashMap();
        this.I = new HashSet();
    }

    public static csh f(String[] strArr) {
        z0b z0bVarP = h1b.p();
        for (String str : strArr) {
            str.getClass();
            z0bVarP.c(tym.O(str));
        }
        return z0bVarP.g();
    }

    public void a(kyl kylVar) {
        this.H.put(kylVar.a, kylVar);
    }

    public nyl b() {
        return new nyl(this);
    }

    public myl c() {
        this.H.clear();
        return this;
    }

    public myl d(int i) {
        Iterator it = this.H.values().iterator();
        while (it.hasNext()) {
            if (((kyl) it.next()).a.c == i) {
                it.remove();
            }
        }
        return this;
    }

    public final void e(nyl nylVar) {
        this.a = nylVar.a;
        this.b = nylVar.b;
        this.c = nylVar.c;
        this.d = nylVar.d;
        this.e = nylVar.e;
        this.f = nylVar.f;
        this.g = nylVar.g;
        this.h = nylVar.h;
        this.i = nylVar.i;
        this.j = nylVar.j;
        this.k = nylVar.k;
        this.l = nylVar.l;
        this.n = nylVar.n;
        this.m = nylVar.m;
        this.o = nylVar.o;
        this.p = nylVar.p;
        this.q = nylVar.q;
        this.s = nylVar.s;
        this.r = nylVar.r;
        this.t = nylVar.t;
        this.u = nylVar.u;
        this.v = nylVar.v;
        this.w = nylVar.w;
        this.x = nylVar.x;
        this.y = nylVar.y;
        this.z = nylVar.A;
        this.A = nylVar.B;
        this.B = nylVar.z;
        this.C = nylVar.C;
        this.D = nylVar.D;
        this.E = nylVar.E;
        this.F = nylVar.F;
        this.G = nylVar.G;
        this.I = new HashSet((Collection) nylVar.I);
        this.H = new HashMap(nylVar.H);
    }

    public myl g() {
        this.C = -3;
        return this;
    }

    public myl h(kyl kylVar) {
        eyl eylVar = kylVar.a;
        d(eylVar.c);
        this.H.put(eylVar, kylVar);
        return this;
    }

    public myl i(String str) {
        return str == null ? j(new String[0]) : j(str);
    }

    public myl j(String... strArr) {
        this.y = f(strArr);
        this.A = false;
        return this;
    }

    public myl k() {
        this.z = 0;
        this.A = false;
        return this;
    }

    public myl l(int i, boolean z) {
        HashSet hashSet = this.I;
        if (z) {
            hashSet.add(Integer.valueOf(i));
            return this;
        }
        hashSet.remove(Integer.valueOf(i));
        return this;
    }
}
