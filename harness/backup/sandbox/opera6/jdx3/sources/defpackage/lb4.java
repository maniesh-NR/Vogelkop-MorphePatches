package defpackage;

import J.N;
import android.content.SharedPreferences;
import android.widget.FrameLayout;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.leanplum.utils.SizeUtil;
import com.opera.android.autofill.AutofillManager;
import com.opera.android.browser.chromium.ChromiumContainerView;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.suggestion.Suggestion;
import com.opera.android.widget.ThumbScroller;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.chromium.components.embedder_support.view.ContentViewRenderView;
import org.chromium.content.browser.ChildProcessLauncherHelperImpl;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final /* synthetic */ class lb4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lb4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaStatus mediaStatus;
        MediaInfo mediaInfo;
        int i;
        int i2;
        Suggestion suggestion;
        Object rw7Var;
        byte b = this.a;
        byte b2 = 2;
        Object obj = this.b;
        switch (b) {
            case 0:
                c26.K(new yf((byte) 7, (mt5) null, (mb4) obj));
                return;
            case 1:
                rn9 rn9Var = (rn9) obj;
                synchronized (rn9Var.d) {
                    if (rn9Var.b) {
                        return;
                    }
                    ((ode) rn9Var.c).n(new ybl(0));
                    rn9Var.b = true;
                    return;
                }
            case 2:
                s1h s1hVar = (s1h) ((igi) ((sb4) obj).b).b;
                if (s1hVar != null) {
                    xwh xwhVar = s1hVar.f;
                    xug.i();
                    if (xwhVar.f || xwhVar.g) {
                        return;
                    }
                    xwhVar.g = true;
                    return;
                }
                return;
            case 3:
                ((CarouselLayoutManager) obj).H();
                return;
            case 4:
                kl4 kl4Var = (kl4) obj;
                Suggestion suggestion2 = kl4Var.f;
                if (suggestion2 != null) {
                    kl4Var.e.C(suggestion2);
                    kl4Var.d.invoke(suggestion2);
                    return;
                }
                return;
            case 5:
                zo4 zo4Var = (zo4) obj;
                jx6 jx6Var = zo4Var.h;
                RemoteMediaClient remoteMediaClient = zo4Var.v;
                if (remoteMediaClient == null || (mediaStatus = remoteMediaClient.getMediaStatus()) == null || (mediaInfo = mediaStatus.getMediaInfo()) == null) {
                    return;
                }
                List mediaTracks = mediaInfo.getMediaTracks();
                rb3 rb3Var = zo4Var.t;
                try {
                    pyl pylVarI = jx6Var.i(zo4.Q, zo4Var.H, new jrd(rb3Var.f[zo4Var.r]), rb3Var);
                    jyl jylVar = new jyl((bj8[]) pylVarI.d);
                    if (!zo4Var.G.equals(jylVar)) {
                        zo4Var.J0(jylVar, mediaTracks);
                    }
                    zo4Var.G = jylVar;
                    jx6Var.c = (pr) pylVarI.f;
                    zo4Var.j.d(2, new jl4(pylVarI, b2));
                    return;
                } catch (rhg unused) {
                    return;
                }
            case 6:
                ws4 ws4Var = (ws4) obj;
                ArrayList arrayList = new ArrayList(Arrays.asList(ic4.f));
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    ws4Var.a.A((String) obj2);
                }
                ws4Var.d = false;
                ws4Var.b();
                return;
            case 7:
                ((kze) ((qb7) obj).c).r(Boolean.TRUE);
                return;
            case 8:
                iw4 iw4Var = (iw4) obj;
                if (iw4Var.l || iw4Var.n || iw4Var.s.j()) {
                    return;
                }
                if (!iw4Var.q) {
                    iw4.D = true;
                }
                iw4Var.d();
                if (iw4Var.r) {
                    ioh.y(2, 4, "Android.ChildProcessConectionEventCounts");
                    return;
                } else {
                    ioh.y(3, 4, "Android.ChildProcessConectionEventCounts");
                    return;
                }
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((iw4) ((zy9) obj).a).f();
                return;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ro9 ro9Var = (ro9) obj;
                int i4 = ro9Var.b + 1;
                ro9Var.b = i4;
                ioh.w(i4, "Android.ChildProcessConnection.OnServiceConnectedCounts");
                return;
            case 11:
                rl rlVar = ChildProcessLauncherHelperImpl.l;
                iw4 iw4Var2 = (iw4) ((ChildProcessLauncherHelperImpl) obj).f.f;
                wxe.t("stopping child connection: pid=%d", new Object[]{Integer.valueOf(iw4Var2.o)});
                iw4Var2.i();
                k5o k5oVar = iw4Var2.g;
                if (k5oVar != null) {
                    iw4Var2.g = null;
                    k5oVar.p(iw4Var2);
                    return;
                }
                return;
            case 12:
                ChromiumContainerView chromiumContainerView = (ChromiumContainerView) obj;
                int i5 = ChromiumContainerView.i;
                ckf ckfVar = chromiumContainerView.a;
                zy4 zy4Var = chromiumContainerView.b;
                dtl dtlVar = (dtl) zy4Var.a.b;
                if (dtlVar.g) {
                    i = dtlVar.a;
                    i2 = dtlVar.c;
                } else {
                    i = dtlVar.b;
                    i2 = dtlVar.d;
                }
                int i6 = i + i2;
                boolean z = (zy4Var.l == 0 && zy4Var.g > 0) || (zy4Var.m == 0 && zy4Var.M() > zy4Var.N());
                if (i6 != ckfVar.m) {
                    ckfVar.m = i6;
                    ckfVar.g();
                    if (z != ((ContentViewRenderView) ckfVar).g) {
                        ((ContentViewRenderView) ckfVar).g = z;
                        WebContents webContents = ((ContentViewRenderView) ckfVar).d;
                        if (webContents != null) {
                            N.MAYdn1NY(((ContentViewRenderView) ckfVar).a, ckfVar, webContents, z);
                        }
                    }
                    iH = 1;
                } else if (z != ((ContentViewRenderView) ckfVar).g) {
                    ((ContentViewRenderView) ckfVar).g = z;
                    WebContents webContents2 = ((ContentViewRenderView) ckfVar).d;
                    if (webContents2 != null) {
                        N.MAYdn1NY(((ContentViewRenderView) ckfVar).a, ckfVar, webContents2, z);
                    }
                }
                ChromiumContent chromiumContent = chromiumContainerView.e;
                if (chromiumContent == null || chromiumContent.h()) {
                    return;
                }
                chromiumContainerView.e.A(zy4Var.Q());
                if (iH == 0) {
                    long j = chromiumContainerView.e.n;
                    if (j != 0) {
                        N.MCqZ2U3N(j);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ((kcf) obj).d();
                return;
            case 14:
                uz4 uz4Var = (uz4) obj;
                ThumbScroller thumbScroller = uz4Var.a;
                int i7 = uz4Var.g;
                int i8 = uz4Var.h;
                int i9 = uz4Var.i;
                int i10 = uz4Var.j;
                huh huhVarA = uz4Var.a();
                ysl yslVar = uz4Var.d;
                iH = yslVar.q() ? yslVar.h() : 0;
                uz4Var.g = iH + ((int) (cs5.s((yslVar.h() - ((int) Math.ceil(huhVarA.k))) / (((int) Math.ceil(huhVarA.a(huhVarA.d))) - (huhVarA.b() - r10)), 0.0f, 1.0f) * (((((thumbScroller.getHeight() - thumbScroller.getPaddingTop()) - thumbScroller.getPaddingBottom()) - iH) - yslVar.A()) - thumbScroller.e.getHeight())));
                uz4Var.h = yslVar.A();
                huh huhVarA2 = uz4Var.a();
                uz4Var.i = (int) Math.floor(huhVarA2.a(huhVarA2.b));
                int iC = uz4Var.a().c();
                uz4Var.j = iC;
                if ((i7 != uz4Var.g || i8 != uz4Var.h || i9 != uz4Var.i || i10 != iC) && thumbScroller.g == 1) {
                    FrameLayout frameLayout = thumbScroller.e;
                    int iB = thumbScroller.b();
                    uz4 uz4Var2 = (uz4) thumbScroller.i.a;
                    frameLayout.setTranslationY(iB + ((int) (cs5.s(uz4Var2.i / uz4Var2.j, 0.0f, 1.0f) * (((((thumbScroller.getHeight() - thumbScroller.getPaddingTop()) - thumbScroller.getPaddingBottom()) - iB) - uz4Var2.h) - thumbScroller.e.getHeight()))));
                }
                if (uz4Var.e == null || !yslVar.n()) {
                    return;
                }
                uz4Var.e.run();
                uz4Var.e = null;
                return;
            case 15:
                ((t35) obj).s(true);
                return;
            case 16:
                a55 a55Var = (a55) obj;
                a55Var.a.g(new iu2(a55Var, (byte) 16));
                return;
            case 17:
                ((ujp) obj).getClass();
                nv6 nv6VarB = ru9.c(t8.a).b();
                SharedPreferences.Editor editor = (SharedPreferences.Editor) nv6VarB.a;
                editor.remove("clipboard.last.copied.image.uri");
                editor.remove("clipboard.last.copied.image.uri_timestamp");
                nv6VarB.w();
                return;
            case SizeUtil.textSize0_1 /* 18 */:
                j55 j55Var = (j55) obj;
                j55Var.j(j55Var.h(j55Var.p.a), true);
                return;
            case 19:
                x65 x65Var = (x65) obj;
                if (!x65Var.y || x65Var.C || x65Var.getHost() == null || x65Var.isStateSaved()) {
                    return;
                }
                x65Var.n0(yim.c);
                return;
            case SizeUtil.textSize0 /* 20 */:
                qc5 qc5Var = (qc5) obj;
                hqk hqkVar = qc5Var.f.c;
                if (hqkVar == null || (suggestion = qc5Var.d) == null) {
                    return;
                }
                hqkVar.q(suggestion, true);
                return;
            case 21:
                ud5 ud5Var = (ud5) obj;
                Runnable runnable = ud5Var.b;
                if (runnable != null) {
                    runnable.run();
                    ud5Var.b = null;
                    return;
                }
                return;
            case SizeUtil.textSize1 /* 22 */:
                ce5.c((ce5) obj);
                return;
            case 23:
                h7f h7fVar = ((xi5) obj).i;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    ((ti5) g7fVarH.next()).n();
                }
                return;
            case SizeUtil.textSize2 /* 24 */:
                l45 l45Var = (l45) obj;
                wj5 wj5Var = (wj5) l45Var.a;
                sw7 sw7Var = new sw7(new uj5(wj5Var.p, wj5Var.q, wj5Var.r, wj5Var.s, wj5Var.t, wj5Var.u));
                ((LinkedHashSet) ((r9i) l45Var.c).e).remove(l45Var);
                ((Callback) l45Var.b).run(sw7Var);
                return;
            case 25:
                hk5 hk5Var = (hk5) obj;
                hk5Var.d = null;
                hk5Var.run(((ki5) hk5Var.b).invoke());
                return;
            case 26:
                igi igiVar = (igi) obj;
                ((LinkedHashSet) ((qb7) igiVar.g).c).remove(igiVar);
                List listK0 = CollectionsKt.k0((List) igiVar.e);
                lh4 lh4Var = (lh4) igiVar.c;
                List list = listK0;
                if ((list instanceof Collection) && list.isEmpty()) {
                    List listK02 = CollectionsKt.k0((List) igiVar.d);
                    vj5 vj5Var = (vj5) igiVar.b;
                    rw7Var = new sw7(new wj5(vj5Var.p, listK02, vj5Var.r, vj5Var.s, vj5Var.t, vj5Var.u));
                } else {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((p58) it.next()).a) {
                            rw7Var = new rw7(listK0);
                        }
                    }
                    List listK022 = CollectionsKt.k0((List) igiVar.d);
                    vj5 vj5Var2 = (vj5) igiVar.b;
                    rw7Var = new sw7(new wj5(vj5Var2.p, listK022, vj5Var2.r, vj5Var2.s, vj5Var2.t, vj5Var2.u));
                }
                lh4Var.run(rw7Var);
                return;
            case 27:
                a06 a06Var = (a06) obj;
                if (a06Var.t) {
                    return;
                }
                a06Var.t = true;
                if (a06Var.isResumed()) {
                    a06Var.g0();
                    return;
                }
                return;
            case 28:
                AutofillManager autofillManager = new AutofillManager();
                autofillManager.e(new hu5((o16) obj, autofillManager, b2));
                return;
            default:
                ((txi) obj).j();
                return;
        }
    }
}
