package defpackage;

import android.view.View;
import com.leanplum.utils.SizeUtil;
import com.opera.android.OperaApplication;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.browser.chromium.ChromiumContainerView;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class ew3 implements esk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tw3 b;

    public /* synthetic */ ew3(tw3 tw3Var, byte b) {
        this.a = b;
        this.b = tw3Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.app.Activity, com.opera.android.BrowserActivity, t5d] */
    public final Object get() {
        byte b = this.a;
        byte b2 = 0;
        tw3 tw3Var = this.b;
        switch (b) {
            case 0:
                ?? r0 = tw3Var.b;
                View viewRequireViewById = r0.requireViewById(2131362211);
                StatusBarDrawingFrameLayout statusBarDrawingFrameLayout = (StatusBarDrawingFrameLayout) r0.requireViewById(2131364679);
                View viewRequireViewById2 = r0.requireViewById(2131364677);
                View viewRequireViewById3 = r0.requireViewById(2131364678);
                ChromiumContainerView chromiumContainerViewE0 = r0.e0();
                wt3 wt3Var = new wt3(r0, (byte) 2);
                String[] strArr = OperaApplication.K;
                return new cwk(statusBarDrawingFrameLayout, viewRequireViewById2, viewRequireViewById3, viewRequireViewById, chromiumContainerViewE0, wt3Var, new wv1(new li((OperaApplication) r0.getApplication(), OperaApplication.class, "usageReporter", "getUsageReporter()Lcom/opera/android/analytics/UsageReporter;", 0, (byte) 22), (byte) 1), new xt3(r0, b2));
            case 1:
                return (e4i) tw3Var.b.y.I.get();
            case 2:
                return (d8j) tw3Var.b.g0.E(d8j.class);
            case 3:
                k6l k6lVar = tw3Var.b.V;
                if (k6lVar == null) {
                    return null;
                }
                return k6lVar;
            case 4:
                return (qr8) tw3Var.b.g0.E(qr8.class);
            case 5:
                return (ibf) jbf.t(tw3Var.b).i();
            case 6:
                return tw3Var.b.L0();
            case 7:
                qim qimVar = tw3Var.b.o;
                Objects.requireNonNull(qimVar);
                return qimVar.e;
            case 8:
                return (u2b) tw3Var.b.g0.E(u2b.class);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                qim qimVar2 = tw3Var.b.o;
                Objects.requireNonNull(qimVar2);
                return qimVar2.e;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                Boolean bool = (Boolean) tw3Var.b.h0.g();
                bool.getClass();
                return bool;
            case 11:
                return Boolean.valueOf((((vok) wok.t(tw3Var.b).i()).a & 4) != 0);
            case 12:
                return ru9.c(tw3Var.b);
            case 13:
                return Integer.valueOf(nr8.e(tw3Var.b));
            case 14:
                qim qimVar3 = tw3Var.b.o;
                Objects.requireNonNull(qimVar3);
                return qimVar3.c;
            case 15:
                qim qimVar4 = tw3Var.b.o;
                Objects.requireNonNull(qimVar4);
                return qimVar4.e;
            case 16:
                return ru9.c(tw3Var.b);
            case 17:
                qim qimVar5 = tw3Var.b.o;
                Objects.requireNonNull(qimVar5);
                return qimVar5;
            case SizeUtil.textSize0_1 /* 18 */:
                return ru9.c(tw3Var.b);
            case 19:
                return (g8j) tw3Var.b.g0.E(g8j.class);
            case SizeUtil.textSize0 /* 20 */:
                return xnh.t(tw3Var.b);
            case 21:
                return (ben) tw3Var.b.g0.E(ben.class);
            case SizeUtil.textSize1 /* 22 */:
                return tw3Var.b.s;
            case 23:
                return (wre) tw3Var.b.g0.E(wre.class);
            case SizeUtil.textSize2 /* 24 */:
                return tw3Var.b.u();
            case 25:
                return (wc6) tw3Var.b.g0.E(wc6.class);
            case 26:
                return new oji(tw3Var.b.g0);
            case 27:
                return tw3Var.b.E0();
            case 28:
                return tw3Var.b.getSharedPreferences("localize", 0);
            default:
                int i = eif.a;
                return Boolean.valueOf(kfo.e0(tw3Var.b));
        }
    }
}
