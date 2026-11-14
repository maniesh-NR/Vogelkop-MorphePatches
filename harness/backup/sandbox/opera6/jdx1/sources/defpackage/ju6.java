package defpackage;

import java.util.HashMap;
import java.util.Random;

/* loaded from: classes.dex */
public final class ju6 {
    public static final fd6 h = new fd6((byte) 1);
    public static final Random i = new Random();
    public dkd d;
    public String f;
    public final fql a = new fql();
    public final dql b = new dql();
    public final HashMap c = new HashMap();
    public gql e = gql.a;
    public long g = -1;

    public final void a(iu6 iu6Var) {
        long j = iu6Var.c;
        if (j != -1 && iu6Var.e) {
            this.g = j;
        }
        this.f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.iu6 b(int r19, defpackage.jrd r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.util.HashMap r3 = r0.c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L16:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto La1
            java.lang.Object r8 = r4.next()
            iu6 r8 = (defpackage.iu6) r8
            long r9 = r8.c
            jrd r11 = r8.d
            r12 = -1
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L56
            int r9 = r8.b
            if (r1 != r9) goto L56
            if (r2 == 0) goto L56
            long r9 = r2.d
            ju6 r14 = r8.g
            java.util.HashMap r15 = r14.c
            r16 = r12
            java.lang.String r12 = r14.f
            java.lang.Object r12 = r15.get(r12)
            iu6 r12 = (defpackage.iu6) r12
            if (r12 == 0) goto L4a
            long r12 = r12.c
            int r15 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r15 != 0) goto L4f
        L4a:
            long r12 = r14.g
            r14 = 1
            long r12 = r12 + r14
        L4f:
            int r12 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r12 < 0) goto L58
            r8.c = r9
            goto L58
        L56:
            r16 = r12
        L58:
            if (r2 == 0) goto L82
            long r9 = r2.d
            int r12 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r12 == 0) goto L82
            if (r11 != 0) goto L6f
            boolean r12 = r2.b()
            if (r12 != 0) goto L16
            long r12 = r8.c
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L16
            goto L86
        L6f:
            long r12 = r11.d
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L16
            int r9 = r2.b
            int r10 = r11.b
            if (r9 != r10) goto L16
            int r9 = r2.c
            int r10 = r11.c
            if (r9 != r10) goto L16
            goto L86
        L82:
            int r9 = r8.b
            if (r1 != r9) goto L16
        L86:
            long r9 = r8.c
            int r12 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r12 == 0) goto L9d
            int r12 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r12 < 0) goto L9d
            if (r12 != 0) goto L16
            java.lang.String r9 = defpackage.tym.a
            jrd r9 = r5.d
            if (r9 == 0) goto L16
            if (r11 == 0) goto L16
            r5 = r8
            goto L16
        L9d:
            r5 = r8
            r6 = r9
            goto L16
        La1:
            if (r5 != 0) goto Lb3
            fd6 r4 = defpackage.ju6.h
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            iu6 r5 = new iu6
            r5.<init>(r0, r4, r1, r2)
            r3.put(r4, r5)
        Lb3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju6.b(int, jrd):iu6");
    }

    public final synchronized String c(gql gqlVar, jrd jrdVar) {
        return b(gqlVar.g(jrdVar.a, this.b).c, jrdVar).a;
    }

    public final void d(d11 d11Var) {
        jrd jrdVar;
        gql gqlVar = d11Var.b;
        int i2 = d11Var.c;
        jrd jrdVar2 = d11Var.d;
        boolean zP = gqlVar.p();
        String str = this.f;
        HashMap map = this.c;
        if (zP) {
            if (str != null) {
                iu6 iu6Var = (iu6) map.get(str);
                iu6Var.getClass();
                a(iu6Var);
                return;
            }
            return;
        }
        iu6 iu6Var2 = (iu6) map.get(str);
        this.f = b(i2, jrdVar2).a;
        e(d11Var);
        if (jrdVar2 != null) {
            long j = jrdVar2.d;
            if (jrdVar2.b()) {
                if (iu6Var2 != null && iu6Var2.c == j && (jrdVar = iu6Var2.d) != null && jrdVar.b == jrdVar2.b && jrdVar.c == jrdVar2.c) {
                    return;
                }
                b(i2, new jrd(j, jrdVar2.a));
                this.d.getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e A[Catch: all -> 0x00c8, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x001c, B:13:0x0028, B:15:0x002e, B:21:0x0039, B:23:0x0045, B:25:0x004b, B:29:0x0053, B:31:0x005f, B:32:0x0063, B:34:0x0068, B:36:0x006e, B:38:0x0085, B:39:0x00a2, B:41:0x00a6, B:42:0x00ad, B:44:0x00b7, B:46:0x00bb), top: B:53:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void e(defpackage.d11 r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            dkd r0 = r8.d     // Catch: java.lang.Throwable -> Lc8
            r0.getClass()     // Catch: java.lang.Throwable -> Lc8
            gql r0 = r9.b     // Catch: java.lang.Throwable -> Lc8
            boolean r0 = r0.p()     // Catch: java.lang.Throwable -> Lc8
            if (r0 == 0) goto L10
            monitor-exit(r8)
            return
        L10:
            jrd r0 = r9.d     // Catch: java.lang.Throwable -> Lc8
            if (r0 == 0) goto L53
            long r0 = r0.d     // Catch: java.lang.Throwable -> Lc8
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L39
            java.util.HashMap r4 = r8.c     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r5 = r8.f     // Catch: java.lang.Throwable -> Lc8
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> Lc8
            iu6 r4 = (defpackage.iu6) r4     // Catch: java.lang.Throwable -> Lc8
            if (r4 == 0) goto L2e
            long r4 = r4.c     // Catch: java.lang.Throwable -> Lc8
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L33
        L2e:
            long r4 = r8.g     // Catch: java.lang.Throwable -> Lc8
            r6 = 1
            long r4 = r4 + r6
        L33:
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L39
            monitor-exit(r8)
            return
        L39:
            java.util.HashMap r0 = r8.c     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r1 = r8.f     // Catch: java.lang.Throwable -> Lc8
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lc8
            iu6 r0 = (defpackage.iu6) r0     // Catch: java.lang.Throwable -> Lc8
            if (r0 == 0) goto L53
            long r4 = r0.c     // Catch: java.lang.Throwable -> Lc8
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L53
            int r0 = r0.b     // Catch: java.lang.Throwable -> Lc8
            int r1 = r9.c     // Catch: java.lang.Throwable -> Lc8
            if (r0 == r1) goto L53
            monitor-exit(r8)
            return
        L53:
            int r0 = r9.c     // Catch: java.lang.Throwable -> Lc8
            jrd r1 = r9.d     // Catch: java.lang.Throwable -> Lc8
            iu6 r0 = r8.b(r0, r1)     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r1 = r8.f     // Catch: java.lang.Throwable -> Lc8
            if (r1 != 0) goto L63
            java.lang.String r1 = r0.a     // Catch: java.lang.Throwable -> Lc8
            r8.f = r1     // Catch: java.lang.Throwable -> Lc8
        L63:
            jrd r1 = r9.d     // Catch: java.lang.Throwable -> Lc8
            r2 = 1
            if (r1 == 0) goto La2
            boolean r1 = r1.b()     // Catch: java.lang.Throwable -> Lc8
            if (r1 == 0) goto La2
            jrd r1 = new jrd     // Catch: java.lang.Throwable -> Lc8
            jrd r3 = r9.d     // Catch: java.lang.Throwable -> Lc8
            java.lang.Object r4 = r3.a     // Catch: java.lang.Throwable -> Lc8
            long r5 = r3.d     // Catch: java.lang.Throwable -> Lc8
            int r3 = r3.b     // Catch: java.lang.Throwable -> Lc8
            r1.<init>(r3, r5, r4)     // Catch: java.lang.Throwable -> Lc8
            int r3 = r9.c     // Catch: java.lang.Throwable -> Lc8
            iu6 r1 = r8.b(r3, r1)     // Catch: java.lang.Throwable -> Lc8
            boolean r3 = r1.e     // Catch: java.lang.Throwable -> Lc8
            if (r3 != 0) goto La2
            r1.e = r2     // Catch: java.lang.Throwable -> Lc8
            gql r1 = r9.b     // Catch: java.lang.Throwable -> Lc8
            jrd r3 = r9.d     // Catch: java.lang.Throwable -> Lc8
            java.lang.Object r3 = r3.a     // Catch: java.lang.Throwable -> Lc8
            dql r4 = r8.b     // Catch: java.lang.Throwable -> Lc8
            r1.g(r3, r4)     // Catch: java.lang.Throwable -> Lc8
            dql r1 = r8.b     // Catch: java.lang.Throwable -> Lc8
            jrd r3 = r9.d     // Catch: java.lang.Throwable -> Lc8
            int r3 = r3.b     // Catch: java.lang.Throwable -> Lc8
            r1.d(r3)     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r1 = defpackage.tym.a     // Catch: java.lang.Throwable -> Lc8
            dkd r1 = r8.d     // Catch: java.lang.Throwable -> Lc8
            r1.getClass()     // Catch: java.lang.Throwable -> Lc8
        La2:
            boolean r1 = r0.e     // Catch: java.lang.Throwable -> Lc8
            if (r1 != 0) goto Lad
            r0.e = r2     // Catch: java.lang.Throwable -> Lc8
            dkd r1 = r8.d     // Catch: java.lang.Throwable -> Lc8
            r1.getClass()     // Catch: java.lang.Throwable -> Lc8
        Lad:
            java.lang.String r1 = r0.a     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r3 = r8.f     // Catch: java.lang.Throwable -> Lc8
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lc8
            if (r1 == 0) goto Lc4
            boolean r1 = r0.f     // Catch: java.lang.Throwable -> Lc8
            if (r1 != 0) goto Lc4
            r0.f = r2     // Catch: java.lang.Throwable -> Lc8
            dkd r1 = r8.d     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r0 = r0.a     // Catch: java.lang.Throwable -> Lc8
            r1.l(r9, r0)     // Catch: java.lang.Throwable -> Lc8
        Lc4:
            monitor-exit(r8)
            return
        Lc6:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lc8
            throw r9
        Lc8:
            r9 = move-exception
            goto Lc6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju6.e(d11):void");
    }
}
