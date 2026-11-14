package defpackage;

import J.N;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.search.YandexPromotionTabHelper;
import com.opera.android.settings.SettingsManager;
import org.chromium.components.navigation_interception.InterceptNavigationDelegate;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class hz4 {
    public final boolean a;
    public final SettingsManager b;
    public final Object c;
    public final Object d;
    public Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;
    public final Object p;
    public final Object q;
    public final Object r;
    public Object s;
    public final Object t;

    /* JADX WARN: Multi-variable type inference failed */
    public hz4(int i, d8e d8eVar, dbf dbfVar, dbf dbfVar2, dbf dbfVar3, bpd bpdVar, k6l k6lVar, SettingsManager settingsManager, s28 s28Var, umi umiVar, pt3 pt3Var, mdh mdhVar, qdh qdhVar, cul culVar, xnh xnhVar, dbf dbfVar4, wcd wcdVar, iuh iuhVar, wok wokVar, d8e d8eVar2) {
        this.a = i;
        this.c = d8eVar;
        this.d = dbfVar;
        this.e = dbfVar2;
        this.f = dbfVar3;
        this.g = bpdVar;
        this.h = k6lVar;
        this.b = settingsManager;
        this.i = s28Var;
        this.j = umiVar;
        this.k = pt3Var;
        this.l = mdhVar;
        this.m = qdhVar;
        this.n = culVar;
        this.o = xnhVar;
        this.p = dbfVar4;
        this.q = wcdVar;
        this.r = iuhVar;
        this.s = wokVar;
        this.t = d8eVar2;
    }

    public hz4(t5d t5dVar, boolean z, eq9 eq9Var, tgi tgiVar, qi qiVar, xw3 xw3Var, xw3 xw3Var2, ivn ivnVar, g1j g1jVar, qp2 qp2Var, q6e q6eVar, x5f x5fVar, eej eejVar, pt3 pt3Var, d7h d7hVar, jv0 jv0Var, SettingsManager settingsManager, e00 e00Var) {
        this.c = t5dVar;
        this.a = z;
        this.f = eq9Var;
        this.g = tgiVar;
        this.d = qiVar;
        this.h = xw3Var;
        this.i = xw3Var2;
        this.j = ivnVar;
        this.k = g1jVar;
        this.l = qp2Var;
        this.m = q6eVar;
        this.n = x5fVar;
        this.o = eejVar;
        this.p = pt3Var;
        this.q = d7hVar;
        this.r = jv0Var;
        this.b = settingsManager;
        this.t = e00Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.Context, t5d] */
    public final ChromiumContent a(boolean z, WebContents webContents) {
        x5f x5fVar = (x5f) this.n;
        ?? r0 = (t5d) this.c;
        if (webContents == null) {
            webContents = (WebContents) N.M_FZHKB_(z, true);
        }
        ChromiumContent chromiumContent = new ChromiumContent((ala) this.s, (qi) this.d, webContents, z, this.a, 0);
        boolean z2 = this.a;
        qy4 qy4Var = new qy4(z2 ? 2 : 29, new vk2((byte) 6), chromiumContent, x5fVar, ru9.c(r0));
        g1j g1jVar = (g1j) this.k;
        qp2 qp2Var = (qp2) this.l;
        InterceptNavigationDelegate interceptNavigationDelegate = (InterceptNavigationDelegate) ((xw3) this.h).apply(chromiumContent);
        ype ypeVar = (ype) ((xw3) this.i).apply(chromiumContent);
        Object obj = this.o;
        chromiumContent.t(qy4Var, g1jVar, qp2Var, interceptNavigationDelegate, ypeVar, x5fVar, (eej) obj, (pt3) this.p, (d7h) this.q, (jv0) this.r);
        if (!z2) {
            chromiumContent.k((az3) this.e);
            new YandexPromotionTabHelper(chromiumContent.e(), (eej) obj, r0, x5fVar);
        }
        chromiumContent.k(((eq9) this.f).e);
        tgi tgiVar = (tgi) this.g;
        if (!tgiVar.b.add(chromiumContent)) {
            return chromiumContent;
        }
        chromiumContent.k(tgiVar.d);
        tgiVar.a(chromiumContent);
        return chromiumContent;
    }
}
