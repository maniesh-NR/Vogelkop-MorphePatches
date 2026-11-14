package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.e;

/* loaded from: classes.dex */
public final class x94 implements AutoCloseable {
    public final a64 a;
    public final CopyOnWriteArrayList b;

    public x94(s9i s9iVar, String str) {
        a64 a64VarB = sgb.b(e.a(((hnl) s9iVar.c).f, new csk((unb) s9iVar.d)));
        this.a = a64VarB;
        this.b = new CopyOnWriteArrayList();
        na2.B(a64VarB, null, null, new s3(s9iVar, str, this, null, (byte) 12), 3);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        sgb.k(this.a, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(long r8, nt5 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.v94
            if (r0 == 0) goto L13
            r0 = r10
            v94 r0 = (defpackage.v94) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            v94 r0 = new v94
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 0
            java.util.concurrent.CopyOnWriteArrayList r7 = r7.b
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L33
            if (r2 != r5) goto L2d
            cd5 r8 = r0.t
            defpackage.ybh.y(r10)
            goto L51
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r4
        L33:
            defpackage.ybh.y(r10)
            cd5 r10 = new cd5
            r10.<init>()
            r7.add(r10)
            w94 r2 = new w94
            r2.<init>(r10, r4, r3)
            r0.t = r10
            r0.w = r5
            java.lang.Object r8 = uyg.w(r8, r2, r0)
            if (r8 != r1) goto L4e
            return r1
        L4e:
            r6 = r10
            r10 = r8
            r8 = r6
        L51:
            if (r10 == 0) goto L54
            r3 = r5
        L54:
            r7.remove(r8)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x94.h(long, nt5):java.lang.Object");
    }
}
