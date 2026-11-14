package defpackage;

import android.content.SharedPreferences;
import com.leanplum.utils.SizeUtil;
import com.opera.android.OperaApplication;
import com.opera.android.oauth2.OperaAccessTokenProvider;
import java.util.Objects;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class yv3 implements esk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tw3 b;

    public /* synthetic */ yv3(tw3 tw3Var, byte b) {
        this.a = b;
        this.b = tw3Var;
    }

    /* JADX WARN: Type inference failed for: r15v87, types: [android.app.Activity, android.content.Context, com.opera.android.BrowserActivity] */
    public final Object get() {
        byte b = this.a;
        byte b2 = 1;
        tw3 tw3Var = this.b;
        switch (b) {
            case 0:
                String[] strArr = OperaApplication.K;
                fp1 fp1Var = tw3Var.b;
                OperaApplication operaApplication = (OperaApplication) fp1Var.getApplication();
                return new aw0(fp1Var, tw3Var.c, (yk6) operaApplication.e().get(), (vk6) operaApplication.r.h.get(), (i12) tw3Var.i0.get(), (tz1) tw3Var.C0.get());
            case 1:
                return new fw3(tw3Var);
            case 2:
                return new q32(tw3Var.b, new yv3(tw3Var, (byte) 6));
            case 3:
                return new x12(tw3Var.b.getContentResolver(), xne.b);
            case 4:
                return new ny1(tw3Var.b, vml.d);
            case 5:
                return new qy1(tw3Var.b.getContentResolver());
            case 6:
                return tw3Var.b.j;
            case 7:
                return new ky1(tw3Var.b, tw3Var.c, tw3Var.m0, tw3Var.n0, tw3Var.o0, tw3Var.p0, tw3Var.x0, tw3Var.q0, tw3Var.j, tw3Var.e0);
            case 8:
                String[] strArr2 = OperaApplication.K;
                fp1 fp1Var2 = tw3Var.b;
                return new egj((ufj) tw3Var.v0.get(), new i9c((ndc) fp1Var2, (ghj) ((l02) tw3Var.d0.get()).d.getValue(), (k42) tw3Var.c0.get(), ((OperaApplication) fp1Var2.getApplication()).L().c));
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                j4c j4cVar = tw3Var.w0;
                ii iiVar = xne.b;
                aw3 aw3Var = aw3.a;
                wjh wjhVar = vml.e;
                return new dz1(j4cVar, iiVar, (d7a) wjhVar.b, (jg8) wjhVar.d);
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                String[] strArr3 = OperaApplication.K;
                fp1 fp1Var3 = tw3Var.b;
                return new gz1(fp1Var3, tw3Var.c, vml.e, tw3Var.t0, ((OperaApplication) fp1Var3.getApplication()).t, tw3Var.h, tw3Var.i);
            case 11:
                fp1 fp1Var4 = tw3Var.b;
                umi umiVar = tw3Var.c;
                r16 r16Var = ngh.a;
                return new l32(fp1Var4, umiVar);
            case 12:
                return new bw3(tw3Var);
            case 13:
                return new a52((i52) tw3Var.q0.get());
            case 14:
                ru9 ru9VarC = ru9.c(((k42) tw3Var.c0.get()).a.b);
                String string = ru9VarC.a.getString("aria.sandbox.userinfo", null);
                if (string == null) {
                    return null;
                }
                try {
                    return yi4.J(string);
                } catch (JSONException unused) {
                    nv6 nv6VarB = ru9VarC.b();
                    ((SharedPreferences.Editor) nv6VarB.a).putString("aria.sandbox.userinfo", null);
                    nv6VarB.w();
                    return null;
                }
            case 15:
                return Boolean.valueOf(((t0i) xf8.W(((k42) tw3Var.c0.get()).d)) != null ? !(r15.a instanceof q0i) : false);
            case 16:
                return (OperaAccessTokenProvider) ((k42) tw3Var.c0.get()).c.getValue();
            case 17:
                qim qimVar = tw3Var.b.o;
                Objects.requireNonNull(qimVar);
                return qimVar.c;
            case SizeUtil.textSize0_1 /* 18 */:
                return new qsh((Object) tw3Var.b.getContentResolver(), ((j4c) tw3Var.a.a.e).get(), (byte) 10);
            case 19:
                return ru9.c(tw3Var.b);
            case SizeUtil.textSize0 /* 20 */:
                return (ot2) tw3Var.b.g0.E(ot2.class);
            case 21:
                return (hxk) tw3Var.b.g0.E(hxk.class);
            case SizeUtil.textSize1 /* 22 */:
                qim qimVar2 = tw3Var.b.o;
                Objects.requireNonNull(qimVar2);
                return qimVar2.e;
            case 23:
                qim qimVar3 = tw3Var.b.o;
                Objects.requireNonNull(qimVar3);
                return qimVar3.c;
            case SizeUtil.textSize2 /* 24 */:
                return Boolean.valueOf(sj2.g(tw3Var.b));
            case 25:
                return ru9.c(tw3Var.b);
            case 26:
                return (d8j) tw3Var.b.g0.E(d8j.class);
            case 27:
                return (pm3) tw3Var.b.g0.E(pm3.class);
            case 28:
                return (hxk) tw3Var.b.g0.E(kxk.class);
            default:
                ?? r15 = tw3Var.b;
                wt3 wt3Var = new wt3(r15, b2);
                String[] strArr4 = OperaApplication.K;
                return new m7d(r15, wt3Var, new wv1(new li((OperaApplication) r15.getApplication(), OperaApplication.class, "usageReporter", "getUsageReporter()Lcom/opera/android/analytics/UsageReporter;", 0, (byte) 21), (byte) 1));
        }
    }
}
