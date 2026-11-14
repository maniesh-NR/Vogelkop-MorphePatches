package defpackage;

import com.opera.api.Callback;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class vs6 {
    public final nx5 a;
    public final gmc b;
    public final ti9 c;
    public final rs6 d;
    public final qs6 e;
    public final e2f f;

    public vs6(nx5 nx5Var, gmc gmcVar, ti9 ti9Var, rs6 rs6Var, qs6 qs6Var, e2f e2fVar) {
        this.a = nx5Var;
        this.b = gmcVar;
        this.c = ti9Var;
        this.d = rs6Var;
        this.e = qs6Var;
        this.f = e2fVar;
    }

    public final void a(joc jocVar, long j, Callback callback) {
        on7 on7Var = pn7.b;
        long jF = pn7.f(pn7.m(cs5.y0(j, un7.d), cs5.x0(14, un7.h)));
        e2f e2fVar = this.f;
        na2.B(e2fVar.a, (CoroutineContext) null, (rx5) null, new t3(e2fVar, jocVar, jF, callback, (mt5) null), 3);
    }

    public final void b(long j, apc apcVar, int i, ch9 ch9Var) {
        gmc gmcVar = this.b;
        gmcVar.getClass();
        gmcVar.d(new zlc(i, gmcVar, j, apcVar, null, (byte) 0));
        if (i == 1 && apcVar == apc.c) {
            na2.B(this.a, (CoroutineContext) null, (rx5) null, new ss6(ch9Var, this, j, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r25, defpackage.oi9 r27, nt5 r28) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r3 = r28
            boolean r4 = r3 instanceof defpackage.ts6
            if (r4 == 0) goto L19
            r4 = r3
            ts6 r4 = (defpackage.ts6) r4
            int r5 = r4.x
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L19
            int r5 = r5 - r6
            r4.x = r5
            goto L1e
        L19:
            ts6 r4 = new ts6
            r4.<init>(r0, r3)
        L1e:
            java.lang.Object r3 = r4.v
            px5 r5 = px5.a
            int r6 = r4.x
            r7 = 0
            r8 = 2
            r9 = 1
            if (r6 == 0) goto L42
            if (r6 == r9) goto L39
            if (r6 != r8) goto L33
            oi9 r0 = r4.u
            ybh.y(r3)
            goto L9b
        L33:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r0)
            return r7
        L39:
            long r1 = r4.t
            oi9 r6 = r4.u
            ybh.y(r3)
            r10 = r6
            goto L69
        L42:
            ybh.y(r3)
            r3 = r27
            r4.u = r3
            r4.t = r1
            r4.x = r9
            gmc r6 = r0.b
            j4c r6 = r6.a
            java.lang.Object r6 = r6.get()
            wlc r6 = (defpackage.wlc) r6
            com.opera.android.live_score.data.db.LiveScoreDatabase_Impl r6 = r6.a
            x41 r10 = new x41
            r11 = 8
            r10.<init>(r1, r11)
            r11 = 0
            java.lang.Object r6 = kfo.a0(r4, r6, r9, r11, r10)
            if (r6 == r5) goto L99
            r10 = r3
            r3 = r6
        L69:
            r9 = r3
            ruc r9 = (defpackage.ruc) r9
            if (r9 == 0) goto L89
            r22 = 0
            r23 = 8388605(0x7ffffd, float:1.175494E-38)
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            ruc r0 = defpackage.ruc.a(r9, r10, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r0
        L89:
            r4.u = r10
            r4.t = r1
            r4.x = r8
            ti9 r0 = r0.c
            doc r0 = r0.h
            java.lang.Object r3 = r0.a(r1, r4)
            if (r3 != r5) goto L9a
        L99:
            return r5
        L9a:
            r0 = r10
        L9b:
            mme r3 = (defpackage.mme) r3
            if (r3 == 0) goto La4
            ruc r0 = zi4.x(r3, r0)
            return r0
        La4:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vs6.c(long, oi9, nt5):java.lang.Object");
    }

    public final void d(long j, apc apcVar, int i) {
        gmc gmcVar = this.b;
        gmcVar.getClass();
        gmcVar.d(new zlc(i, gmcVar, j, apcVar, null, (byte) 1));
        if (i == 1 && apcVar == apc.c) {
            na2.B(this.a, (CoroutineContext) null, (rx5) null, new us6((byte) 0, j, null, this), 3);
        }
    }
}
