package defpackage;

import android.content.res.Resources;
import com.opera.android.settings.SettingsManager;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class o4m implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r4m b;

    public /* synthetic */ o4m(r4m r4mVar, byte b) {
        this.a = b;
        this.b = r4mVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException, Resources.NotFoundException {
        byte b = this.a;
        io7 io7Var = io7.A;
        String str = null;
        r4m r4mVar = this.b;
        switch (b) {
            case 0:
                h5m h5mVar = r4mVar.d;
                szb szbVarW = r4mVar.W();
                v3m v3mVar = r4mVar.g;
                if (szbVarW == null) {
                    v3mVar.getClass();
                } else {
                    str = (String) ((avn) ((bvn) no7.n(v3mVar.a, io7Var, bvn.k)).i()).b.get(szbVarW);
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
                h5mVar.c(str, (String) ((avn) ((bvn) no7.n(v3mVar.a, io7Var, bvn.k)).i()).b.get(szbVar));
                break;
            case 1:
                y4m y4mVar2 = r4mVar.b;
                v3m v3mVar3 = y4mVar2.d;
                if (!v3mVar3.g()) {
                    v3mVar3.b.V(1, "translate_web_pages_enabled");
                    v3mVar3.i(v3mVar3.d());
                }
                SettingsManager settingsManager = y4mVar2.d.b;
                if (!settingsManager.i("translate_web_pages_backup_translation_method_enabled")) {
                    settingsManager.V(1, "translate_web_pages_backup_translation_method_enabled");
                }
                r4mVar.c0(new o4m(r4mVar, (byte) 5));
                r4mVar.l = true;
                break;
            case 2:
                r4mVar.d.a();
                r4mVar.Z(r4mVar.f.o, 1);
                break;
            case 3:
                r4mVar.e.J0(false);
                r4mVar.d.a();
                break;
            case 4:
                r4mVar.a.H0(null);
                b0c b0cVar = r4mVar.c;
                b0cVar.e = null;
                b0cVar.f = null;
                b0cVar.d = (byte) 0;
                b0cVar.v0();
                r4mVar.d.a();
                r4mVar.e.J0(false);
                break;
            case 5:
                r4mVar.e.J0(false);
                h5m h5mVar2 = r4mVar.d;
                h5mVar2.c.run();
                vz5 vz5Var = h5mVar2.f;
                d7h d7hVar = vz5Var != null ? (d7h) vz5Var.i : null;
                if (d7hVar != null) {
                    y4m y4mVar3 = r4mVar.b;
                    v3m v3mVar4 = y4mVar3.d;
                    szb szbVar2 = y4mVar3.i;
                    if (szbVar2 == null) {
                        szb szbVarD2 = v3mVar4.d();
                        y4mVar3.i = szbVarD2;
                        v3mVar4.i(szbVarD2);
                        szbVar2 = y4mVar3.i;
                    }
                    Objects.requireNonNull(szbVar2);
                    d7hVar.d((szb) null, szbVar2, ps0.d);
                    break;
                }
                break;
            case 6:
                r4mVar.f0();
                break;
            case 7:
                szb szbVarW2 = r4mVar.W();
                v3m v3mVar5 = r4mVar.g;
                if (szbVarW2 == null) {
                    v3mVar5.getClass();
                } else {
                    str = (String) ((avn) ((bvn) no7.n(v3mVar5.a, io7Var, bvn.k)).i()).b.get(szbVarW2);
                }
                kze kzeVar = r4mVar.j;
                if (str == null) {
                    str = "";
                }
                kzeVar.r(str);
                r4mVar.f0();
                break;
            default:
                r4mVar.Z(r4mVar.f.o, 1);
                break;
        }
    }
}
