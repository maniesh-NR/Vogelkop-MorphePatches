package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.Size;
import android.view.ViewGroup;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.bar.TopToolbarContainer;
import com.opera.android.settings.SettingsManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class mt3 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ BrowserActivity b;

    public /* synthetic */ mt3(BrowserActivity browserActivity, byte b) {
        this.a = b;
        this.b = browserActivity;
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [android.app.Activity, android.content.Context, com.opera.android.BrowserActivity] */
    /* JADX WARN: Type inference failed for: r4v14, types: [android.app.Activity, com.opera.android.BrowserActivity] */
    /* JADX WARN: Type inference failed for: r5v10, types: [android.content.Context, com.opera.android.BrowserActivity] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.app.Activity, com.opera.android.BrowserActivity] */
    public final Object invoke() {
        byte b = this.a;
        byte b2 = 14;
        TopToolbarContainer topToolbarContainer = null;
        xd5 xd5Var = this.b;
        switch (b) {
            case 0:
                return xd5Var.getSharedPreferences("browser_action_stats", 0);
            case 1:
                int i = BrowserActivity.E1;
                k6l k6lVar = xd5Var.V;
                if (k6lVar != null) {
                    return k6lVar;
                }
                return null;
            case 2:
                gbf gbfVar = xd5Var.M;
                if (gbfVar != null) {
                    return gbfVar;
                }
                return null;
            case 3:
                gbf gbfVar2 = xd5Var.M;
                if (gbfVar2 != null) {
                    return gbfVar2;
                }
                return null;
            case 4:
                int i2 = BrowserActivity.E1;
                k6l k6lVar2 = xd5Var.V;
                if (k6lVar2 != null) {
                    return k6lVar2;
                }
                return null;
            case 5:
                TopToolbarContainer topToolbarContainer2 = xd5Var.W;
                if (topToolbarContainer2 != null) {
                    return topToolbarContainer2;
                }
                return null;
            case 6:
                int i3 = BrowserActivity.E1;
                String[] strArr = OperaApplication.K;
                OperaApplication operaApplication = (OperaApplication) xd5Var.getApplication();
                return new ulg(xne.b, bml.u(xd5Var.getApplicationContext()), operaApplication.u(), new ji(operaApplication, (byte) 9), new xt3(xd5Var, (byte) 2));
            case 7:
                int i4 = BrowserActivity.E1;
                return ru9.c(xd5Var);
            case 8:
                k6l k6lVar3 = xd5Var.V;
                k6l k6lVar4 = k6lVar3 != null ? k6lVar3 : null;
                String[] strArr2 = OperaApplication.K;
                OperaApplication operaApplication2 = (OperaApplication) xd5Var.getApplication();
                return new mu6(operaApplication2.R(), k6lVar4, operaApplication2.L().e);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                int i5 = BrowserActivity.E1;
                dyf dyfVar = new dyf(xd5Var);
                xd5Var.l1(dyfVar.k);
                return dyfVar;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                w6j w6jVar = xd5Var.F;
                if (w6jVar == null) {
                    w6jVar = null;
                }
                rii riiVar = new rii(w6jVar, xd5Var.N0());
                TopToolbarContainer topToolbarContainer3 = xd5Var.W;
                if (topToolbarContainer3 == null) {
                    topToolbarContainer3 = null;
                } else {
                    topToolbarContainer = topToolbarContainer3;
                }
                return new wul(xd5Var, riiVar, topToolbarContainer3, topToolbarContainer.findViewById(2131364821));
            case 11:
                int i6 = BrowserActivity.E1;
                return new eej(xd5Var.I0(), xd5Var.o.f, xd5Var.P0());
            case 12:
                int i7 = BrowserActivity.E1;
                gom gomVarA = mom.a(xd5Var);
                if (gomVarA.a == lom.d) {
                    mom.b(xd5Var, gomVarA);
                }
                return Unit.a;
            case 13:
                int i8 = BrowserActivity.E1;
                ((f7d) xd5Var.t1.getValue()).b();
                return Unit.a;
            case 14:
                int i9 = BrowserActivity.E1;
                fnh fnhVar = xd5Var.C;
                if (fnhVar != null) {
                    return fnhVar;
                }
                return null;
            case 15:
                int i10 = BrowserActivity.E1;
                ((f7d) xd5Var.t1.getValue()).b();
                return Unit.a;
            case 16:
                int i11 = BrowserActivity.E1;
                String[] strArr3 = OperaApplication.K;
                xd5 xd5Var2 = this.b;
                OperaApplication operaApplication3 = (OperaApplication) xd5Var2.getApplication();
                umi umiVar = xd5Var2.x;
                SettingsManager settingsManagerH0 = xd5Var2.H0();
                tw3 tw3Var = xd5Var2.y;
                fx3 fx3Var = tw3Var.a.g;
                x5f x5fVar = operaApplication3.L().c;
                jtg jtgVarD = operaApplication3.D();
                gmk gmkVarE = operaApplication3.E();
                rr3 rr3Var = operaApplication3.p;
                xv1 xv1Var = operaApplication3.r;
                zv9 zv9Var = (zv9) xv1Var.O.get();
                gy gyVar = (gy) no7.n(xd5Var2, io7.k, gy.k);
                hx3 hx3Var = tw3Var.a;
                wy wyVar = new wy(xd5Var2, umiVar, settingsManagerH0, fx3Var, x5fVar, jtgVarD, gmkVarE, rr3Var, zv9Var, gyVar, hx3Var.r(), hx3Var.x(), (esk) xv1Var.f.get());
                xd5Var2.l1(new yy(fue.c(xd5Var2.getApplicationContext()), wyVar, operaApplication3.y(), operaApplication3.z()));
                return wyVar;
            case 17:
                int i12 = BrowserActivity.E1;
                lim anVar = new an();
                xd5Var.l1(anVar);
                return anVar;
            case SizeUtil.textSize0_1 /* 18 */:
                int i13 = BrowserActivity.E1;
                String[] strArr4 = OperaApplication.K;
                ?? r4 = this.b;
                OperaApplication operaApplication4 = (OperaApplication) r4.getApplication();
                gjm gjmVarP0 = r4.P0();
                tw3 tw3Var2 = r4.y;
                return new f7d(r4, gjmVarP0, (e4i) tw3Var2.I.get(), r4.x, operaApplication4.L().c, tw3Var2.a.a(), operaApplication4.b(), operaApplication4.D(), operaApplication4.M(), r4.F0(), new pt3(r4, b2));
            case 19:
                int i14 = BrowserActivity.E1;
                String[] strArr5 = OperaApplication.K;
                ?? r3 = this.b;
                OperaApplication operaApplication5 = (OperaApplication) r3.getApplication();
                umi umiVar2 = r3.x;
                tw3 tw3Var3 = r3.y;
                return new v1f(r3, umiVar2, (xc9) tw3Var3.a.s().get(), operaApplication5.m().e, (ojn) tw3Var3.Q.get(), ru9.c(r3), ((k3i) operaApplication5.D.get()).a());
            case SizeUtil.textSize0 /* 20 */:
                int i15 = BrowserActivity.E1;
                String[] strArr6 = OperaApplication.K;
                xd5 xd5Var3 = this.b;
                OperaApplication operaApplication6 = (OperaApplication) xd5Var3.getApplication();
                nr8 nr8VarO = operaApplication6.o();
                Context applicationContext = xd5Var3.getApplicationContext();
                return new ipk(xd5Var3, xd5Var3.x, wok.t(applicationContext), operaApplication6.L().c, nr8VarO, operaApplication6.H(), xd5Var3.getResources().getString(2132020148), xd5Var3.getLifecycle(), (f35) xd5Var3.m0.getValue(), operaApplication6.d(), new du3(xd5Var3, (byte) 15), new t1(applicationContext, (byte) 1), new kw0(applicationContext));
            case 21:
                return new yz9(xd5Var.d0);
            case SizeUtil.textSize1 /* 22 */:
                int i16 = BrowserActivity.E1;
                String[] strArr7 = OperaApplication.K;
                return new l98(xd5Var, (dp6) ((OperaApplication) xd5Var.getApplication()).v.get());
            case 23:
                ?? r5 = this.b;
                umi umiVar3 = r5.x;
                du3 du3Var = new du3(r5, (byte) 16);
                ysj ysjVarJ0 = r5.J0();
                String[] strArr8 = OperaApplication.K;
                return new buj(r5, umiVar3, du3Var, ysjVarJ0, ((OperaApplication) r5.getApplication()).L().c);
            case SizeUtil.textSize2 /* 24 */:
                int i17 = BrowserActivity.E1;
                return new v4b(xd5Var.getLifecycle(), yne.a, zsd.b);
            case 25:
                ?? r52 = this.b;
                k6l k6lVar5 = r52.V;
                return new pgf(k6lVar5 != null ? k6lVar5 : null, r52.y.a.g, r52.x, r52, (mu6) r52.a1.getValue(), new du3(r52, b2));
            case 26:
                int i18 = BrowserActivity.E1;
                return (ViewGroup) xd5Var.findViewById(2131364681);
            case 27:
                BrowserActivity browserActivity = ((wv3) xd5Var.y0.get()).a;
                Rect rectT = q9n.t(browserActivity.findViewById(2131364681));
                rectT.top = browserActivity.M0().h() + rectT.top;
                rectT.bottom -= browserActivity.M0().g();
                return new Size(rectT.width(), rectT.height());
            case 28:
                int i19 = BrowserActivity.E1;
                fnh fnhVar2 = xd5Var.C;
                if (fnhVar2 != null) {
                    return fnhVar2;
                }
                return null;
            default:
                return xd5Var.H0();
        }
    }
}
