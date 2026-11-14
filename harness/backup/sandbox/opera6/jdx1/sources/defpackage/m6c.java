package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class m6c implements ufd {
    public final n6c a;
    public final int b;
    public final boolean c;
    public final float d;
    public final ufd e;
    public final float f;
    public final boolean g;
    public final nx5 h;
    public final n27 i;
    public final long j;
    public final int k;
    public final List l;
    public final int m;
    public final int n;
    public final int o;
    public final fsf p;
    public final int q;
    public final int r;

    public m6c(n6c n6cVar, int i, boolean z, float f, ufd ufdVar, float f2, boolean z2, nx5 nx5Var, n27 n27Var, long j, int i2, List list, int i3, int i4, int i5, fsf fsfVar, int i6, int i7) {
        this.a = n6cVar;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = ufdVar;
        this.f = f2;
        this.g = z2;
        this.h = nx5Var;
        this.i = n27Var;
        this.j = j;
        this.k = i2;
        this.l = list;
        this.m = i3;
        this.n = i4;
        this.o = i5;
        this.p = fsfVar;
        this.q = i6;
        this.r = i7;
    }

    @Override // defpackage.ufd
    public final Map a() {
        return this.e.a();
    }

    @Override // defpackage.ufd
    public final void b() {
        this.e.b();
    }

    @Override // defpackage.ufd
    public final Function1 c() {
        return this.e.c();
    }

    @Override // defpackage.ufd
    public final Function2 d() {
        return this.e.d();
    }

    @Override // defpackage.ufd
    public final Function1 e() {
        return this.e.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.m6c f(int r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m6c.f(int, boolean):m6c");
    }

    public final long g() {
        ufd ufdVar = this.e;
        return (ufdVar.getWidth() << 32) | (ufdVar.getHeight() & 4294967295L);
    }

    @Override // defpackage.ufd
    public final int getHeight() {
        return this.e.getHeight();
    }

    @Override // defpackage.ufd
    public final int getWidth() {
        return this.e.getWidth();
    }
}
