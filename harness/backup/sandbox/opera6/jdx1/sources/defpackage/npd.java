package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.SparseBooleanArray;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class npd {
    public static final e4j B = new e4j(1);
    public static final dsk C = jym.p(new fd6((byte) 3));
    public final Bundle A;
    public final Object a = new Object();
    public final Uri b;
    public final jpd c;
    public final ipd d;
    public final kod e;
    public final Context f;
    public final xqd g;
    public final aqd h;
    public final String i;
    public final m4j j;
    public final pod k;
    public final Handler l;
    public final bpd m;
    public final gpd n;
    public final Handler o;
    public final boolean p;
    public final boolean q;
    public final csh r;
    public ijg s;
    public xkg t;
    public lpd u;
    public boolean v;
    public final short w;
    public boolean x;
    public final csh y;
    public final csh z;

    public npd(pod podVar, Context context, String str, gk9 gk9Var, csh cshVar, csh cshVar2, csh cshVar3, kod kodVar, Bundle bundle, Bundle bundle2, bpd bpdVar) {
        w7d.G("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.9.0] [" + tym.a + "]");
        this.k = podVar;
        this.f = context;
        this.i = str;
        this.y = cshVar;
        this.z = cshVar2;
        this.r = cshVar3;
        this.e = kodVar;
        this.A = bundle2;
        this.m = bpdVar;
        this.p = true;
        this.q = true;
        xqd xqdVar = new xqd(this);
        this.g = xqdVar;
        this.o = new Handler(Looper.getMainLooper());
        Looper looperI = gk9Var.b.I();
        Handler handler = new Handler(looperI);
        this.l = handler;
        this.s = ijg.H;
        this.c = new jpd(this, looperI);
        this.d = new ipd(this, looperI);
        Uri uriBuild = new Uri.Builder().scheme(npd.class.getName()).appendPath(str).appendPath(String.valueOf(SystemClock.elapsedRealtime())).build();
        this.b = uriBuild;
        aqd aqdVar = new aqd(this, uriBuild, handler, bundle, cshVar, cshVar2, lod.e, lod.f, bundle2);
        this.h = aqdVar;
        this.j = new m4j(Process.myUid(), 1009000300, 8, context.getPackageName(), xqdVar, bundle, ((xod) aqdVar.j.b).c.b);
        xkg xkgVar = new xkg(gk9Var);
        this.t = xkgVar;
        tym.S(handler, new zr9(this, xkgVar, (byte) 29));
        this.w = (short) 3000;
        this.n = new gpd(this, (byte) 2);
        tym.S(handler, new gpd(this, (byte) 3));
    }

    public static boolean j(nod nodVar) {
        return nodVar != null && Objects.equals(nodVar.a.a.a, "com.android.systemui");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.view.KeyEvent r4, boolean r5, boolean r6) {
        /*
            r3 = this;
            pod r0 = r3.k
            npd r0 = r0.a
            nod r0 = r0.d()
            r0.getClass()
            int r4 = r4.getKeyCode()
            r1 = 85
            r2 = 79
            if (r4 == r1) goto L17
            if (r4 != r2) goto L1b
        L17:
            if (r5 == 0) goto L1b
            r4 = 87
        L1b:
            r5 = 1
            if (r4 == r2) goto L65
            r1 = 126(0x7e, float:1.77E-43)
            if (r4 == r1) goto L5e
            r1 = 127(0x7f, float:1.78E-43)
            if (r4 == r1) goto L56
            r1 = 272(0x110, float:3.81E-43)
            if (r4 == r1) goto L4e
            r1 = 273(0x111, float:3.83E-43)
            if (r4 == r1) goto L48
            switch(r4) {
                case 85: goto L65;
                case 86: goto L41;
                case 87: goto L4e;
                case 88: goto L48;
                case 89: goto L3a;
                case 90: goto L33;
                default: goto L31;
            }
        L31:
            r3 = 0
            return r3
        L33:
            tl5 r4 = new tl5
            r1 = 2
            r4.<init>(r3)
            goto L7a
        L3a:
            tl5 r4 = new tl5
            r1 = 3
            r4.<init>(r3)
            goto L7a
        L41:
            tl5 r4 = new tl5
            r1 = 4
            r4.<init>(r3)
            goto L7a
        L48:
            tl5 r4 = new tl5
            r4.<init>(r3)
            goto L7a
        L4e:
            tl5 r4 = new tl5
            r1 = 9
            r4.<init>(r3)
            goto L7a
        L56:
            tl5 r4 = new tl5
            r1 = 8
            r4.<init>(r3)
            goto L7a
        L5e:
            tl5 r4 = new tl5
            r1 = 7
            r4.<init>(r3)
            goto L7a
        L65:
            xkg r4 = r3.t
            boolean r4 = r4.getPlayWhenReady()
            if (r4 == 0) goto L74
            tl5 r4 = new tl5
            r1 = 5
            r4.<init>(r3)
            goto L7a
        L74:
            tl5 r4 = new tl5
            r1 = 6
            r4.<init>(r3)
        L7a:
            gg7 r1 = new gg7
            r1.<init>(r3, r6, r0, r4)
            android.os.Handler r3 = r3.l
            defpackage.tym.S(r3, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.npd.a(android.view.KeyEvent, boolean, boolean):boolean");
    }

    public final void b(nod nodVar, mpd mpdVar) {
        int iJ;
        xqd xqdVar = this.g;
        try {
            m59 m59VarO = xqdVar.b.O(nodVar);
            if (m59VarO != null) {
                iJ = m59VarO.j();
            } else if (!g(nodVar)) {
                return;
            } else {
                iJ = 0;
            }
            mod modVar = nodVar.d;
            if (modVar != null) {
                mpdVar.c(modVar, iJ);
            }
        } catch (DeadObjectException unused) {
            xqdVar.b.Z(nodVar);
        } catch (RemoteException e) {
            w7d.L("Exception in " + nodVar, e);
        }
    }

    public final void c(mpd mpdVar) {
        h1b h1bVarH = this.g.b.H();
        for (int i = 0; i < h1bVarH.size(); i++) {
            b((nod) h1bVarH.get(i), mpdVar);
        }
        try {
            mpdVar.c(this.h.h, 0);
        } catch (RemoteException e) {
            w7d.r("Exception in using media1 API", e);
        }
    }

    public final nod d() {
        h1b h1bVarH = this.g.b.H();
        for (int i = 0; i < h1bVarH.size(); i++) {
            nod nodVar = (nod) h1bVarH.get(i);
            if (h(nodVar)) {
                return nodVar;
            }
        }
        return null;
    }

    public final void e(cig cigVar) {
        this.c.a(false, false);
        c(new jid(cigVar));
        try {
            ypd ypdVar = this.h.h;
            u67 u67Var = this.s.s;
            ypdVar.t();
        } catch (RemoteException e) {
            w7d.r("Exception in using media1 API", e);
        }
    }

    public final void f(nod nodVar, boolean z) {
        if (n()) {
            byte b = 0;
            boolean z2 = this.t.C(16) && this.t.g() != null;
            boolean z3 = this.t.C(31) || this.t.C(20);
            nod nodVarR = r(nodVar);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            z4o.H(!false);
            sparseBooleanArray.append(1, true);
            z4o.H(true);
            cig cigVar = new cig(new w69(sparseBooleanArray));
            if (!z2) {
                if (z3) {
                    this.e.getClass();
                    o0b o0bVarB = yr9.b(new UnsupportedOperationException());
                    o0bVarB.addListener(new vr9(o0bVarB, new rn9(this, nodVarR, z, cigVar), b), new k31(this, (byte) 5));
                    return;
                }
                w7d.K("Play requested without current MediaItem, but playback resumption prevented by missing available commands");
            }
            tym.F(this.t);
            if (z) {
                o(nodVarR);
            }
        }
    }

    public final boolean g(nod nodVar) {
        return this.g.b.S(nodVar) || this.h.e.S(nodVar);
    }

    public final boolean h(nod nodVar) {
        return Objects.equals(nodVar.a.a.a, this.f.getPackageName()) && nodVar.b != 0 && new Bundle(nodVar.e).getBoolean("androidx.media3.session.MediaNotificationManager", false);
    }

    public final boolean i() {
        boolean z;
        synchronized (this.a) {
            z = this.v;
        }
        return z;
    }

    public final ListenableFuture k(nod nodVar, csh cshVar) {
        r(nodVar);
        return this.e.c(cshVar);
    }

    public final lod l(nod nodVar) {
        h1b h1bVarS;
        boolean z = this.x;
        h1b h1bVarS2 = null;
        aqd aqdVar = this.h;
        if (z && j(nodVar)) {
            aqdVar.getClass();
            o3j o3jVar = lod.e;
            o3j o3jVar2 = aqdVar.u;
            o3jVar2.getClass();
            cig cigVar = aqdVar.v;
            cigVar.getClass();
            if (aqdVar.t.isEmpty()) {
                csh cshVar = aqdVar.s;
                h1bVarS2 = cshVar == null ? null : h1b.s(cshVar);
                h1bVarS = null;
            } else {
                csh cshVar2 = aqdVar.t;
                h1bVarS = cshVar2 == null ? null : h1b.s(cshVar2);
            }
            return new lod(o3jVar2, cigVar, h1bVarS2, h1bVarS);
        }
        this.e.getClass();
        cig cigVar2 = lod.f;
        o3j o3jVar3 = lod.e;
        lod lodVar = new lod(o3jVar3, cigVar2, null, null);
        if (h(nodVar)) {
            byte b = 1;
            this.x = true;
            pod podVar = this.k;
            csh cshVar3 = podVar.a.z;
            if (cshVar3.isEmpty()) {
                aqdVar.s = podVar.a.y;
            } else {
                aqdVar.t = cshVar3;
                Bundle bundle = aqdVar.r;
                boolean z2 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
                boolean z3 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
                aqdVar.X();
                if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z2 || bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z3) {
                    ((xod) aqdVar.j.b).a.setExtras(bundle);
                }
            }
            Bundle bundle2 = aqdVar.r;
            boolean z4 = aqdVar.v.a(17) != cigVar2.a(17);
            aqdVar.u = o3jVar3;
            aqdVar.v = cigVar2;
            if (!aqdVar.t.isEmpty()) {
                boolean z5 = bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
                boolean z6 = bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
                aqdVar.X();
                if (bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z5 || bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z6) {
                    ((xod) aqdVar.j.b).a.setExtras(bundle2);
                }
            }
            npd npdVar = aqdVar.f;
            if (z4) {
                tym.S(npdVar.l, new qpd(aqdVar, npdVar.t, b));
                return lodVar;
            }
            aqdVar.Y(npdVar.t);
        }
        return lodVar;
    }

    public final r0b m(nod nodVar) {
        r(nodVar);
        this.e.getClass();
        return yr9.c(new e4j(-6));
    }

    public final boolean n() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        c5j c5jVar = new c5j();
        this.o.post(new hpd(this, c5jVar, (byte) 0));
        try {
            return ((Boolean) c5jVar.get()).booleanValue();
        } catch (InterruptedException | ExecutionException e) {
            h9o.o(e);
            return false;
        }
    }

    public final void o(nod nodVar) {
        r(nodVar);
        this.e.getClass();
    }

    public final c5j p(nod nodVar, csh cshVar, final int i, final long j) {
        r(nodVar);
        return tym.b0(this.e.c(cshVar), new dd2() { // from class: jod
            public final ListenableFuture apply(Object obj) {
                return yr9.c(new ood(i, (List) obj, j));
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q() {
        String str;
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [AndroidXMedia3/1.9.0] [");
        sb.append(tym.a);
        sb.append("] [");
        HashSet hashSet = rjd.a;
        synchronized (rjd.class) {
            str = rjd.b;
        }
        sb.append(str);
        sb.append("]");
        w7d.G(sb.toString());
        synchronized (this.a) {
            if (this.v) {
                return;
            }
            this.v = true;
            ipd ipdVar = this.d;
            jbd jbdVar = ipdVar.a;
            if (jbdVar != null) {
                ipdVar.removeCallbacks(jbdVar);
                ipdVar.a = null;
            }
            this.l.removeCallbacksAndMessages(null);
            int i = 0;
            try {
                tym.S(this.l, new gpd(this, 0 == true ? 1 : 0));
            } catch (Exception e) {
                w7d.L("Exception thrown while closing", e);
            }
            aqd aqdVar = this.h;
            ComponentName componentName = aqdVar.l;
            npd npdVar = aqdVar.f;
            bpd bpdVar = aqdVar.j;
            if (Build.VERSION.SDK_INT < 31) {
                if (componentName == null) {
                    ((xod) bpdVar.b).a.setMediaButtonReceiver(null);
                } else {
                    Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", npdVar.b);
                    intent.setComponent(componentName);
                    ((xod) bpdVar.b).a.setMediaButtonReceiver(PendingIntent.getBroadcast(npdVar.f, 0, intent, aqd.w));
                }
            }
            up1 up1Var = aqdVar.k;
            if (up1Var != null) {
                npdVar.f.unregisterReceiver(up1Var);
            }
            xod xodVar = (xod) bpdVar.b;
            xodVar.f.kill();
            MediaSession mediaSession = xodVar.a;
            mediaSession.setCallback(null);
            xodVar.b.a.clear();
            mediaSession.release();
            xqd xqdVar = this.g;
            Set set = xqdVar.c;
            vzk vzkVar = xqdVar.b;
            h1b h1bVarH = vzkVar.H();
            int size = h1bVarH.size();
            while (i < size) {
                Object obj = h1bVarH.get(i);
                i++;
                nod nodVar = (nod) obj;
                vzkVar.Z(nodVar);
                mod modVar = nodVar.d;
                if (modVar != null) {
                    modVar.f();
                }
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                mod modVar2 = ((nod) it.next()).d;
                if (modVar2 != null) {
                    modVar2.f();
                }
            }
            set.clear();
            xqdVar.a.clear();
        }
    }

    public final nod r(nod nodVar) {
        if (!this.x || !j(nodVar)) {
            return nodVar;
        }
        nod nodVarD = d();
        nodVarD.getClass();
        return nodVarD;
    }

    public final void s() {
        long j = this.w;
        Handler handler = this.l;
        gpd gpdVar = this.n;
        handler.removeCallbacks(gpdVar);
        if (!this.q || j <= 0) {
            return;
        }
        if (this.t.e0() || this.t.isLoading()) {
            handler.postDelayed(gpdVar, j);
        }
    }

    public final void t(xkg xkgVar, xkg xkgVar2) {
        aqd aqdVar = this.h;
        this.t = xkgVar2;
        if (xkgVar != null) {
            lpd lpdVar = this.u;
            lpdVar.getClass();
            xkgVar.g0(lpdVar);
        }
        lpd lpdVar2 = new lpd(this, xkgVar2);
        xkgVar2.S(lpdVar2);
        this.u = lpdVar2;
        try {
            aqdVar.h.x(0, xkgVar, xkgVar2);
        } catch (RemoteException e) {
            w7d.r("Exception in using media1 API", e);
        }
        if (xkgVar == null) {
            ((xod) aqdVar.j.b).a.setActive(true);
        }
        this.s = new ijg(xkgVar2.s(), 0, xkgVar2.v0(), xkgVar2.u0(), xkgVar2.u0(), 0, xkgVar2.getPlaybackParameters(), xkgVar2.getRepeatMode(), xkgVar2.getShuffleModeEnabled(), xkgVar2.U(), xkgVar2.x0(), 0, xkgVar2.C(18) ? xkgVar2.d0() : vjd.K, xkgVar2.C(22) ? xkgVar2.V() : 1.0f, 1.0f, xkgVar2.C(21) ? xkgVar2.W() : pf2.i, 0, xkgVar2.C(28) ? xkgVar2.z() : y36.d, xkgVar2.X(), xkgVar2.C(23) ? xkgVar2.N() : 0, xkgVar2.z0(), xkgVar2.getPlayWhenReady(), 1, xkgVar2.G(), xkgVar2.getPlaybackState(), xkgVar2.e0(), xkgVar2.isLoading(), xkgVar2.y0(), xkgVar2.s0(), xkgVar2.a0(), xkgVar2.R(), xkgVar2.C(30) ? xkgVar2.w() : fzl.b, xkgVar2.L());
        e(xkgVar2.P());
    }

    public final void u() {
        if (Looper.myLooper() == this.l.getLooper()) {
            return;
        }
        qp2.n("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
    }
}
