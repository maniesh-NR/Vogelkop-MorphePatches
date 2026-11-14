package defpackage;

import android.content.Context;
import com.leanplum.utils.SizeUtil;
import com.opera.android.Lazy;
import com.opera.android.OperaApplication;
import com.opera.android.account.push.AccountPushManager;
import com.opera.android.favorites.e;
import com.opera.android.settings.SettingsManager;
import java.io.File;
import java.util.EnumMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class qv1 implements esk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xv1 b;

    public /* synthetic */ qv1(xv1 xv1Var, byte b) {
        this.a = b;
        this.b = xv1Var;
    }

    public final Object get() {
        byte b = this.a;
        byte b2 = 2;
        byte b3 = 7;
        byte b4 = 1;
        byte b5 = 0;
        xv1 xv1Var = this.b;
        switch (b) {
            case 0:
                OperaApplication operaApplication = xv1Var.a;
                return new xb(operaApplication.b(), operaApplication.N(), operaApplication.J());
            case 1:
                umi umiVar = vml.d;
                ii iiVar = xne.b;
                OperaApplication operaApplication2 = xv1Var.a;
                return new rq8(new r9i(new File(operaApplication2.getFilesDir(), "favorite-catalog"), umiVar), new g77(umiVar, iiVar, new k5o(e3j.t(operaApplication2), new jv1(xv1Var, (byte) 25))), new lld(dj9.t(operaApplication2), b3), new uu1((byte) 9), new jv1(xv1Var, (byte) 27), new jv1(xv1Var, (byte) 28), new jv1(xv1Var, (byte) 29), new rb(operaApplication2, umiVar, (byte) 1));
            case 2:
                OperaApplication operaApplication3 = xv1Var.a;
                x5f x5fVar = operaApplication3.L().c;
                x5f x5fVar2 = operaApplication3.L().d;
                cul culVar = (cul) operaApplication3.r.g1.get();
                umi umiVar2 = vml.d;
                e84 e84Var = new e84(operaApplication3, umiVar2);
                td2 td2Var = new td2(umiVar2);
                pp6 pp6Var = new pp6(operaApplication3);
                vzk vzkVar = new vzk();
                vzkVar.a = e84Var;
                vzkVar.b = td2Var;
                vzkVar.c = pp6Var;
                return new e(culVar, vzkVar, (zzj) xv1Var.U0.get());
            case 3:
                OperaApplication operaApplication4 = xv1Var.a;
                return new xt8(operaApplication4, operaApplication4.R(), operaApplication4.J());
            case 4:
                OperaApplication operaApplication5 = xv1Var.a;
                fqe fqeVarY = operaApplication5.y();
                au8 au8Var = new au8(operaApplication5);
                au8Var.b.put((EnumMap) cue.NewsFeed, (cue) new xue(fqeVarY));
                return au8Var;
            case 5:
                e59 e59Var = new e59();
                OperaApplication operaApplication6 = xv1Var.a;
                umi umiVar3 = vml.d;
                e59Var.a(d59.a, new uw1(operaApplication6, umiVar3, x1p.h(operaApplication6, 2132017600, 2132017598, 2132017599, 2132017601), b5));
                j59 j59VarA = j59.a(operaApplication6);
                Objects.requireNonNull(j59VarA);
                e59Var.a(d59.c, new uw1((Context) operaApplication6, umiVar3, new j59(j59VarA.b, j59VarA.a, j59VarA.c, j59VarA.d, "215901376228", j59VarA.f, j59VarA.g, j59VarA.h), (byte) 3));
                e59Var.a(d59.b, new me9(operaApplication6, umiVar3, xv1Var.M));
                lz6 lz6Var = (lz6) xv1Var.p1.get();
                e59Var.a(d59.d, new n9c(operaApplication6, umiVar3, new qq6(new r9i(lz6Var.d, lz6Var.a(), (qp6) lz6Var.j.getValue(), new d06(lz6Var.c)))));
                j59 j59VarA2 = j59.a(operaApplication6);
                Objects.requireNonNull(j59VarA2);
                e59Var.a(d59.e, new uw1(operaApplication6, umiVar3, j59VarA2, "fcm"));
                e59Var.a(d59.g, new uw1(operaApplication6, umiVar3, x1p.h(operaApplication6, 2132019792, 2132019790, 2132019791, 2132019794), b2));
                if (operaApplication6.D().b()) {
                    e59Var.a(d59.f, new n9c(operaApplication6, umiVar3, (AccountPushManager) operaApplication6.r.c.get()));
                }
                return e59Var;
            case 6:
                OperaApplication operaApplication7 = xv1Var.a;
                return new g89(operaApplication7.L().c, new nv1(xv1Var, b4), new esg(operaApplication7, vml.d), new ov1(), new ydj(operaApplication7, (byte) 0));
            case 7:
                OperaApplication operaApplication8 = xv1Var.a;
                return new som(operaApplication8, operaApplication8.b(), operaApplication8.g());
            case 8:
                j4c j4cVar = xv1Var.N;
                umi umiVar4 = vml.d;
                j4cVar.getClass();
                Lazy.e(j4cVar, umiVar4);
                OperaApplication operaApplication9 = xv1Var.a;
                bf9 bf9Var = new bf9(operaApplication9, umiVar4, operaApplication9.b(), operaApplication9.N(), operaApplication9.J(), xv1Var.N, xv1Var.x);
                bf9Var.F(new mxl(bf9Var, operaApplication9.L().c));
                bf9Var.F(new uv1(xv1Var, b5));
                return bf9Var;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return xv1Var.a.getSharedPreferences("flow_touch_mgr", 0);
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return new zv9(xv1Var.a, vml.d);
            case 11:
                return new h0a(xf8.u(((lpe) xv1Var.i0.get()).s), xv1Var.y, (SettingsManager) xv1Var.P0.get());
            case 12:
                return new e00(xv1Var.a, vml.d);
            case 13:
                return new v1a(ru9.c(xv1Var.a), (nx5) xv1Var.i.get());
            case 14:
                int i = f4b.f;
                OperaApplication operaApplication10 = xv1Var.a;
                tjh tjhVarA = tjh.a(operaApplication10);
                return new f4b(new vg4(operaApplication10, (byte) 8), new d4b(tjhVarA, (byte) 0), new d4b(tjhVarA, (byte) 1), new d4b(tjhVarA, (byte) 2));
            case 15:
                OperaApplication operaApplication11 = xv1Var.a;
                return new atb(operaApplication11, operaApplication11.L().c, (nzk) xv1Var.c1.get());
            case 16:
                return new nzk(xv1Var.a);
            case 17:
                return new m9c(xv1Var.a);
            case SizeUtil.textSize0_1 /* 18 */:
                nx5 nx5Var = (nx5) xv1Var.i.get();
                OperaApplication operaApplication12 = xv1Var.a;
                return new snc(nx5Var, operaApplication12, new jv1(xv1Var, (byte) 15), vml.e, xv1Var.K, new vk1((byte) 16), xv1Var.d0, xv1Var.j0, xv1Var.l0, xnh.t(operaApplication12), xv1Var.P0, vml.d, ((lpe) operaApplication12.A.get()).u, operaApplication12.L().c);
            case 19:
                return new vv1(xv1Var);
            case SizeUtil.textSize0 /* 20 */:
                return new zkd(xv1Var.a.L().c, new mv1(xv1Var, (byte) 0));
            case 21:
                OperaApplication operaApplication13 = xv1Var.a;
                return new tjg(operaApplication13, vml.d, (djg) xv1Var.Y.get(), (zkd) xv1Var.Z.get(), operaApplication13.L().c);
            case SizeUtil.textSize1 /* 22 */:
                return new wld(xv1Var.a.L().c);
            case 23:
                return new epd(xv1Var.a.L().c);
            case SizeUtil.textSize2 /* 24 */:
                return new fqe(xv1Var.a, vml.d, (tm5) xv1Var.u.get());
            case 25:
                return new a5l(xv1Var.a, vml.d, (wun) xv1Var.o1.get());
            case 26:
                return new oue(xv1Var.a, vml.d);
            case 27:
                OperaApplication operaApplication14 = xv1Var.a;
                return new ete(operaApplication14, vml.d, operaApplication14.L().c);
            case 28:
                return new br6(xv1Var.a, new jv1(xv1Var, (byte) 17));
            default:
                e00 e00Var = (e00) xv1Var.e.get();
                OperaApplication operaApplication15 = xv1Var.a;
                wjh wjhVar = vml.e;
                r16 r16Var = ngh.a;
                return new lpe(operaApplication15, wjhVar, new mpe(new bi(e00Var, (byte) 19), new jv1(xv1Var, (byte) 18), new jv1(xv1Var, (byte) 20), new lld(dj9.t(operaApplication15), b3), new ix5((byte) 12), new uu1(b3), new lv1(xv1Var, b2), new iab(operaApplication15, 1), new iab(operaApplication15, 4), new hga(operaApplication15, b4), new jv1(xv1Var, (byte) 21), new jv1(xv1Var, (byte) 22), new pjn(v1.u(operaApplication15), (byte) 4), new jv1(xv1Var, (byte) 23), new uu1((byte) 8)), xv1Var.r1, (br6) xv1Var.h0.get(), new jv1(xv1Var, (byte) 24));
        }
    }
}
