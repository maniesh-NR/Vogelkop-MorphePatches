package defpackage;

import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.RootView;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class du3 implements esk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ BrowserActivity b;

    public /* synthetic */ du3(BrowserActivity browserActivity, byte b) {
        this.a = b;
        this.b = browserActivity;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [android.app.Activity, android.content.Context, com.opera.android.BrowserActivity] */
    public final Object get() {
        byte b = this.a;
        byte b2 = 0;
        xd5 xd5Var = this.b;
        switch (b) {
            case 0:
                int i = BrowserActivity.E1;
                return xd5Var.P0();
            case 1:
                int i2 = BrowserActivity.E1;
                qim qimVar = xd5Var.o;
                Objects.requireNonNull(qimVar);
                return qimVar;
            case 2:
                int i3 = BrowserActivity.E1;
                return (pgf) xd5Var.Z.getValue();
            case 3:
                int i4 = BrowserActivity.E1;
                qim qimVar2 = xd5Var.o;
                Objects.requireNonNull(qimVar2);
                return qimVar2;
            case 4:
                int i5 = BrowserActivity.E1;
                tcc lifecycle = xd5Var.getLifecycle();
                c8l c8lVar = (c8l) xd5Var.w0.get();
                k6l k6lVar = xd5Var.V;
                return new j8l(lifecycle, c8lVar, k6lVar != null ? k6lVar : null);
            case 5:
                int i6 = BrowserActivity.E1;
                qim qimVar3 = xd5Var.o;
                Objects.requireNonNull(qimVar3);
                return qimVar3;
            case 6:
                return (d8j) xd5Var.g0.E(d8j.class);
            case 7:
                int i7 = BrowserActivity.E1;
                return xd5Var.getSupportFragmentManager();
            case 8:
                int i8 = BrowserActivity.E1;
                return xd5Var.J0();
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                int i9 = BrowserActivity.E1;
                return xd5Var.o.f;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return (hxk) xd5Var.g0.E(kxk.class);
            case 11:
                int i10 = BrowserActivity.E1;
                return xnh.t(xd5Var.getApplicationContext());
            case 12:
                int i11 = BrowserActivity.E1;
                return new wv3(xd5Var);
            case 13:
                int i12 = BrowserActivity.E1;
                return xd5Var.W();
            case 14:
                int i13 = BrowserActivity.E1;
                String[] strArr = OperaApplication.K;
                return ((OperaApplication) xd5Var.getApplication()).L().c;
            case 15:
                int i14 = BrowserActivity.E1;
                k6l k6lVar2 = xd5Var.V;
                return (k6lVar2 != null ? k6lVar2 : null).i;
            case 16:
                RootView rootView = xd5Var.Q;
                if (rootView == null) {
                    rootView = null;
                }
                int height = rootView.getHeight();
                RootView rootView2 = xd5Var.Q;
                int i15 = height - (rootView2 == null ? null : rootView2).o;
                if (rootView2 == null) {
                    rootView2 = null;
                }
                int i16 = i15 - rootView2.p;
                bvl bvlVar = xd5Var.X;
                if (bvlVar == null) {
                    bvlVar = null;
                }
                int i17 = i16 - ((avl) bvlVar.getState().g()).c;
                r22 r22Var = xd5Var.I;
                return Integer.valueOf(i17 - ((np3) ((pde) (r22Var != null ? r22Var : null).b).g()).b);
            case 17:
                int i18 = BrowserActivity.E1;
                return xd5Var.O0();
            case SizeUtil.textSize0_1 /* 18 */:
                int i19 = BrowserActivity.E1;
                qln qlnVarQ0 = xd5Var.Q0();
                int color = xd5Var.getColor(2131100343);
                int color2 = xd5Var.getColor(2131100342);
                qlnVarQ0.getClass();
                o2c o2cVar = new o2c(false, 0, 0, false);
                return new qjn(qlnVarQ0.g, new a56(color, color2).c(qlnVarQ0.a, o2cVar), new vk2((byte) 25), o2cVar);
            case 19:
                bvl bvlVar2 = xd5Var.X;
                if (bvlVar2 != null) {
                    return bvlVar2;
                }
                return null;
            case SizeUtil.textSize0 /* 20 */:
                r22 r22Var2 = xd5Var.I;
                if (r22Var2 != null) {
                    return r22Var2;
                }
                return null;
            case 21:
                int i20 = BrowserActivity.E1;
                String[] strArr2 = OperaApplication.K;
                ?? r3 = this.b;
                OperaApplication operaApplication = (OperaApplication) r3.getApplication();
                return new kwf(r3, (swf) r3.y.a.t().get(), operaApplication.s(), operaApplication.J(), new nwf(new hv3(r3), operaApplication.L().c, b2), operaApplication.L().c, operaApplication.L().d, new du3(r3, (byte) 17), new k5o((BrowserActivity) r3), (in3) operaApplication.r.r.get());
            case SizeUtil.textSize1 /* 22 */:
                return xd5Var.I0();
            case 23:
                gbf gbfVar = xd5Var.M;
                return (gbfVar != null ? gbfVar : null).p();
            case SizeUtil.textSize2 /* 24 */:
                return (pgf) xd5Var.Z.getValue();
            case 25:
                return Boolean.valueOf(xd5Var.X0());
            case 26:
                return Boolean.valueOf(xd5Var.X0());
            case 27:
                return Boolean.valueOf(xd5Var.X0());
            case 28:
                return (af3) xd5Var.y.a.n().get();
            default:
                return tvg.t(xd5Var);
        }
    }
}
