package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import android.webkit.URLUtil;
import com.opera.ads.internal.fullscreenad.AdActivity;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* loaded from: classes.dex */
public final class cko implements bpo {
    public final AdActivity a;
    public boolean b;
    public final ylp c;
    public lzo d;
    public dpo e;
    public int k;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public long f = -1;
    public long g = -1;
    public long h = -1;
    public long i = -1;
    public long j = -1;
    public long l = -1;
    public long m = -1;

    public cko(AdActivity adActivity, ylp ylpVar) {
        this.a = adActivity;
        this.c = ylpVar;
    }

    @Override // defpackage.bpo
    public final void a() {
        this.b = true;
    }

    @Override // defpackage.bpo
    public final void a(String str) {
        vm vmVarF = f();
        if (vmVarF != null) {
            ((woo) vmVarF).onAdClicked();
        }
        ylp ylpVar = this.c;
        new agm(this.a, ylpVar.b.b, null, (byte) 9).e(new h1p(ylpVar.o, ylpVar.p, str, (String) null), e());
    }

    @Override // defpackage.bpo
    public final void b() throws NoSuchAlgorithmException, InvalidKeyException {
        String str;
        vm vmVarF = f();
        if (vmVarF != null) {
            ylp ylpVar = this.c;
            sm smVar = ylpVar.b.b;
            smVar.getClass();
            if (smVar != sm.f && smVar != sm.g) {
                vmVarF = null;
            }
            if (vmVarF != null) {
                idf idfVar = vmVarF instanceof idf ? (idf) vmVarF : null;
                if (idfVar != null) {
                    eio eioVar = ylpVar.E;
                    idfVar.a(new a36());
                    String string = (eioVar == null || (str = eioVar.e) == null) ? null : StringsKt.l0(str).toString();
                    String str2 = eioVar != null ? eioVar.d : null;
                    ocp.d(ylpVar);
                    if (string == null || StringsKt.N(string) || str2 == null || StringsKt.N(str2) || !URLUtil.isNetworkUrl(string)) {
                        return;
                    }
                    Pair pair = new Pair("custom_data", (Object) null);
                    Pair pair2 = new Pair("event_id", (Object) null);
                    Pair pair3 = new Pair("publisher_user_id", (Object) null);
                    on7 on7Var = pn7.b;
                    Iterator it = rbd.c(new Pair[]{pair, pair2, pair3, new Pair("timestamp", String.valueOf(pn7.p(cs5.y0(System.currentTimeMillis(), un7.d), un7.e)))}).entrySet().iterator();
                    while (true) {
                        String str3 = "";
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        String str4 = (String) entry.getKey();
                        String str5 = (String) entry.getValue();
                        String strM = am2.m('}', "{", str4);
                        String strEncode = str5 != null ? Uri.encode(str5) : null;
                        if (strEncode != null) {
                            str3 = strEncode;
                        }
                        string = c.o(string, strM, str3);
                    }
                    Uri uri = Uri.parse(string);
                    Uri uri2 = uri.isHierarchical() ? uri : null;
                    if (uri2 != null) {
                        String strP = CollectionsKt.P(CollectionsKt.b0(CollectionsKt.N(uri2.getQueryParameterNames(), e82.E(new String[]{"cc", "cd", "eid", "s", "puid", "se", "ts"}))), "&", (CharSequence) null, (String) null, 0, new b11(uri2, (byte) 23), 30);
                        Mac mac = Mac.getInstance("HmacSHA256");
                        Charset charset = Charsets.UTF_8;
                        mac.init(new SecretKeySpec(str2.getBytes(charset), "HmacSHA256"));
                        String strO = c.o(uri2.toString(), "{signature}", e82.w(mac.doFinal(strP.getBytes(charset)), "", k0l.F, 30));
                        dap dapVar = dap.a;
                        dap.c(strO, p9p.j, new p9p((byte) 11, 1), new ogo(this));
                    }
                }
            }
        }
    }

    @Override // defpackage.bpo
    public final void c() {
        g();
        this.a.finish();
    }

    public final void d(boolean z) {
        if (!this.o && this.p && this.q) {
            this.o = true;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.g;
            this.i = z ? 0L : j >= 0 ? jElapsedRealtime - j : -1L;
            p7p p7pVarE = e();
            if (p7pVarE != null) {
                p7pVarE.b(Integer.valueOf(this.k), Long.valueOf(this.h), Long.valueOf(this.i));
            }
            dpo dpoVar = this.e;
            if (dpoVar != null) {
                dpoVar.c();
            }
            this.j = jElapsedRealtime;
            this.l = jElapsedRealtime;
            this.m = 0L;
            lzo lzoVar = this.d;
            if (lzoVar != null) {
                a3p a3pVar = lzoVar.a;
                mmo mmoVar = ocp.d(this.c).d;
                if (mmoVar != null) {
                    mmoVar.invoke(a3pVar);
                }
            }
            vm vmVarF = f();
            if (vmVarF != null) {
                ((woo) vmVarF).g();
            }
        }
    }

    public final p7p e() {
        ylp ylpVar = this.c;
        uro uroVarD = ocp.d(ylpVar);
        if (uroVarD.a != ylpVar) {
            uroVarD = null;
        }
        if (uroVarD != null) {
            return uroVarD.b;
        }
        return null;
    }

    public final vm f() {
        ylp ylpVar = this.c;
        uro uroVarD = ocp.d(ylpVar);
        if (uroVarD.a != ylpVar) {
            uroVarD = null;
        }
        if (uroVarD != null) {
            return uroVarD.c;
        }
        return null;
    }

    public final void g() {
        this.n = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.l;
        long j2 = this.m;
        if (j >= 0) {
            j2 += jElapsedRealtime - j;
        }
        long j3 = j2;
        long j4 = this.j;
        long j5 = j4 >= 0 ? jElapsedRealtime - j4 : -1L;
        p7p p7pVarE = e();
        if (p7pVarE != null) {
            int i = this.k;
            long j6 = this.h;
            long j7 = this.i;
            voo vooVar = p7pVarE.a;
            p7p.e(new x2p(vooVar.c, vooVar.b.a, vooVar.j, vooVar.l, d1p.e().a(), Boolean.valueOf(d1p.e().c), j3, i, j6, j7, j5), null, p7pVarE.b);
        }
        vm vmVarF = f();
        ylp ylpVar = this.c;
        uro uroVarD = ocp.d(ylpVar);
        if (ylpVar != uroVarD.a) {
            uroVarD = null;
        }
        if (uroVarD != null) {
            uroVarD.a = null;
            uroVarD.b = null;
            uroVarD.c = null;
            uroVarD.d = null;
        }
        if (vmVarF != null) {
            ((woo) vmVarF).onAdDismissed();
        }
    }
}
