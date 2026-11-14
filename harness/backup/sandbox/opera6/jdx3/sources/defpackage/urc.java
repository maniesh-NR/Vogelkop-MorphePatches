package defpackage;

import android.net.Uri;
import com.leanplum.internal.Constants;
import com.opera.android.browser.WebContentsWrapper;
import com.opera.android.settings.SettingsManager;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class urc implements ndc {
    public final WebContentsWrapper a;
    public final g8c b;
    public final cp7 c;
    public final xoc d;
    public final qdc e;
    public final ta7 f;
    public final ode g;
    public final s9i h;
    public final eyi i;
    public final kze j;
    public String k;
    public boolean l;

    public urc(WebContentsWrapper webContentsWrapper, g8c g8cVar, rkc rkcVar, SettingsManager settingsManager, cp7 cp7Var, j4c j4cVar, orm ormVar, wyn wynVar, vx vxVar, cs6 cs6Var, xoc xocVar, dw3 dw3Var, dw3 dw3Var2) throws JSONException {
        this.a = webContentsWrapper;
        this.b = g8cVar;
        this.c = cp7Var;
        this.d = xocVar;
        qdc qdcVar = new qdc(this, true);
        this.e = qdcVar;
        u02 u02Var = (u02) rkcVar.invoke(this);
        ta7 ta7Var = new ta7(u02Var, new y0a(this, (byte) 16), j4cVar, ormVar, wynVar, vxVar, webContentsWrapper.e().m(), settingsManager, cs6Var, xocVar, dw3Var, dw3Var2);
        this.f = ta7Var;
        this.g = new ode((Object) null);
        s9i s9iVar = new s9i(webContentsWrapper.e(), ta7Var);
        this.h = s9iVar;
        eyi eyiVar = new eyi(webContentsWrapper.e().m(), settingsManager);
        this.i = eyiVar;
        this.j = new kze(trc.a);
        ((kze) u02Var.o).j(this, new ug(new rrc(this, (byte) 0), (byte) 27));
        ((kze) eyiVar.d).j(this, new ug(new rrc(this, (byte) 1), (byte) 27));
        webContentsWrapper.i();
        byte b = 2;
        cp7Var.getState().j(this, new ug(new rrc(this, b), (byte) 27));
        qdcVar.g(qcc.e);
        oup.l0(qdcVar, (Function1) null, new rrc(this, (byte) 3), (Function1) null, (Function1) null, 13);
        nv6 nv6Var = (nv6) s9iVar.e;
        yqc yqcVar = new yqc(this);
        nv6Var.getClass();
        vpb vpbVar = new vpb();
        vpbVar.a(new orb());
        qq8 qq8Var = (qq8) nv6Var.a;
        String strH = qq8Var.h();
        orb orbVarJ = o18.j("jsonrpc", "2.0", "method", "views.v1.getLiveScoreState");
        orbVarJ.p(vpbVar, Constants.Params.PARAMS);
        orbVarJ.p(strH, "id");
        qq8Var.l(orbVarJ, new rkc(yqcVar, b));
    }

    public final void a() {
        String str;
        if (this.c.getState().g() != bp7.c || (str = this.k) == null) {
            return;
        }
        Uri uri = (Uri) this.b.invoke(str);
        if (this.l) {
            return;
        }
        this.l = true;
        this.j.r(trc.a);
        ksc kscVar = new ksc(uri.toString(), 0);
        rrc rrcVar = new rrc(this, (byte) 4);
        WebContentsWrapper webContentsWrapper = this.a;
        new stn(webContentsWrapper, rrcVar);
        webContentsWrapper.d().r(kscVar);
    }

    public final tcc getLifecycle() {
        return this.e;
    }
}
