package defpackage;

import J.N;
import android.content.SharedPreferences;
import android.net.Uri;
import com.opera.android.Lazy;
import com.opera.android.browser.WebContentsWrapper;
import com.opera.android.settings.SettingsManager;
import kotlin.jvm.functions.Function1;
import org.chromium.base.LocaleUtils;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class j62 {
    public final dx3 a;
    public final umi b;
    public final gjm c;
    public final ji d;
    public final j4c e;
    public final j4c f;
    public final Lazy g;
    public final wv1 h;
    public final yv3 i;
    public final yv3 j;
    public final wyn k;
    public final zv3 l;
    public final zv3 m;
    public final zv3 n;
    public final yv3 o;
    public final ji p;
    public final ji q;
    public final zv3 r;
    public final j4c s;
    public final r2 t;
    public final zyk u = z4c.b(new vk1((byte) 17));

    public j62(dx3 dx3Var, umi umiVar, gjm gjmVar, ji jiVar, j4c j4cVar, j4c j4cVar2, Lazy lazy, wv1 wv1Var, yv3 yv3Var, yv3 yv3Var2, wyn wynVar, zv3 zv3Var, zv3 zv3Var2, zv3 zv3Var3, yv3 yv3Var3, ji jiVar2, ji jiVar3, zv3 zv3Var4, j4c j4cVar3, r2 r2Var) {
        this.a = dx3Var;
        this.b = umiVar;
        this.c = gjmVar;
        this.d = jiVar;
        this.e = j4cVar;
        this.f = j4cVar2;
        this.g = lazy;
        this.h = wv1Var;
        this.i = yv3Var;
        this.j = yv3Var2;
        this.k = wynVar;
        this.l = zv3Var;
        this.m = zv3Var2;
        this.n = zv3Var3;
        this.o = yv3Var3;
        this.p = jiVar2;
        this.q = jiVar3;
        this.r = zv3Var4;
        this.s = j4cVar3;
        this.t = r2Var;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [android.content.Context, dx3, java.lang.Object] */
    public final hq3 a(boolean z, Function1 function1, d12 d12Var) {
        umi umiVar;
        wth wthVar;
        yk6 yk6Var = (yk6) this.e.get();
        a52 a52Var = (a52) this.f.get();
        xb xbVar = (xb) this.h.b.get();
        SettingsManager settingsManagerJ = this.d.b.J();
        g7m g7mVarB = b();
        qsh qshVar = (qsh) this.j.get();
        ky1 ky1Var = (ky1) this.s.get();
        k42 k42Var = (k42) this.l.get();
        l02 l02Var = (l02) this.m.get();
        qb qbVar = (qb) this.n.get();
        ekc ekcVar = (ekc) this.u.getValue();
        WebContents webContents = (WebContents) N.M_FZHKB_(z, false);
        ?? r10 = this.a;
        WebContentsWrapper webContentsWrapper = new WebContentsWrapper(r10.j, webContents, 7);
        webContentsWrapper.g(null);
        SelectionPopupControllerImpl selectionPopupControllerImplFromWebContents = SelectionPopupControllerImpl.fromWebContents(webContentsWrapper.e());
        selectionPopupControllerImplFromWebContents.getClass();
        selectionPopupControllerImplFromWebContents.f = (ve) function1.invoke(selectionPopupControllerImplFromWebContents);
        umi umiVar2 = this.b;
        a12 a12Var = new a12(r10, umiVar2);
        wth wthVar2 = new wth(a12Var, (byte) 10);
        if (z) {
            umiVar = umiVar2;
            wthVar = new wth(d12Var, (byte) 10);
        } else {
            umiVar = umiVar2;
            wthVar = wthVar2;
        }
        f62 f62Var = new f62(z, yk6Var, settingsManagerJ, ekcVar, (byte) 0);
        Uri.Builder builderBuildUpon = Uri.parse("opera-aria://ui/").buildUpon();
        builderBuildUpon.appendQueryParameter("language", LocaleUtils.getDefaultLocaleString());
        return new hq3(webContentsWrapper, a12Var, wthVar, l02Var, new h62(xbVar, k42Var, (byte) 0), f62Var, new hv((Object) r10, (Object) umiVar, (Object) wthVar2, (byte) 2), builderBuildUpon.build(), settingsManagerJ, new rii(a12Var, (byte) 21), this.g, g7mVarB, new p12(r10, this.c, this.i, qshVar, g7mVarB), this.k, ky1Var, yk6Var, a52Var, qbVar, new g62(k42Var, (byte) 0), this.t, this.o);
    }

    public final g7m b() {
        yv3 yv3Var = this.o;
        ru9 ru9Var = (ru9) yv3Var.get();
        ji jiVar = this.p;
        orm ormVar = (orm) jiVar.get();
        d5o d5oVar = new d5o();
        d5oVar.a = ru9Var;
        d5oVar.b = ormVar;
        String string = ru9Var.a.getString("ai.onboarding.session", null);
        if (string != null) {
            nv6 nv6VarB = ru9Var.b();
            ((SharedPreferences.Editor) nv6VarB.a).remove("ai.onboarding.session");
            nv6VarB.w();
            try {
                d5oVar.c = wyh.w(new orb(string));
            } catch (Exception unused) {
            }
        }
        return new g7m(yv3Var, jiVar, this.q, this.r, d5oVar);
    }
}
