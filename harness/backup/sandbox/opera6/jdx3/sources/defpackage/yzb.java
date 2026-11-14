package defpackage;

import J.N;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Rect;
import android.media.MediaCrypto;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import androidx.fragment.app.r;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.common.util.concurrent.ListenableFuture;
import com.leanplum.LeanplumOnPushOpenedCallback;
import com.leanplum.internal.Constants;
import com.leanplum.utils.SizeUtil;
import com.opera.android.OperaApplication;
import com.opera.android.mainmenu.tiles.MainMenuTileLayout;
import com.opera.android.sheet.OperaBottomSheetBehavior;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;
import com.opera.android.widget.MeasurableHeightScrollView;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;
import org.chromium.media.MediaDrmBridge;

/* loaded from: classes.dex */
public final /* synthetic */ class yzb implements dkj, n5o, LeanplumOnPushOpenedCallback, ed2, jr9, m94, bqb, m9n, ivc, zph, p9n, vlk, nbd, vgd, kid, vid, pa2, vqd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yzb(int i, PendingIntent pendingIntent) {
        this.a = (byte) 23;
        this.b = pendingIntent;
    }

    public /* synthetic */ yzb(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.dkj
    public final void a() {
        ((a0c) this.b).g0();
    }

    public final ListenableFuture apply(Object obj) {
        return (ListenableFuture) ((nna) this.b).invoke(obj);
    }

    /* renamed from: apply, reason: collision with other method in class */
    public final Object m9apply(Object obj) {
        return (Void) ((yo7) this.b).invoke(obj);
    }

    public final Object attachCompleter(l94 l94Var) {
        ua7 ua7Var = (ua7) this.b;
        x7d.l().execute(new zr9((Object) ua7Var, (Object) l94Var, (byte) 19));
        return ua7Var + " [fetch@" + SystemClock.uptimeMillis() + "]";
    }

    @Override // defpackage.ivc
    public final void b(bre breVar) {
        Context context = ((zuc) this.b).d.getContext();
        String[] strArr = OperaApplication.K;
        ((OperaApplication) context.getApplicationContext()).y().c().m.h(breVar);
    }

    @Override // defpackage.vgd
    public final int c(Object obj) {
        oj9 oj9Var = (oj9) this.b;
        ogd ogdVar = (ogd) obj;
        String str = ogdVar.b;
        return ((str.equals(oj9Var.n) || str.equals(wgd.b(oj9Var))) && ogdVar.c(oj9Var, false) && ogdVar.d(oj9Var)) ? 1 : 0;
    }

    @Override // defpackage.pa2
    public final void d(boolean z) {
        hld hldVar;
        Rect rectD;
        rld rldVar = (rld) this.b;
        r activity = rldVar.getActivity();
        if (activity == null || !activity.isInPictureInPictureMode() || !z || (hldVar = rldVar.m) == null || (rectD = hldVar.n.d()) == null) {
            return;
        }
        a26.k0(rldVar.requireActivity(), new Size(rectD.width(), rectD.height()));
    }

    public final Object e(Object obj, Object obj2) {
        return ((b10) this.b).apply(obj2);
    }

    @Override // defpackage.kid
    public final void f(gid gidVar) throws RemoteException {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 21:
                nm5 nm5Var = (nm5) obj;
                m4j m4jVar = gidVar.e;
                ghd ghdVar = gidVar.a;
                if (gidVar.D != null) {
                    w7d.q("Cannot be notified about the connection result many times. Probably a bug or malicious app.");
                    ghdVar.release();
                    break;
                } else {
                    ssa ssaVar = nm5Var.c;
                    csh cshVar = nm5Var.n;
                    Bundle bundle = nm5Var.i;
                    gidVar.D = ssaVar;
                    gidVar.q = nm5Var.d;
                    gidVar.v = nm5Var.e;
                    cig cigVar = nm5Var.f;
                    gidVar.w = cigVar;
                    cig cigVar2 = nm5Var.g;
                    gidVar.x = cigVar2;
                    cig cigVarD = gid.d(cigVar, cigVar2);
                    gidVar.y = cigVarD;
                    h1b h1bVar = nm5Var.k;
                    gidVar.r = h1bVar;
                    h1b h1bVar2 = nm5Var.l;
                    gidVar.s = h1bVar2;
                    csh cshVarH = gid.H(h1bVar2, h1bVar, gidVar.v, cigVarD, bundle);
                    gidVar.t = cshVarH;
                    gidVar.u = gid.G(cshVarH, gidVar.r, bundle, gidVar.v, gidVar.y);
                    k1b k1bVar = new k1b(4);
                    for (int i = 0; i < cshVar.d; i++) {
                        vb5 vb5Var = (vb5) cshVar.get(i);
                        n3j n3jVar = vb5Var.a;
                        if (n3jVar != null && n3jVar.a == 0) {
                            k1bVar.e(n3jVar.b, vb5Var);
                        }
                    }
                    k1bVar.b(true);
                    gidVar.p = nm5Var.j;
                    MediaSession.Token token = nm5Var.m;
                    if (token == null) {
                        token = m4jVar.a.g;
                    }
                    if (token != null) {
                        gidVar.E = new MediaController(gidVar.d, token);
                    }
                    try {
                        nm5Var.c.asBinder().linkToDeath(gidVar.g, 0);
                        n4j n4jVar = m4jVar.a;
                        gidVar.n = new m4j(n4jVar.a, nm5Var.a, nm5Var.b, n4jVar.d, nm5Var.c, nm5Var.h, token);
                        gidVar.I = bundle;
                        ghdVar.getClass();
                        z4o.H(Looper.myLooper() == ghdVar.f.getLooper());
                        z4o.H(!ghdVar.h);
                        ghdVar.h = true;
                        mhd mhdVar = ghdVar.i;
                        mhdVar.c = true;
                        ghd ghdVar2 = mhdVar.b;
                        if (ghdVar2 != null) {
                            mhdVar.set(ghdVar2);
                            break;
                        }
                    } catch (RemoteException unused) {
                        ghdVar.release();
                        return;
                    }
                }
                break;
            case SizeUtil.textSize1 /* 22 */:
                c4j c4jVar = (c4j) obj;
                if (gidVar.r() && gidVar.k.isEmpty()) {
                    c4j c4jVar2 = gidVar.p.c;
                    if (c4jVar2.c < c4jVar.c && z5i.n(c4jVar, c4jVar2)) {
                        gidVar.p = gidVar.p.j(c4jVar);
                        break;
                    }
                }
                break;
            case 23:
                PendingIntent pendingIntent = (PendingIntent) obj;
                if (gidVar.r() && !Objects.equals(gidVar.q, pendingIntent)) {
                    gidVar.q = pendingIntent;
                    ghd ghdVar3 = gidVar.a;
                    ghdVar3.getClass();
                    z4o.H(Looper.myLooper() == ghdVar3.f.getLooper());
                    ghdVar3.e.getClass();
                    break;
                }
                break;
            default:
                Bundle bundle2 = (Bundle) obj;
                if (gidVar.r()) {
                    csh cshVar2 = gidVar.t;
                    csh cshVar3 = gidVar.u;
                    gidVar.I = bundle2;
                    csh cshVarH2 = gid.H(gidVar.s, gidVar.r, gidVar.v, gidVar.y, bundle2);
                    gidVar.t = cshVarH2;
                    gidVar.u = gid.G(cshVarH2, gidVar.r, gidVar.I, gidVar.v, gidVar.y);
                    gidVar.t.equals(cshVar2);
                    gidVar.u.equals(cshVar3);
                    ghd ghdVar4 = gidVar.a;
                    ghdVar4.getClass();
                    z4o.H(Looper.myLooper() == ghdVar4.f.getLooper());
                    ghdVar4.e.getClass();
                    break;
                }
                break;
        }
    }

    public final Object g(Object obj) {
        l1c l1cVar = (l1c) obj;
        ((isd) this.b).E(l1cVar, l1cVar != null);
        return null;
    }

    @Override // defpackage.p9n
    public final void h(View view) {
        ArrayList arrayList = (ArrayList) this.b;
        MainMenuTileLayout mainMenuTileLayout = (MainMenuTileLayout) view;
        if (mainMenuTileLayout.getVisibility() != 8) {
            arrayList.add(mainMenuTileLayout);
        }
    }

    @Override // defpackage.vlk
    public final void i(amk amkVar) {
        h8d h8dVar = (h8d) this.b;
        h8dVar.k = amkVar.a.a;
        ((OperaMaterialButton) h8dVar.j.c).setEnabled(true);
    }

    @Override // defpackage.zph
    public final boolean isEmpty() {
        zse zseVar = (zse) this.b;
        y83 y83Var = zseVar.t;
        if (y83Var == null) {
            y83Var = null;
        }
        if (((CircularProgressIndicator) y83Var.h).getVisibility() != 8) {
            return false;
        }
        bte bteVar = zseVar.G0().e;
        bteVar.getClass();
        if (TextUtils.isEmpty((CharSequence) bteVar.b.g())) {
            return false;
        }
        wse wseVar = zseVar.y;
        return (wseVar != null ? wseVar : null).a.size() == 0;
    }

    @Override // defpackage.m9n
    public final void j() {
        lrc lrcVar = (lrc) this.b;
        or2 or2Var = lrcVar.B;
        if (or2Var == null) {
            or2Var = null;
        }
        OperaBottomSheetBehavior operaBottomSheetBehaviorC = OperaBottomSheetBehavior.C((MeasurableHeightScrollView) or2Var.e);
        if (operaBottomSheetBehaviorC.q != 6) {
            return;
        }
        operaBottomSheetBehaviorC.o = true;
        vl6 vl6Var = lrcVar.C;
        ((OperaBottomSheetBehavior) (vl6Var != null ? vl6Var : null).b).I(3);
    }

    public final Object l(npd npdVar, nod nodVar, int i) {
        tqd tqdVar = (tqd) this.b;
        if (npdVar.i()) {
            return r0b.b;
        }
        tqdVar.h(npdVar.t, nodVar);
        xqd.Y0(npdVar, nodVar, i, new e4j(0));
        return r0b.b;
    }

    @Override // defpackage.bqb
    public final void n(tw7 tw7Var) {
        nv6 nv6Var = (nv6) this.b;
        if (tw7Var instanceof rw7) {
            Object obj = nv6Var.a;
        } else {
            if (tw7Var instanceof sw7) {
                return;
            }
            h9o.p();
        }
    }

    @Override // com.leanplum.LeanplumOnPushOpenedCallback
    public final void onLeanplumPushOpened(Bundle bundle) {
        z9c z9cVar = (z9c) this.b;
        cm cmVar = new cm(bundle != null ? bundle.getString(Constants.Keys.PUSH_MESSAGE_ID) : null, z9c.b(bundle), (byte) 3);
        Context context = z9cVar.a;
        String[] strArr = OperaApplication.K;
        x5f x5fVar = ((OperaApplication) context.getApplicationContext()).L().c;
        long jUptimeMillis = SystemClock.uptimeMillis();
        x5fVar.q0(cmVar, true, jUptimeMillis - bundle.getLong("c.o.a.lp.created", jUptimeMillis));
        Uri uriA = z9c.a(context, bundle);
        if (uriA != null) {
            ((OperaApplication) context.getApplicationContext()).L().d.o0(cmVar.f(), uriA, sj0.b, xn0.b);
        }
    }

    public final void run(long j) {
        MediaCrypto mediaCrypto = (MediaCrypto) this.b;
        UUID uuid = MediaDrmBridge.n;
        N.MV9yuwVC(j, mediaCrypto);
    }
}
