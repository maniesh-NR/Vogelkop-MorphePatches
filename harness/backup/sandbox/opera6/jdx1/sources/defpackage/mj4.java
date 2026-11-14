package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class mj4 extends kuk implements Function2 {
    public AutoCloseable A;
    public byte t;
    public final /* synthetic */ List u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ rj4 w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj4(List list, mt5 mt5Var, boolean z, rj4 rj4Var, boolean z2, boolean z3, int i) {
        super(2, mt5Var);
        this.u = list;
        this.v = z;
        this.w = rj4Var;
        this.x = z2;
        this.y = z3;
        this.z = i;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        return new mj4(this.u, mt5Var, this.v, this.w, this.x, this.y, this.z);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0095, code lost:
    
        if (r1.q(1000000000, r11) == r0) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            px5 r0 = px5.a
            byte r1 = r11.t
            r2 = 0
            int r3 = r11.z
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r1 == 0) goto L33
            if (r1 == r7) goto L2f
            if (r1 == r6) goto L2b
            if (r1 == r5) goto L21
            if (r1 != r4) goto L1b
            defpackage.ybh.y(r12)
            goto L98
        L1b:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r11)
            return r8
        L21:
            java.lang.AutoCloseable r11 = r11.A
            java.lang.AutoCloseable r11 = (java.lang.AutoCloseable) r11
            defpackage.ybh.y(r12)     // Catch: java.lang.Throwable -> L29
            goto L76
        L29:
            r12 = move-exception
            goto L80
        L2b:
            defpackage.ybh.y(r12)
            goto L60
        L2f:
            defpackage.ybh.y(r12)
            goto L42
        L33:
            defpackage.ybh.y(r12)
            java.util.List r12 = r11.u
            java.util.Collection r12 = (java.util.Collection) r12
            r11.t = r7
            java.lang.Object r12 = defpackage.cs5.b0(r12, r11)
            if (r12 == r0) goto L97
        L42:
            boolean r12 = r11.v
            rj4 r1 = r11.w
            if (r12 == 0) goto L4e
            kwl r12 = r1.c
            r9 = 6
            defpackage.kwl.d(r12, r2, r9)
        L4e:
            boolean r12 = r11.x
            if (r12 == 0) goto L86
            vsm r12 = r1.i
            nd4 r12 = r12.a()
            r11.t = r6
            java.lang.Object r12 = r12.k(r11)
            if (r12 == r0) goto L97
        L60:
            java.lang.AutoCloseable r12 = (java.lang.AutoCloseable) r12
            r1 = r12
            qd4 r1 = (defpackage.qd4) r1     // Catch: java.lang.Throwable -> L7e
            if (r3 != 0) goto L68
            r2 = r7
        L68:
            r3 = r12
            java.lang.AutoCloseable r3 = (java.lang.AutoCloseable) r3     // Catch: java.lang.Throwable -> L7e
            r11.A = r3     // Catch: java.lang.Throwable -> L7e
            r11.t = r5     // Catch: java.lang.Throwable -> L7e
            cd5 r11 = r1.q(r2)     // Catch: java.lang.Throwable -> L7e
            if (r11 == r0) goto L97
            r11 = r12
        L76:
            defpackage.fr3.t(r11, r8)
            goto L98
        L7a:
            r10 = r12
            r12 = r11
            r11 = r10
            goto L80
        L7e:
            r11 = move-exception
            goto L7a
        L80:
            throw r12     // Catch: java.lang.Throwable -> L81
        L81:
            r0 = move-exception
            defpackage.fr3.t(r11, r12)
            throw r0
        L86:
            boolean r12 = r11.y
            if (r12 == 0) goto L98
            if (r3 != 0) goto L98
            r11.t = r4
            r2 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            java.lang.Object r11 = r1.q(r2, r11)
            if (r11 != r0) goto L98
        L97:
            return r0
        L98:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
