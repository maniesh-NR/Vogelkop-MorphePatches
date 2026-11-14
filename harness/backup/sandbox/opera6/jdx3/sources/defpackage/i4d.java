package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.print.PageRange;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.f;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.leanplum.core.BuildConfig;
import com.opera.android.OperaApplication;
import com.opera.android.media.PlayerService;
import com.opera.android.oauth2.OAuth2Account;
import com.opera.android.oauth2.OperaAccessToken;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.api.Callback;
import java.util.Arrays;
import java.util.Objects;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public class i4d implements loo, hsd, ebf, ahf, cn, hpf, dkg, htd, b5n, y7, pji, tif, vlf {
    public final /* synthetic */ byte a;
    public Object b;

    public i4d() {
        this.a = (byte) 1;
        this.b = d77.a(ExtraCroppingQuirk.class);
    }

    public i4d(NestedScrollView nestedScrollView) {
        this.a = (byte) 23;
        if (Build.VERSION.SDK_INT >= 35) {
            this.b = new ooi(nestedScrollView);
        } else {
            this.b = new hr5();
        }
    }

    public i4d(RecyclerView recyclerView, View view, xbf xbfVar) {
        this.a = (byte) 3;
        nvk nvkVar = new nvk(recyclerView.getContext(), new s6h(this, new kvk(2130970914, 2132020895, 2130970915)));
        flb flbVar = new flb(nvkVar);
        flbVar.e(recyclerView);
        zld zldVar = new zld(recyclerView, xbfVar, new z0c(nvkVar, flbVar, (byte) 14));
        this.b = zldVar;
        recyclerView.getContext();
        recyclerView.C0(new LinearLayoutManager());
        recyclerView.y0(zldVar);
        e eVar = recyclerView.M;
        eVar.e = eVar.c;
        zldVar.G();
        new amd(this, view);
    }

    public i4d(OAuth2Account oAuth2Account, za zaVar) {
        this.a = (byte) 10;
        this.b = zaVar;
        Objects.requireNonNull(oAuth2Account);
    }

    public /* synthetic */ i4d(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public i4d(jpo jpoVar) {
        this.a = (byte) 25;
        this.b = c26.k(f4j.a);
    }

    public i4d(Function1 function1) {
        this.a = (byte) 26;
        Intent intent = new Intent("android.intent.action.SEND");
        function1.invoke(intent);
        this((Object) intent, (byte) 26);
    }

    public i4d(qrh qrhVar, hvc hvcVar) {
        this.a = (byte) 21;
        this.b = hvcVar;
    }

    public static int C(qfb qfbVar, int i, int i2, byte[] bArr, int i3) {
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            int i6 = i5 + 3;
            if (i6 > i3) {
                break;
            }
            short s = (short) (bArr[i5] & 255);
            short s2 = (short) (bArr[i5 + 1] & 255);
            short s3 = (short) ((s | (s2 << 8)) & 4095);
            short s4 = (short) (((s2 >> 4) | (((short) (bArr[i5 + 2] & 255)) << 4)) & 4095);
            if (s3 < 3329) {
                ((short[]) qfbVar.b)[i + i4] = s3;
                i4++;
            }
            if (i4 < i2 && s4 < 3329) {
                ((short[]) qfbVar.b)[i + i4] = s4;
                i4++;
            }
            i5 = i6;
        }
        return i4;
    }

    public final int A(View view) {
        return ((f) this.b).getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(nt5 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof g4j
            if (r0 == 0) goto L13
            r0 = r5
            g4j r0 = (g4j) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            g4j r0 = new g4j
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.t
            px5 r1 = px5.a
            int r0 = r0.v
            r1 = 0
            if (r0 == 0) goto L3f
            r2 = 1
            if (r0 != r2) goto L39
            ybh.y(r5)
            java.lang.Object r4 = r4.b
            ef2 r4 = (ef2) r4
            f4j r5 = f4j.a
            f4j r0 = f4j.b
            boolean r4 = r4.a(r5, r0)
            if (r4 == 0) goto L38
            kotlin.Unit r4 = kotlin.Unit.a
            return r4
        L38:
            throw r1
        L39:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r4)
            return r1
        L3f:
            ybh.y(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i4d.B(nt5):java.lang.Object");
    }

    public final void D() {
        if (((ef2) this.b).b(f4j.c) == f4j.b) {
            throw null;
        }
    }

    @Override // defpackage.hpf
    public final void I(fpf fpfVar) {
        ((kcg) this.b).a(fpfVar);
    }

    @Override // defpackage.pji
    public final void T() {
        ((gii) this.b).e();
    }

    @Override // defpackage.ahf
    public final void V(OperaAccessToken operaAccessToken) {
        new i42(this, operaAccessToken, (za) this.b).k();
    }

    @Override // defpackage.loo
    public final void a() {
        ((cie) this.b).b.I();
    }

    @Override // defpackage.ahf
    public final void b() {
        switch (this.a) {
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((za) this.b).run(null);
                break;
            default:
                wjh wjhVar = (wjh) ((n1) this.b).b;
                wjhVar.t(((Activity) wjhVar.b).getString(2132021775));
                break;
        }
    }

    public final int d(View view) {
        return ((f) this.b).getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin;
    }

    @Override // defpackage.hsd
    public final void e(cie cieVar) {
        jsd jsdVar = (jsd) this.b;
        t8p t8pVar = new t8p(jsdVar.getContext());
        jsdVar.a(t8pVar);
        jsdVar.a.put(cieVar, t8pVar);
        cieVar.w0 = t8pVar;
        jsd.c(t8pVar, cieVar);
        t8pVar.z = cieVar.u;
        t8pVar.v(t8pVar.u);
        t8pVar.x.c = t8pVar.o;
        t8pVar.B = cieVar.z0;
        t8pVar.y = cieVar.o;
        t8pVar.y();
        t8pVar.x(false);
    }

    @Override // defpackage.pji
    public final void f(PageRange[] pageRangeArr) {
        gii giiVar = (gii) this.b;
        dd7 dd7VarF = giiVar.f();
        umi umiVar = giiVar.b;
        nml nmlVarE = umiVar.e(new fii(giiVar, (byte) 2));
        nmlVarE.b(umiVar.f(new fii(giiVar, (byte) 3)));
        nmlVarE.a(dd7VarF);
        xvg.l(giiVar.l);
        giiVar.d.b();
    }

    public final void g(cm cmVar) {
        switch (this.a) {
            case 11:
                opf opfVar = (opf) ((p8f) this.b).c;
                opfVar.a("loadAd: onAdFailedToLoad, error=" + cmVar);
                opfVar.a.onFailure(rm5.q(cmVar.b, cmVar.c));
                break;
            default:
                qpf qpfVar = (qpf) ((p8f) this.b).c;
                qpfVar.b("loadAd: onAdFailedToLoad, error=" + cmVar);
                qpfVar.b.onFailure(rm5.q(cmVar.b, cmVar.c));
                break;
        }
    }

    @Override // defpackage.hpf
    public final void h(cpf cpfVar) {
        ((kcg) this.b).a(cpfVar);
    }

    public final int i() {
        return ((f) this.b).getPaddingTop();
    }

    @Override // defpackage.ebf
    public final void j(ViewStub viewStub, abf abfVar) {
        Objects.requireNonNull(abfVar);
        bbf bbfVar = new bbf(abfVar);
        gbf gbfVar = (gbf) this.b;
        new igi(viewStub, bbfVar, gbfVar.c, gbfVar.f);
    }

    public final PendingIntent k(gk9 gk9Var) {
        PlayerService playerService = (PlayerService) this.b;
        Intent intentB = mdb.b(playerService);
        intentB.setAction("com.opera.android.action.SHOW_MEDIA_PLAYER_FROM_NOTIFICATION");
        return PendingIntent.getActivity(playerService, 0, intentB, 67108864);
    }

    @Override // defpackage.y7
    public final void l() {
        ((hvc) this.b).run();
    }

    public final int m() {
        f fVar = (f) this.b;
        return fVar.getHeight() - fVar.getPaddingBottom();
    }

    @Override // defpackage.hpf
    public final void n(epf epfVar) {
        ((kcg) this.b).a(epfVar);
    }

    public final CharSequence o(gk9 gk9Var) {
        qjd qjdVarG = ((gig) ((ode) ((PlayerService) this.b).a.c).g()).g();
        return aik.c((qjdVarG != null ? qjdVarG.e : vjd.K).f);
    }

    @Override // defpackage.loo
    public final void onAdClicked() {
        ((cie) this.b).b.onAdClicked();
    }

    public final void onAdLoaded(Object obj) {
        switch (this.a) {
            case 11:
                opf opfVar = (opf) ((p8f) this.b).c;
                opfVar.a("loadAd: onAdLoaded");
                opfVar.d = (dhb) obj;
                opfVar.c = (MediationInterstitialAdCallback) opfVar.a.onSuccess(opfVar);
                break;
            default:
                qpf qpfVar = (qpf) ((p8f) this.b).c;
                qpfVar.b("loadAd: onAdLoaded");
                qpfVar.e = (l2i) obj;
                qpfVar.d = (MediationRewardedAdCallback) qpfVar.b.onSuccess(qpfVar);
                break;
        }
    }

    public final CharSequence q(gk9 gk9Var) {
        qjd qjdVarG = ((gig) ((ode) ((PlayerService) this.b).a.c).g()).g();
        return aik.c((qjdVarG != null ? qjdVarG.e : vjd.K).a);
    }

    @Override // defpackage.hpf
    public final void r(gpf gpfVar) {
        ((kcg) this.b).a(gpfVar);
    }

    public final void s(itd itdVar) {
    }

    public final Bitmap t(gk9 gk9Var) {
        PlayerService playerService = (PlayerService) this.b;
        qjd qjdVarG = ((gig) ((ode) playerService.a.c).g()).g();
        if (qjdVarG != null) {
            return (Bitmap) ((tjg) playerService.a.b).k.d.get(qjdVarG.a);
        }
        return null;
    }

    @Override // defpackage.vlf
    public final void u(OperaListItem operaListItem, boolean z) {
        ((wzj) this.b).b.V(z ? 1 : 0, "speed_dial.plus_button");
    }

    public final void v(tvh tvhVar) {
        wjh wjhVar = (wjh) ((n1) this.b).b;
        db dbVar = (db) wjhVar.f;
        dbVar.f = null;
        dbVar.g = (String) wjhVar.d;
        ((Callback) wjhVar.e).run(tvhVar);
    }

    public final View w(int i) {
        return ((f) this.b).getChildAt(i);
    }

    public final boolean x(itd itdVar, MenuItem menuItem) {
        txi txiVar = (txi) ((x79) this.b).e;
        if (txiVar == null) {
            return false;
        }
        txiVar.onMenuItemClick(menuItem);
        return true;
    }

    public final void y(vi2 vi2Var) {
        wjh wjhVar = (wjh) ((n1) this.b).b;
        boolean z = vi2Var.b;
        String str = (String) vi2Var.g;
        String str2 = vi2Var.a;
        if (!z) {
            if (vi2Var.c != -1) {
                if (TextUtils.isEmpty(str)) {
                    wjhVar.t(null);
                    return;
                } else {
                    wjhVar.t(str);
                    return;
                }
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            Activity activity = (Activity) wjhVar.b;
            String[] strArr = OperaApplication.K;
            jpo.Q(((OperaApplication) activity.getApplication()).b(), vi2Var);
            return;
        }
        db dbVar = (db) wjhVar.f;
        dbVar.f = null;
        h7f h7fVar = dbVar.e;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((cb) g7fVarH.next()).getClass();
        }
        Activity activity2 = (Activity) wjhVar.b;
        String str3 = (String) vi2Var.f;
        String str4 = (String) vi2Var.d;
        String[] strArr2 = OperaApplication.K;
        pj2 pj2Var = new pj2(((OperaApplication) activity2.getApplicationContext()).b());
        Bundle bundle = new Bundle();
        bundle.putString("3", "google");
        bundle.putString(BuildConfig.BUILD_NUMBER, str2);
        bundle.putCharSequence("1", str3);
        bundle.putCharSequence("2", str4);
        pj2Var.setArguments(bundle);
        new zhj(new wzg(pj2Var, pj2.class, (byte) 4), null, 2, -1, "confirm", false, Arrays.asList(new n6h[0])).c(activity2);
    }

    @Override // defpackage.y7
    public final void z(String str, boolean z) {
    }
}
