package defpackage;

import ads_mobile_sdk.bz0;
import ads_mobile_sdk.cy0;
import ads_mobile_sdk.d90;
import ads_mobile_sdk.eo;
import ads_mobile_sdk.fe3;
import ads_mobile_sdk.g03;
import ads_mobile_sdk.h01;
import ads_mobile_sdk.ho3;
import ads_mobile_sdk.ia1;
import ads_mobile_sdk.l23;
import ads_mobile_sdk.m6;
import ads_mobile_sdk.mt0;
import ads_mobile_sdk.nw;
import ads_mobile_sdk.oi3;
import ads_mobile_sdk.p;
import ads_mobile_sdk.pb1;
import ads_mobile_sdk.qf2;
import ads_mobile_sdk.rf1;
import ads_mobile_sdk.rp3;
import ads_mobile_sdk.ru0;
import ads_mobile_sdk.s52;
import ads_mobile_sdk.td1;
import ads_mobile_sdk.u30;
import ads_mobile_sdk.u62;
import ads_mobile_sdk.ur0;
import ads_mobile_sdk.v62;
import ads_mobile_sdk.v82;
import ads_mobile_sdk.vd1;
import ads_mobile_sdk.vy0;
import ads_mobile_sdk.vz;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Handler;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.libraries.ads.mobile.sdk.common.AdActivity;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class u6k extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u6k(byte b, mt5 mt5Var, Object obj) {
        super(2, mt5Var);
        this.t = b;
        this.u = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6k(dak dakVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 1;
        avj avjVar = cak.d;
        this.u = dakVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6k(mt5 mt5Var, wrm wrmVar) {
        super(2, mt5Var);
        this.t = (byte) 6;
        this.u = wrmVar;
    }

    private final Object invokeSuspend$ads_mobile_sdk$an3(Object obj) {
        boolean z;
        Unit unit;
        px5 px5Var = px5.a;
        ybh.y(obj);
        bz0 bz0Var = (bz0) this.u;
        synchronized (bz0Var.f) {
            synchronized (bz0Var.f) {
                z = bz0Var.m;
            }
            vy0 vy0Var = bz0Var.i;
            vy0 vy0Var2 = vy0.ENDED;
            bz0Var.i = vy0Var2;
            na2.B(bz0Var.a, null, null, new vf6(bz0Var, vy0Var, vy0Var2, z, z, null), 3);
            unit = Unit.a;
        }
        return unit;
    }

    private final Object invokeSuspend$ads_mobile_sdk$l52(Object obj) {
        px5 px5Var = px5.a;
        ybh.y(obj);
        Context context = ((s52) this.u).c;
        u62 u62Var = ui6.r;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            qp2.o("Application Context cannot be null");
            return null;
        }
        if (!u62Var.a) {
            byte b = 1;
            u62Var.a = true;
            w5p w5pVarA = w5p.a();
            w5pVarA.c = new ouo(new Handler(), applicationContext, new auj((byte) 15), w5pVarA);
            boolean z = applicationContext instanceof Application;
            if (z) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(m6.d);
            }
            nw.f3a = (UiModeManager) applicationContext.getSystemService("uimode");
            WindowManager windowManager = v62.a;
            v62.c = applicationContext.getResources().getDisplayMetrics().density;
            v62.a = (WindowManager) applicationContext.getSystemService("window");
            applicationContext.registerReceiver(new anf((byte) 5), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
            pb1.b.a = applicationContext.getApplicationContext();
            p pVar = p.f;
            boolean z2 = pVar.c;
            puo puoVar = pVar.d;
            if (!z2) {
                if (z) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(puoVar);
                }
                puoVar.e = pVar;
                puoVar.b = true;
                boolean zA = puoVar.a();
                puoVar.c = zA;
                pVar.e = zA;
                pVar.c = true;
            }
            g03.d.a = new WeakReference(applicationContext);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            applicationContext.registerReceiver(new up1((byte) 25), intentFilter);
            Executors.newSingleThreadExecutor().execute(new oi3(applicationContext, b));
        }
        return Unit.a;
    }

    private final Object invokeSuspend$ads_mobile_sdk$qu0(Object obj) {
        px5 px5Var = px5.a;
        ybh.y(obj);
        ru0 ru0Var = ru0.a;
        Application application = (Application) this.u;
        SharedPreferences sharedPreferences = application.getSharedPreferences("GoogleMobileAds", 0);
        int i = sharedPreferences.getInt("early_webview_init_count", 0);
        String string = sharedPreferences.getString("early_webview_init_profiles", "");
        String str = string != null ? string : "";
        Set setSingleton = StringsKt.N(str) ? Collections.singleton("Default") : b5j.e(Collections.singleton("Default"), CollectionsKt.n0(StringsKt.Y(str, new String[]{","}, 0, 6)));
        if (i > 0) {
            AtomicBoolean atomicBoolean = ho3.a;
            cv6 cv6Var = bb7.a;
            mr6 mr6Var = mr6.b;
            Executor executorP = mr6Var.P();
            if (executorP == null) {
                executorP = new va7(mr6Var);
            }
            ho3.a(application, executorP, true, setSingleton, null);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putInt("early_webview_init_count", i - 1);
            editorEdit.apply();
        }
        return Unit.a;
    }

    private final Object invokeSuspend$ads_mobile_sdk$rs0(Object obj) {
        px5 px5Var = px5.a;
        ybh.y(obj);
        ((AdActivity) this.u).finish();
        return Unit.a;
    }

    private final Object invokeSuspend$ads_mobile_sdk$s82(Object obj) {
        px5 px5Var = px5.a;
        ybh.y(obj);
        v82 v82Var = (v82) this.u;
        rp3 rp3Var = v82Var.R;
        if (rp3Var == null) {
            return null;
        }
        ViewGroup viewGroup = rp3Var.c;
        ((cy0) v82Var.H.getValue()).n.set(false);
        ViewGroup viewGroup2 = v82Var.q;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        if (viewGroup.indexOfChild(viewGroup2) == -1) {
            ViewGroup viewGroup3 = v82Var.q;
            viewGroup.addView(viewGroup3 != null ? viewGroup3 : null, rp3Var.b, rp3Var.a);
        }
        return Unit.a;
    }

    private final Object invokeSuspend$ads_mobile_sdk$t30(Object obj) {
        px5 px5Var = px5.a;
        ybh.y(obj);
        ((u30) this.u).c();
        return Unit.a;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.u;
        switch (b) {
            case 0:
                return new u6k((byte) 0, mt5Var, (ne5) obj2);
            case 1:
                avj avjVar = cak.d;
                return new u6k((dak) obj2, mt5Var);
            case 2:
                return new u6k((byte) 2, mt5Var, (kfk) obj2);
            case 3:
                return new u6k((byte) 3, mt5Var, (hfk) obj2);
            case 4:
                return new u6k((byte) 4, mt5Var, (q0l) obj2);
            case 5:
                return new u6k((byte) 5, mt5Var, (byte[]) obj2);
            case 6:
                return new u6k(mt5Var, (wrm) obj2);
            case 7:
                return new u6k((byte) 7, mt5Var, (axm) obj2);
            case 8:
                return new u6k((byte) 8, mt5Var, (m59) obj2);
            case 9:
                return new u6k((byte) 9, mt5Var, (w6j) obj2);
            case 10:
                return new u6k((byte) 10, mt5Var, (b1o) obj2);
            case 11:
                return new u6k((byte) 11, mt5Var, (bz0) obj2);
            case 12:
                return new u6k((byte) 12, mt5Var, (mt0) obj2);
            case 13:
                return new u6k((byte) 13, mt5Var, (d90) obj2);
            case 14:
                return new u6k((byte) 14, mt5Var, (td1) obj2);
            case 15:
                return new u6k((byte) 15, mt5Var, (fe3) obj2);
            case 16:
                return new u6k((byte) 16, mt5Var, (h01) obj2);
            case 17:
                return new u6k((byte) 17, mt5Var, (ia1) obj2);
            case 18:
                return new u6k((byte) 18, mt5Var, (l23) obj2);
            case 19:
                return new u6k((byte) 19, mt5Var, (s52) obj2);
            case 20:
                return new u6k((byte) 20, mt5Var, (rf1) obj2);
            case 21:
                return new u6k((byte) 21, mt5Var, (vd1) obj2);
            case 22:
                return new u6k((byte) 22, mt5Var, (vz) obj2);
            case 23:
                return new u6k((byte) 23, mt5Var, (qf2) obj2);
            case 24:
                return new u6k((byte) 24, mt5Var, (eo) obj2);
            case 25:
                return new u6k((byte) 25, mt5Var, (Application) obj2);
            case 26:
                return new u6k((byte) 26, mt5Var, (AdActivity) obj2);
            case 27:
                return new u6k((byte) 27, mt5Var, (v82) obj2);
            case 28:
                return new u6k((byte) 28, mt5Var, (u30) obj2);
            default:
                return new u6k((byte) 29, mt5Var, (ur0) obj2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        Object obj3 = this.u;
        switch (b) {
            case 0:
                return create((zpn) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 1:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 2:
                return create((l99) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 3:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 4:
                return create((xa7) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 5:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 6:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 7:
                return create((xa7) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 8:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 9:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 10:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 11:
                return new u6k((byte) 11, (mt5) obj2, (bz0) obj3).invokeSuspend(Unit.a);
            case 12:
                return new u6k((byte) 12, (mt5) obj2, (mt0) obj3).invokeSuspend(Unit.a);
            case 13:
                return new u6k((byte) 13, (mt5) obj2, (d90) obj3).invokeSuspend(Unit.a);
            case 14:
                return new u6k((byte) 14, (mt5) obj2, (td1) obj3).invokeSuspend(Unit.a);
            case 15:
                return new u6k((byte) 15, (mt5) obj2, (fe3) obj3).invokeSuspend(Unit.a);
            case 16:
                return new u6k((byte) 16, (mt5) obj2, (h01) obj3).invokeSuspend(Unit.a);
            case 17:
                ia1 ia1Var = (ia1) obj3;
                new u6k((byte) 17, (mt5) obj2, ia1Var);
                Unit unit = Unit.a;
                px5 px5Var = px5.a;
                ybh.y(unit);
                return ia1Var;
            case 18:
                return new u6k((byte) 18, (mt5) obj2, (l23) obj3).invokeSuspend(Unit.a);
            case 19:
                return new u6k((byte) 19, (mt5) obj2, (s52) obj3).invokeSuspend(Unit.a);
            case 20:
                return new u6k((byte) 20, (mt5) obj2, (rf1) obj3).invokeSuspend(Unit.a);
            case 21:
                return new u6k((byte) 21, (mt5) obj2, (vd1) obj3).invokeSuspend(Unit.a);
            case 22:
                return new u6k((byte) 22, (mt5) obj2, (vz) obj3).invokeSuspend(Unit.a);
            case 23:
                return new u6k((byte) 23, (mt5) obj2, (qf2) obj3).invokeSuspend(Unit.a);
            case 24:
                return new u6k((byte) 24, (mt5) obj2, (eo) obj3).invokeSuspend(Unit.a);
            case 25:
                return new u6k((byte) 25, (mt5) obj2, (Application) obj3).invokeSuspend(Unit.a);
            case 26:
                return new u6k((byte) 26, (mt5) obj2, (AdActivity) obj3).invokeSuspend(Unit.a);
            case 27:
                return new u6k((byte) 27, (mt5) obj2, (v82) obj3).invokeSuspend(Unit.a);
            case 28:
                return new u6k((byte) 28, (mt5) obj2, (u30) obj3).invokeSuspend(Unit.a);
            default:
                return new u6k((byte) 29, (mt5) obj2, (ur0) obj3).invokeSuspend(Unit.a);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: mt5 */
    /* JADX INFO: Thrown type has an unknown type hierarchy: q6 */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws q6, java.security.NoSuchAlgorithmException, mt5 {
        /*
            Method dump skipped, instructions count: 2488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u6k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
