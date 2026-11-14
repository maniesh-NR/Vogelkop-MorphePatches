package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import android.webkit.URLUtil;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public abstract class aap {
    public static volatile z8p c;
    public static d3k g;
    public static d3k h;
    public static final zyk a = z4c.b(xvo.n);
    public static final zyk b = z4c.b(xvo.o);
    public static final pfe d = new pfe();
    public static final AtomicBoolean e = new AtomicBoolean();
    public static long f = -1;
    public static final AtomicReference i = new AtomicReference();

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
    
        if (na2.Z(r12, r5, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable a(android.app.Application r12, nt5 r13) {
        /*
            boolean r0 = r13 instanceof defpackage.i9p
            if (r0 == 0) goto L13
            r0 = r13
            i9p r0 = (defpackage.i9p) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            i9p r0 = new i9p
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.v
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 2
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2b
            ybh.y(r13)     // Catch: java.lang.Throwable -> L82
            goto L7d
        L2b:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r12)
            r12 = 0
            return r12
        L32:
            java.lang.String r12 = r0.u
            android.app.Application r2 = r0.t
            ybh.y(r13)     // Catch: java.lang.Throwable -> L82
            r6 = r12
            r8 = r2
            goto L5d
        L3c:
            ybh.y(r13)
            p0i r13 = t0i.b     // Catch: java.lang.Throwable -> L82
            java.lang.String r13 = ynh.c()     // Catch: java.lang.Throwable -> L82
            cv6 r2 = bb7.a     // Catch: java.lang.Throwable -> L82
            d7a r2 = s6d.a     // Catch: java.lang.Throwable -> L82
            dno r5 = new dno     // Catch: java.lang.Throwable -> L82
            r5.<init>(r12, r9, r4)     // Catch: java.lang.Throwable -> L82
            r0.t = r12     // Catch: java.lang.Throwable -> L82
            r0.u = r13     // Catch: java.lang.Throwable -> L82
            r0.w = r4     // Catch: java.lang.Throwable -> L82
            java.lang.Object r2 = na2.Z(r2, r5, r0)     // Catch: java.lang.Throwable -> L82
            if (r2 == r1) goto L7c
            r8 = r12
            r6 = r13
            r13 = r2
        L5d:
            r7 = r13
            p5p r7 = (defpackage.p5p) r7     // Catch: java.lang.Throwable -> L82
            zyk r12 = defpackage.aap.a     // Catch: java.lang.Throwable -> L82
            java.lang.Object r12 = r12.getValue()     // Catch: java.lang.Throwable -> L82
            kotlin.coroutines.CoroutineContext r12 = (kotlin.coroutines.CoroutineContext) r12     // Catch: java.lang.Throwable -> L82
            k54 r5 = new k54     // Catch: java.lang.Throwable -> L82
            r10 = 12
            r11 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L82
            r0.t = r9     // Catch: java.lang.Throwable -> L82
            r0.u = r9     // Catch: java.lang.Throwable -> L82
            r0.w = r3     // Catch: java.lang.Throwable -> L82
            java.lang.Object r12 = na2.Z(r12, r5, r0)     // Catch: java.lang.Throwable -> L82
            if (r12 != r1) goto L7d
        L7c:
            return r1
        L7d:
            java.lang.Boolean r12 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L82
            p0i r13 = t0i.b     // Catch: java.lang.Throwable -> L82
            goto L8c
        L82:
            r0 = move-exception
            r12 = r0
            p0i r13 = t0i.b
            q0i r13 = new q0i
            r13.<init>(r12)
            r12 = r13
        L8c:
            uyg.h(r12)
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            boolean r0 = r12 instanceof q0i
            if (r0 == 0) goto L96
            r12 = r13
        L96:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aap.a(android.app.Application, nt5):java.io.Serializable");
    }

    public static final String b(long j, boolean z) {
        if (!z) {
            j -= System.currentTimeMillis();
        }
        if (j < 0) {
            j = -j;
        }
        long j2 = j / 1000;
        long j3 = j2 / 86400;
        long j4 = (j2 % 86400) / 3600;
        long j5 = (j2 % 3600) / 60;
        long j6 = j2 % 60;
        StringBuilder sb = new StringBuilder();
        if (j3 > 0) {
            sb.append(j3 + "d ");
        }
        if (j4 > 0) {
            sb.append(j4 + "h ");
        }
        if (j5 > 0) {
            sb.append(j5 + "m ");
        }
        if (j6 > 0 || sb.length() == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(j6);
            sb2.append('s');
            sb.append(sb2.toString());
        }
        String string = sb.toString();
        return j < 0 ? string.concat(" ago") : "in ".concat(string);
    }

    public static final void c(Context context, String str) {
        long jN;
        if (str != null) {
            String str2 = URLUtil.isHttpsUrl(str) ? str : null;
            if (str2 != null) {
                on7 on7Var = pn7.b;
                Application application = cbp.b;
                long jY0 = cs5.y0(SystemClock.uptimeMillis() - cbp.a, un7.d);
                un7 un7Var = un7.e;
                long jP = pn7.p(jY0, un7Var);
                if (jP < 20) {
                    uih.a.getClass();
                    jN = uih.b.n(40L) + (20 - jP);
                } else if (jP < 60) {
                    uih.a.getClass();
                    jN = uih.b.n(60 - jP);
                } else {
                    jN = 0;
                }
                Map map = a3p.h0;
                na2.B(w2p.a, (CoroutineContext) null, (rx5) null, new i2p(cs5.y0(jN, un7Var), cs5.x0(30, un7Var), context, str2, null), 3);
            }
        }
    }

    public static final void d(Application application) {
        pfp.b();
        d3k d3kVar = h;
        if (d3kVar == null || !d3kVar.isActive()) {
            h = na2.B(w2p.a, (CoroutineContext) null, (rx5) null, new fno(application, null, (byte) 2), 3);
        }
    }

    public static final void e(Application application) {
        pfp.b();
        d3k d3kVar = g;
        if (d3kVar == null || !d3kVar.isActive()) {
            g = na2.B(w2p.a, (CoroutineContext) null, (rx5) null, new v9p(application, null, (byte) 0), 3);
        }
    }

    public static final z8p f() {
        z8p z8pVar = c;
        return z8pVar == null ? (z8p) b.getValue() : z8pVar;
    }
}
