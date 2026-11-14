package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class k6c {
    public final jde a;
    public final i6c b;
    public final n5c c;
    public final long d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ n5c f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ rd3 i;
    public final /* synthetic */ sd3 j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ long m;
    public final /* synthetic */ u6c n;

    public k6c(long j, boolean z, i6c i6cVar, n5c n5cVar, int i, int i2, rd3 rd3Var, sd3 sd3Var, int i3, int i4, long j2, u6c u6cVar) {
        this.e = z;
        this.f = n5cVar;
        this.g = i;
        this.h = i2;
        this.i = rd3Var;
        this.j = sd3Var;
        this.k = i3;
        this.l = i4;
        this.m = j2;
        this.n = u6cVar;
        jde jdeVar = xbb.a;
        this.a = new jde();
        this.b = i6cVar;
        this.c = n5cVar;
        this.d = ap5.b(0, z ? yo5.h(j) : Integer.MAX_VALUE, 0, z ? Integer.MAX_VALUE : yo5.g(j), 5);
    }

    public final n6c a(int i, long j) {
        List list;
        i6c i6cVar = this.b;
        Object objD = i6cVar.d(i);
        Object objB = i6cVar.b(i);
        jde jdeVar = this.a;
        List list2 = (List) jdeVar.e(i);
        if (list2 != null) {
            list = list2;
        } else {
            List listA = this.c.a(i);
            int size = listA.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((pfd) listA.get(i2)).N(j));
            }
            jdeVar.i(i, arrayList);
            list = arrayList;
        }
        return new n6c(i, list, this.e, this.i, this.j, this.f.b.getLayoutDirection(), this.k, this.l, i != this.g + (-1) ? this.h : 0, this.m, objD, objB, this.n.o, j);
    }
}
