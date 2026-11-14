package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import com.google.android.gms.cast.framework.CastSession;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class tjg implements w6f {
    public final Context a;
    public final umi b;
    public final djg c;
    public final zkd d;
    public final ode e;
    public final x5f f;
    public ExoPlayer g;
    public zo4 h;
    public ujc i;
    public pod j;
    public okg k;
    public hd l;
    public mhd m;
    public jx6 n;
    public xbf o;
    public boolean p;
    public final i7f q;
    public final qjg r;
    public final ArrayDeque s;
    public final ArrayList t;
    public final hp2 u;
    public final ArrayList v;
    public sjg w;
    public njg x;

    public tjg(Context context, umi umiVar, djg djgVar, zkd zkdVar, x5f x5fVar) {
        ode odeVar = new ode();
        this.e = odeVar;
        this.q = new i7f();
        this.r = new qjg(this);
        this.s = new ArrayDeque();
        this.t = new ArrayList();
        byte b = 0;
        this.u = new hp2((byte) 7, false);
        this.v = new ArrayList(1);
        this.a = context;
        this.b = umiVar;
        this.c = djgVar;
        this.d = zkdVar;
        this.f = x5fVar;
        l();
        okg okgVar = this.k;
        fpd fpdVar = new fpd(this.i, x5fVar, this);
        z4o.w(((gk9) fpdVar).b.n());
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        a1b a1bVar = h1b.b;
        csh cshVar = csh.e;
        kod kodVarF = okgVar.c.f();
        Object obj = pod.b;
        int iIntValue = ((Integer) npd.C.get()).intValue();
        gd6 gd6Var = new gd6(context, (byte) 0);
        gd6Var.c = iIntValue;
        gd6Var.b = true;
        this.j = new pod(context, "PlayerManager", fpdVar, cshVar, cshVar, cshVar, kodVarF, bundle, bundle2, new bpd(new hd6(gd6Var)));
        this.i.a();
        m4j m4jVar = this.j.a.j;
        m4jVar.getClass();
        Bundle bundle3 = Bundle.EMPTY;
        a36 a36Var = new a36();
        Looper looperMyLooper = Looper.myLooper();
        Looper mainLooper = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        mhd mhdVar = new mhd(mainLooper);
        tym.S(new Handler(mainLooper), new fhd(mhdVar, new ghd(context, m4jVar, a36Var, mainLooper, mhdVar), (byte) 0));
        this.m = mhdVar;
        xbf xbfVar = new xbf(this, odeVar, this.j, mhdVar, new jjg(this, b));
        this.o = xbfVar;
        this.l = new hd(context, umiVar, xbfVar);
        xbf xbfVar2 = this.o;
        zkdVar.e.a(xbfVar2);
        tjg tjgVar = (tjg) xbfVar2.b;
        zkdVar.c = tjgVar;
        tjgVar.F(zkdVar.d);
        zkdVar.T();
    }

    @Override // defpackage.w6f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void F(rjg rjgVar) {
        this.q.b(rjgVar);
    }

    public final void b(sjg sjgVar, boolean z) {
        ArrayList arrayList = this.t;
        arrayList.add(z ? arrayList.size() : 0, sjgVar);
        n();
        i7f i7fVar = this.q;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            ((rjg) g7fVarC.next()).d(sjgVar);
        }
    }

    public final jx6 c() {
        ujc ujcVar = this.i;
        nyl nylVarL = ujcVar != null ? ((gk9) ujcVar).b.L() : null;
        Context context = this.a;
        return nylVarL == null ? new jx6(context) : new jx6(nylVarL, new n9a((byte) 15), context);
    }

    public final void e(egd[] egdVarArr, k37 k37Var) {
        ojg ojgVar = new ojg(this, k37Var);
        this.s.add(ojgVar);
        new wjh(this.a, this.b, egdVarArr, new r9g((Object) ojgVar, (byte) 3));
    }

    public final void f() {
        if (this.i == null) {
            return;
        }
        l();
        xbf xbfVar = this.o;
        zkd zkdVar = this.d;
        zkdVar.S(null, null);
        zkdVar.e.b(xbfVar);
        zkdVar.c.H(zkdVar.d);
        zkdVar.c = null;
        this.i.stop();
        i7f i7fVar = this.q;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            ((rjg) g7fVarC.next()).k();
        }
        this.j.a();
        this.j = null;
        try {
            ((ghd) this.m.get()).release();
        } catch (InterruptedException | ExecutionException unused) {
        }
        this.m = null;
        this.i.g0(this.r);
        this.i.release();
        this.g = null;
        this.i = null;
        this.n = null;
        hd hdVar = this.l;
        if (hdVar.b) {
            ((se3) hdVar.e).c();
        }
        this.l = null;
        this.k.b();
        this.k = null;
        this.o = null;
    }

    public final void g() {
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Runnable) arrayList.get(i)).run();
        }
        arrayList.subList(0, size).clear();
    }

    public final void h() {
        if (((gk9) this.i).b.getPlaybackState() == 1) {
            this.i.a();
        }
    }

    @Override // defpackage.w6f
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void H(rjg rjgVar) {
        this.q.c(rjgVar);
    }

    public final void j(sjg sjgVar) {
        this.t.remove(sjgVar);
        i7f i7fVar = this.q;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            ((rjg) g7fVarC.next()).i(sjgVar);
        }
        n();
        PlayerView playerView = sjgVar.b;
        if (playerView != null) {
            playerView.g((gig) null);
        }
    }

    public final kg7 k(qjd qjdVar) {
        Uri uriD0;
        egd egdVarC = this.k.c(qjdVar);
        vjd vjdVar = qjdVar.e;
        o29 o29VarB = egdVarC != null ? egdVarC.b() : null;
        if ((o29VarB == null || o29VarB == o29.AUDIO_PLAYLIST) && (uriD0 = sfe.d0(vjdVar)) != null) {
            Bundle bundle = vjdVar.I;
            String string = bundle != null ? bundle.getString("com.opera.android.media.FILE_TYPE", null) : null;
            String string2 = uriD0.toString();
            int[][] iArr = lg7.a;
            kg7 kg7VarG = lg7.g(c5o.m().o(string2, string));
            if (o29VarB == null || kg7VarG == kg7.g || kg7VarG == kg7.h) {
                return kg7VarG;
            }
        }
        return o29VarB == null ? kg7.f : lg7.g(o29VarB);
    }

    public final void l() {
        if (this.g != null) {
            return;
        }
        njg njgVar = this.x;
        if (njgVar != null) {
            njgVar.t.removeSessionManagerListener(njgVar, CastSession.class);
            this.x = null;
        }
        Context context = this.a;
        ai8 ai8Var = new ai8(context);
        jx6 jx6VarC = c();
        z4o.H(!ai8Var.o);
        ai8Var.d = new st6(jx6VarC, (byte) 1);
        z4o.H(!ai8Var.o);
        ai8Var.k = (short) 10000;
        z4o.H(!ai8Var.o);
        ai8Var.l = (short) 30000;
        qi8 qi8VarA = ai8Var.a();
        qi8VarA.S0(1);
        m(qi8VarA, new okg(context, new kjg(this, (byte) 1), new mgf((Object) this, (Object) qi8VarA, (byte) 5)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(g83 g83Var, okg okgVar) {
        okg okgVar2 = this.k;
        Object[] objArr = 0;
        byte b = 1;
        if (okgVar2 != null) {
            ArrayList arrayList = new ArrayList(okgVar2.e.size());
            okgVar2.c.h(new kkg(okgVar2, arrayList, objArr == true ? 1 : 0), true);
            okgVar.d((mkg[]) arrayList.toArray(new mkg[0]), ((gk9) this.i).b.getCurrentWindowIndex(), ((gk9) this.i).b.getCurrentPosition());
        }
        gig gigVar = this.i;
        okg okgVar3 = this.k;
        qjg qjgVar = this.r;
        if (gigVar != null) {
            gigVar.g0(qjgVar);
        }
        this.i = new ujc(g83Var, b);
        ExoPlayer exoPlayer = g83Var instanceof ExoPlayer ? (ExoPlayer) g83Var : null;
        this.g = exoPlayer;
        this.h = g83Var instanceof zo4 ? (zo4) g83Var : null;
        this.k = okgVar;
        if (exoPlayer != null) {
            ((qi8) exoPlayer).A(pf2.i, true);
        }
        this.i.S(qjgVar);
        xbf xbfVar = this.o;
        if (xbfVar != null) {
            uuj uujVar = (uuj) xbfVar.g;
            ujc ujcVar = this.i;
            int i = uujVar.i();
            uujVar.c = ujcVar;
            int i2 = uujVar.i();
            if (i2 != i) {
                g7f g7fVar = new g7f((h7f) uujVar.b);
                while (g7fVar.hasNext()) {
                    ((ald) g7fVar.next()).a(i2);
                }
            }
        }
        this.e.r(this.i);
        qi8 qi8Var = this.g;
        if (qi8Var != null) {
            qi8 qi8Var2 = qi8Var;
            qi8Var2.Y0();
            this.n = qi8Var2.j;
        } else {
            this.n = this.h.h;
        }
        if (okgVar3 != null) {
            okgVar3.b();
        }
        if (gigVar != null) {
            ArrayList arrayList2 = this.t;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                sjg sjgVar = (sjg) obj;
                PlayerView playerView = sjgVar.b;
                if (playerView != null && playerView.q == gigVar) {
                    playerView.g(this.w == sjgVar ? this.i : null);
                }
            }
            this.i.setPlayWhenReady(((gk9) gigVar).b.e0());
            gigVar.release();
        } else {
            this.i.setPlayWhenReady(false);
        }
        pod podVar = this.j;
        if (podVar != null) {
            gig fpdVar = new fpd(this.i, this.f, this);
            gig gigVar2 = ((gk9) fpdVar).b;
            z4o.w(gigVar2.n());
            Looper looperI = gigVar2.I();
            npd npdVar = podVar.a;
            z4o.w(looperI == ((gk9) npdVar.t).b.I());
            z4o.H(gigVar2.I() == Looper.myLooper());
            xkg xkgVar = npdVar.t;
            if (fpdVar != ((gk9) xkgVar).b) {
                npdVar.t(xkgVar, new xkg(fpdVar));
            }
            this.i.a();
        }
    }

    public final void n() {
        PlayerView playerView;
        ArrayList arrayList = this.t;
        sjg sjgVar = arrayList.isEmpty() ? null : (sjg) am2.k(1, arrayList);
        if (sjgVar != this.w) {
            if (sjgVar != null && (playerView = sjgVar.b) != null) {
                playerView.g((gig) null);
                playerView.g(this.i);
            }
            this.w = sjgVar;
            i7f i7fVar = this.q;
            g7f g7fVarC = u35.c(i7fVar, i7fVar);
            while (g7fVarC.hasNext()) {
                ((rjg) g7fVarC.next()).e();
            }
        }
    }
}
