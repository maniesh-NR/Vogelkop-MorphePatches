package defpackage;

import com.opera.android.BrowserActivity;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class y4m extends n1 {
    public final BrowserActivity c;
    public final v3m d;
    public final ghf e;
    public final r4m f;
    public Set g;
    public Set h;
    public szb i;
    public boolean j;

    public y4m(o4m o4mVar, BrowserActivity browserActivity, v3m v3mVar, ghf ghfVar, r4m r4mVar) {
        super((Object) o4mVar, (byte) 24);
        this.g = new HashSet();
        this.h = new HashSet();
        this.c = browserActivity;
        this.d = v3mVar;
        this.e = ghfVar;
        this.f = r4mVar;
        this.j = v3mVar.g();
        szb szbVarD = szb.d(0, v3mVar.b.z("translate_web_pages_to_language"));
        this.i = v3mVar.h(szbVarD) ? szbVarD : null;
    }

    public final boolean H0(String str) {
        Set set;
        return (str == null || (set = (Set) ((ode) this.d.d.d).g()) == null || !set.contains(str)) ? false : true;
    }

    public final boolean I0(szb szbVar, String str) {
        return szbVar == null || this.d.e(szbVar, 1) || H0(str);
    }
}
