package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.net.Uri;
import com.leanplum.ActionContext;
import com.leanplum.internal.RequestBuilder;
import com.leanplum.messagetemplates.OperaRateSheet;
import com.opera.android.BrowserActivity;
import com.opera.android.oauth2.OperaAccessToken;
import com.opera.api.Callback;
import java.util.Collections;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final /* synthetic */ class qe9 implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ qe9(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        xx1 xx1Var;
        byte b = this.a;
        byte b2 = 0;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (b) {
            case 0:
                bf9 bf9Var = (bf9) obj7;
                pc9 pc9Var = (pc9) obj6;
                lyf lyfVar = (lyf) obj5;
                lyf lyfVar2 = (lyf) obj4;
                w59 w59Var = (w59) obj3;
                Callback callback = (Callback) obj2;
                Long l = (Long) obj;
                if (pc9Var != null) {
                    fvd fvdVar = new fvd(l.longValue(), System.currentTimeMillis(), bf9Var.a.u(), (String) lyfVar.a, (String) lyfVar2.a, w59Var.c, (String) lyfVar.b, (String) lyfVar2.b, w59Var.d);
                    qie qieVar = pc9Var.g;
                    umi umiVar = pc9Var.b;
                    nml nmlVarB = umiVar.b(new ow3(pc9Var, fvdVar, (byte) 2));
                    nmlVarB.b(umiVar.f(new dc9(pc9Var, (byte) 1)));
                    qieVar.n(new oml(nmlVarB), null);
                }
                if (callback != null) {
                    callback.run(l);
                    break;
                }
                break;
            case 1:
                OperaRateSheet.initiateRateSheet$lambda$0((Activity) obj7, (ActionContext) obj6, (qjh) obj5, (mcj) obj4, (orm) obj3, (skm) obj2, (tw7) obj);
                break;
            case 2:
                olh olhVar = (olh) obj7;
                d7l d7lVar = (d7l) obj6;
                BrowserActivity browserActivity = (BrowserActivity) obj5;
                String str = (String) obj4;
                String str2 = (String) obj3;
                xx1 xx1Var2 = (xx1) obj2;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    xx1Var = xx1Var2;
                    if (d7lVar.j.x(uri, new qe9(olhVar, browserActivity, str, str2, uri, xx1Var2, (byte) 3))) {
                    }
                } else {
                    xx1Var = xx1Var2;
                }
                xx1Var.run(-1L);
                break;
            case 3:
                olh olhVar2 = (olh) obj7;
                fp1 fp1Var = (BrowserActivity) obj6;
                String str3 = (String) obj5;
                String str4 = (String) obj4;
                Uri uri2 = (Uri) obj3;
                xx1 xx1Var3 = (xx1) obj2;
                Long l2 = (Long) obj;
                if (l2 != null) {
                    olhVar2.a.d(uri2.toString(), str4, str3, l2.longValue(), xx1Var3);
                    if ("file".equals(uri2.getScheme())) {
                        lg7.a(fp1Var, uri2);
                        break;
                    }
                } else {
                    xx1Var3.run(-1L);
                    break;
                }
                break;
            case 4:
                slk slkVar = (slk) obj7;
                final String str5 = (String) obj6;
                final String str6 = (String) obj5;
                final String str7 = (String) obj4;
                final String str8 = (String) obj3;
                final h1b h1bVar = (h1b) obj2;
                h0d h0dVar = (h0d) obj;
                final tmk tmkVar = slkVar.b;
                final zzh zzhVar = new zzh(slkVar, (byte) 9);
                if (!w1h.o((SharedPreferences) ((b59) tmkVar.a.a).get(), "acked_tokens", Collections.EMPTY_SET).contains(str5)) {
                    if (!tmkVar.i.add(str5)) {
                        zzhVar.run(null);
                        break;
                    } else {
                        tmkVar.l();
                        h0d h0dVar2 = h0d.c;
                        xbf xbfVar = tmkVar.c;
                        if (h0dVar != h0dVar2) {
                            final byte b3 = 1;
                            xbfVar.z(new Callback() { // from class: kmk
                                /* JADX WARN: Type inference failed for: r11v1, types: [lmk] */
                                /* JADX WARN: Type inference failed for: r12v0, types: [lmk] */
                                @Override // com.opera.api.Callback
                                public final void run(Object obj8) {
                                    byte b4 = b3;
                                    final zzh zzhVar2 = zzhVar;
                                    final tmk tmkVar2 = tmkVar;
                                    switch (b4) {
                                        case 0:
                                            String str9 = (String) obj8;
                                            if (str9 != null) {
                                                shf shfVar = tmkVar2.b;
                                                enk enkVar = enk.a;
                                                final byte b5 = 0;
                                                ((wth) shfVar.a).w(new ue9(str9, str5, str6, str7, str8, h1bVar, shfVar, (lmk) new Callback() { // from class: lmk
                                                    @Override // com.opera.api.Callback
                                                    public final void run(Object obj9) {
                                                        byte b6 = b5;
                                                        zzh zzhVar3 = zzhVar2;
                                                        tmk tmkVar3 = tmkVar2;
                                                        prh prhVar = (prh) obj9;
                                                        switch (b6) {
                                                            case 0:
                                                                tmkVar3.d(prhVar, zzhVar3);
                                                                break;
                                                            default:
                                                                tmkVar3.d(prhVar, zzhVar3);
                                                                break;
                                                        }
                                                    }
                                                }));
                                                break;
                                            }
                                            break;
                                        default:
                                            String str10 = (String) obj8;
                                            if (str10 != null) {
                                                shf shfVar2 = tmkVar2.b;
                                                enk enkVar2 = enk.a;
                                                final byte b6 = 1;
                                                ((wth) shfVar2.a).w(new ue9(str10, str5, str6, str7, str8, h1bVar, shfVar2, new Callback() { // from class: lmk
                                                    @Override // com.opera.api.Callback
                                                    public final void run(Object obj9) {
                                                        byte b62 = b6;
                                                        zzh zzhVar3 = zzhVar2;
                                                        tmk tmkVar3 = tmkVar2;
                                                        prh prhVar = (prh) obj9;
                                                        switch (b62) {
                                                            case 0:
                                                                tmkVar3.d(prhVar, zzhVar3);
                                                                break;
                                                            default:
                                                                tmkVar3.d(prhVar, zzhVar3);
                                                                break;
                                                        }
                                                    }
                                                }, (byte) 0));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        } else {
                            final byte b4 = 0;
                            xbfVar.A(new Callback() { // from class: kmk
                                /* JADX WARN: Type inference failed for: r11v1, types: [lmk] */
                                /* JADX WARN: Type inference failed for: r12v0, types: [lmk] */
                                @Override // com.opera.api.Callback
                                public final void run(Object obj8) {
                                    byte b42 = b4;
                                    final zzh zzhVar2 = zzhVar;
                                    final tmk tmkVar2 = tmkVar;
                                    switch (b42) {
                                        case 0:
                                            String str9 = (String) obj8;
                                            if (str9 != null) {
                                                shf shfVar = tmkVar2.b;
                                                enk enkVar = enk.a;
                                                final byte b5 = 0;
                                                ((wth) shfVar.a).w(new ue9(str9, str5, str6, str7, str8, h1bVar, shfVar, (lmk) new Callback() { // from class: lmk
                                                    @Override // com.opera.api.Callback
                                                    public final void run(Object obj9) {
                                                        byte b62 = b5;
                                                        zzh zzhVar3 = zzhVar2;
                                                        tmk tmkVar3 = tmkVar2;
                                                        prh prhVar = (prh) obj9;
                                                        switch (b62) {
                                                            case 0:
                                                                tmkVar3.d(prhVar, zzhVar3);
                                                                break;
                                                            default:
                                                                tmkVar3.d(prhVar, zzhVar3);
                                                                break;
                                                        }
                                                    }
                                                }));
                                                break;
                                            }
                                            break;
                                        default:
                                            String str10 = (String) obj8;
                                            if (str10 != null) {
                                                shf shfVar2 = tmkVar2.b;
                                                enk enkVar2 = enk.a;
                                                final byte b6 = 1;
                                                ((wth) shfVar2.a).w(new ue9(str10, str5, str6, str7, str8, h1bVar, shfVar2, new Callback() { // from class: lmk
                                                    @Override // com.opera.api.Callback
                                                    public final void run(Object obj9) {
                                                        byte b62 = b6;
                                                        zzh zzhVar3 = zzhVar2;
                                                        tmk tmkVar3 = tmkVar2;
                                                        prh prhVar = (prh) obj9;
                                                        switch (b62) {
                                                            case 0:
                                                                tmkVar3.d(prhVar, zzhVar3);
                                                                break;
                                                            default:
                                                                tmkVar3.d(prhVar, zzhVar3);
                                                                break;
                                                        }
                                                    }
                                                }, (byte) 0));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        }
                    }
                } else {
                    zzhVar.run(null);
                    break;
                }
            case 5:
                String str9 = (String) obj7;
                String str10 = (String) obj6;
                String str11 = (String) obj5;
                String str12 = (String) obj4;
                shf shfVar = (shf) obj3;
                ny9 ny9Var = (ny9) obj2;
                fvh fvhVar = new fvh();
                String string = ((Uri) obj).toString();
                rma rmaVar = new rma((byte) 4);
                rmaVar.o(string, null);
                hra hraVarI = rmaVar.d().i("api/v1/free_trial/ofa/user/start/premium_beta/");
                if (hraVarI == null) {
                    qp2.o("Required value was null.");
                    break;
                } else {
                    fvhVar.a = hraVarI;
                    fvhVar.d("Authorization", "Bearer ".concat(str9));
                    orb orbVar = new orb();
                    orbVar.p(str10, "device_id");
                    orbVar.p(str11, "campaign");
                    orbVar.p(str12, "token");
                    orbVar.p("com.opera.browser.beta", "package_name");
                    qvh qvhVar = rvh.Companion;
                    String string2 = orbVar.a.toString();
                    Regex regex = esd.e;
                    esd esdVarX = wyh.x("application/json");
                    qvhVar.getClass();
                    fvhVar.e(RequestBuilder.POST, qvh.b(string2, esdVarX));
                    ((t9f) ((ii) shfVar.c).get()).c(new kvh(fvhVar)).enqueue(new isd((Object) new b94((umi) shfVar.b, ny9Var, (byte) 0), (byte) 28));
                    break;
                }
            default:
                myk mykVar = (myk) obj7;
                mgh mghVar = (mgh) obj6;
                ab abVar = (ab) obj5;
                orb orbVar2 = (orb) obj4;
                fi2 fi2Var = (fi2) obj3;
                fi2 fi2Var2 = (fi2) obj2;
                OperaAccessToken operaAccessToken = (OperaAccessToken) obj;
                if (((Callback) mghVar.c) != null) {
                    if (operaAccessToken != null) {
                        di2 di2Var = mykVar.e;
                        iyk iykVar = new iyk(fi2Var2, abVar, b2);
                        di2Var.getClass();
                        mghVar.b = new xf1(di2Var, iykVar, operaAccessToken, orbVar2, fi2Var);
                        break;
                    } else {
                        abVar.run("Not signed in");
                        break;
                    }
                }
                break;
        }
    }
}
