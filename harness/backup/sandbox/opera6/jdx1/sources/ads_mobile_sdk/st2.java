package ads_mobile_sdk;

import defpackage.eyo;
import defpackage.fsg;
import defpackage.pin;
import defpackage.tso;
import defpackage.vkp;
import defpackage.xf8;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class st2 {
    public final tso a;
    public final vkp b;
    public final qr0 c;
    public final eyo d;
    public vz e;
    public nx5 f;
    public ws g;
    public ku0 h;
    public final p04 i = xf8.h(0, null, null, 7);
    public final LinkedList j = new LinkedList();

    public st2(tso tsoVar, vkp vkpVar, qr0 qr0Var, eyo eyoVar) {
        this.a = tsoVar;
        this.b = vkpVar;
        this.c = qr0Var;
        this.d = eyoVar;
    }

    public abstract Object a(kuk kukVar);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(byte[] r9, nt5 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ads_mobile_sdk.ot2
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.ot2 r0 = (ads_mobile_sdk.ot2) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ads_mobile_sdk.ot2 r0 = new ads_mobile_sdk.ot2
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            px5 r1 = px5.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.ybh.y(r10)     // Catch: java.io.IOException -> L5d
            goto L71
        L28:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            return r3
        L2e:
            defpackage.ybh.y(r10)
            ads_mobile_sdk.g21 r10 = new ads_mobile_sdk.g21     // Catch: java.io.IOException -> L5d
            r10.<init>()     // Catch: java.io.IOException -> L5d
            ads_mobile_sdk.qr0 r2 = r8.c     // Catch: java.io.IOException -> L5d
            java.lang.String r5 = "gads:remote_capture_service_url"
            java.lang.String r6 = "https://pagead2.googlesyndication.com/pagead/ping?e=2&f=1"
            ads_mobile_sdk.fo r7 = ads_mobile_sdk.fo.a$23     // Catch: java.io.IOException -> L5d
            java.lang.Object r2 = r2.a(r5, r6, r7)     // Catch: java.io.IOException -> L5d
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.io.IOException -> L5d
            r10.b(r2)     // Catch: java.io.IOException -> L5d
            java.lang.String r2 = "application/x-protobuf"
            r10.b(r2, r9)     // Catch: java.io.IOException -> L5d
            ads_mobile_sdk.h21 r9 = r10.a()     // Catch: java.io.IOException -> L5d
            vkp r8 = r8.b     // Catch: java.io.IOException -> L5d
            r0.c = r4     // Catch: java.io.IOException -> L5d
            r10 = 30
            java.lang.Object r8 = defpackage.vkp.c(r8, r9, r3, r0, r10)     // Catch: java.io.IOException -> L5d
            if (r8 != r1) goto L71
            return r1
        L5d:
            r8 = move-exception
            vr3 r9 = ads_mobile_sdk.xu0.a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Failed to ping RCS payload: "
            r9.<init>(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            ads_mobile_sdk.xu0.b(r8, r3)
        L71:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.st2.a(byte[], nt5):java.lang.Object");
    }

    public final void a(Object obj) {
        synchronized (this) {
            this.j.add(obj);
        }
        if (a()) {
            this.i.b(Unit.a);
        }
    }

    public final void a(nx5 nx5Var, ku0 ku0Var, ws wsVar) {
        this.f = nx5Var;
        this.h = ku0Var;
        this.e = (vz) this.a.get();
        this.g = wsVar;
        nx5 nx5Var2 = this.f;
        mt5 mt5Var = null;
        if (nx5Var2 == null) {
            nx5Var2 = null;
        }
        defpackage.na2.B(nx5Var2, h.a, null, new fsg(new pin((byte) 8, mt5Var, this), mt5Var, (byte) 3), 2);
    }

    public boolean a() {
        boolean z;
        synchronized (this) {
            int size = this.j.size();
            qr0 qr0Var = this.c;
            qr0Var.getClass();
            z = size >= ((Number) qr0Var.a("gads:exception_buffer_size", (Object) 1000, (Function1) fo.a$11)).intValue();
        }
        return z;
    }

    public long b() {
        qr0 qr0Var = this.c;
        qr0Var.getClass();
        on7 on7Var = pn7.b;
        return ((pn7) qr0Var.a("gads:exception_monitoring_interval_ms", u0h.b(5, un7.f), fo.a$18)).a;
    }
}
