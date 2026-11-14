package defpackage;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public final class tn6 implements xl7 {
    public final List a;
    public final yh8 b;
    public final yqa c;
    public final zy9 d;
    public final boolean e;
    public final boolean f;
    public final HashMap g;
    public final uv5 h;
    public final i06 i;
    public final fjg j;
    public final tn k;
    public final UUID l;
    public final Looper m;
    public final ue2 n;
    public final Object o;
    public byte p;
    public int q;
    public HandlerThread r;
    public rn6 s;
    public oo9 t;
    public wl7 u;
    public byte[] v;
    public byte[] w;
    public wh8 x;
    public nv6 y;
    public xh8 z;

    public tn6(UUID uuid, yh8 yh8Var, yqa yqaVar, zy9 zy9Var, List list, boolean z, boolean z2, byte[] bArr, HashMap map, tn tnVar, Looper looper, i06 i06Var, fjg fjgVar) {
        this.l = uuid;
        this.c = yqaVar;
        this.d = zy9Var;
        this.b = yh8Var;
        this.e = z;
        this.f = z2;
        if (bArr != null) {
            this.w = bArr;
            this.a = null;
        } else {
            list.getClass();
            this.a = Collections.unmodifiableList(list);
        }
        this.g = map;
        this.k = tnVar;
        this.h = new uv5();
        this.i = i06Var;
        this.j = fjgVar;
        this.p = (byte) 2;
        this.m = looper;
        this.n = new ue2((Object) this, looper, (byte) 1);
        this.o = new Object();
    }

    @Override // defpackage.xl7
    public final UUID a() {
        m();
        return this.l;
    }

    @Override // defpackage.xl7
    public final boolean b() {
        m();
        return this.e;
    }

    @Override // defpackage.xl7
    public final oo9 c() {
        m();
        return this.t;
    }

    @Override // defpackage.xl7
    public final void d(am7 am7Var) {
        m();
        int i = this.q;
        if (i <= 0) {
            w7d.q("release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.q = i2;
        if (i2 == 0) {
            this.p = (byte) 0;
            ue2 ue2Var = this.n;
            String str = tym.a;
            ue2Var.removeCallbacksAndMessages(null);
            rn6 rn6Var = this.s;
            synchronized (rn6Var) {
                rn6Var.removeCallbacksAndMessages(null);
                rn6Var.b = true;
            }
            this.s = null;
            this.r.quit();
            this.r = null;
            this.t = null;
            this.u = null;
            this.x = null;
            synchronized (this.o) {
                this.y = null;
            }
            this.z = null;
            byte[] bArr = this.v;
            if (bArr != null) {
                this.b.closeSession(bArr);
                this.v = null;
            }
        }
        if (am7Var != null) {
            uv5 uv5Var = this.h;
            synchronized (uv5Var.a) {
                Integer num = (Integer) uv5Var.b.get(am7Var);
                if (num != null) {
                    ArrayList arrayList = new ArrayList(uv5Var.d);
                    arrayList.remove(am7Var);
                    uv5Var.d = Collections.unmodifiableList(arrayList);
                    int iIntValue = num.intValue();
                    HashMap map = uv5Var.b;
                    if (iIntValue == 1) {
                        map.remove(am7Var);
                        HashSet hashSet = new HashSet(uv5Var.c);
                        hashSet.remove(am7Var);
                        uv5Var.c = Collections.unmodifiableSet(hashSet);
                    } else {
                        map.put(am7Var, Integer.valueOf(num.intValue() - 1));
                    }
                }
            }
            if (this.h.b(am7Var) == 0) {
                am7Var.e();
            }
        }
        zy9 zy9Var = this.d;
        int i3 = this.q;
        wn6 wn6Var = (wn6) zy9Var.a;
        if (i3 == 1 && wn6Var.p > 0 && wn6Var.l != -9223372036854775807L) {
            wn6Var.o.add(this);
            Handler handler = wn6Var.u;
            handler.getClass();
            handler.postAtTime(new bl6(this, (byte) 4), this, SystemClock.uptimeMillis() + wn6Var.l);
        } else if (i3 == 0) {
            wn6Var.m.remove(this);
            if (wn6Var.r == this) {
                wn6Var.r = null;
            }
            if (wn6Var.s == this) {
                wn6Var.s = null;
            }
            yqa yqaVar = wn6Var.i;
            HashSet hashSet2 = (HashSet) yqaVar.b;
            hashSet2.remove(this);
            if (((tn6) yqaVar.c) == this) {
                yqaVar.c = null;
                if (!hashSet2.isEmpty()) {
                    tn6 tn6Var = (tn6) hashSet2.iterator().next();
                    yqaVar.c = tn6Var;
                    xh8 provisionRequest = tn6Var.b.getProvisionRequest();
                    tn6Var.z = provisionRequest;
                    rn6 rn6Var2 = tn6Var.s;
                    String str2 = tym.a;
                    provisionRequest.getClass();
                    rn6Var2.getClass();
                    rn6Var2.obtainMessage(1, new sn6(provisionRequest, bsc.g.getAndIncrement(), SystemClock.elapsedRealtime(), true)).sendToTarget();
                }
            }
            if (wn6Var.l != -9223372036854775807L) {
                Handler handler2 = wn6Var.u;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                wn6Var.o.remove(this);
            }
        }
        wn6Var.k();
    }

    @Override // defpackage.xl7
    public final void e(am7 am7Var) {
        m();
        if (this.q < 0) {
            w7d.q("Session reference count less than zero: " + this.q);
            this.q = 0;
        }
        if (am7Var != null) {
            uv5 uv5Var = this.h;
            synchronized (uv5Var.a) {
                ArrayList arrayList = new ArrayList(uv5Var.d);
                arrayList.add(am7Var);
                uv5Var.d = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) uv5Var.b.get(am7Var);
                if (num == null) {
                    HashSet hashSet = new HashSet(uv5Var.c);
                    hashSet.add(am7Var);
                    uv5Var.c = Collections.unmodifiableSet(hashSet);
                }
                uv5Var.b.put(am7Var, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
            }
        }
        int i = this.q + 1;
        this.q = i;
        if (i == 1) {
            z4o.H(this.p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.r = handlerThread;
            handlerThread.start();
            this.s = new rn6(this, this.r.getLooper());
            if (k()) {
                g(true);
            }
        } else if (am7Var != null && h() && this.h.b(am7Var) == 1) {
            am7Var.c(this.p);
        }
        wn6 wn6Var = (wn6) this.d.a;
        if (wn6Var.l != -9223372036854775807L) {
            wn6Var.o.remove(this);
            Handler handler = wn6Var.u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // defpackage.xl7
    public final boolean f(String str) {
        m();
        byte[] bArr = this.v;
        bArr.getClass();
        return this.b.E(str, bArr);
    }

    public final void g(boolean z) {
        long jMin;
        String str;
        Set set;
        if (this.f) {
            return;
        }
        byte[] bArr = this.v;
        String str2 = tym.a;
        boolean z2 = true;
        if (this.w == null) {
            l(bArr, 1, z);
            return;
        }
        if (this.p != 4) {
            try {
                this.b.restoreKeys(this.v, this.w);
            } catch (Exception | NoSuchMethodError e) {
                i(1, e);
                z2 = false;
            }
            if (!z2) {
                return;
            }
        }
        if (q54.d.equals(this.l)) {
            m();
            byte[] bArr2 = this.v;
            Pair pair = null;
            Map mapQueryKeyStatus = bArr2 == null ? null : this.b.queryKeyStatus(bArr2);
            if (mapQueryKeyStatus != null) {
                long j = -9223372036854775807L;
                try {
                    str = (String) mapQueryKeyStatus.get("LicenseDurationRemaining");
                } catch (NumberFormatException unused) {
                }
                long j2 = str != null ? Long.parseLong(str) : -9223372036854775807L;
                Long lValueOf = Long.valueOf(j2);
                try {
                    String str3 = (String) mapQueryKeyStatus.get("PlaybackDurationRemaining");
                    if (str3 != null) {
                        j = Long.parseLong(str3);
                    }
                } catch (NumberFormatException unused2) {
                }
                pair = new Pair(lValueOf, Long.valueOf(j));
            }
            pair.getClass();
            jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        } else {
            jMin = Long.MAX_VALUE;
        }
        if (jMin <= 60) {
            w7d.m("Offline license has expired or will expire soon. Remaining seconds: " + jMin);
            l(bArr, 2, z);
            return;
        }
        if (jMin <= 0) {
            i(2, new lwb());
            return;
        }
        this.p = (byte) 4;
        uv5 uv5Var = this.h;
        synchronized (uv5Var.a) {
            set = uv5Var.c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((am7) it.next()).b();
        }
    }

    @Override // defpackage.xl7
    public final wl7 getError() {
        m();
        if (this.p == 1) {
            return this.u;
        }
        return null;
    }

    @Override // defpackage.xl7
    public final int getState() {
        m();
        return this.p;
    }

    public final boolean h() {
        byte b = this.p;
        return b == 3 || b == 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(int r6, java.lang.Throwable r7) {
        /*
            r5 = this;
            wl7 r0 = new wl7
            boolean r1 = r7 instanceof android.media.MediaDrm.MediaDrmStateException
            r2 = 1
            if (r1 == 0) goto L17
            r6 = r7
            android.media.MediaDrm$MediaDrmStateException r6 = (android.media.MediaDrm.MediaDrmStateException) r6
            java.lang.String r6 = r6.getDiagnosticInfo()
            int r6 = defpackage.tym.x(r6)
            int r6 = defpackage.tym.w(r6)
            goto L57
        L17:
            boolean r1 = r7 instanceof android.media.MediaDrmResetException
            r3 = 6006(0x1776, float:8.416E-42)
            if (r1 != 0) goto L47
            boolean r1 = r7 instanceof android.media.NotProvisionedException
            r4 = 6002(0x1772, float:8.41E-42)
            if (r1 != 0) goto L56
            boolean r1 = yi4.C(r7)
            if (r1 != 0) goto L56
            boolean r1 = r7 instanceof android.media.DeniedByServerException
            if (r1 == 0) goto L30
            r6 = 6007(0x1777, float:8.418E-42)
            goto L57
        L30:
            boolean r1 = r7 instanceof defpackage.qnm
            if (r1 == 0) goto L37
            r6 = 6001(0x1771, float:8.409E-42)
            goto L57
        L37:
            boolean r1 = r7 instanceof defpackage.un6
            if (r1 == 0) goto L3e
            r6 = 6003(0x1773, float:8.412E-42)
            goto L57
        L3e:
            boolean r1 = r7 instanceof defpackage.lwb
            if (r1 == 0) goto L45
            r6 = 6008(0x1778, float:8.419E-42)
            goto L57
        L45:
            if (r6 != r2) goto L49
        L47:
            r6 = r3
            goto L57
        L49:
            r1 = 2
            if (r6 != r1) goto L4f
            r6 = 6004(0x1774, float:8.413E-42)
            goto L57
        L4f:
            r1 = 3
            if (r6 == r1) goto L56
            hai.d()
            return
        L56:
            r6 = r4
        L57:
            r0.<init>(r6, r7)
            r5.u = r0
            java.lang.String r6 = "DRM session error"
            defpackage.w7d.r(r6, r7)
            boolean r6 = r7 instanceof java.lang.Exception
            if (r6 == 0) goto L88
            uv5 r6 = r5.h
            java.lang.Object r0 = r6.a
            monitor-enter(r0)
            java.util.Set r6 = r6.c     // Catch: java.lang.Throwable -> L86
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L86
            java.util.Iterator r6 = r6.iterator()
        L71:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L9b
            java.lang.Object r0 = r6.next()
            am7 r0 = (defpackage.am7) r0
            r1 = r7
            java.lang.Exception r1 = (java.lang.Exception) r1
            r0.d(r1)
            goto L71
        L84:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L86
            throw r5
        L86:
            r5 = move-exception
            goto L84
        L88:
            boolean r6 = r7 instanceof java.lang.Error
            if (r6 == 0) goto La3
            boolean r6 = yi4.D(r7)
            if (r6 != 0) goto L9b
            boolean r6 = yi4.C(r7)
            if (r6 != 0) goto L9b
            java.lang.Error r7 = (java.lang.Error) r7
            throw r7
        L9b:
            byte r6 = r5.p
            r7 = 4
            if (r6 == r7) goto La2
            r5.p = r2
        La2:
            return
        La3:
            java.lang.String r5 = "Unexpected Throwable subclass"
            h9o.m(r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tn6.i(int, java.lang.Throwable):void");
    }

    public final void j(Throwable th, boolean z) {
        if ((th instanceof NotProvisionedException) || yi4.C(th)) {
            this.c.n(this);
        } else {
            i(z ? 1 : 2, th);
        }
    }

    public final boolean k() {
        Set set;
        if (h()) {
            return true;
        }
        try {
            try {
                byte[] bArrOpenSession = this.b.openSession();
                this.v = bArrOpenSession;
                this.b.l(bArrOpenSession, this.j);
                this.t = this.b.s(this.v);
                this.p = (byte) 3;
                uv5 uv5Var = this.h;
                synchronized (uv5Var.a) {
                    set = uv5Var.c;
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((am7) it.next()).c(3);
                }
                this.v.getClass();
                return true;
            } catch (NotProvisionedException unused) {
                this.c.n(this);
                return false;
            }
        } catch (Exception | NoSuchMethodError e) {
            if (yi4.C(e)) {
                this.c.n(this);
                return false;
            }
            i(1, e);
            return false;
        }
    }

    public final void l(byte[] bArr, int i, boolean z) {
        try {
            synchronized (this.o) {
                this.y = new nv6((byte) 20);
                List list = this.a;
                if (list != null) {
                    h1b.s(list);
                }
            }
            wh8 wh8VarC = this.b.C(bArr, this.a, i, this.g);
            this.x = wh8VarC;
            rn6 rn6Var = this.s;
            String str = tym.a;
            wh8VarC.getClass();
            rn6Var.getClass();
            rn6Var.obtainMessage(2, new sn6(wh8VarC, bsc.g.getAndIncrement(), SystemClock.elapsedRealtime(), z)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            j(e, true);
        }
    }

    public final void m() {
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.m;
        if (threadCurrentThread != looper.getThread()) {
            w7d.L("DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
