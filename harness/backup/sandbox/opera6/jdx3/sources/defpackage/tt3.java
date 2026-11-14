package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.Lazy;
import com.opera.android.OperaApplication;
import com.opera.android.bar.BottomBar;
import com.opera.android.browser.BrowserFragmentFrameLayout;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class tt3 implements esk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ BrowserActivity b;

    public /* synthetic */ tt3(BrowserActivity browserActivity, byte b) {
        this.a = b;
        this.b = browserActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.content.Context, com.opera.android.BrowserActivity] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.app.Activity, android.content.Context, com.opera.android.BrowserActivity] */
    public final Object get() {
        byte b = this.a;
        ?? r4 = this.b;
        switch (b) {
            case 0:
                int i = BrowserActivity.E1;
                String[] strArr = OperaApplication.K;
                ?? r5 = this.b;
                OperaApplication operaApplication = (OperaApplication) r5.getApplication();
                z43 z43Var = r5.z;
                return (z43Var != null ? z43Var : 0).c(r5, new wv1(new pv3(operaApplication, OperaApplication.class, "settingsManager", "getSettingsManager()Lcom/opera/android/settings/SettingsManager;", 0, (byte) 22), (byte) 1), new du3(r5, (byte) 11), (nue) r5.y.E.get(), new du3(r5, (byte) 13), new nwf(new hv3(r5), operaApplication.L().c, (byte) 1));
            case 1:
                int i2 = BrowserActivity.E1;
                return r4.H0();
            case 2:
                int i3 = BrowserActivity.E1;
                return ru9.c(r4);
            case 3:
                int i4 = BrowserActivity.E1;
                return ru9.c(r4);
            case 4:
                int i5 = BrowserActivity.E1;
                String[] strArr2 = OperaApplication.K;
                xd5 xd5Var = this.b;
                OperaApplication operaApplication2 = (OperaApplication) xd5Var.getApplication();
                BottomBar bottomBar = xd5Var.A;
                tw3 tw3Var = xd5Var.y;
                if (bottomBar == null) {
                    bottomBar = null;
                }
                View viewFindViewById = bottomBar.findViewById(2131362066);
                View viewInflate = ((ViewStub) viewFindViewById.findViewById(2131362065)).inflate();
                k6l k6lVar = xd5Var.V;
                k6l k6lVar2 = k6lVar != null ? k6lVar : null;
                tcc lifecycle = xd5Var.getLifecycle();
                dll dllVar = xd5Var.a;
                zv3 zv3Var = tw3Var.r0;
                hx3 hx3Var = tw3Var.a;
                zv3 zv3Var2 = tw3Var.e;
                byte b2 = 7;
                du3 du3Var = new du3(xd5Var, b2);
                du3 du3Var2 = new du3(xd5Var, (byte) 8);
                du3 du3Var3 = new du3(xd5Var, (byte) 9);
                ji jiVar = new ji(operaApplication2, b2);
                zv3 zv3Var3 = tw3Var.c0;
                Lazy lazyE = hx3Var.e();
                rvg rvgVarA = rvg.a(viewInflate);
                fx3 fx3Var = hx3Var.q;
                ViewGroup viewGroup = (ViewGroup) viewFindViewById;
                wv1 wv1Var = new wv1(new li(operaApplication2, OperaApplication.class, "usageReporter", "getUsageReporter()Lcom/opera/android/analytics/UsageReporter;", 0, (byte) 19), (byte) 1);
                j4c j4cVarE = operaApplication2.e();
                rw3 rw3Var = tw3Var.f0;
                du3 du3Var4 = new du3(xd5Var, (byte) 10);
                gjm gjmVarP0 = xd5Var.P0();
                hw3 hw3Var = tw3Var.t0;
                y22 y22Var = (y22) tw3Var.u0.get();
                ji jiVar2 = new ji(operaApplication2, (byte) 8);
                j4c j4cVar = tw3Var.h;
                qim qimVar = xd5Var.o;
                Objects.requireNonNull(qimVar);
                return new b22(xd5Var, k6lVar2, lifecycle, dllVar, zv3Var, zv3Var2, du3Var, du3Var2, du3Var3, jiVar, zv3Var3, lazyE, rvgVarA, fx3Var, viewGroup, wv1Var, j4cVarE, rw3Var, du3Var4, gjmVarP0, hw3Var, y22Var, jiVar2, j4cVar, qimVar);
            case 5:
                int i6 = BrowserActivity.E1;
                return ru9.c(r4);
            case 6:
                int i7 = BrowserActivity.E1;
                return r4.H0();
            case 7:
                int i8 = BrowserActivity.E1;
                return r4.H0();
            case 8:
                int i9 = BrowserActivity.E1;
                return ru9.c(r4);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                int i10 = BrowserActivity.E1;
                return r4.H0();
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                int i11 = BrowserActivity.E1;
                return r4.H0();
            case 11:
                int i12 = BrowserActivity.E1;
                return r4.H0();
            case 12:
                int i13 = BrowserActivity.E1;
                return r4.H0();
            case 13:
                int i14 = BrowserActivity.E1;
                return r4.H0();
            case 14:
                int i15 = BrowserActivity.E1;
                return r4.H0();
            case 15:
                int i16 = BrowserActivity.E1;
                return r4.H0();
            case 16:
                int i17 = BrowserActivity.E1;
                return ru9.c(r4);
            case 17:
                int i18 = BrowserActivity.E1;
                return r4.H0();
            case SizeUtil.textSize0_1 /* 18 */:
                return (Boolean) ((dq9) r4.A1.get()).b.g();
            case 19:
                t82 t82Var = r4.E;
                if (t82Var != null) {
                    return t82Var;
                }
                return null;
            case SizeUtil.textSize0 /* 20 */:
                t82 t82Var2 = r4.E;
                if (t82Var2 != null) {
                    return t82Var2;
                }
                return null;
            case 21:
                int i19 = BrowserActivity.E1;
                return ru9.c(r4);
            case SizeUtil.textSize1 /* 22 */:
                int i20 = BrowserActivity.E1;
                BrowserActivity browserActivity = this.b;
                BrowserFragmentFrameLayout browserFragmentFrameLayoutF0 = browserActivity.P().f0();
                return new inn(browserActivity, browserFragmentFrameLayoutF0.b, browserFragmentFrameLayoutF0.c, (ykn) browserActivity.s1.get(), browserActivity.z1);
            case 23:
                int i21 = BrowserActivity.E1;
                return r4.O0();
            case SizeUtil.textSize2 /* 24 */:
                int i22 = BrowserActivity.E1;
                return ru9.c(r4);
            case 25:
                int i23 = BrowserActivity.E1;
                return ru9.c(r4);
            case 26:
                int i24 = BrowserActivity.E1;
                return r4.O0();
            case 27:
                int i25 = BrowserActivity.E1;
                return ru9.c(r4);
            case 28:
                int i26 = BrowserActivity.E1;
                return r4.O0();
            default:
                int i27 = BrowserActivity.E1;
                return ru9.c(r4);
        }
    }
}
