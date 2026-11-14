package defpackage;

import android.content.res.Resources;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.translate_web_pages.TranslationData;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class p4m implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r4m b;
    public final /* synthetic */ vz5 c;
    public final /* synthetic */ b2l d;
    public final /* synthetic */ TranslationData e;

    public /* synthetic */ p4m(r4m r4mVar, vz5 vz5Var, b2l b2lVar, TranslationData translationData, byte b) {
        this.a = b;
        this.b = r4mVar;
        this.c = vz5Var;
        this.d = b2lVar;
        this.e = translationData;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException, Resources.NotFoundException {
        String str;
        String str2;
        byte b = this.a;
        boolean z = false;
        boolean z2 = true;
        TranslationData translationData = this.e;
        b2l b2lVar = this.d;
        vz5 vz5Var = this.c;
        r4m r4mVar = this.b;
        switch (b) {
            case 0:
                l8l l8lVar = r4mVar.a;
                r4mVar.d.b(vz5Var);
                if (!tjm.I0(r4mVar.e.c, b2lVar)) {
                    r4mVar.b0();
                    r4mVar.a0();
                    break;
                } else {
                    k8l k8lVar = l8lVar.c;
                    l8lVar.H0(((d7l) b2lVar).j.getUrl());
                    k8l k8lVar2 = l8lVar.c;
                    if (k8lVar2 == null || (k8lVar != null && ((str = k8lVar2.a) == null || !str.equals(k8lVar.a)))) {
                        z2 = false;
                    }
                    r4mVar.c.I0(b2lVar, z2 ? translationData.b : null);
                    byte b2 = translationData.a != 2 ? (byte) 0 : (byte) 2;
                    if (r4mVar.W() != null) {
                        r4mVar.Z(b2lVar, b2);
                    } else {
                        r4mVar.k = b2;
                    }
                    r4mVar.d0(b2lVar);
                    break;
                }
            default:
                h5m h5mVar = r4mVar.d;
                v3m v3mVar = r4mVar.g;
                h5mVar.b(vz5Var);
                tjm tjmVar = r4mVar.e;
                if (!tjm.I0(tjmVar.c, b2lVar)) {
                    r4mVar.b0();
                    if (vz5Var != null) {
                        r4mVar.a0();
                        break;
                    }
                } else if (vz5Var != null) {
                    r4mVar.a.H0(((d7l) b2lVar).j.getUrl());
                    r4mVar.c.I0(b2lVar, translationData.b);
                    if (translationData.a == 2) {
                        szb szbVarW = r4mVar.W();
                        io7 io7Var = io7.A;
                        if (szbVarW == null) {
                            v3mVar.getClass();
                            str2 = null;
                        } else {
                            str2 = (String) ((avn) ((bvn) no7.n(v3mVar.a, io7Var, bvn.k)).i()).b.get(szbVarW);
                        }
                        y4m y4mVar = r4mVar.b;
                        v3m v3mVar2 = y4mVar.d;
                        szb szbVar = y4mVar.i;
                        if (szbVar == null) {
                            szb szbVarD = v3mVar2.d();
                            y4mVar.i = szbVarD;
                            v3mVar2.i(szbVarD);
                            szbVar = y4mVar.i;
                        }
                        Objects.requireNonNull(szbVar);
                        String str3 = (String) ((avn) ((bvn) no7.n(v3mVar.a, io7Var, bvn.k)).i()).b.get(szbVar);
                        j5m j5mVar = h5mVar.g;
                        if (j5mVar == null || !((d5m) j5mVar.d.g()).b() || !h5mVar.g.b.equals(str2) || !h5mVar.g.c.equals(str3)) {
                            h5mVar.a();
                            if (str2 != null && str3 != null) {
                                h5mVar.c(str2, str3);
                                r4mVar.Y(b2lVar, 1);
                                r4mVar.d0(b2lVar);
                                break;
                            }
                        } else {
                            r4mVar.Y(b2lVar, 1);
                            r4mVar.d0(b2lVar);
                            break;
                        }
                    }
                    uy3 uy3VarF = uy3.F(b2lVar);
                    ChromiumContent chromiumContent = uy3VarF != null ? uy3VarF.b : null;
                    if (chromiumContent != null && chromiumContent.O > 0) {
                        z = true;
                    }
                    tjmVar.J0(z);
                    r4mVar.d0(b2lVar);
                    break;
                } else {
                    r4mVar.k = (byte) 0;
                    r4mVar.o = false;
                    break;
                }
                break;
        }
    }
}
