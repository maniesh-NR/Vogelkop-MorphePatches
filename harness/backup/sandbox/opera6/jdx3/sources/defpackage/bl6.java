package defpackage;

import J.N;
import android.animation.ValueAnimator;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.f;
import androidx.fragment.app.g;
import com.leanplum.utils.SizeUtil;
import com.opera.android.OperaApplication;
import com.opera.android.downloads.DownloadJobService;
import com.opera.android.downloads.DownloadService;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.chromium.content.browser.androidoverlay.DialogOverlayImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class bl6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bl6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r13v47, types: [android.content.Context, com.opera.android.downloads.DownloadService, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws SecurityException {
        Uri uriG;
        rf7 rf7Var;
        int top;
        byte b = this.a;
        int i = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                el6 el6Var = (el6) obj;
                el6Var.V(el6Var.Q(), 1028, new zk6((byte) 16));
                el6Var.f.e();
                return;
            case 1:
                ll6 ll6Var = (ll6) obj;
                if (ll6Var.a0 >= 300000) {
                    ((kgd) ll6Var.n.b).O0 = true;
                    ll6Var.a0 = 0L;
                    return;
                }
                return;
            case 2:
                ((mm6) obj).i();
                return;
            case 3:
                vn6 vn6Var = (vn6) obj;
                if (vn6Var.c) {
                    return;
                }
                xl7 xl7Var = vn6Var.b;
                if (xl7Var != null) {
                    xl7Var.d(vn6Var.a);
                }
                vn6Var.d.n.remove(vn6Var);
                vn6Var.c = true;
                return;
            case 4:
                ((tn6) obj).d((am7) null);
                return;
            case 5:
                ((gs6) obj).a.a(tg0.b);
                return;
            case 6:
                up6 up6Var = ((qs6) obj).f;
                if (up6Var != null) {
                    up6Var.run();
                    return;
                }
                return;
            case 7:
                Function0 function0 = (Function0) ((pqh) obj).a;
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            case 8:
                g gVar = (g) obj;
                ArrayList arrayList = gVar.c;
                int size = arrayList.size();
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    ((f) ((ew6) obj2)).a.c(gVar);
                }
                return;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((l94) obj).d(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
                return;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((vtk) obj).close();
                return;
            case 11:
                ow6 ow6Var = (ow6) obj;
                ow6Var.j = true;
                ow6Var.d();
                return;
            case 12:
                ((uw6) obj).f(false);
                return;
            case 13:
                ((ay6) obj).h.d();
                return;
            case 14:
                c47 c47Var = (c47) obj;
                vr3 vr3Var = new vr3(new tu(c47Var, (byte) 3));
                c47Var.c.y(new d47(vr3Var.b(), (byte) 0));
                c47Var.d.y(new d47(vr3Var.b(), (byte) 0));
                wu5 wu5Var = c47Var.e;
                tt2 tt2VarB = vr3Var.b();
                wu5Var.getClass();
                tt2VarB.run(ActivityManager.isUserAMonkey() ? z37.b : z37.a);
                c47Var.f.y(new d47(vr3Var.b(), (byte) 0));
                vr3Var.d();
                return;
            case 15:
                DialogOverlayImpl dialogOverlayImpl = (DialogOverlayImpl) obj;
                if (dialogOverlayImpl.c != null) {
                    dialogOverlayImpl.l();
                    dialogOverlayImpl.k();
                    return;
                }
                return;
            case 16:
                kd7 kd7Var = (kd7) obj;
                kd7Var.l.clear();
                kd7Var.g(Collections.EMPTY_LIST);
                return;
            case 17:
                re7 re7Var = (re7) obj;
                N.MCe2yFpu(re7Var.a.b.a, re7Var.t.getId());
                return;
            case SizeUtil.textSize0_1 /* 18 */:
                ua7 ua7Var = (ua7) obj;
                umi umiVar = (umi) ua7Var.c;
                List<re7> listUnmodifiableList = Collections.unmodifiableList(((rf7) ua7Var.d).c);
                ArrayList arrayList2 = new ArrayList(listUnmodifiableList.size());
                for (re7 re7Var2 : listUnmodifiableList) {
                    if (!re7Var2.o() && (uriG = re7Var2.g()) != null) {
                        HashSet hashSet = s29.a;
                        if ("file".equals(uriG.getScheme())) {
                            arrayList2.add(new te7(re7Var2.o, new File(uriG.getPath())));
                        }
                    }
                }
                if (arrayList2.isEmpty()) {
                    ua7Var.q(true);
                    return;
                }
                nml nmlVarE = umiVar.e(new n57(ua7Var));
                nmlVarE.b(umiVar.f(new uk6((Object) ua7Var, (byte) 11)));
                nmlVarE.a(arrayList2);
                return;
            case 19:
                ((a21) obj).f();
                return;
            case SizeUtil.textSize0 /* 20 */:
                DownloadJobService downloadJobService = (DownloadJobService) obj;
                if (downloadJobService.b != null) {
                    String[] strArr = OperaApplication.K;
                    rf7Var = ((OperaApplication) downloadJobService.getApplicationContext()).m().a;
                    rf7Var.v();
                    try {
                        for (re7 re7Var3 : Collections.unmodifiableList(rf7Var.c)) {
                            if (re7Var3.p() && !re7Var3.m() && re7Var3.w) {
                                re7Var3.u();
                            }
                        }
                        return;
                    } finally {
                    }
                }
                return;
            case 21:
                ru9 ru9Var = (ru9) ((qq6) obj).b;
                nv6 nv6VarB = ru9Var.b();
                int i2 = ru9Var.a.getInt("download_notification_permission_rationale.shown.count", 0) + 1;
                SharedPreferences.Editor editor = (SharedPreferences.Editor) nv6VarB.a;
                editor.putInt("download_notification_permission_rationale.shown.count", i2);
                editor.putLong("download_notification_permission_rationale.last_shown.timestamp", System.currentTimeMillis());
                nv6VarB.w();
                return;
            case SizeUtil.textSize1 /* 22 */:
                yf7 yf7Var = (yf7) obj;
                yf7Var.g = false;
                ArrayList arrayList3 = yf7Var.e;
                int size2 = arrayList3.size();
                while (i < size2) {
                    Object obj3 = arrayList3.get(i);
                    i++;
                    ((Runnable) obj3).run();
                }
                arrayList3.clear();
                return;
            case 23:
                ?? r13 = (DownloadService) ((wt2) obj).b;
                boolean z = DownloadService.e;
                if (ev4.f((Context) r13)) {
                    String[] strArr2 = OperaApplication.K;
                    rf7Var = ((OperaApplication) r13.getApplicationContext()).m().a;
                    rf7Var.v();
                    try {
                        for (re7 re7Var4 : Collections.unmodifiableList(rf7Var.c)) {
                            if (re7Var4.p() && !re7Var4.m() && re7Var4.w) {
                                re7Var4.u();
                            }
                        }
                    } finally {
                    }
                }
                ConnectivityManager connectivityManager = (ConnectivityManager) r13.getSystemService("connectivity");
                if (connectivityManager != null) {
                    eg7 eg7Var = new eg7((Object) r13, (byte) 0);
                    r13.d = eg7Var;
                    connectivityManager.registerDefaultNetworkCallback(eg7Var);
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                        r13.f();
                        return;
                    }
                    return;
                }
                return;
            case SizeUtil.textSize2 /* 24 */:
                DownloadService downloadService = (DownloadService) ((eg7) obj).b;
                boolean z2 = DownloadService.e;
                downloadService.f();
                return;
            case 25:
                ev4 ev4Var = (ev4) obj;
                ev4Var.b = true;
                Context context = (Context) ev4Var.d;
                DownloadService.e(context, "ctrl_init[" + ev4.f(context) + "]");
                boolean zQ = ev4Var.q();
                ev4Var.c = zQ;
                ev4Var.d(zQ);
                return;
            case 26:
                qg7 qg7Var = (qg7) ((k5o) obj).c;
                qg7Var.m0(qg7Var.p);
                return;
            case 27:
                gi7 gi7Var = (gi7) obj;
                gi7Var.a = false;
                hi7 hi7Var = gi7Var.b;
                ni7 ni7Var = hi7Var.i;
                Rect rectR = q9n.r((FrameLayout) hi7Var.e.c);
                CoordinatorLayout coordinatorLayout = hi7Var.c;
                Rect rectR2 = q9n.r(coordinatorLayout);
                h6n it = new g6n(coordinatorLayout).iterator();
                while (true) {
                    h6n h6nVar = it;
                    if (!h6nVar.hasNext()) {
                        Point point = hi7Var.n;
                        int i3 = ni7Var.y;
                        ji7 ji7Var = ni7Var.x;
                        if (i3 != i) {
                            ni7Var.y = i;
                            if (ni7Var.t == null) {
                                ValueAnimator valueAnimator = ji7Var.c;
                                if (((valueAnimator == null || !valueAnimator.isRunning()) ? mi7.a : ji7Var.b) == mi7.a) {
                                    ji7Var.c(ni7Var.c(point.x), ni7Var.d(point.y));
                                    ji7.b(ni7Var.x, mi7.d, ni7.B, null, null, null, 28);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    View view = (View) h6nVar.next();
                    if (gi7.x(view) && view.isLaidOut() && i < (top = rectR.bottom - (view.getTop() + rectR2.top))) {
                        i = top;
                    }
                }
                break;
            case 28:
                ac1 ac1Var = (ac1) obj;
                ac1Var.d = null;
                ((vi7) ac1Var.e).w((ui7) ac1Var.c, ac1Var.a, ac1Var.b);
                return;
            default:
                ym7 ym7Var = (ym7) obj;
                boolean zIsPopupShowing = ym7Var.h.isPopupShowing();
                ym7Var.s(zIsPopupShowing);
                ym7Var.m = zIsPopupShowing;
                return;
        }
    }
}
