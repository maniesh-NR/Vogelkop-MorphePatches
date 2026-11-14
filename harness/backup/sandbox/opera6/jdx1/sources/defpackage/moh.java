package defpackage;

import android.media.MediaCodec;
import android.net.Uri;
import android.os.Bundle;
import android.util.LruCache;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class moh implements k4n {
    public static final Set C = Collections.unmodifiableSet(EnumSet.of(loh.b, loh.c));
    public static final Set D = Collections.unmodifiableSet(EnumSet.of(loh.a, loh.d, loh.g, loh.f, loh.h));
    public static final wfh E;
    public static final s4n F;
    public static final zrd G;
    public static final j9h H;
    public static final v3n I;
    public static final j9h J;
    public static final byte K;
    public static final short L;
    public int B;
    public final m59 a;
    public final m59 b;
    public final Executor c;
    public final b2j d;
    public final j9h e;
    public buk n;
    public zpl o;
    public final m59 r;
    public q18 t;
    public final r72 u;
    public ScheduledFuture v;
    public cyd w;
    public cyd x;
    public koh y;
    public boolean z;
    public final Object f = new Object();
    public final m59 g = new m59((Object) null);
    public loh h = loh.a;
    public loh i = null;
    public int j = 0;
    public boolean k = false;
    public gp2 l = null;
    public final ArrayList m = new ArrayList();
    public Surface p = null;
    public Surface q = null;
    public f28 s = null;
    public int A = 1;

    static {
        mo2 mo2Var = mo2.g;
        List listAsList = Arrays.asList(mo2Var, mo2.f, mo2.e);
        on2 on2Var = on2.c;
        wfh wfhVarA = wfh.a(listAsList, new on2(mo2Var, 1));
        E = wfhVarA;
        s4n s4nVar = new s4n(wfhVarA, -1);
        F = s4nVar;
        G = new zrd(s4nVar);
        new RuntimeException("The video frame producer became inactive before any data was received.");
        H = new j9h((byte) 11);
        I = w3n.d;
        J = new j9h((byte) 13);
        new b2j(tjb.a());
        K = (byte) 3;
        L = (short) 1000;
    }

    public moh(zrd zrdVar, j9h j9hVar, j9h j9hVar2, j9h j9hVar3) {
        int i = 0;
        Uri uri = Uri.EMPTY;
        this.t = null;
        this.u = new r72(60, (h9o) null);
        this.B = 3;
        this.v = null;
        this.x = null;
        this.y = null;
        this.z = false;
        Executor executorA = tjb.a();
        this.c = executorA;
        b2j b2jVar = new b2j(executorA);
        this.d = b2jVar;
        int i2 = s4n.c;
        s4n s4nVar = zrdVar.a;
        this.r = new m59(new zrd(s4nVar.b == -1 ? new s4n(s4nVar.a, F.b) : s4nVar));
        this.a = new m59(new so2(this.j, m(this.h)));
        this.b = new m59(Boolean.FALSE);
        this.e = j9hVar;
        this.w = new cyd(j9hVar, b2jVar, executorA);
        String[] strArr = {"B", "KB", "MB", "GB", "TB"};
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double d = 5.24288E7d;
        double d2 = 5.24288E7d;
        while (d2 >= 1024.0d && i < 4) {
            d2 /= 1024.0d;
            i++;
        }
        if (i == 0) {
            decimalFormat.format(d2);
            String str = strArr[i];
            return;
        }
        StringBuilder sb = new StringBuilder();
        while (-1 < i) {
            double dPow = Math.pow(1024.0d, i);
            double dFloor = Math.floor(d / dPow);
            if (dFloor > 0.0d) {
                sb.append(decimalFormat.format(dFloor));
                sb.append(" ");
                sb.append(strArr[i]);
                sb.append(" ");
                d -= dFloor * dPow;
            }
            i--;
        }
        StringsKt.l0(sb).toString();
    }

    public static k28 k(int i, ud4 ud4Var) {
        k28 k28Var;
        v3n v3nVar = I;
        LruCache lruCache = m28.a;
        zyk zykVarB = z4c.b(new sa1(ud4Var, i, v3nVar));
        if (ud4Var instanceof mr) {
            mr mrVar = (mr) ud4Var;
            xd4 xd4Var = mrVar.a;
            if (!xd4Var.d() && xd4Var.j() != -1) {
                l28 l28Var = new l28(mrVar.a.e(), mrVar.c, i, v3nVar);
                LruCache lruCache2 = m28.a;
                synchronized (lruCache2) {
                    k28Var = (k28) lruCache2.get(l28Var);
                    if (k28Var == null) {
                        k28Var = (k28) zykVarB.getValue();
                        lruCache2.put(l28Var, k28Var);
                    }
                }
                return k28Var;
            }
        }
        return (k28) zykVarB.getValue();
    }

    public static Object l(m59 m59Var) {
        try {
            return m59Var.b().get();
        } catch (InterruptedException | ExecutionException e) {
            h9o.o(e);
            return null;
        }
    }

    public static int m(loh lohVar) {
        return (lohVar == loh.e || lohVar == loh.f) ? 1 : 2;
    }

    @Override // defpackage.k4n
    public final void a(buk bukVar) {
        f(bukVar, zpl.a, false);
    }

    @Override // defpackage.k4n
    public final x6f b() {
        return this.r;
    }

    @Override // defpackage.k4n
    public final x6f c() {
        return this.a;
    }

    @Override // defpackage.k4n
    public final k28 d(int i, ud4 ud4Var) {
        return k(i == 1 ? 2 : 1, ud4Var);
    }

    @Override // defpackage.k4n
    public final boolean e() {
        return ((zrd) l(this.r)).a.a == E;
    }

    @Override // defpackage.k4n
    public final void f(buk bukVar, zpl zplVar, boolean z) {
        synchronized (this.f) {
            Objects.toString(this.h);
            if (this.h == loh.h) {
                q(loh.a);
            }
        }
        this.d.execute(new gg7(this, bukVar, zplVar, z, (byte) 3));
    }

    @Override // defpackage.k4n
    public final q2n g(xd4 xd4Var, int i) {
        int i2 = i == 1 ? 2 : 1;
        ((zrd) l(this.r)).a.getClass();
        return new noh(k(i2, xd4Var), xd4Var);
    }

    @Override // defpackage.k4n
    public final void h(int i) {
        this.d.execute(new br(this, i, (byte) 21));
    }

    @Override // defpackage.k4n
    public final x6f i() {
        return this.b;
    }

    public final void j(buk bukVar, zpl zplVar, boolean z) {
        if (bukVar.h.b.isDone()) {
            return;
        }
        j9h j9hVar = new j9h(this);
        b2j b2jVar = this.d;
        bukVar.b(b2jVar, j9hVar);
        Size size = bukVar.b;
        wh4 wh4VarA = d(bukVar.g, bukVar.e.a()).a(bukVar.c);
        gp2 gp2VarA = wh4VarA != null ? wh4VarA.a(size) : null;
        this.l = gp2VarA;
        Objects.toString(gp2VarA);
        koh kohVar = this.y;
        if (kohVar != null && !kohVar.d) {
            kohVar.d = true;
            ScheduledFuture scheduledFuture = kohVar.f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                kohVar.f = null;
            }
        }
        koh kohVar2 = new koh(this, bukVar, zplVar, this.z, z ? K : (byte) 0);
        this.y = kohVar2;
        Objects.toString(this.s);
        cyd cydVar = this.w;
        cydVar.a();
        k1g.O((ListenableFuture) cydVar.i).addListener(new jbd(kohVar2, bukVar, zplVar, (byte) 15), b2jVar);
    }

    public final void n(int i, IOException iOException) throws Exception {
        boolean z;
        synchronized (this.f) {
            z = false;
            switch (this.h.ordinal()) {
                case 0:
                case 3:
                case 8:
                    throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.h);
                case 4:
                case 5:
                    q(loh.f);
                    z = true;
                    break;
            }
        }
        if (z) {
            r(i, iOException);
        }
    }

    public final void o() throws Exception {
        boolean z;
        boolean z2;
        synchronized (this.f) {
            switch (this.h.ordinal()) {
                case 1:
                case 2:
                    s(loh.g);
                case 0:
                case 3:
                case 8:
                    z = true;
                    z2 = false;
                    break;
                case 4:
                case 5:
                    jpo.n("In-progress recording shouldn't be null when in state " + this.h, false);
                    q(loh.g);
                    z2 = true;
                    z = false;
                    break;
                case 6:
                    q(loh.g);
                    z = false;
                    z2 = false;
                    break;
                case 7:
                default:
                    z = false;
                    z2 = false;
                    break;
            }
        }
        if (!z) {
            if (z2) {
                r(4, null);
                return;
            }
            return;
        }
        this.A = 1;
        f28 f28Var = this.s;
        if (f28Var != null) {
            cyd cydVar = this.x;
            if (cydVar != null) {
                jpo.n((String) null, ((f28) cydVar.f) == f28Var);
                Objects.toString(this.s);
                this.x.e();
                this.x = null;
                this.s = null;
                p(null);
            } else {
                Objects.toString(f28Var);
                cyd cydVar2 = this.w;
                cydVar2.a();
                k1g.O((ListenableFuture) cydVar2.i);
            }
        }
        synchronized (this.f) {
            switch (this.h.ordinal()) {
                case 1:
                case 2:
                    s(loh.a);
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    q(loh.a);
                    break;
            }
        }
        buk bukVar = this.n;
        if (bukVar == null || bukVar.h.b.isDone()) {
            return;
        }
        j(this.n, this.o, false);
    }

    public final void p(Surface surface) {
        if (this.p == surface) {
            return;
        }
        this.p = surface;
        synchronized (this.f) {
            int iHashCode = surface != null ? surface.hashCode() : 0;
            if (this.j != iHashCode) {
                this.j = iHashCode;
                this.a.o(new so2(iHashCode, m(this.h)));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(defpackage.loh r3) {
        /*
            r2 = this;
            loh r0 = r2.h
            if (r0 == r3) goto L50
            java.util.Objects.toString(r0)
            java.util.Objects.toString(r3)
            java.util.Set r0 = defpackage.moh.C
            boolean r1 = r0.contains(r3)
            if (r1 == 0) goto L33
            loh r1 = r2.h
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L3a
            java.util.Set r0 = defpackage.moh.D
            loh r1 = r2.h
            boolean r0 = r0.contains(r1)
            loh r1 = r2.h
            if (r0 == 0) goto L2d
            r2.i = r1
            int r0 = m(r1)
            goto L3b
        L2d:
            java.lang.String r2 = "Invalid state transition. Should not be transitioning to a PENDING state from state "
            j9h.g(r1, r2)
            return
        L33:
            loh r0 = r2.i
            if (r0 == 0) goto L3a
            r0 = 0
            r2.i = r0
        L3a:
            r0 = 0
        L3b:
            r2.h = r3
            if (r0 != 0) goto L43
            int r0 = m(r3)
        L43:
            int r3 = r2.j
            so2 r1 = new so2
            r1.<init>(r3, r0)
            m59 r2 = r2.a
            r2.o(r1)
            return
        L50:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Attempted to transition to state "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = ", but Recorder is already in state "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.moh.q(loh):void");
    }

    public final void r(int i, IOException iOException) throws Exception {
        if (this.k) {
            return;
        }
        this.k = true;
        if (this.A != 4) {
            q18 q18Var = this.t;
            if (q18Var != null) {
                q18Var.close();
                this.t = null;
            }
            final byte b = 2;
            if (this.B != 2) {
                rl rlVar = new rl((byte) 28);
                this.v = ((g7a) x7d.l()).schedule(new q2g(this.d, rlVar, (byte) 24), 1000L, TimeUnit.MILLISECONDS);
            } else {
                f28 f28Var = this.s;
                if (f28Var != null) {
                    f28Var.g.execute(new y18(f28Var, (byte) 3));
                }
            }
            final f28 f28Var2 = this.s;
            final long jO = f28Var2.p.O();
            f28Var2.g.execute(new Runnable() { // from class: z18
                @Override // java.lang.Runnable
                public final void run() {
                    switch (b) {
                        case 0:
                            f28 f28Var3 = f28Var2;
                            long j = jO;
                            switch (vep.A(f28Var3.E)) {
                                case 0:
                                case 2:
                                case 3:
                                case 5:
                                case 7:
                                    break;
                                case 1:
                                    yi4.O(j);
                                    f28Var3.n.addLast(Range.create(Long.valueOf(j), Long.MAX_VALUE));
                                    f28Var3.g(3);
                                    break;
                                case 4:
                                    f28Var3.g(6);
                                    break;
                                case 6:
                                case 8:
                                    qp2.n("Encoder is released");
                                    break;
                                default:
                                    qp2.n("Unknown state: ".concat(o18.v(f28Var3.E)));
                                    break;
                            }
                        case 1:
                            f28 f28Var4 = f28Var2;
                            long j2 = jO;
                            switch (vep.A(f28Var4.E)) {
                                case 0:
                                    f28Var4.x = null;
                                    yi4.O(j2);
                                    try {
                                        if (f28Var4.A) {
                                            f28Var4.f();
                                        }
                                        f28Var4.u = Range.create(Long.valueOf(j2), Long.MAX_VALUE);
                                        f28Var4.d.start();
                                        s18 s18Var = f28Var4.e;
                                        if (s18Var instanceof b28) {
                                            ((b28) s18Var).a(true);
                                        }
                                        f28Var4.g(2);
                                        break;
                                    } catch (MediaCodec.CodecException e) {
                                        f28Var4.a(1, e.getMessage(), e);
                                        return;
                                    }
                                case 1:
                                case 4:
                                case 7:
                                    break;
                                case 2:
                                    f28Var4.x = null;
                                    Range range = (Range) f28Var4.n.removeLast();
                                    jpo.n("There should be a \"pause\" before \"resume\"", range != null && ((Long) range.getUpper()).longValue() == Long.MAX_VALUE);
                                    Long l = (Long) range.getLower();
                                    long jLongValue = l.longValue();
                                    f28Var4.n.addLast(Range.create(l, Long.valueOf(j2)));
                                    yi4.O(j2);
                                    yi4.O(j2 - jLongValue);
                                    if ((f28Var4.b || b77.a.b(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!f28Var4.b || b77.a.b(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("drop-input-frames", 0);
                                        f28Var4.d.setParameters(bundle);
                                        s18 s18Var2 = f28Var4.e;
                                        if (s18Var2 instanceof b28) {
                                            ((b28) s18Var2).a(true);
                                        }
                                    }
                                    if (f28Var4.b) {
                                        f28Var4.e();
                                    }
                                    f28Var4.g(2);
                                    break;
                                case 3:
                                case 5:
                                    f28Var4.g(5);
                                    break;
                                case 6:
                                case 8:
                                    qp2.n("Encoder is released");
                                    break;
                                default:
                                    qp2.n("Unknown state: ".concat(o18.v(f28Var4.E)));
                                    break;
                            }
                        default:
                            f28 f28Var5 = f28Var2;
                            long j3 = jO;
                            switch (vep.A(f28Var5.E)) {
                                case 0:
                                case 3:
                                case 7:
                                    break;
                                case 1:
                                case 2:
                                    int i2 = f28Var5.E;
                                    f28Var5.g(4);
                                    Long l2 = (Long) f28Var5.u.getLower();
                                    long jLongValue2 = l2.longValue();
                                    if (jLongValue2 == Long.MAX_VALUE) {
                                        qp2.g("There should be a \"start\" before \"stop\"");
                                        break;
                                    } else if (j3 < jLongValue2) {
                                        qp2.g("The start time should be before the stop time.");
                                        break;
                                    } else {
                                        f28Var5.u = Range.create(l2, Long.valueOf(j3));
                                        yi4.O(j3);
                                        if (i2 == 3 && f28Var5.x != null) {
                                            f28Var5.h();
                                            break;
                                        } else {
                                            f28Var5.w = true;
                                            f28Var5.y = ((g7a) x7d.l()).schedule(new y18(f28Var5, (byte) 4), 1000L, TimeUnit.MILLISECONDS);
                                            break;
                                        }
                                    }
                                case 4:
                                case 5:
                                    f28Var5.g(1);
                                    break;
                                case 6:
                                case 8:
                                    qp2.n("Encoder is released");
                                    break;
                                default:
                                    qp2.n("Unknown state: ".concat(o18.v(f28Var5.E)));
                                    break;
                            }
                    }
                }
            });
            return;
        }
        while (true) {
            r72 r72Var = this.u;
            if (r72Var.d()) {
                throw null;
            }
            ((q18) r72Var.a()).close();
        }
    }

    public final void s(loh lohVar) {
        if (!C.contains(this.h)) {
            t14.d(this.h, "Can only updated non-pending state from a pending state, but state is ");
            return;
        }
        if (!D.contains(lohVar)) {
            j9h.g(lohVar, "Invalid state transition. State is not a valid non-pending state while in a pending state: ");
        } else if (this.i != lohVar) {
            this.i = lohVar;
            this.a.o(new so2(this.j, m(lohVar)));
        }
    }
}
