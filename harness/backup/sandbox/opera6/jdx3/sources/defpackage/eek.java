package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.textclassifier.TextClassification;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.leanplum.utils.SizeUtil;
import com.opera.android.tabui2.siteimages.ImageUrlRepDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final /* synthetic */ class eek implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eek(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ eek(sjl sjlVar, rf1 rf1Var, tb1 tb1Var) {
        this.a = (byte) 16;
        this.b = rf1Var;
        this.c = tb1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke() {
        long j;
        ojl ojlVarD;
        gbc gbcVar;
        sf1 sf1Var;
        z8k z8kVar;
        int iK;
        byte b = 27;
        byte b2 = 4;
        byte b3 = 3;
        final byte b4 = 1;
        Object[] objArr = 0;
        byte b5 = 2;
        switch (this.a) {
            case 0:
                jek jekVar = (jek) this.b;
                v1e v1eVar = (v1e) this.c;
                jekVar.getClass();
                return new z99(new xd6(new k54(jekVar, v1eVar, (mt5) null, (byte) 8), (byte) 11), new agb(b, pair, jekVar), (byte) 2);
            case 1:
                hfk hfkVar = (hfk) this.b;
                mfk mfkVar = (mfk) ((afe) this.c).getValue();
                hfkVar.b(mfkVar != null ? mfkVar.a : null);
                return Unit.a;
            case 2:
                hfk hfkVar2 = (hfk) this.b;
                Function0 function0 = (Function0) this.c;
                hfkVar2.getClass();
                function0.invoke();
                return Unit.a;
            case 3:
                mrk mrkVar = (mrk) this.b;
                gjm gjmVar = (gjm) this.c;
                fbf fbfVar = mrkVar.c;
                fbfVar.a.t.y().h();
                fbfVar.a.m.p = true;
                gjmVar.c(new tca(sca.b), mrkVar.u, new t7d(new zqk(mrkVar, b3), (byte) 23));
                return Unit.a;
            case 4:
                mrk mrkVar2 = (mrk) this.b;
                return new oqk(mrkVar2.l, new brk(mrkVar2, b5), (dbf) this.c);
            case 5:
                dtk dtkVar = (dtk) this.b;
                List list = (List) this.c;
                an2 an2Var = jgk.a;
                return Boolean.valueOf(jgk.a(dtkVar.a, list));
            case 6:
                qwk qwkVar = (qwk) this.b;
                tsd tsdVar = (tsd) this.c;
                ViewGroup viewGroup = qwkVar.g;
                View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131559358, viewGroup, false);
                if (viewInflate != null) {
                    return new uwk(kf.b((FrameLayout) viewInflate), qwkVar.h, tsdVar);
                }
                t3p.q("rootView");
                return null;
            case 7:
                g4l g4lVar = (g4l) this.b;
                uz3 uz3Var = (uz3) this.c;
                if (!g4lVar.j.isEmpty()) {
                    g4lVar.g.h(uz3Var);
                }
                return Unit.a;
            case 8:
                Context context = (Context) this.b;
                a5l a5lVar = (a5l) this.c;
                u5i u5iVarF = xih.f(context, ImageUrlRepDatabase.class, "tab_image_urls");
                u5iVarF.d.add(new t5i(a5lVar, b4));
                return (ImageUrlRepDatabase) u5iVarF.b();
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                final eme emeVar = (eme) this.b;
                final r9l r9lVar = (r9l) this.c;
                final Object[] objArr2 = objArr == true ? 1 : 0;
                return new vvb(new uvb[]{new uvb(2131363290, 2, 48, new tvb() { // from class: h9l
                    @Override // defpackage.tvb
                    public final void run() {
                        byte b6 = objArr2;
                        r9l r9lVar2 = r9lVar;
                        eme emeVar2 = emeVar;
                        switch (b6) {
                            case 0:
                                emeVar2.j0(r9lVar2.t.e, null);
                                r9lVar2.j();
                                break;
                            default:
                                emeVar2.j0(p6l.b, null);
                                r9lVar2.j();
                                break;
                        }
                    }
                }), new uvb(2131363291, 6, 42, new tvb() { // from class: h9l
                    @Override // defpackage.tvb
                    public final void run() {
                        byte b6 = b4;
                        r9l r9lVar2 = r9lVar;
                        eme emeVar2 = emeVar;
                        switch (b6) {
                            case 0:
                                emeVar2.j0(r9lVar2.t.e, null);
                                r9lVar2.j();
                                break;
                            default:
                                emeVar2.j0(p6l.b, null);
                                r9lVar2.j();
                                break;
                        }
                    }
                })});
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                xf8.F0(((r9l) this.b).y, (b3c) this.c);
                return Unit.a;
            case 11:
                ((v9l) this.b).a((p6l) this.c);
                return Unit.a;
            case 12:
                ((a21) this.b).L((Long) this.c);
                return Unit.a;
            case 13:
                Context context2 = (Context) this.b;
                TextClassification textClassification = (TextClassification) this.c;
                String text = textClassification.getText();
                PendingIntent activity = PendingIntent.getActivity(context2, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                if (Build.VERSION.SDK_INT >= 34) {
                    g8.K(activity);
                } else {
                    activity.send();
                }
                return Unit.a;
            case 14:
                na2.B((nx5) this.b, (CoroutineContext) null, rx5.d, new wc2((Function1) this.c, (mt5) null, (byte) 2), 1);
                return Unit.a;
            case 15:
                dil dilVar = (dil) this.b;
                long j2 = ((gcb) ((afe) this.c).getValue()).a;
                y8f y8fVarG = dilVar.g();
                long jFloatToRawIntBits = 9205357640488583168L;
                if (y8fVarG != null) {
                    long j3 = y8fVarG.a;
                    sf1 sf1VarK = dilVar.k();
                    if (sf1VarK != null && sf1VarK.b.length() != 0) {
                        x6a x6aVar = (x6a) dilVar.q.getValue();
                        int i = x6aVar == null ? -1 : fil.a[x6aVar.ordinal()];
                        if (i != -1) {
                            if (i == 1 || i == 2) {
                                long j4 = dilVar.l().b;
                                int i2 = xjl.c;
                                j = j4 >> 32;
                            } else {
                                if (i != 3) {
                                    h9o.p();
                                    return null;
                                }
                                long j5 = dilVar.l().b;
                                int i3 = xjl.c;
                                j = j5 & 4294967295L;
                            }
                            int i4 = (int) j;
                            gbc gbcVar2 = dilVar.d;
                            if (gbcVar2 != null && (ojlVarD = gbcVar2.d()) != null && (gbcVar = dilVar.d) != null && (sf1Var = (sf1) gbcVar.a.b) != null) {
                                int iC = djh.c(dilVar.b.i(i4), 0, sf1Var.b.length());
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (ojlVarD.d(j3) >> 32));
                                njl njlVar = ojlVarD.a;
                                xbe xbeVar = njlVar.b;
                                int iD = xbeVar.d(iC);
                                float fE = njlVar.e(iD);
                                float f = njlVar.f(iD);
                                float fB = djh.b(fIntBitsToFloat, Math.min(fE, f), Math.max(fE, f));
                                if (gcb.a(j2, 0L) || Math.abs(fIntBitsToFloat - fB) <= ((int) (j2 >> 32)) / 2) {
                                    float f2 = xbeVar.f(iD);
                                    jFloatToRawIntBits = (Float.floatToRawIntBits(fB) << 32) | (Float.floatToRawIntBits(((xbeVar.b(iD) - f2) / 2.0f) + f2) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new y8f(jFloatToRawIntBits);
            case 16:
                rf1 rf1Var = (rf1) this.b;
                tb1 tb1Var = (tb1) this.c;
                ofc ofcVar = (pfc) rf1Var.a;
                if (ofcVar instanceof ofc) {
                    tfc tfcVar = ofcVar.c;
                    if (tfcVar != null) {
                        tfcVar.a();
                    } else {
                        try {
                            tb1Var.a(ofcVar.a);
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                } else if ((ofcVar instanceof nfc) && (z8kVar = ((nfc) ofcVar).c) != null) {
                    z8kVar.a();
                }
                return Unit.a;
            case 17:
                mhk mhkVar = (mhk) this.b;
                ve4 ve4Var = (ve4) this.c;
                Executor executor = ((oe4) mhkVar.c).a;
                if (executor != null) {
                    return executor;
                }
                ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1, new kb1(-3, new lb1(mb1.b, "CXCP-Camera-E", c26.j(0))));
                ve4Var.a(te4.c, new cbl(executorServiceNewFixedThreadPool, (byte) 8));
                return executorServiceNewFixedThreadPool;
            case SizeUtil.textSize0_1 /* 18 */:
                return ((umi) ((tcl) ((plk) this.b).a)).f(new o62((Function1) this.c, b5));
            case 19:
                rlm rlmVar = (rlm) this.b;
                String str = (String) this.c;
                rlmVar.g = true;
                pde pdeVar = rlmVar.c;
                pdeVar.r(rlmVar.f(((nlm) pdeVar.g()).b, ((nlm) pdeVar.g()).c));
                w6j w6jVar = rlmVar.b;
                elm elmVar = new elm(str, rlmVar.d, rlmVar.e);
                p7l p7lVar = new p7l(rlmVar, (byte) 27);
                umi umiVar = (umi) w6jVar.b;
                Unit unit = Unit.a;
                byte b6 = 15;
                nml nmlVarG = umiVar.g(new o62(new gil(w6jVar, elmVar, b6), b2));
                new plk(umiVar, nmlVarG, new eyi(unit, nmlVarG), pair).t(new qfl(p7lVar, b6)).l();
                return unit;
            case SizeUtil.textSize0 /* 20 */:
                ArrayList arrayList = (ArrayList) this.b;
                gpm gpmVar = (gpm) this.c;
                String str2 = gpmVar.g;
                if (arrayList.isEmpty() || (iK = StringsKt.K(str2, '/', gpmVar.i.a.length() + 3, 4)) == -1) {
                    return "";
                }
                int iM = StringsKt.M(str2, new char[]{'?', '#'}, iK);
                return iM == -1 ? str2.substring(iK) : str2.substring(iK, iM);
            case 21:
                ((d4) this.b).removeOnAttachStateChangeListener((s5n) this.c);
                return Unit.a;
            case SizeUtil.textSize1 /* 22 */:
                ((d4) this.b).removeOnAttachStateChangeListener((tu4) this.c);
                return Unit.a;
            case 23:
                ((tcc) this.b).b((h9) this.c);
                return Unit.a;
            case SizeUtil.textSize2 /* 24 */:
                qln qlnVar = (qln) this.b;
                String str3 = (String) this.c;
                ami amiVar = qlnVar.f;
                int iA = vep.A(am2.a(str3));
                return iA != 0 ? iA != 21 ? iA != 22 ? (List) qlnVar.c(((List) ((kze) amiVar.g).g()).stream().filter(new n0h(str3, (byte) 2))).collect(Collectors.toList()) : (List) ((kze) amiVar.h).g() : qlnVar.e() : (List) ((kze) ((s14) amiVar.d).f).g();
            case 25:
                myn mynVar = (myn) this.b;
                Bundle bundle = (Bundle) this.c;
                String str4 = (String) mynVar.d.getValue();
                String str5 = (String) mynVar.a.getValue();
                wc1 wc1Var = (wc1) mynVar.g.getValue();
                if (wc1Var != null) {
                    WebView webView = wc1Var.a;
                    pair = new Pair(Integer.valueOf(webView.getScrollX()), Integer.valueOf(webView.getScrollY()));
                }
                StringBuilder sbN = z1m.n("WebViewStateSaver Save: ", str4, ", ", str5, ", ");
                sbN.append(pair);
                sbN.append(", ");
                sbN.append(bundle);
                return sbN.toString();
            case 26:
                ((vij) ((rii) this.b).b).getClass();
                synchronized (vij.b) {
                }
                return Unit.a;
            case 27:
                h6o h6oVar = (h6o) this.b;
                tsd tsdVar2 = (tsd) this.c;
                ViewGroup viewGroup2 = h6oVar.k;
                View viewInflate2 = LayoutInflater.from(viewGroup2.getContext()).inflate(2131559574, viewGroup2, false);
                if (viewInflate2 != null) {
                    return new e6o(kf.b((FrameLayout) viewInflate2), h6oVar.l, tsdVar2, new lrk(1, h6oVar.j, w6o.class, "onCardItemFullyVisible", "onCardItemFullyVisible$app(Lcom/opera/android/startpage/livescore/worldcup/WorldCupPromoCardAspectItem;)V", 0, (byte) 25));
                }
                t3p.q("rootView");
                return null;
            case 28:
                ((h6o) this.b).j.d((pk4) this.c);
                return Unit.a;
            default:
                h6o h6oVar2 = (h6o) this.b;
                tsd tsdVar3 = (tsd) this.c;
                ViewGroup viewGroup3 = h6oVar2.k;
                View viewInflate3 = LayoutInflater.from(viewGroup3.getContext()).inflate(2131559577, viewGroup3, false);
                if (viewInflate3 != null) {
                    return new l6o(kf.b((FrameLayout) viewInflate3), h6oVar2.l, tsdVar3, 2131559578, k6o.a, new q0n((byte) 22), new lrk(1, h6oVar2.j, w6o.class, "onCardItemFullyVisible", "onCardItemFullyVisible$app(Lcom/opera/android/startpage/livescore/worldcup/WorldCupPromoCardAspectItem;)V", 0, (byte) 26));
                }
                t3p.q("rootView");
                return null;
        }
    }
}
