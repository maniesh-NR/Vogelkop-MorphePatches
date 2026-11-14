package defpackage;

import android.content.SharedPreferences;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.w;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserAppWidget;
import com.opera.android.OperaApplication;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class e6g extends nr9 implements Function0 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e6g(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [android.app.Activity, android.content.Context, com.opera.android.BrowserActivity, t5d] */
    public final Object invoke() {
        Object value;
        xbf xbfVar;
        ec ecVar;
        List listF;
        Fragment fragment;
        byte b = this.a;
        iz5 iz5Var = iz5.a;
        byte b2 = 1;
        switch (b) {
            case 0:
                ((f6g) ((z84) this).receiver).H0();
                break;
            case 1:
                ((k6g) ((z84) this).receiver).a();
                break;
            case 2:
                ((xf5) ((wf5) ((z84) this).receiver)).a.finish(hjm.b);
                break;
            case 3:
                ((bng) ((z84) this).receiver).c.a.invoke();
                break;
            case 4:
                hng hngVar = (bng) ((z84) this).receiver;
                hdg hdgVar = hngVar.m;
                ey5 ey5Var = (ey5) hdgVar.b.getValue();
                na2.B(o0g.Q(hngVar), (CoroutineContext) null, (rx5) null, new hz1(hngVar, sko.j(ey5Var != null ? ey5Var.b : "", (String) hdgVar.a.getValue()), (mt5) null, (byte) 23), 3);
                break;
            case 5:
                ((bng) ((z84) this).receiver).n.j((Object) null);
                break;
            case 6:
                nak nakVar = ((bng) ((z84) this).receiver).q;
                do {
                    value = nakVar.getValue();
                } while (!nakVar.h(value, (Object) null));
            case 7:
                ((bng) ((z84) this).receiver).e.t(new za8(ve8.b));
                break;
            case 8:
                ((s3i) ((z84) this).receiver).g0();
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                nak nakVar2 = ((t2i) ((z84) this).receiver).h;
                if (!Intrinsics.a(nakVar2.getValue(), iz5Var)) {
                    nakVar2.j((Object) null);
                }
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                h3i h3iVar = (t2i) ((z84) this).receiver;
                nak nakVar3 = h3iVar.h;
                Object value2 = nakVar3.getValue();
                jz5 jz5Var = value2 instanceof jz5 ? (jz5) value2 : null;
                if (jz5Var != null) {
                    h3iVar.k(je8.b, jz5Var.a);
                    nakVar3.k((Object) null, iz5Var);
                    na2.B(o0g.Q(h3iVar), (CoroutineContext) null, (rx5) null, new r8h(h3iVar, jz5Var, (mt5) null, (byte) 5), 3);
                }
                break;
            case 11:
                h3i h3iVar2 = (t2i) ((z84) this).receiver;
                Object value3 = h3iVar2.h.getValue();
                xbfVar = value3 instanceof hz5 ? (hz5) value3 : null;
                if (xbfVar != null) {
                    h3iVar2.k(je8.f, ((hz5) xbfVar).a);
                }
                break;
            case 12:
                h3i h3iVar3 = (t2i) ((z84) this).receiver;
                nak nakVar4 = h3iVar3.h;
                Object value4 = nakVar4.getValue();
                hz5 hz5Var = value4 instanceof hz5 ? (hz5) value4 : null;
                if (hz5Var != null && (ecVar = hz5Var.b.f) != null) {
                    gpm gpmVar = ecVar.b;
                    h3iVar3.k(je8.g, hz5Var.a);
                    nakVar4.j((Object) null);
                    Throwable thD = t0i.d(((t0i) h3iVar3.c.a.invoke(gpmVar, ecVar.c)).a);
                    if (thD != null) {
                        nak nakVar5 = h3iVar3.l;
                        dum dumVarV = hn9.v(new udk((shk) ahk.d0.getValue(), Collections.singletonList(gpmVar)), thD);
                        nakVar5.getClass();
                        nakVar5.k((Object) null, dumVarV);
                    }
                }
                break;
            case 13:
                ((t2i) ((z84) this).receiver).f.j((Object) null);
                break;
            case 14:
                h3i h3iVar4 = (t2i) ((z84) this).receiver;
                h3iVar4.f.j((Object) null);
                h3iVar4.c.d.invoke();
                break;
            case 15:
                ((t2i) ((z84) this).receiver).g.j((Object) null);
                break;
            case 16:
                ((t2i) ((z84) this).receiver).c.b.invoke();
                break;
            case 17:
                nv6 nv6VarB = ru9.c(((f4i) ((z84) this).receiver).a.b).b();
                ((SharedPreferences.Editor) nv6VarB.a).putBoolean("rewards.onboarding_seen", true);
                nv6VarB.w();
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                nv6 nv6VarB2 = ru9.c(((f4i) ((z84) this).receiver).a.b).b();
                ((SharedPreferences.Editor) nv6VarB2.a).putBoolean("rewards.onboarding_seen", true);
                nv6VarB2.w();
                break;
            case 19:
                y5i y5iVar = (y5i) ((z84) this).receiver;
                nx5 nx5Var = y5iVar.a;
                if (nx5Var == null) {
                    nx5Var = null;
                }
                sgb.k(nx5Var, (CancellationException) null);
                pjb pjbVar = y5iVar.f;
                if (pjbVar == null) {
                    pjbVar = null;
                }
                pjbVar.getClass();
                xbf xbfVar2 = y5iVar.e;
                xbfVar = xbfVar2 != null ? xbfVar2 : null;
                ((l3g) xbfVar.e).close();
                qsk qskVar = (qsk) xbfVar.f;
                if (qskVar != null) {
                    qskVar.close();
                }
                break;
            case SizeUtil.textSize0 /* 20 */:
                ((isi) ((z84) this).receiver).g0();
                break;
            case 21:
                ((qsi) ((z84) this).receiver).b.h();
                break;
            case SizeUtil.textSize1 /* 22 */:
                qsi qsiVar = (qsi) ((z84) this).receiver;
                g8j g8jVar = qsiVar.b;
                r9g r9gVar = qsiVar.d.m;
                g8jVar.getClass();
                String[] strArr = OperaApplication.K;
                ?? r0 = g8jVar.a;
                q6e q6eVarI = ((OperaApplication) r0.getApplication()).I();
                w wVar = (w) r0.getSystemService("com.opera.android.FRAGMENT_MANAGER_SERVICE");
                if (wVar != null && (listF = wVar.c.f()) != null && (fragment = (Fragment) CollectionsKt.Q(listF)) != null && !vtp.M(fragment)) {
                    nej nejVar = (nej) r0.getSystemService("com.opera.android.ui.SHEET_QUEUE_SERVICE");
                    im6 im6Var = new im6(r0.getString(2132021186), q6eVarI, r9gVar, b2);
                    nejVar.getClass();
                    nejVar.b(im6Var, ijm.b);
                }
                break;
            case 23:
                ((qsi) ((z84) this).receiver).b.c(2131364286);
                break;
            case SizeUtil.textSize2 /* 24 */:
                fp1 fp1Var = ((qsi) ((z84) this).receiver).b.a;
                int i = BrowserAppWidget.b;
                kfo.c0(fp1Var.getApplicationContext(), BrowserAppWidget.class, BrowserAppWidget.d(fp1Var), 2131559326);
                break;
            case 25:
                vcj vcjVar = (vcj) ((z84) this).receiver;
                qn qnVar = vcjVar.e;
                if (qnVar != null) {
                    vcjVar.b();
                    qnVar.run();
                }
                break;
            case 26:
                ((b1k) ((z84) this).receiver).c.a.invoke();
                break;
            case 27:
                g1k g1kVar = (b1k) ((z84) this).receiver;
                d2h d2hVar = (d2h) g1kVar.e.getValue();
                b2h b2hVar = (b2h) g1kVar.f.getValue();
                if (d2hVar == null || b2hVar == null) {
                    g1kVar.h((Throwable) null);
                } else {
                    na2.B(o0g.Q(g1kVar), (CoroutineContext) null, (rx5) null, new mz9(g1kVar, b2hVar, d2hVar, (mt5) null, (byte) 27), 3);
                }
                break;
            case 28:
                ((b1k) ((z84) this).receiver).h.j((Object) null);
                break;
            default:
                g1k g1kVar2 = (b1k) ((z84) this).receiver;
                b2h b2hVar2 = (b2h) g1kVar2.f.getValue();
                if (b2hVar2 == null) {
                    g1kVar2.h((Throwable) null);
                    g1kVar2.h.j((Object) null);
                } else {
                    na2.B(o0g.Q(g1kVar2), (CoroutineContext) null, (rx5) null, new r8h(g1kVar2, b2hVar2, (mt5) null, (byte) 16), 3);
                }
                break;
        }
        return Unit.a;
    }
}
