package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class eh2 extends kuk implements Function2 {
    public pfe a;
    public fh2 b;
    public long c;
    public byte d;
    public /* synthetic */ Object e;
    public final /* synthetic */ fh2 f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh2(long j, fh2 fh2Var, mt5 mt5Var) {
        super(2, mt5Var);
        this.f = fh2Var;
        this.g = j;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        eh2 eh2Var = new eh2(this.g, this.f, mt5Var);
        eh2Var.e = obj;
        return eh2Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0062 A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:18:0x005a, B:20:0x0062, B:22:0x0066, B:23:0x0069, B:24:0x007c), top: B:30:0x005a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            px5 r0 = px5.a
            byte r1 = r8.d
            ads_mobile_sdk.fh2 r2 = r8.f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L2c
            if (r1 == r4) goto L23
            if (r1 != r3) goto L1d
            long r0 = r8.c
            ads_mobile_sdk.fh2 r2 = r8.b
            pfe r4 = r8.a
            java.lang.Object r8 = r8.e
            nx5 r8 = (nx5) r8
            defpackage.ybh.y(r9)
            goto L5a
        L1d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            return r5
        L23:
            java.lang.Object r1 = r8.e
            nx5 r1 = (nx5) r1
            defpackage.ybh.y(r9)
            r9 = r1
            goto L43
        L2c:
            defpackage.ybh.y(r9)
            java.lang.Object r9 = r8.e
            nx5 r9 = (nx5) r9
            ads_mobile_sdk.xj2 r1 = r2.a
            r8.e = r9
            r8.d = r4
            java.lang.Object r1 = r1.r(r8)
            if (r1 == r0) goto L41
            kotlin.Unit r1 = kotlin.Unit.a
        L41:
            if (r1 == r0) goto L57
        L43:
            pfe r4 = r2.f
            r8.e = r9
            r8.a = r4
            r8.b = r2
            long r6 = r8.g
            r8.c = r6
            r8.d = r3
            java.lang.Object r8 = r4.i(r8)
            if (r8 != r0) goto L58
        L57:
            return r0
        L58:
            r8 = r9
            r0 = r6
        L5a:
            java.util.concurrent.atomic.AtomicBoolean r9 = r2.e     // Catch: java.lang.Throwable -> L82
            boolean r9 = r9.get()     // Catch: java.lang.Throwable -> L82
            if (r9 != 0) goto L7c
            d3k r9 = r2.g     // Catch: java.lang.Throwable -> L82
            if (r9 == 0) goto L69
            r9.k(r5)     // Catch: java.lang.Throwable -> L82
        L69:
            ss6 r9 = new ss6     // Catch: java.lang.Throwable -> L82
            r9.<init>(r0, r2, r5)     // Catch: java.lang.Throwable -> L82
            kotlin.coroutines.h r0 = kotlin.coroutines.h.a     // Catch: java.lang.Throwable -> L82
            fsg r1 = new fsg     // Catch: java.lang.Throwable -> L82
            r6 = 3
            r1.<init>(r9, r5, r6)     // Catch: java.lang.Throwable -> L82
            d3k r8 = defpackage.na2.B(r8, r0, r5, r1, r3)     // Catch: java.lang.Throwable -> L82
            r2.g = r8     // Catch: java.lang.Throwable -> L82
        L7c:
            kotlin.Unit r8 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L82
            r4.l(r5)
            return r8
        L82:
            r8 = move-exception
            r4.l(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.eh2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
