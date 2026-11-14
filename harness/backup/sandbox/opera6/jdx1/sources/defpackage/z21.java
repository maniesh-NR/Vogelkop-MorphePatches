package defpackage;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z21 extends CameraDevice.StateCallback {
    public final String a;
    public final ge4 b;
    public final int c;
    public final long d;
    public final h0l e;
    public final db4 f;
    public final ab4 g;
    public final hb4 h;
    public final hnl i;
    public final hh2 j;
    public final CameraDevice.StateCallback k;
    public final f1p l;
    public final int m;
    public final Object n;
    public boolean o;
    public y21 p;
    public final CountDownLatch q;
    public final long r;
    public qql s;
    public final nak t;

    public z21(String str, ge4 ge4Var, int i, long j, h0l h0lVar, db4 db4Var, ab4 ab4Var, hb4 hb4Var, hnl hnlVar, hh2 hh2Var, CameraDevice.StateCallback stateCallback, f1p f1pVar) {
        this.a = str;
        this.b = ge4Var;
        this.c = i;
        this.d = j;
        this.e = h0lVar;
        this.f = db4Var;
        this.g = ab4Var;
        this.h = hb4Var;
        this.i = hnlVar;
        this.j = hh2Var;
        this.k = stateCallback;
        this.l = f1pVar;
        bf2 bf2Var = lan.b;
        bf2Var.getClass();
        this.m = bf2.b.incrementAndGet(bf2Var);
        this.n = new Object();
        this.q = new CountDownLatch(1);
        this.t = z4o.f(vf4.a);
        sd4.b(str);
        if (i != 1) {
            h0lVar.getClass();
            j = SystemClock.elapsedRealtimeNanos();
        }
        this.r = j;
    }

    public static void d(hb4 hb4Var) {
        hb4Var.b.getClass();
    }

    public final void a() {
        kf4 kf4Var = (kf4) this.t.getValue();
        wc4 wc4Var = kf4Var instanceof pf4 ? ((pf4) kf4Var).a : null;
        b(wc4Var != null ? (CameraDevice) wc4Var.E(uqh.a(CameraDevice.class)) : null, new y21(k65.a, null, null, 14));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.hardware.camera2.CameraDevice r7, defpackage.y21 r8) {
        /*
            r6 = this;
            nak r0 = r6.t
            java.lang.Object r0 = r0.getValue()
            kf4 r0 = (defpackage.kf4) r0
            boolean r1 = r0 instanceof defpackage.pf4
            r2 = 0
            if (r1 == 0) goto L12
            pf4 r0 = (defpackage.pf4) r0
            wc4 r0 = r0.a
            goto L13
        L12:
            r0 = r2
        L13:
            java.lang.Object r1 = r6.n
            monitor-enter(r1)
            y21 r3 = r6.p     // Catch: java.lang.Throwable -> L6b
            if (r3 != 0) goto L20
            r6.p = r8     // Catch: java.lang.Throwable -> L6b
            boolean r3 = r6.o     // Catch: java.lang.Throwable -> L6b
            if (r3 == 0) goto L21
        L20:
            r8 = r2
        L21:
            monitor-exit(r1)
            if (r8 == 0) goto L6a
            yc4 r1 = r8.c
            if (r1 == 0) goto L38
            k65 r3 = r8.a
            k65 r4 = defpackage.k65.f
            if (r3 == r4) goto L38
            db4 r3 = r6.f
            java.lang.String r4 = r6.a
            byte r1 = r1.a
            r5 = 0
            r3.a(r1, r4, r5)
        L38:
            nak r1 = r6.t
            of4 r3 = new of4
            yc4 r4 = r8.c
            r3.<init>(r4)
            r1.getClass()
            r1.k(r2, r3)
            k65 r1 = r8.a
            k65 r3 = defpackage.k65.c
            if (r1 == r3) goto L5e
            hb4 r1 = r6.h
            d(r1)
            ab4 r1 = r6.g
            hh2 r3 = r6.j
            hb4 r4 = r6.h
            d(r4)
            r1.a(r0, r7, r6, r3)
        L5e:
            nak r7 = r6.t
            nf4 r6 = r6.c(r8)
            r7.getClass()
            r7.k(r2, r6)
        L6a:
            return
        L6b:
            r6 = move-exception
            monitor-exit(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z21.b(android.hardware.camera2.CameraDevice, y21):void");
    }

    public final nf4 c(y21 y21Var) {
        sn7 sn7Var;
        sn7 sn7Var2;
        sn7 sn7Var3;
        this.e.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        qql qqlVar = this.s;
        long j = y21Var.b;
        if (qqlVar != null) {
            long j2 = qqlVar.a;
            sn7 sn7Var4 = new sn7(j2 - this.d);
            sn7 sn7Var5 = new sn7(j2 - this.r);
            sn7Var3 = new sn7(j - j2);
            sn7Var2 = sn7Var5;
            sn7Var = sn7Var4;
        } else {
            sn7Var = null;
            sn7Var2 = null;
            sn7Var3 = null;
        }
        long j3 = jElapsedRealtimeNanos - j;
        k65 k65Var = y21Var.a;
        int i = this.c - 1;
        yc4 yc4Var = y21Var.c;
        return new nf4(this.a, k65Var, Integer.valueOf(i), sn7Var, y21Var.d, sn7Var2, sn7Var3, new sn7(j3), yc4Var);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        if (!Intrinsics.a(cameraDevice.getId(), this.a)) {
            qp2.n("Check failed.");
            return;
        }
        sd4.b(this.a);
        this.q.countDown();
        synchronized (this.n) {
        }
        Trace.beginSection(((Object) sd4.b(this.a)) + "#onFinalized");
        toString();
        b(cameraDevice, new y21(k65.c, null, null, 14));
        CameraDevice.StateCallback stateCallback = this.k;
        if (stateCallback != null) {
            stateCallback.onClosed(cameraDevice);
        }
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        String id = cameraDevice.getId();
        String str = this.a;
        if (!Intrinsics.a(id, str)) {
            qp2.n("Check failed.");
            return;
        }
        Trace.beginSection(((Object) sd4.b(str)) + "#onDisconnected");
        sd4.b(str);
        this.q.countDown();
        b(cameraDevice, new y21(k65.d, new yc4(6), null, 10));
        CameraDevice.StateCallback stateCallback = this.k;
        if (stateCallback != null) {
            stateCallback.onDisconnected(cameraDevice);
        }
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        String id = cameraDevice.getId();
        String str = this.a;
        if (!Intrinsics.a(id, str)) {
            qp2.n("Check failed.");
            return;
        }
        Trace.beginSection(((Object) sd4.b(str)) + "#onError-" + i);
        sd4.b(str);
        this.q.countDown();
        k65 k65Var = k65.e;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            qp2.o(sko.i(i, "Unexpected StateCallback error code: "));
                            return;
                        }
                    }
                }
            }
        }
        b(cameraDevice, new y21(k65Var, new yc4(i2), null, 10));
        CameraDevice.StateCallback stateCallback = this.k;
        if (stateCallback != null) {
            stateCallback.onError(cameraDevice, i);
        }
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        y21 y21Var;
        y21 y21Var2;
        if (!Intrinsics.a(cameraDevice.getId(), this.a)) {
            qp2.n("Check failed.");
            return;
        }
        this.e.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        this.s = new qql(jElapsedRealtimeNanos);
        Trace.beginSection(((Object) sd4.b(this.a)) + "#onOpened");
        long j = jElapsedRealtimeNanos - this.r;
        long j2 = jElapsedRealtimeNanos - this.d;
        int i = this.c;
        String str = this.a;
        mt5 mt5Var = null;
        if (i == 1) {
            sd4.b(str);
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(j / 1000000.0d)}, 1));
        } else {
            sd4.b(str);
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(j / 1000000.0d)}, 1));
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(j2 / 1000000.0d)}, 1));
        }
        synchronized (this.n) {
            y21Var = this.p;
            if (y21Var == null) {
                this.o = true;
            }
        }
        CameraDevice.StateCallback stateCallback = this.k;
        if (stateCallback != null) {
            stateCallback.onOpened(cameraDevice);
        }
        if (y21Var != null) {
            ab4 ab4Var = this.g;
            hh2 hh2Var = this.j;
            d(this.h);
            d(this.h);
            ab4Var.a(null, cameraDevice, this, hh2Var);
            return;
        }
        v21 v21Var = new v21(this.b, cameraDevice, this.a, this.f, this.l, this.i);
        hh2 hh2Var2 = this.j;
        if (Build.VERSION.SDK_INT < 30) {
            hh2Var2.getClass();
        } else {
            synchronized (hh2Var2.c) {
                hh2Var2.e.add(v21Var);
                ih2 ih2VarA = hh2Var2.a();
                if (ih2VarA != null) {
                    na2.B(hh2Var2.a, null, rx5.d, new jj4((Object) hh2Var2.b, (Object) new vr(v21Var, ih2VarA, (mt5) null, (byte) 3), mt5Var, (byte) 11), 1);
                }
            }
        }
        nak nakVar = this.t;
        pf4 pf4Var = new pf4(v21Var);
        nakVar.getClass();
        nakVar.k((Object) null, pf4Var);
        synchronized (this.n) {
            this.o = false;
            y21Var2 = this.p;
        }
        if (y21Var2 != null) {
            nak nakVar2 = this.t;
            of4 of4Var = new of4(y21Var2.c);
            nakVar2.getClass();
            nakVar2.k((Object) null, of4Var);
            ab4 ab4Var2 = this.g;
            hh2 hh2Var3 = this.j;
            d(this.h);
            d(this.h);
            ab4Var2.a(v21Var, cameraDevice, this, hh2Var3);
            nak nakVar3 = this.t;
            nf4 nf4VarC = c(y21Var2);
            nakVar3.getClass();
            nakVar3.k((Object) null, nf4VarC);
        }
        Trace.endSection();
    }

    public final String toString() {
        return "CameraState-" + this.m;
    }
}
