package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class jxf implements ufd {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final fsf e;
    public final int f;
    public final int g;
    public final int h;
    public final wfd i;
    public final wfd j;
    public final float k;
    public final int l;
    public final boolean m;
    public final n9a n;
    public final ufd o;
    public final boolean p;
    public final List q;
    public final List r;
    public final nx5 s;
    public final n27 t;
    public final long u;

    public jxf(List list, int i, int i2, int i3, fsf fsfVar, int i4, int i5, int i6, wfd wfdVar, wfd wfdVar2, float f, int i7, boolean z, n9a n9aVar, ufd ufdVar, boolean z2, List list2, List list3, nx5 nx5Var, n27 n27Var, long j) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = fsfVar;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = wfdVar;
        this.j = wfdVar2;
        this.k = f;
        this.l = i7;
        this.m = z;
        this.n = n9aVar;
        this.o = ufdVar;
        this.p = z2;
        this.q = list2;
        this.r = list3;
        this.s = nx5Var;
        this.t = n27Var;
        this.u = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jxf(l08 l08Var, int i, int i2, int i3, int i4, int i5, int i6, n9a n9aVar, ufd ufdVar, nx5 nx5Var, n27 n27Var, long j) {
        fsf fsfVar = fsf.b;
        l08 l08Var2 = l08.a;
        this(l08Var, i, i2, i3, fsfVar, i4, i5, i6, null, null, 0.0f, 0, false, n9aVar, ufdVar, false, l08Var2, l08Var2, nx5Var, n27Var, j);
    }

    @Override // defpackage.ufd
    public final Map a() {
        return this.o.a();
    }

    @Override // defpackage.ufd
    public final void b() {
        this.o.b();
    }

    @Override // defpackage.ufd
    public final Function1 c() {
        return this.o.c();
    }

    @Override // defpackage.ufd
    public final Function2 d() {
        return this.o.d();
    }

    @Override // defpackage.ufd
    public final Function1 e() {
        return this.o.e();
    }

    public final jxf f(int i) {
        int i2;
        int i3 = this.b + this.c;
        if (this.p) {
            return null;
        }
        List list = this.a;
        if (list.isEmpty() || this.i == null || (i2 = this.l - i) < 0 || i2 >= i3) {
            return null;
        }
        float f = this.k - (i3 != 0 ? i / i3 : 0.0f);
        if (this.j == null || f >= 0.5f || f <= -0.5f) {
            return null;
        }
        wfd wfdVar = (wfd) CollectionsKt.K(list);
        wfd wfdVar2 = (wfd) CollectionsKt.Q(list);
        int i4 = this.g;
        int i5 = this.f;
        if (i < 0) {
            if (Math.min((wfdVar.j + i3) - i5, (wfdVar2.j + i3) - i4) <= (-i)) {
                return null;
            }
        } else if (Math.min(i5 - wfdVar.j, i4 - wfdVar2.j) <= i) {
            return null;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((wfd) list.get(i6)).a(i);
        }
        List list2 = this.q;
        int size2 = list2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((wfd) list2.get(i7)).a(i);
        }
        List list3 = this.r;
        int size3 = list3.size();
        for (int i8 = 0; i8 < size3; i8++) {
            ((wfd) list3.get(i8)).a(i);
        }
        return new jxf(list, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, f, i2, this.m || i > 0, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u);
    }

    public final long g() {
        ufd ufdVar = this.o;
        return (ufdVar.getWidth() << 32) | (ufdVar.getHeight() & 4294967295L);
    }

    @Override // defpackage.ufd
    public final int getHeight() {
        return this.o.getHeight();
    }

    @Override // defpackage.ufd
    public final int getWidth() {
        return this.o.getWidth();
    }
}
