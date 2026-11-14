package defpackage;

import android.content.Context;
import android.net.Uri;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.Lazy;
import com.opera.android.OperaApplication;
import com.opera.android.bar.BottomBar;
import com.opera.android.bookmarks.h;
import com.opera.android.browser.blocklist.bridge.BlockListRepositoryBridge;
import com.opera.android.favorites.data.FavoriteRemovedSuggestionsDatabase;
import com.opera.android.settings.SettingsManager;
import com.opera.android.webaiassistant.db.HistoryDatabase;
import java.util.Objects;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class zv3 extends Lazy {
    public final /* synthetic */ byte e;
    public final /* synthetic */ tw3 f;

    public /* synthetic */ zv3(tw3 tw3Var, byte b) {
        this.e = b;
        this.f = tw3Var;
    }

    /* JADX WARN: Type inference failed for: r0v105, types: [android.app.Activity, com.opera.android.BrowserActivity, dx3] */
    /* JADX WARN: Type inference failed for: r0v107, types: [android.app.Activity, com.opera.android.BrowserActivity] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.app.Activity, com.opera.android.BrowserActivity] */
    /* JADX WARN: Type inference failed for: r0v65, types: [android.app.Activity, android.content.Context, com.opera.android.BrowserActivity, dx3] */
    /* JADX WARN: Type inference failed for: r0v67, types: [android.app.Activity, android.content.Context, com.opera.android.BrowserActivity, dx3] */
    /* JADX WARN: Type inference failed for: r0v80, types: [android.app.Activity, com.opera.android.BrowserActivity] */
    /* JADX WARN: Type inference failed for: r0v88, types: [android.app.Activity, com.opera.android.BrowserActivity] */
    /* JADX WARN: Type inference failed for: r1v23, types: [android.app.Activity, com.opera.android.BrowserActivity, dx3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v28, types: [android.app.Activity, com.opera.android.BrowserActivity] */
    /* JADX WARN: Type inference failed for: r1v44, types: [android.app.Activity, com.opera.android.BrowserActivity] */
    @Override // com.opera.android.Lazy
    public final Object d() {
        byte b = this.e;
        byte b2 = 19;
        byte b3 = 24;
        byte b4 = 23;
        byte b5 = 10;
        byte b6 = 22;
        byte b7 = 29;
        byte b8 = 21;
        byte b9 = 18;
        byte b10 = 11;
        byte b11 = 20;
        byte b12 = 25;
        byte b13 = 9;
        byte b14 = 3;
        tw3 tw3Var = this.f;
        switch (b) {
            case 0:
                String[] strArr = OperaApplication.K;
                fp1 fp1Var = tw3Var.b;
                OperaApplication operaApplication = (OperaApplication) fp1Var.getApplication();
                return new qb(new ji(operaApplication, b9), operaApplication.c(), fp1Var, new yv3(tw3Var, (byte) 14));
            case 1:
                String[] strArr2 = OperaApplication.K;
                ?? r0 = tw3Var.b;
                OperaApplication operaApplication2 = (OperaApplication) r0.getApplication();
                x5f x5fVar = operaApplication2.L().c;
                SettingsManager settingsManagerJ = operaApplication2.J();
                x5f x5fVar2 = operaApplication2.L().d;
                wth wthVar = r0.d0;
                hw3 hw3Var = r0.y.K;
                return new uv0(settingsManagerJ, x5fVar, x5fVar2, wthVar, new et3(operaApplication2, (byte) 2));
            case 2:
                gz1 gz1Var = (gz1) tw3Var.g.get();
                gz1Var.getClass();
                Context context = gz1Var.a;
                return new tz1(context, gz1Var.b, (HistoryDatabase) xih.f(context.getApplicationContext(), HistoryDatabase.class, "ai_history").b(), (l32) gz1Var.f.get(), (kul) gz1Var.d.get(), ru9.c(context), (bw3) gz1Var.g.get(), new k51((byte) 25), (nx5) gz1Var.e.get(), (jg8) gz1Var.c.d);
            case 3:
                String[] strArr3 = OperaApplication.K;
                return new l02(new ji((OperaApplication) tw3Var.b.getApplication(), b2), new yv3(tw3Var, (byte) 15), new yv3(tw3Var, (byte) 16));
            case 4:
                return new i12(tw3Var.c);
            case 5:
                String[] strArr4 = OperaApplication.K;
                OperaApplication operaApplication3 = (OperaApplication) tw3Var.b.getApplication();
                return new k42(new ji(operaApplication3, b11), new ji(operaApplication3, (byte) 21));
            case 6:
                String[] strArr5 = OperaApplication.K;
                fp1 fp1Var2 = tw3Var.b;
                return new q52(fp1Var2, ((OperaApplication) fp1Var2.getApplication()).c(), (k42) tw3Var.c0.get());
            case 7:
                String[] strArr6 = OperaApplication.K;
                tw3 tw3Var2 = this.f;
                ?? r1 = tw3Var2.b;
                OperaApplication operaApplication4 = (OperaApplication) r1.getApplication();
                return new j62(r1, tw3Var2.c, r1.P0(), new ji(operaApplication4, (byte) 22), operaApplication4.e(), tw3Var2.j, tw3Var2.a.q, new wv1(new pv3(tw3Var2, tw3.class, "accountStatusProvider", "getAccountStatusProvider()Lcom/opera/android/account/AccountStatusProvider;", 0, (byte) 23), (byte) 2), new yv3(tw3Var2, (byte) 17), new yv3(tw3Var2, b9), (wyn) operaApplication4.r.m1.get(), tw3Var2.c0, tw3Var2.d0, tw3Var2.b0, new yv3(tw3Var2, b2), new ji(operaApplication4, (byte) 23), new ji(operaApplication4, (byte) 24), tw3Var2.e, tw3Var2.s0, new r2(1, (Object) r1, BrowserActivity.class, "getEncryptionKeyForOpenAiAssistant", "getEncryptionKeyForOpenAiAssistant(Lcom/opera/api/Callback;)V", 0, (byte) 13));
            case 8:
                String[] strArr7 = OperaApplication.K;
                ndc ndcVar = tw3Var.b;
                OperaApplication operaApplication5 = (OperaApplication) ndcVar.getApplication();
                Class<OperaApplication> cls = OperaApplication.class;
                return new cg2(ndcVar, new q2(0, tw3Var.u, Lazy.class, "get", "get()Ljava/lang/Object;", 0, (byte) 12), new pv3(operaApplication5, cls, "mediaPlayerManager", "getMediaPlayerManager()Lcom/opera/android/media/PlayerManager;", 0, (byte) 24), new cw3(tw3Var, (byte) 0), new cw3(tw3Var, (byte) 1), new cw3(tw3Var, (byte) 2), new cw3(tw3Var, (byte) 3), new pv3(operaApplication5, cls, "usageReporter", "getUsageReporter()Lcom/opera/android/analytics/UsageReporter;", 0, (byte) 25), new ji(operaApplication5, (byte) 25), ndcVar.f0);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                String[] strArr8 = OperaApplication.K;
                tw3 tw3Var3 = this.f;
                ?? r12 = tw3Var3.b;
                OperaApplication operaApplication6 = (OperaApplication) r12.getApplication();
                umi umiVar = tw3Var3.c;
                gjm gjmVarP0 = r12.P0();
                yv3 yv3Var = new yv3(tw3Var3, b11);
                yv3 yv3Var2 = new yv3(tw3Var3, (byte) 26);
                dw3 dw3Var = new dw3(operaApplication6, (byte) 1);
                hx3 hx3Var = tw3Var3.a;
                return new it2(umiVar, gjmVarP0, yv3Var, yv3Var2, dw3Var, hx3Var.u(), hx3Var.j(), hx3Var.c(), new dw3(operaApplication6, (byte) 2), new dw3(operaApplication6, (byte) 3), ((mi) hx3Var.a.b).z, new ji(operaApplication6, (byte) 26), hx3Var.l(), new ji(operaApplication6, (byte) 27), new wv1(new pv3(tw3Var3, tw3.class, "accountStatusProvider", "getAccountStatusProvider()Lcom/opera/android/account/AccountStatusProvider;", 0, (byte) 26), (byte) 2), new ji(operaApplication6, (byte) 28), new yv3(tw3Var3, (byte) 21), new yv3(tw3Var3, (byte) 22), new yv3(tw3Var3, (byte) 23), new yv3(tw3Var3, (byte) 24), ((mi) tw3Var3.a.a.b).o, new ji(operaApplication6, (byte) 29), new yv3(tw3Var3, (byte) 25), new dw3(operaApplication6, (byte) 0), hx3Var.v(), ((mi) hx3Var.a.b).l, hx3Var.g());
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                String[] strArr9 = OperaApplication.K;
                si3 si3Var = (si3) ((OperaApplication) tw3Var.b.getApplication()).r.o.get();
                return new ij3((ech) si3Var.b.b.get(), (cj3) si3Var.o.getValue(), (BlockListRepositoryBridge) si3Var.p.getValue(), (f9d) si3Var.r.getValue());
            case 11:
                String[] strArr10 = OperaApplication.K;
                OperaApplication operaApplication7 = (OperaApplication) tw3Var.b.getApplication();
                return new lm3(new yv3(tw3Var, (byte) 27), new yv3(tw3Var, (byte) 28), new dw3(operaApplication7, (byte) 4), new dw3(operaApplication7, (byte) 5), tw3Var.a.p);
            case 12:
                SettingsManager settingsManagerW = tw3Var.a.w();
                return new po3(new k7d(tw3Var.b, settingsManagerW, new yv3(tw3Var, b7)), new y8l(settingsManagerW, new ew3(tw3Var, (byte) 0)));
            case 13:
                ?? r13 = tw3Var.b;
                hv3 hv3Var = new hv3(r13);
                String[] strArr11 = OperaApplication.K;
                return new bq3(hv3Var, ((OperaApplication) r13.getApplication()).L().c);
            case 14:
                String[] strArr12 = OperaApplication.K;
                ?? r02 = tw3Var.b;
                OperaApplication operaApplication8 = (OperaApplication) r02.getApplication();
                hx3 hx3Var2 = tw3Var.a;
                SettingsManager settingsManagerW2 = hx3Var2.w();
                x5f x5fVar3 = operaApplication8.L().c;
                x5f x5fVar4 = operaApplication8.L().d;
                xnh xnhVarT = xnh.t(r02.getApplicationContext());
                k6l k6lVar = r02.V;
                k6l k6lVar2 = k6lVar == null ? null : k6lVar;
                tni tniVar = r02.l;
                bq3 bq3Var = (bq3) tw3Var.o.get();
                kze kzeVar = r02.i0;
                nue nueVar = (nue) tw3Var.E.get();
                hw3 hw3Var2 = tw3Var.F;
                kze kzeVar2 = ((xnc) operaApplication8.z.get()).a;
                ikc ikcVarA = ((k3i) operaApplication8.D.get()).a();
                ew3 ew3Var = new ew3(tw3Var, (byte) 1);
                qim qimVar = r02.o;
                Objects.requireNonNull(qimVar);
                BottomBar bottomBar = r02.A;
                return new jt3(r02, settingsManagerW2, x5fVar3, x5fVar4, xnhVarT, k6lVar2, tniVar, bq3Var, kzeVar, nueVar, hw3Var2, kzeVar2, new et3(operaApplication8, (byte) 3), ikcVarA, ew3Var, new dw3(operaApplication8, (byte) 7), operaApplication8.s, qimVar, bottomBar != null ? bottomBar : null, new zu3(r02), new pt3(r02, (byte) 14), new dw3(operaApplication8, (byte) 6), hx3Var2.p);
            case 15:
                ?? r03 = tw3Var.b;
                umi umiVar2 = vml.d;
                j4c j4cVar = (j4c) tw3Var.a.a.e;
                qim qimVar2 = r03.o;
                Objects.requireNonNull(qimVar2);
                z77 z77Var = qimVar2.c;
                String[] strArr13 = OperaApplication.K;
                x5f x5fVar5 = ((OperaApplication) r03.getApplication()).L().c;
                OperaApplication operaApplication9 = (OperaApplication) r03.getApplicationContext();
                jk5 jk5VarI = operaApplication9.i();
                ik5 ik5Var = new ik5(umiVar2, (lpe) operaApplication9.A.get(), new fch(new s49((byte) 5)));
                int i = 0;
                Class<OperaApplication> cls2 = OperaApplication.class;
                qb7 qb7Var = new qb7(new c37(xnh.t(operaApplication9), new vzk(new wv1(new pw3(operaApplication9, cls2, "newsFacade", "getNewsFacade()Lcom/opera/android/news/NewsFacade;", i, (byte) 4), (byte) 3), (esk) new ox3(operaApplication9, b14), (esk) new kw3(b10))), new zy9(j4cVar), new qii());
                SettingsManager settingsManagerJ2 = operaApplication9.J();
                return new bk5(jk5VarI, ik5Var, qb7Var, new agm(z77Var, new r9i(new i16(settingsManagerJ2, new i3j(new wv1(new pw3(operaApplication9, cls2, "newsFacade", "getNewsFacade()Lcom/opera/android/news/NewsFacade;", i, (byte) 5), (byte) 3), settingsManagerJ2, ru9.c(operaApplication9)), b5), new u59(j4cVar, (byte) 28), new s99(settingsManagerJ2, (byte) 0)), x5fVar5, (byte) 2), new r99(operaApplication9, (byte) 1));
            case 16:
                String[] strArr14 = OperaApplication.K;
                fp1 fp1Var3 = tw3Var.b;
                OperaApplication operaApplication10 = (OperaApplication) fp1Var3.getApplication();
                uu1 uu1Var = new uu1((byte) 28);
                j4c j4cVar2 = tw3Var.z0;
                ii iiVar = xne.b;
                nx5 nx5Var = (nx5) operaApplication10.t.get();
                wjh wjhVar = vml.e;
                ki kiVar = new ki(fp1Var3.getApplicationContext(), b13);
                ghf ghfVar = new ghf(Uri.parse("https://composer-cms.opera-api.com/api/v1/ai_prompts/for_client/ofa_chat/"), iiVar, (jg8) wjhVar.f, b13);
                jg8 jg8Var = (jg8) wjhVar.d;
                n08 n08Var = n08.a;
                vx vxVar = new vx(kiVar, (byte) 16);
                on7 on7Var = pn7.b;
                return new kt5(n08Var, vxVar, uu1Var, j4cVar2, ghfVar, cs5.x0(7, un7.h), nx5Var, jg8Var);
            case 17:
                String[] strArr15 = OperaApplication.K;
                fp1 fp1Var4 = tw3Var.b;
                OperaApplication operaApplication11 = (OperaApplication) fp1Var4.getApplication();
                return new du5(fp1Var4, operaApplication11.j(), operaApplication11.J(), z4c.b(new et3(operaApplication11, (byte) 4)));
            case SizeUtil.textSize0_1 /* 18 */:
                String[] strArr16 = OperaApplication.K;
                ?? r04 = tw3Var.b;
                return new ob6(tw3Var.c, new dw3((OperaApplication) r04.getApplication(), (byte) 8), r04.P0());
            case 19:
                String[] strArr17 = OperaApplication.K;
                OperaApplication operaApplication12 = (OperaApplication) tw3Var.b.getApplication();
                return new xg7(new dw3(operaApplication12, b13), new dw3(operaApplication12, b5), new ew3(tw3Var, (byte) 2));
            case SizeUtil.textSize0 /* 20 */:
                String[] strArr18 = OperaApplication.K;
                ?? r05 = tw3Var.b;
                OperaApplication operaApplication13 = (OperaApplication) r05.getApplication();
                return new or8(tw3Var.c, r05.P0(), new dw3(operaApplication13, b10), new dw3(operaApplication13, (byte) 15), new dw3(operaApplication13, (byte) 16), new ew3(tw3Var, (byte) 4), new ew3(tw3Var, (byte) 5), new ew3(tw3Var, (byte) 6), new ew3(tw3Var, (byte) 7), new dw3(operaApplication13, (byte) 17), new dw3(operaApplication13, (byte) 12), new dw3(operaApplication13, (byte) 13), new ew3(tw3Var, b14), tw3Var.a.m(), tw3Var.x, new dw3(operaApplication13, (byte) 14), r05.y.a.r());
            case 21:
                String[] strArr19 = OperaApplication.K;
                OperaApplication operaApplication14 = (OperaApplication) tw3Var.b.getApplication();
                return new tr8(tw3Var.c, ((FavoriteRemovedSuggestionsDatabase) xih.f(operaApplication14.getApplicationContext(), FavoriteRemovedSuggestionsDatabase.class, "add_favorite_removed_suggestions.db").b()).x(), (h) operaApplication14.g(), operaApplication14.G());
            case SizeUtil.textSize1 /* 22 */:
                z0b z0bVarP = h1b.p();
                z0bVarP.c(tw3Var.A.get());
                z0bVarP.c(tw3Var.N.get());
                z0bVarP.c(tw3Var.T.get());
                z0bVarP.c(tw3Var.j0.get());
                z0bVarP.c(tw3Var.Y.get());
                z0bVarP.c(tw3Var.B.get());
                z0bVarP.c(tw3Var.W.get());
                hx3 hx3Var3 = tw3Var.a;
                z0bVarP.c(hx3Var3.k.get());
                z0bVarP.c(((mi) hx3Var3.a.b).x.get());
                z0bVarP.c(tw3Var.l.get());
                z0bVarP.c(tw3Var.v.get());
                z0bVarP.c(tw3Var.t.get());
                z0bVarP.c(tw3Var.w.get());
                z0bVarP.c(tw3Var.n.get());
                z0bVarP.c(tw3Var.C.get());
                z0bVarP.c(tw3Var.G.get());
                z0bVarP.c(tw3Var.H.get());
                z0bVarP.c(tw3Var.J.get());
                z0bVarP.c(tw3Var.P.get());
                z0bVarP.c(tw3Var.h0.get());
                z0bVarP.c(tw3Var.B0.get());
                return z0bVarP.g();
            case 23:
                return new ul9((h1b) tw3Var.y.get(), (byte) 1);
            case SizeUtil.textSize2 /* 24 */:
                return new lm3(tw3Var.b.P0(), new gw3(tw3Var, (byte) 0));
            case 25:
                fp1 fp1Var5 = tw3Var.b;
                String[] strArr20 = OperaApplication.K;
                return new m0a(fp1Var5, (h0a) ((OperaApplication) fp1Var5.getApplication()).x.get(), new tah(new cw3(tw3Var, (byte) 4), tw3Var.c, (q32) tw3Var.m0.get(), (x12) tw3Var.n0.get(), (ny1) tw3Var.o0.get(), (qy1) tw3Var.p0.get(), new f0a(new cw3(tw3Var, (byte) 5))), (iv7) tw3Var.a.l.get());
            case 26:
                String[] strArr21 = OperaApplication.K;
                fp1 fp1Var6 = tw3Var.b;
                OperaApplication operaApplication15 = (OperaApplication) fp1Var6.getApplication();
                v1a v1aVar = (v1a) operaApplication15.y.get();
                j4c j4cVar3 = operaApplication15.G;
                z8b z8bVar = new z8b();
                z8bVar.a = v1aVar;
                z8bVar.b = j4cVar3;
                na2.B(cqp.V(fp1Var6.getLifecycle()), (CoroutineContext) null, (rx5) null, new fg6(fp1Var6, z8bVar, null, b11), 3);
                return z8bVar;
            case 27:
                return new lm3(new ew3(tw3Var, (byte) 8));
            case 28:
                String[] strArr22 = OperaApplication.K;
                ?? r06 = tw3Var.b;
                OperaApplication operaApplication16 = (OperaApplication) r06.getApplication();
                return new xg7(r06, new dw3(operaApplication16, b9), operaApplication16.w(), new dw3(operaApplication16, b8), new uu1(b7), new dw3(operaApplication16, b6), new ew3(tw3Var, b13), new ew3(tw3Var, b5), (wyn) operaApplication16.r.m1.get(), vml.d, new dw3(operaApplication16, b4), new dw3(operaApplication16, b3), new dw3(operaApplication16, b12), new dw3(operaApplication16, b2), new dw3(operaApplication16, b11));
            default:
                String[] strArr23 = OperaApplication.K;
                ?? r07 = tw3Var.b;
                OperaApplication operaApplication17 = (OperaApplication) r07.getApplication();
                ipk ipkVarL0 = r07.L0();
                SettingsManager settingsManagerJ3 = operaApplication17.J();
                xbf xbfVar = ipkVarL0.k;
                return new wcd(settingsManagerJ3, (ode) xbfVar.e, (ode) xbfVar.f, new ew3(tw3Var, b10));
        }
    }

    @Override // com.opera.android.Lazy
    public final void g(Object obj) {
        switch (this.e) {
            case 15:
                vml.e(new bi2(this.f, (bk5) obj, (byte) 20));
                break;
        }
    }
}
