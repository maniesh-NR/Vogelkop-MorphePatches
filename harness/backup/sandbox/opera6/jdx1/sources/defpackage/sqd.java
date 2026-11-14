package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class sqd implements mod {
    public final ksa a;
    public final int b;

    public sqd(ksa ksaVar, int i) {
        this.a = ksaVar;
        this.b = i;
    }

    @Override // defpackage.mod
    public final void a(int i, n3j n3jVar) {
        this.a.j0(i, n3jVar.b(), Bundle.EMPTY);
    }

    @Override // defpackage.mod
    public final void b(int i) {
        this.a.b(i);
    }

    @Override // defpackage.mod
    public final void c(int i, int i2, int i3) {
        this.a.c(i, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != sqd.class) {
            return false;
        }
        return Objects.equals(this.a.asBinder(), ((sqd) obj).a.asBinder());
    }

    @Override // defpackage.mod
    public final void f() {
        exg.n(this.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        if (r2 != 4) goto L25;
     */
    @Override // defpackage.mod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r10, defpackage.xbc r11) {
        /*
            r9 = this;
            java.lang.String r0 = defpackage.xbc.j
            java.lang.Object r1 = r11.c
            int r2 = r11.d
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = defpackage.xbc.g
            int r5 = r11.a
            r3.putInt(r4, r5)
            java.lang.String r4 = defpackage.xbc.h
            long r5 = r11.b
            r3.putLong(r4, r5)
            sjd r4 = r11.e
            if (r4 == 0) goto L43
            java.lang.String r5 = defpackage.xbc.i
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r7 = defpackage.sjd.e
            android.os.Bundle r8 = r4.a
            r6.putBundle(r7, r8)
            java.lang.String r7 = defpackage.sjd.f
            boolean r8 = r4.b
            r6.putBoolean(r7, r8)
            java.lang.String r7 = defpackage.sjd.g
            boolean r8 = r4.c
            r6.putBoolean(r7, r8)
            java.lang.String r7 = defpackage.sjd.h
            boolean r4 = r4.d
            r6.putBoolean(r7, r4)
            r3.putBundle(r5, r6)
        L43:
            a4j r11 = r11.f
            if (r11 == 0) goto L50
            java.lang.String r4 = defpackage.xbc.l
            android.os.Bundle r11 = r11.b()
            r3.putBundle(r4, r11)
        L50:
            java.lang.String r11 = defpackage.xbc.k
            r3.putInt(r11, r2)
            if (r1 == 0) goto L98
            r11 = 1
            if (r2 == r11) goto L9e
            r11 = 2
            r4 = 0
            if (r2 == r11) goto L8f
            r11 = 3
            if (r2 == r11) goto L65
            r11 = 4
            if (r2 == r11) goto L9e
            goto L98
        L65:
            k14 r11 = new k14
            h1b r1 = (h1b) r1
            z0b r2 = h1b.p()
            r5 = r4
        L6e:
            int r6 = r1.size()
            if (r5 >= r6) goto L84
            java.lang.Object r6 = r1.get(r5)
            qjd r6 = (defpackage.qjd) r6
            android.os.Bundle r6 = r6.c(r4)
            r2.c(r6)
            int r5 = r5 + 1
            goto L6e
        L84:
            csh r1 = r2.g()
            r11.<init>(r1)
            r3.putBinder(r0, r11)
            goto L98
        L8f:
            qjd r1 = (defpackage.qjd) r1
            android.os.Bundle r11 = r1.c(r4)
            r3.putBundle(r0, r11)
        L98:
            ksa r9 = r9.a
            r9.z(r10, r3)
            return
        L9e:
            h9o.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sqd.g(int, xbc):void");
    }

    @Override // defpackage.mod
    public final void h(int i, c4j c4jVar, boolean z, boolean z2, int i2) {
        this.a.h0(i, c4jVar.a(z, z2).c(i2));
    }

    public final int hashCode() {
        return Objects.hash(this.a.asBinder());
    }

    @Override // defpackage.mod
    public final void i(int i, cig cigVar) {
        this.a.g0(i, cigVar.c());
    }

    @Override // defpackage.mod
    public final void j(int i, e4j e4jVar) {
        this.a.V(i, e4jVar.b());
    }

    @Override // defpackage.mod
    public final void l(int i, ijg ijgVar, cig cigVar, boolean z, boolean z2) {
        Bundle bundleR;
        int i2 = this.b;
        z4o.H(i2 != 0);
        boolean z3 = z || !cigVar.a(17);
        boolean z4 = z2 || !cigVar.a(30);
        ksa ksaVar = this.a;
        if (i2 < 2) {
            ksaVar.F(ijgVar.o(cigVar, z, true).r(i2), i, z3);
            return;
        }
        ijg ijgVarO = ijgVar.o(cigVar, z, z2);
        if (ksaVar instanceof lid) {
            bundleR = new Bundle();
            bundleR.putBinder(ijg.o0, new hjg(ijgVarO));
        } else {
            bundleR = ijgVarO.r(i2);
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean(gjg.d, z3);
        bundle.putBoolean(gjg.e, z4);
        ksaVar.l0(i, bundleR, bundle);
    }
}
