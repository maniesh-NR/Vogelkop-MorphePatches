package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class v3c implements ufd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ufd b;
    public final /* synthetic */ z3c c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ufd e;

    public /* synthetic */ v3c(ufd ufdVar, z3c z3cVar, int i, ufd ufdVar2, byte b) {
        this.a = b;
        this.c = z3cVar;
        this.d = i;
        this.e = ufdVar2;
        this.b = ufdVar;
    }

    @Override // defpackage.ufd
    public final Map a() {
        switch (this.a) {
        }
        return this.b.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    @Override // defpackage.ufd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r17 = this;
            r0 = r17
            byte r1 = r0.a
            ufd r2 = r0.e
            int r3 = r0.d
            z3c r0 = r0.c
            switch(r1) {
                case 0: goto L1e;
                default: goto Ld;
            }
        Ld:
            r0.d = r3
            r2.b()
            m3c r1 = r0.a
            m3c r1 = r1.h
            if (r1 != 0) goto L1d
            int r1 = r0.d
            r0.f(r1)
        L1d:
            return
        L1e:
            r0.e = r3
            r2.b()
            dfe r1 = r0.m
            see r2 = r0.l
            long[] r3 = r2.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L8c
            r6 = 0
        L2f:
            r7 = r3[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L87
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = 0
        L49:
            if (r11 >= r9) goto L85
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L81
            int r12 = r6 << 3
            int r12 = r12 + r11
            java.lang.Object[] r13 = r2.b
            r13 = r13[r12]
            java.lang.Object[] r14 = r2.c
            r14 = r14[r12]
            gkk r14 = (defpackage.gkk) r14
            int r15 = r1.j(r13)
            if (r15 < 0) goto L73
            int r5 = r0.e
            if (r15 < r5) goto L81
            java.lang.Object[] r5 = r1.a
            r16 = r5[r15]
            java.lang.Object r16 = defpackage.dkk.b
            r5[r15] = r16
        L73:
            see r5 = r0.j
            boolean r5 = r5.b(r13)
            if (r5 == 0) goto L7e
            r14.dispose()
        L7e:
            r2.l(r12)
        L81:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L49
        L85:
            if (r9 != r10) goto L8c
        L87:
            if (r6 == r4) goto L8c
            int r6 = r6 + 1
            goto L2f
        L8c:
            int r1 = r0.d
            r0.f(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v3c.b():void");
    }

    @Override // defpackage.ufd
    public final Function1 c() {
        switch (this.a) {
        }
        return this.b.c();
    }

    @Override // defpackage.ufd
    public final Function2 d() {
        switch (this.a) {
        }
        return this.b.d();
    }

    @Override // defpackage.ufd
    public final Function1 e() {
        switch (this.a) {
        }
        return this.b.e();
    }

    @Override // defpackage.ufd
    public final int getHeight() {
        switch (this.a) {
        }
        return this.b.getHeight();
    }

    @Override // defpackage.ufd
    public final int getWidth() {
        switch (this.a) {
        }
        return this.b.getWidth();
    }
}
