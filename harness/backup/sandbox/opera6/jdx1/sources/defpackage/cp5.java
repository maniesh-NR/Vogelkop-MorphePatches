package defpackage;

import java.util.ArrayList;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class cp5 implements opj, c3c {
    public long b;
    public ArrayList c;

    @Override // defpackage.c3c
    public final ufd c(vfd vfdVar, pfd pfdVar, long j) {
        h(j);
        ifg ifgVarN = pfdVar.N(j);
        return vfdVar.b0(ifgVarN.a, ifgVarN.b, n08.a, new f4(ifgVarN, (byte) 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.opj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(mt5 r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.bp5
            if (r0 == 0) goto L13
            r0 = r8
            bp5 r0 = (defpackage.bp5) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L1a
        L13:
            bp5 r0 = new bp5
            nt5 r8 = (nt5) r8
            r0.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            pqh r0 = r0.t
            defpackage.ybh.y(r8)     // Catch: java.lang.Throwable -> L2b
            goto L63
        L2b:
            r8 = move-exception
            goto L73
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            r7 = 0
            return r7
        L34:
            defpackage.ybh.y(r8)
            long r4 = r7.b
            boolean r8 = defpackage.yo5.k(r4)
            if (r8 == 0) goto L7f
            pqh r8 = new pqh
            r8.<init>()
            r0.t = r8     // Catch: java.lang.Throwable -> L6f
            r0.w = r3     // Catch: java.lang.Throwable -> L6f
            nh4 r2 = new nh4     // Catch: java.lang.Throwable -> L6f
            mt5 r0 = hib.b(r0)     // Catch: java.lang.Throwable -> L6f
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L6f
            r2.s()     // Catch: java.lang.Throwable -> L6f
            r8.a = r2     // Catch: java.lang.Throwable -> L6f
            java.util.ArrayList r0 = r7.c     // Catch: java.lang.Throwable -> L6f
            r0.add(r2)     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r0 = r2.q()     // Catch: java.lang.Throwable -> L6f
            if (r0 != r1) goto L62
            return r1
        L62:
            r0 = r8
        L63:
            java.util.ArrayList r8 = r7.c
            java.lang.Object r0 = r0.a
            java.util.Collection r8 = defpackage.y9m.p(r8)
            r8.remove(r0)
            goto L7f
        L6f:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L73:
            java.util.ArrayList r7 = r7.c
            java.lang.Object r0 = r0.a
            java.util.Collection r7 = defpackage.y9m.p(r7)
            r7.remove(r0)
            throw r8
        L7f:
            long r7 = r7.b
            apj r0 = new apj
            int r1 = defpackage.yo5.h(r7)
            f97 r2 = defpackage.f97.a
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r3) goto L97
            defpackage.e97.a(r1)
            e97 r4 = new e97
            r4.<init>(r1)
            goto L98
        L97:
            r4 = r2
        L98:
            int r7 = defpackage.yo5.g(r7)
            if (r7 == r3) goto La6
            defpackage.e97.a(r7)
            e97 r2 = new e97
            r2.<init>(r7)
        La6:
            r0.<init>(r4, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cp5.f(mt5):java.lang.Object");
    }

    public final void h(long j) {
        this.b = j;
        if (yo5.k(j)) {
            return;
        }
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty()) {
            return;
        }
        this.c = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            p0i p0iVar = t0i.b;
            ((mt5) obj).resumeWith(Unit.a);
        }
    }
}
