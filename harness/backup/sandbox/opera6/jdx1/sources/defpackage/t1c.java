package defpackage;

import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class t1c {
    public final List a;
    public final p2d b;
    public final String c;
    public final long d;
    public final int e;
    public final long f;
    public final String g;
    public final List h;
    public final id1 i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final float o;
    public final float p;
    public final dd1 q;
    public final i3j r;
    public final ed1 s;
    public final List t;
    public final int u;
    public final boolean v;
    public final zy9 w;
    public final wjh x;
    public final int y;

    public t1c(List list, p2d p2dVar, String str, long j, int i, long j2, String str2, List list2, id1 id1Var, int i2, int i3, int i4, float f, float f2, float f3, float f4, dd1 dd1Var, i3j i3jVar, List list3, int i5, ed1 ed1Var, boolean z, zy9 zy9Var, wjh wjhVar, int i6) {
        this.a = list;
        this.b = p2dVar;
        this.c = str;
        this.d = j;
        this.e = i;
        this.f = j2;
        this.g = str2;
        this.h = list2;
        this.i = id1Var;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = f;
        this.n = f2;
        this.o = f3;
        this.p = f4;
        this.q = dd1Var;
        this.r = i3jVar;
        this.t = list3;
        this.u = i5;
        this.s = ed1Var;
        this.v = z;
        this.w = zy9Var;
        this.x = wjhVar;
        this.y = i6;
    }

    public final String a(String str) {
        int i;
        StringBuilder sb = new StringBuilder(str);
        sb.append(this.c);
        sb.append("\n");
        long j = this.f;
        p2d p2dVar = this.b;
        t1c t1cVar = (t1c) p2dVar.g.c(j);
        if (t1cVar != null) {
            sb.append("\t\tParents: ");
            sb.append(t1cVar.c);
            for (t1c t1cVar2 = (t1c) p2dVar.g.c(t1cVar.f); t1cVar2 != null; t1cVar2 = (t1c) p2dVar.g.c(t1cVar2.f)) {
                sb.append("->");
                sb.append(t1cVar2.c);
            }
            sb.append(str);
            sb.append("\n");
        }
        List list = this.h;
        if (!list.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(list.size());
            sb.append("\n");
        }
        int i2 = this.j;
        if (i2 != 0 && (i = this.k) != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.l)));
        }
        List list2 = this.a;
        if (!list2.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (Object obj : list2) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(obj);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return a("");
    }
}
