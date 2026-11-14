package defpackage;

import android.view.ViewGroup;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.bar.BottomBar;
import com.opera.android.settings.SettingsManager;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class wt3 implements esk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ BrowserActivity b;

    public /* synthetic */ wt3(BrowserActivity browserActivity, byte b) {
        this.a = b;
        this.b = browserActivity;
    }

    /* JADX WARN: Type inference failed for: r2v27, types: [android.app.Activity, android.content.Context, com.opera.android.BrowserActivity] */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.content.Context, com.opera.android.BrowserActivity] */
    public final Object get() {
        byte b = this.a;
        ndc ndcVar = this.b;
        switch (b) {
            case 0:
                int i = BrowserActivity.E1;
                return ndcVar.O0();
            case 1:
                int i2 = BrowserActivity.E1;
                i7d i7dVar = new i7d(ndcVar.q0(), ndcVar.o1, true);
                i7dVar.getLifecycle().a(new jw0(ndcVar, (byte) 2));
                return i7dVar;
            case 2:
                int i3 = BrowserActivity.E1;
                k6l k6lVar = ndcVar.V;
                if (k6lVar == null) {
                    return null;
                }
                return k6lVar;
            case 3:
                int i4 = BrowserActivity.E1;
                return Boolean.valueOf(ndcVar.X0());
            case 4:
                gbf gbfVar = ndcVar.M;
                return (gbfVar == null ? null : gbfVar).p();
            case 5:
                int i5 = BrowserActivity.E1;
                return ndcVar.x0().d;
            case 6:
                int i6 = BrowserActivity.E1;
                b2l b2lVarW0 = ndcVar.w0();
                return Boolean.valueOf(b2lVarW0 != null && ((d7l) b2lVarW0).n0() && ndcVar.X0());
            case 7:
                return (m0a) ndcVar.y.F0.get();
            case 8:
                return (mbf) ndcVar.y.F.get();
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                int i7 = BrowserActivity.E1;
                qim qimVar = ndcVar.o;
                Objects.requireNonNull(qimVar);
                return qimVar.e;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                int i8 = BrowserActivity.E1;
                return new ykn(new du3(ndcVar, (byte) 19), new du3(ndcVar, (byte) 20));
            case 11:
                ?? r3 = this.b;
                umi umiVar = r3.x;
                hw3 hw3Var = r3.y.v0;
                wjh wjhVar = vml.e;
                return new yu4(r3, umiVar, hw3Var, (d7a) wjhVar.b, (jg8) wjhVar.d);
            case 12:
                int i9 = BrowserActivity.E1;
                String[] strArr = OperaApplication.K;
                ((u8k) ((OperaApplication) ndcVar.getApplicationContext()).I.get()).b();
                r22 r22Var = ndcVar.G;
                return new mo3((r22Var == null ? null : r22Var).O());
            case 13:
                k6l k6lVar2 = ndcVar.V;
                return new t8l(ndcVar, k6lVar2 == null ? null : k6lVar2, ndcVar.y1);
            case 14:
                int i10 = BrowserActivity.E1;
                return new dq9(ndcVar.H0(), ((jt3) ndcVar.y.r.get()).g, ((t8l) ndcVar.z1.get()).c);
            case 15:
                return (e4i) ndcVar.y.I.get();
            case 16:
                z43 z43Var = ndcVar.z;
                return Boolean.valueOf(((gbf) (z43Var != null ? z43Var : null).i).j.p());
            case 17:
                k6l k6lVar3 = ndcVar.V;
                k6l k6lVar4 = k6lVar3 == null ? null : k6lVar3;
                c5o c5oVar = ndcVar.e0;
                String[] strArr2 = OperaApplication.K;
                x5f x5fVar = ((OperaApplication) ndcVar.getApplication()).L().c;
                return new q82(ndcVar, k6lVar4, c5oVar);
            case SizeUtil.textSize0_1 /* 18 */:
                int i11 = BrowserActivity.E1;
                String[] strArr3 = OperaApplication.K;
                return new meg((evn) ((OperaApplication) ndcVar.getApplication()).r.q1.get());
            case 19:
                int i12 = BrowserActivity.E1;
                ndc ndcVar2 = this.b;
                return new n03(ndcVar2, ndcVar2, ndcVar2.Q0().h, (ikc) ndcVar2.y.a.o().get(), ndcVar2.P().f0().c);
            case SizeUtil.textSize0 /* 20 */:
                ndc ndcVar3 = this.b;
                qq6 qq6Var = ndcVar3.u1;
                tw3 tw3Var = ndcVar3.y;
                v6d v6dVar = new v6d(qq6Var);
                umi umiVar2 = ndcVar3.x;
                f1p f1pVar = new f1p();
                f1pVar.a = ndcVar3;
                f1pVar.b = umiVar2;
                ava.a.a(new dnb(f1pVar, (byte) 8));
                String[] strArr4 = OperaApplication.K;
                OperaApplication operaApplication = (OperaApplication) ndcVar3.getApplication();
                gjm gjmVarP0 = ndcVar3.P0();
                x5f x5fVar2 = operaApplication.L().c;
                z77 z77VarZ0 = ndcVar3.z0();
                qim qimVar2 = ndcVar3.o;
                Objects.requireNonNull(qimVar2);
                p77 p77Var = qimVar2.h;
                ysj ysjVarJ0 = ndcVar3.J0();
                k6l k6lVar5 = ndcVar3.V;
                if (k6lVar5 == null) {
                    k6lVar5 = null;
                }
                u4l u4lVar = (u4l) tw3Var.a.s.get();
                i53 i53VarG = operaApplication.g();
                nr8 nr8VarO = operaApplication.o();
                SettingsManager settingsManagerH0 = ndcVar3.H0();
                c4l c4lVar = (c4l) tw3Var.R.get();
                mt3 mt3Var = new mt3(ndcVar3, (byte) 26);
                mt3 mt3Var2 = new mt3(ndcVar3, (byte) 27);
                mt3 mt3Var3 = new mt3(ndcVar3, (byte) 28);
                eme emeVar = new eme(ndcVar3);
                BottomBar bottomBar = ndcVar3.A;
                if (bottomBar == null) {
                    bottomBar = null;
                }
                jo3 jo3Var = new jo3(bottomBar);
                yqa yqaVar = ndcVar3.b0;
                qim qimVar3 = ndcVar3.o;
                Objects.requireNonNull(qimVar3);
                return new v9l(ndcVar3, gjmVarP0, x5fVar2, umiVar2, z77VarZ0, p77Var, ysjVarJ0, k6lVar5, u4lVar, i53VarG, nr8VarO, settingsManagerH0, c4lVar, mt3Var, mt3Var2, mt3Var3, emeVar, jo3Var, yqaVar, new x77((Object) qimVar3, (Object) new c37(v6dVar, ndcVar3), (byte) 9), new gb3(ndcVar3, v6dVar, (byte) 6));
            case 21:
                int i13 = BrowserActivity.E1;
                return jbf.t(ndcVar);
            case SizeUtil.textSize1 /* 22 */:
                int i14 = BrowserActivity.E1;
                qim qimVar4 = ndcVar.o;
                Objects.requireNonNull(qimVar4);
                return qimVar4;
            case 23:
                return (rj) ndcVar.g0.E(rj.class);
            case SizeUtil.textSize2 /* 24 */:
                ?? r2 = this.b;
                umi umiVar3 = r2.x;
                deg degVar = yne.b;
                String[] strArr5 = OperaApplication.K;
                return new c8l(r2, umiVar3, degVar, (n7l) ((OperaApplication) r2.getApplication()).r.f1.get(), (v4b) r2.t0.getValue());
            case 25:
                return (syl) ndcVar.g0.E(syl.class);
            case 26:
                return (g0c) ndcVar.g0.E(g0c.class);
            case 27:
                int i15 = BrowserActivity.E1;
                return (ViewGroup) ndcVar.findViewById(2131364106);
            case 28:
                int i16 = BrowserActivity.E1;
                jvj jvjVar = ndcVar.D;
                if (jvjVar != null) {
                    return jvjVar;
                }
                return null;
            default:
                int i17 = BrowserActivity.E1;
                return ndcVar.z0();
        }
    }
}
