package defpackage;

import android.content.Context;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.Lazy;
import com.opera.android.OperaApplication;
import java.util.Objects;

/* loaded from: classes.dex */
public final class hw3 extends Lazy {
    public final /* synthetic */ byte e;
    public final /* synthetic */ tw3 f;

    public /* synthetic */ hw3(tw3 tw3Var, byte b) {
        this.e = b;
        this.f = tw3Var;
    }

    /* JADX WARN: Type inference failed for: r0v140, types: [android.app.Activity, com.opera.android.BrowserActivity] */
    /* JADX WARN: Type inference failed for: r0v153, types: [android.app.Activity, com.opera.android.BrowserActivity] */
    /* JADX WARN: Type inference failed for: r0v37, types: [android.app.Activity, com.opera.android.BrowserActivity] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.app.Activity, android.content.Context, com.opera.android.BrowserActivity] */
    /* JADX WARN: Type inference failed for: r1v40, types: [android.app.Activity, com.opera.android.BrowserActivity] */
    /* JADX WARN: Type inference failed for: r1v79, types: [android.app.Activity, android.content.Context, com.opera.android.BrowserActivity] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.app.Activity, com.opera.android.BrowserActivity] */
    /* JADX WARN: Type inference failed for: r5v12, types: [android.app.Activity, com.opera.android.BrowserActivity] */
    /* JADX WARN: Type inference failed for: r5v40, types: [android.app.Activity, android.content.Context, com.opera.android.BrowserActivity, dx3] */
    @Override // com.opera.android.Lazy
    public final Object d() {
        byte b = this.e;
        byte b2 = 10;
        byte b3 = 9;
        byte b4 = 8;
        byte b5 = 27;
        byte b6 = 26;
        byte b7 = 29;
        byte b8 = 28;
        byte b9 = 7;
        byte b10 = 14;
        byte b11 = 13;
        byte b12 = 15;
        byte b13 = 12;
        byte b14 = 16;
        tw3 tw3Var = this.f;
        switch (b) {
            case 0:
                String[] strArr = OperaApplication.K;
                ?? r5 = tw3Var.b;
                OperaApplication operaApplication = (OperaApplication) r5.getApplication();
                return new rte(r5, r5.P0(), operaApplication.y(), new ew3(tw3Var, (byte) 12), operaApplication.L().c);
            case 1:
                String[] strArr2 = OperaApplication.K;
                ?? r0 = tw3Var.b;
                OperaApplication operaApplication2 = (OperaApplication) r0.getApplication();
                return new mue(ru9.c(r0), operaApplication2.z(), tw3Var.a.w(), r0.E0(), operaApplication2.o());
            case 2:
                return new iw3(tw3Var);
            case 3:
                String[] strArr3 = OperaApplication.K;
                fp1 fp1Var = tw3Var.b;
                OperaApplication operaApplication3 = (OperaApplication) fp1Var.getApplication();
                return new sze(operaApplication3, vml.e, cqp.V(fp1Var.getLifecycle()), fp1Var.getLifecycle(), new mr3((byte) 6), new tze(new jw3(operaApplication3, (byte) 0), new dw3(operaApplication3, (byte) 26), new dw3(operaApplication3, (byte) 27), new lld((Object) dj9.t(operaApplication3), (byte) 7), new ix5((byte) 12), new kw3((byte) 0), new jw3(operaApplication3, (byte) 1), new iab(operaApplication3, 1), new iab(operaApplication3, 4), new hga(operaApplication3, (byte) 1), new dw3(operaApplication3, (byte) 28), new dw3(operaApplication3, (byte) 29), new pjn(v1.u(operaApplication3), (byte) 4), new lw3(operaApplication3, (byte) 0), new ew3(tw3Var, (byte) 13)), (br6) operaApplication3.r.h0.get());
            case 4:
                BrowserActivity browserActivity = tw3Var.b;
                k6l k6lVar = browserActivity.V;
                if (k6lVar == null) {
                    k6lVar = null;
                }
                z43 z43Var = browserActivity.z;
                mbf mbfVar = new mbf(k6lVar, z43Var != null ? z43Var : null);
                browserActivity.getLifecycle().a(mbfVar);
                return mbfVar;
            case 5:
                String[] strArr4 = OperaApplication.K;
                fp1 fp1Var2 = tw3Var.b;
                OperaApplication operaApplication4 = (OperaApplication) fp1Var2.getApplication();
                tlg tlgVar = new tlg(operaApplication4.o(), operaApplication4.J(), (e8k) tw3Var.O.get(), u59.C(operaApplication4), operaApplication4.G(), (u8k) operaApplication4.I.get());
                fp1Var2.getLifecycle().a(tlgVar);
                return tlgVar;
            case 6:
                return new bmg(new ki(tw3Var.k, (byte) 2));
            case 7:
                String[] strArr5 = OperaApplication.K;
                tw3 tw3Var2 = this.f;
                fp1 fp1Var3 = tw3Var2.b;
                OperaApplication operaApplication5 = (OperaApplication) fp1Var3.getApplication();
                lw3 lw3Var = new lw3(operaApplication5, (byte) 1);
                wv1 wv1Var = new wv1(new pv3(tw3Var2, tw3.class, "accountStatusProvider", "getAccountStatusProvider()Lcom/opera/android/account/AccountStatusProvider;", 0, (byte) 27), (byte) 2);
                ew3 ew3Var = new ew3(tw3Var2, (byte) 14);
                ew3 ew3Var2 = new ew3(tw3Var2, (byte) 15);
                lw3 lw3Var2 = new lw3(operaApplication5, (byte) 2);
                fx3 fx3Var = tw3Var2.a.n;
                hx3 hx3Var = tw3Var2.a;
                int i = 0;
                return new lm3(lw3Var, wv1Var, ew3Var, ew3Var2, lw3Var2, fx3Var, hx3Var.y(), hx3Var.n(), new lw3(operaApplication5, (byte) 3), new lw3(operaApplication5, (byte) 4), tvg.t(fp1Var3), new wv1(new pv3(fp1Var3, BrowserActivity.class, "purchasesProvider", "getPurchasesProvider()Lcom/opera/android/premium/ui/PurchasesProvider;", i, (byte) 28), (byte) 2), hx3Var.p, operaApplication5.C, hx3Var.o, new wv1(new pv3(operaApplication5, OperaApplication.class, "usageReporter", "getUsageReporter()Lcom/opera/android/analytics/UsageReporter;", i, (byte) 29), (byte) 2), new ew3(tw3Var2, (byte) 16), new nu3(hx3Var.m, (byte) 1));
            case 8:
                return new qjh(tw3Var.b, new ew3(tw3Var, (byte) 17), new gw3(tw3Var, (byte) 1));
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return new hnh(tw3Var.b.P0(), new cw3(tw3Var, (byte) 6), new cw3(tw3Var, (byte) 7), new cw3(tw3Var, (byte) 8), new cw3(tw3Var, (byte) 9), new cw3(tw3Var, (byte) 10), (byte) 0);
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                String[] strArr6 = OperaApplication.K;
                fp1 fp1Var4 = tw3Var.b;
                OperaApplication operaApplication6 = (OperaApplication) fp1Var4.getApplication();
                return new r2i((y3i) operaApplication6.G.get(), ((k3i) operaApplication6.D.get()).a(), ru9.c(fp1Var4), fp1Var4);
            case 11:
                String[] strArr7 = OperaApplication.K;
                ?? r02 = tw3Var.b;
                OperaApplication operaApplication7 = (OperaApplication) r02.getApplication();
                return new x7j(r02.P0(), operaApplication7.G, (j4c) tw3Var.a.a.g, tw3Var.l0, new gw3(tw3Var, (byte) 2), new ew3(tw3Var, (byte) 18), new lw3(operaApplication7, (byte) 5), (byte) 2);
            case 12:
                String[] strArr8 = OperaApplication.K;
                OperaApplication operaApplication8 = (OperaApplication) tw3Var.b.getApplication();
                gjm gjmVar = (gjm) tw3Var.a.p.get();
                return new e4i((k3i) operaApplication8.D.get(), new f4i(new lw3(operaApplication8, (byte) 6), new yhe(gjmVar, (byte) 16)), gjmVar);
            case 13:
                String[] strArr9 = OperaApplication.K;
                ?? r52 = tw3Var.b;
                OperaApplication operaApplication9 = (OperaApplication) r52.getApplication();
                return new f1j(r52, tw3Var.c, operaApplication9.s(), tw3Var.a.w(), operaApplication9.L().c, new ki(tw3Var.u0, (byte) 3));
            case 14:
                String[] strArr10 = OperaApplication.K;
                tw3 tw3Var3 = this.f;
                ?? r1 = tw3Var3.b;
                OperaApplication operaApplication10 = (OperaApplication) r1.getApplication();
                tw3 tw3Var4 = r1.y;
                gjm gjmVarP0 = r1.P0();
                ew3 ew3Var3 = new ew3(tw3Var3, (byte) 19);
                ew3 ew3Var4 = new ew3(tw3Var3, (byte) 21);
                ew3 ew3Var5 = new ew3(tw3Var3, (byte) 25);
                mw3 mw3Var = new mw3(tw3Var3, (byte) 3);
                mw3 mw3Var2 = new mw3(tw3Var3, b2);
                mw3 mw3Var3 = new mw3(tw3Var3, b12);
                hx3 hx3Var2 = tw3Var3.a;
                j4c j4cVar = (j4c) hx3Var2.a.e;
                mw3 mw3Var4 = new mw3(tw3Var3, (byte) 17);
                mw3 mw3Var5 = new mw3(tw3Var3, (byte) 18);
                mw3 mw3Var6 = new mw3(tw3Var3, (byte) 19);
                mw3 mw3Var7 = new mw3(tw3Var3, (byte) 20);
                ew3 ew3Var6 = new ew3(tw3Var3, (byte) 23);
                mw3 mw3Var8 = new mw3(tw3Var3, (byte) 0);
                mw3 mw3Var9 = new mw3(tw3Var3, (byte) 6);
                lw3 lw3Var3 = new lw3(operaApplication10, (byte) 24);
                ii iiVar = ((mi) hx3Var2.a.b).t;
                nw3 nw3Var = new nw3(operaApplication10, (byte) 0);
                nw3 nw3Var2 = new nw3(operaApplication10, (byte) 1);
                Lazy lazyI = hx3Var2.i();
                wv1 wv1Var2 = new wv1(new pw3(tw3Var3, tw3.class, "accountStatusProvider", "getAccountStatusProvider()Lcom/opera/android/account/AccountStatusProvider;", 0, (byte) 0), (byte) 2);
                nw3 nw3Var3 = new nw3(operaApplication10, (byte) 2);
                nw3 nw3Var4 = new nw3(operaApplication10, (byte) 3);
                ow3 ow3Var = new ow3(tw3Var3, operaApplication10, (byte) 0);
                ew3 ew3Var7 = new ew3(tw3Var3, (byte) 20);
                g92 g92Var = operaApplication10.z;
                lw3 lw3Var4 = new lw3(operaApplication10, (byte) 7);
                lw3 lw3Var5 = new lw3(operaApplication10, (byte) 8);
                kw3 kw3Var = new kw3(tw3Var3, (byte) 1);
                kw3 kw3Var2 = new kw3(tw3Var3, (byte) 1);
                ew3 ew3Var8 = new ew3(tw3Var3, (byte) 22);
                j4c j4cVarE = operaApplication10.e();
                lw3 lw3Var6 = new lw3(operaApplication10, (byte) 9);
                lw3 lw3Var7 = new lw3(operaApplication10, (byte) 10);
                lw3 lw3Var8 = new lw3(operaApplication10, (byte) 11);
                Lazy lazyP = hx3Var2.p();
                fx3 fx3Var2 = hx3Var2.u;
                lw3 lw3Var9 = new lw3(operaApplication10, (byte) 12);
                ew3 ew3Var9 = new ew3(tw3Var3, (byte) 24);
                umi umiVar = tw3Var3.c;
                wjh wjhVar = tw3Var3.d;
                ew3 ew3Var10 = new ew3(tw3Var3, (byte) 26);
                Lazy lazyT = hx3Var2.t();
                lw3 lw3Var10 = new lw3(operaApplication10, (byte) 13);
                lw3 lw3Var11 = new lw3(operaApplication10, (byte) 14);
                zv3 zv3Var = tw3Var3.q;
                ew3 ew3Var11 = new ew3(tw3Var3, (byte) 27);
                kw3 kw3Var3 = new kw3((byte) 2);
                lw3 lw3Var12 = new lw3(operaApplication10, (byte) 15);
                ew3 ew3Var12 = new ew3(tw3Var3, (byte) 28);
                ew3 ew3Var13 = new ew3(tw3Var3, (byte) 29);
                mw3 mw3Var10 = new mw3(tw3Var3, (byte) 1);
                mw3 mw3Var11 = new mw3(tw3Var3, (byte) 2);
                mw3 mw3Var12 = new mw3(tw3Var3, (byte) 4);
                lw3 lw3Var13 = new lw3(operaApplication10, (byte) 16);
                lw3 lw3Var14 = new lw3(operaApplication10, (byte) 17);
                xv1 xv1Var = operaApplication10.r;
                sqi sqiVar = (sqi) xv1Var.L0.get();
                lw3 lw3Var15 = new lw3(operaApplication10, (byte) 18);
                lw3 lw3Var16 = new lw3(operaApplication10, (byte) 19);
                lw3 lw3Var17 = new lw3(operaApplication10, (byte) 20);
                Lazy lazyS = hx3Var2.s();
                mw3 mw3Var13 = new mw3(tw3Var3, (byte) 5);
                mw3 mw3Var14 = new mw3(tw3Var3, (byte) 7);
                fx3 fx3Var3 = hx3Var2.q;
                zv3 zv3Var2 = tw3Var3.r;
                mw3 mw3Var15 = new mw3(tw3Var3, (byte) 8);
                mw3 mw3Var16 = new mw3(tw3Var3, (byte) 9);
                j4c j4cVar2 = operaApplication10.A;
                return new x7j(r1, gjmVarP0, ew3Var3, ew3Var4, ew3Var5, mw3Var, mw3Var2, mw3Var3, j4cVar, mw3Var4, mw3Var5, mw3Var6, mw3Var7, ew3Var6, mw3Var8, mw3Var9, lw3Var3, iiVar, nw3Var, nw3Var2, lazyI, wv1Var2, nw3Var3, nw3Var4, ow3Var, ew3Var7, g92Var, lw3Var4, lw3Var5, kw3Var, kw3Var2, ew3Var8, j4cVarE, lw3Var6, lw3Var7, lw3Var8, lazyP, fx3Var2, lw3Var9, ew3Var9, umiVar, wjhVar, ew3Var10, lazyT, lw3Var10, lw3Var11, zv3Var, ew3Var11, kw3Var3, lw3Var12, ew3Var12, ew3Var13, mw3Var10, mw3Var11, mw3Var12, lw3Var13, lw3Var14, sqiVar, lw3Var15, lw3Var16, lw3Var17, lazyS, mw3Var13, mw3Var14, fx3Var3, zv3Var2, mw3Var15, mw3Var16, ((lpe) j4cVar2.get()).b, new mw3(tw3Var3, (byte) 11), new lw3(operaApplication10, (byte) 21), new mw3(tw3Var3, (byte) 12), new mw3(tw3Var3, (byte) 13), new lw3(operaApplication10, (byte) 22), new lw3(operaApplication10, (byte) 23), new mw3(tw3Var3, (byte) 14), tw3Var4.a.g, new gw3(tw3Var3, (byte) 3), (x0f) xv1Var.l0.get(), new lw3(operaApplication10, (byte) 25), tw3Var3.l0, tw3Var3.I, operaApplication10.D, new et3(operaApplication10, (byte) 5), new lw3(operaApplication10, (byte) 26), tw3Var3.C0, tw3Var3.f, tw3Var3.i, new eq6(((lz6) operaApplication10.J.get()).a), ((lpe) j4cVar2.get()).q, ((lpe) j4cVar2.get()).x, new lw3(operaApplication10, (byte) 27), new mw3(tw3Var3, (byte) 16), hx3Var2.o(), new lw3(operaApplication10, (byte) 28), new lw3(operaApplication10, (byte) 29), tw3Var3.p);
            case 15:
                String[] strArr11 = OperaApplication.K;
                fp1 fp1Var5 = tw3Var.b;
                return new hnh(fp1Var5, new cw3(tw3Var, (byte) 11), tw3Var.c, new cw3(tw3Var, (byte) 12), new cw3(tw3Var, (byte) 13), new et3((OperaApplication) fp1Var5.getApplication(), (byte) 6), (byte) 1);
            case 16:
                Context applicationContext = tw3Var.b.getApplicationContext();
                ii iiVar2 = xne.b;
                t1 t1Var = new t1(applicationContext, (byte) 2);
                t1 t1Var2 = new t1(applicationContext, (byte) 3);
                kw3 kw3Var4 = new kw3((byte) 3);
                wjh wjhVar2 = vml.e;
                return new ehj(iiVar2, t1Var, t1Var2, kw3Var4, (d7a) wjhVar2.b, (jg8) wjhVar2.f);
            case 17:
                return new e7k(new cw3(tw3Var, (byte) 14), new cw3(tw3Var, (byte) 15), new cw3(tw3Var, (byte) 16), new pw3(tw3Var.b, BrowserActivity.class, "isUiClean", "isUiClean()Z", 0, (byte) 1));
            case SizeUtil.textSize0_1 /* 18 */:
                mw3 mw3Var17 = new mw3(tw3Var, (byte) 21);
                j7k j7kVar = k7k.k;
                fp1 fp1Var6 = tw3Var.b;
                po7 po7Var = new po7((k7k) no7.n(fp1Var6, k7k.l, k7k.n));
                String[] strArr12 = OperaApplication.K;
                e8k e8kVar = new e8k(mw3Var17, po7Var, (u8k) ((OperaApplication) fp1Var6.getApplication()).I.get());
                fp1Var6.getLifecycle().a(e8kVar);
                return e8kVar;
            case 19:
                return new ob6(tw3Var.b.P0(), new gw3(tw3Var, (byte) 4), (ojn) tw3Var.Q.get());
            case SizeUtil.textSize0 /* 20 */:
                String[] strArr13 = OperaApplication.K;
                fp1 fp1Var7 = tw3Var.b;
                return new ojn(fp1Var7, tw3Var.c, (fjn) ((OperaApplication) fp1Var7.getApplication()).r.l1.get());
            case 21:
                String[] strArr14 = OperaApplication.K;
                fp1 fp1Var8 = tw3Var.b;
                OperaApplication operaApplication11 = (OperaApplication) fp1Var8.getApplication();
                return new gyk(fp1Var8, operaApplication11.o(), operaApplication11.J(), operaApplication11.b());
            case SizeUtil.textSize1 /* 22 */:
                String[] strArr15 = OperaApplication.K;
                OperaApplication operaApplication12 = (OperaApplication) tw3Var.b.getApplication();
                return new c4l(new nw3(operaApplication12, (byte) 4), new nw3(operaApplication12, (byte) 5), new nw3(operaApplication12, (byte) 6));
            case 23:
                fp1 fp1Var9 = tw3Var.b;
                wjh wjhVar3 = vml.e;
                kul kulVar = new kul(fp1Var9, wjhVar3);
                qw3 qw3Var = new qw3(tw3Var, kulVar);
                i7f i7fVar = kulVar.e;
                i7fVar.b(qw3Var);
                i7fVar.b(new c65(new mw3(tw3Var, (byte) 22), cqp.V(fp1Var9.getLifecycle()), (cv6) wjhVar3.c));
                return kulVar;
            case SizeUtil.textSize2 /* 24 */:
                return new v78((h1b) tw3Var.y.get(), (byte) 1);
            case 25:
                String[] strArr16 = OperaApplication.K;
                ?? r03 = tw3Var.b;
                OperaApplication operaApplication13 = (OperaApplication) r03.getApplication();
                gjm gjmVarP02 = r03.P0();
                mw3 mw3Var18 = new mw3(tw3Var, (byte) 23);
                nw3 nw3Var5 = new nw3(operaApplication13, b13);
                nw3 nw3Var6 = new nw3(operaApplication13, b11);
                nw3 nw3Var7 = new nw3(operaApplication13, b10);
                mw3 mw3Var19 = new mw3(tw3Var, b6);
                mw3 mw3Var20 = new mw3(tw3Var, b5);
                hx3 hx3Var3 = tw3Var.a;
                return new zdn(gjmVarP02, mw3Var18, nw3Var5, nw3Var6, nw3Var7, mw3Var19, mw3Var20, ((mi) hx3Var3.a.b).s, hx3Var3.m, new nw3(operaApplication13, b9), new nw3(operaApplication13, b4), new mw3(tw3Var, (byte) 24), new nw3(operaApplication13, b3), new nw3(operaApplication13, b2), new mw3(tw3Var, (byte) 25), new nw3(operaApplication13, (byte) 11), new kw3((byte) 4), tw3Var.V, operaApplication13.L().c);
            case 26:
                String[] strArr17 = OperaApplication.K;
                ?? r12 = tw3Var.b;
                return new men(((OperaApplication) r12.getApplication()).M().i, (ben) r12.g0.E(ben.class), ru9.c(r12), tw3Var.a.w());
            case 27:
                String[] strArr18 = OperaApplication.K;
                ?? r53 = tw3Var.b;
                OperaApplication operaApplication14 = (OperaApplication) r53.getApplication();
                hx3 hx3Var4 = tw3Var.a;
                af3 af3Var = (af3) hx3Var4.n().get();
                qb7 qb7Var = new qb7(af3Var, operaApplication14.L().d);
                xb xbVarA = hx3Var4.a();
                slk slkVarM = operaApplication14.M();
                fmk fmkVar = (fmk) r53.y.a.y().get();
                ru9 ru9VarC = ru9.c(r53);
                qim qimVar = r53.o;
                Objects.requireNonNull(qimVar);
                return new pfn(r53, af3Var, qb7Var, xbVarA, slkVarM, fmkVar, ru9VarC, qimVar.c, operaApplication14.D(), new q2(0, hx3Var4.m, Lazy.class, "get", "get()Ljava/lang/Object;", 0, (byte) 13), operaApplication14.L().c);
            case 28:
                String[] strArr19 = OperaApplication.K;
                ?? r04 = tw3Var.b;
                OperaApplication operaApplication15 = (OperaApplication) r04.getApplication();
                nw3 nw3Var8 = new nw3(operaApplication15, b12);
                hx3 hx3Var5 = tw3Var.a;
                return new xg7(nw3Var8, (j4c) hx3Var5.a.e, hx3Var5.B(), r04.a0, new mw3(tw3Var, b8), new nw3(operaApplication15, b14), new mw3(tw3Var, b7), tw3Var.c, (gjm) hx3Var5.p.get(), operaApplication15.D, (j4c) hx3Var5.a.g, (e4i) tw3Var.I.get());
            default:
                return new xg7(tw3Var.b.P0());
        }
    }
}
