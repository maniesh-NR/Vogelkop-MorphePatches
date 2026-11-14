package ads_mobile_sdk;

import defpackage.qqo;
import defpackage.vkp;
import java.net.URL;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class u11 implements vkp {
    public final c21 a;
    public ws b;
    public d91 c;
    public final zyk d = z4c.b(new qqo(this, (byte) 5));

    public u11(c21 c21Var) {
        this.a = c21Var;
    }

    @Override // defpackage.vkp
    public final Object a(int i, long j, m5 m5Var) {
        Object objA = ((vkp) this.d.getValue()).a(i, j, m5Var);
        return objA == px5.a ? objA : Unit.a;
    }

    @Override // defpackage.vkp
    public final Object a(h21 h21Var, pn7 pn7Var, w22 w22Var) {
        return ((vkp) this.d.getValue()).a(h21Var, pn7Var, w22Var);
    }

    @Override // defpackage.vkp
    public final Object a(h21 h21Var, pn7 pn7Var, Map map, boolean z, boolean z2, mt5 mt5Var) {
        return ((vkp) this.d.getValue()).a(h21Var, pn7Var, null, z, z2, mt5Var);
    }

    @Override // defpackage.vkp
    public final Object a(hf1 hf1Var) {
        Object objA = ((vkp) this.d.getValue()).a(hf1Var);
        return objA == px5.a ? objA : Unit.a;
    }

    @Override // defpackage.vkp
    public final Object a(String str, Map map, mt5 mt5Var) {
        Object objA = ((vkp) this.d.getValue()).a(str, map, mt5Var);
        return objA == px5.a ? objA : Unit.a;
    }

    @Override // defpackage.vkp
    public final Object a(URL url, in0 in0Var, mt5 mt5Var) {
        return ((vkp) this.d.getValue()).a(url, in0Var, mt5Var);
    }

    @Override // defpackage.vkp
    public final Object a(URL url, Map map, boolean z, nt5 nt5Var) {
        return ((vkp) this.d.getValue()).a(url, map, z, nt5Var);
    }

    @Override // defpackage.vkp
    public final Object a(URL url, mt5 mt5Var) {
        return ((vkp) this.d.getValue()).a(url, mt5Var);
    }

    @Override // defpackage.vkp
    public final void a(d91 d91Var) {
        this.c = d91Var;
        zyk zykVar = this.d;
        if (zykVar.isInitialized()) {
            ((vkp) zykVar.getValue()).a(this.c);
        }
    }

    @Override // defpackage.vkp
    public final void a(ws wsVar) {
        this.b = wsVar;
        zyk zykVar = this.d;
        if (zykVar.isInitialized()) {
            ((vkp) zykVar.getValue()).a(this.b);
        }
    }
}
