package defpackage;

import android.content.SharedPreferences;
import android.os.PowerManager;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStructure;
import android.widget.OverScroller;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.favorites.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class y1n implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y1n(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ y1n(WebContentsAccessibilityImpl webContentsAccessibilityImpl, ViewStructure viewStructure) {
        this.a = (byte) 29;
        this.b = viewStructure;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MenuItem menuItemFindItem;
        View view;
        byte b = this.a;
        byte b2 = 1;
        int i = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                fp1 fp1Var = (BrowserActivity) ((au5) obj).b;
                fp1Var.deleteSharedPreferences("shakewin-token-storage");
                fp1Var.deleteSharedPreferences("shakewin-fcm-controller");
                return;
            case 1:
                au5 au5Var = (au5) obj;
                a36 a36Var = hk6.e;
                au5.a(((BrowserActivity) au5Var.c).getResources().getString(2132017628), ((e) ((nr8) au5Var.b)).f);
                return;
            case 2:
                h5k h5kVar = (h5k) obj;
                h5kVar.a = false;
                ((View) h5kVar.c).setAlpha(((TextView) h5kVar.b).canScrollVertically(1) ? 1.0f : 0.0f);
                return;
            case 3:
                ((y2n) obj).r();
                return;
            case 4:
                ((l94) ((cyd) obj).j).b((Object) null);
                return;
            case 5:
                ((e4n) obj).c();
                return;
            case 6:
                ((e6n) obj).R();
                return;
            case 7:
                ((x2) obj).invoke();
                return;
            case 8:
                g7f g7fVar = new g7f((h7f) ((q8n) obj).b);
                while (g7fVar.hasNext()) {
                    ((i21) g7fVar.next()).f();
                }
                return;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                w9n w9nVar = (w9n) obj;
                w9nVar.e = false;
                int iA = w9nVar.a();
                if (w9nVar.c != iA) {
                    w9nVar.c = iA;
                    w9nVar.b.a(iA);
                    return;
                }
                return;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((ldn) obj).G0();
                return;
            case 11:
                ((ldn) ((r2n) obj).b).g0();
                return;
            case 12:
                nv6 nv6VarB = ru9.c(((ndn) obj).a).b();
                ((SharedPreferences.Editor) nv6VarB.a).putBoolean("vpn_pro.kill_switch.on", false);
                nv6VarB.w();
                return;
            case 13:
                ((SearchView) obj).clearFocus();
                return;
            case 14:
                cen cenVar = (cen) obj;
                cenVar.a = null;
                fen fenVar = cenVar.c;
                fenVar.b(new een(fenVar));
                return;
            case 15:
                len lenVar = (len) obj;
                lenVar.e = false;
                HashSet hashSet = lenVar.d;
                HashSet hashSet2 = new HashSet(hashSet);
                hashSet.clear();
                for (re7 re7Var : Collections.unmodifiableList(lenVar.a.c)) {
                    if (re7Var.n && !re7Var.m() && hashSet2.contains(Long.valueOf(re7Var.o))) {
                        re7Var.u.b(lenVar);
                        re7Var.u();
                    }
                }
                return;
            case 16:
                cgn cgnVar = (cgn) obj;
                if (cgnVar.v.p().e) {
                    cgnVar.E.a(6);
                    return;
                }
                return;
            case 17:
                ro9 ro9Var = (ro9) obj;
                k2d k2dVar = ro9.h;
                k2d k2dVar2 = (k2d) ro9Var.d;
                if (k2dVar2 == ro9.f) {
                    if (ro9Var.b != 2) {
                        k2dVar = ro9.g;
                    }
                    ro9Var.D(k2dVar);
                    return;
                } else if (k2dVar2 == k2dVar) {
                    ro9Var.D(ro9.i);
                    return;
                } else {
                    if (k2dVar2 == ro9.j) {
                        ro9Var.D(ro9.k);
                        return;
                    }
                    return;
                }
            case SizeUtil.textSize0_1 /* 18 */:
                wci wciVar = (wci) obj;
                synchronized (wciVar) {
                    PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) wciVar.c;
                    if (wakeLock != null) {
                        wakeLock.release();
                    }
                }
                return;
            case 19:
                ((d7k) obj).invoke(ljn.a);
                return;
            case SizeUtil.textSize0 /* 20 */:
                qjn qjnVar = (qjn) obj;
                if (!(qjnVar.h instanceof cnn) && qjnVar.i && qjnVar.k && qjnVar.e.isEmpty()) {
                    qjnVar.k = false;
                    qjnVar.c(new vk2((byte) 25));
                    return;
                }
                return;
            case 21:
                qjn qjnVar2 = (qjn) ((pjn) obj).b;
                qjnVar2.j = false;
                qjnVar2.k = true;
                ArrayList arrayList = qjnVar2.d;
                ArrayList arrayList2 = new ArrayList(arrayList);
                int size = arrayList2.size();
                while (i < size) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    WeakReference weakReference = (WeakReference) obj2;
                    lkn lknVar = (lkn) weakReference.get();
                    if (lknVar == null) {
                        arrayList.remove(weakReference);
                    } else {
                        lknVar.invalidateSelf();
                    }
                }
                return;
            case SizeUtil.textSize1 /* 22 */:
                w6j w6jVar = (w6j) obj;
                if (((OverScroller) w6jVar.d).computeScrollOffset()) {
                    w6jVar.r(r1.getCurrX(), r1.getCurrY());
                    ((View) w6jVar.c).postOnAnimation(new y1n((Object) w6jVar, (byte) 22));
                    return;
                }
                return;
            case 23:
                ((gln) obj).onFailure();
                return;
            case SizeUtil.textSize2 /* 24 */:
                s14 s14Var = (s14) obj;
                List list = (List) ((List) ((kze) s14Var.f).g()).stream().map(new mn((byte) 24)).collect(Collectors.toList());
                rl rlVar = new rl((byte) 4);
                umi umiVar = (umi) s14Var.d;
                nml nmlVarC = umiVar.c(new npl(s14Var, list, (byte) 26));
                nmlVarC.b(umiVar.d(new npl(s14Var, rlVar, (byte) 27)));
                nmlVarC.a(null);
                return;
            case 25:
                lqn lqnVar = (lqn) obj;
                tsn tsnVar = (tsn) xf8.B(lqnVar.w.q).g();
                if (lqnVar.K != null || lqnVar.getView() == null) {
                    return;
                }
                zv0 zv0Var = lqnVar.E;
                if (zv0Var == null) {
                    zv0Var = null;
                }
                if (zv0Var.d || (menuItemFindItem = lqnVar.l.o().findItem(2131362304)) == null || !menuItemFindItem.isVisible() || (view = lqnVar.L) == null || !view.isAttachedToWindow()) {
                    return;
                }
                ru9 ru9Var = lqnVar.r;
                if (ru9Var.a.getBoolean("ai.chats_sign_in_bubble_shown", false) || ru9Var.a.getBoolean("ai.chats_bubble_shown", false)) {
                    return;
                }
                if (!tsnVar.e) {
                    if (tsnVar.d) {
                        lqnVar.L0(new sba(new qba(lqnVar.k, view, fan.a(8.0f, view.getResources()), 1, new sxh(2132017412, new Object[0]), null, 2131558914, null, true)), new hqn(lqnVar, b2));
                        return;
                    }
                    return;
                }
                byte b3 = 18;
                gil gilVar = new gil(lqnVar, view, b3);
                hq3 hq3Var = lqnVar.v;
                ju4 ju4Var = (ju4) xf8.o0(hq3Var.d());
                Long lValueOf = ju4Var != null ? Long.valueOf(ju4Var.a) : null;
                wth wthVar = hq3Var.l;
                ((d12) wthVar.b).c(new ra(new tmi(gilVar, wthVar, lValueOf, b3), (byte) 4));
                return;
            case 26:
                vl6 vl6Var = ((mqn) obj).T;
                (vl6Var != null ? vl6Var : null).S();
                return;
            case 27:
                z5i.f0(((srn) obj).a);
                return;
            case 28:
                vsn vsnVar = (vsn) obj;
                vsnVar.u = true;
                vsnVar.q.u();
                return;
            default:
                r1j r1jVar = WebContentsAccessibilityImpl.P;
                ((ViewStructure) obj).asyncCommit();
                return;
        }
    }
}
