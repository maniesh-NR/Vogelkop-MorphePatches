package defpackage;

import com.opera.android.settings.SettingsManager;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class yu1 implements u9j {
    public final SettingsManager a;
    public final ev1 b;
    public final nzk c;
    public final dxe d;
    public final jjg e;
    public final uu1 f;
    public final v9j g;
    public final s9 h;
    public final xu1 i;
    public final vu1 j;

    public yu1(SettingsManager settingsManager, ev1 ev1Var, nzk nzkVar, dxe dxeVar, jjg jjgVar) {
        uu1 uu1Var = new uu1((byte) 0);
        this.a = settingsManager;
        this.b = ev1Var;
        this.c = nzkVar;
        this.d = dxeVar;
        this.e = jjgVar;
        this.f = uu1Var;
        this.g = new v9j(this);
        this.h = new s9(this, (byte) 2);
        this.i = new xu1(this, (byte) 0);
        this.j = new vu1(this, (byte) 0);
    }

    public final b7j a() {
        b7j b7jVar = this.b.b;
        return b7jVar == null ? this.a.c() : b7jVar;
    }

    public final e7j b() {
        e7j e7jVar = this.b.a;
        return e7jVar == null ? this.a.f() : e7jVar;
    }

    public final void c() {
        p37 c4cVar;
        List listC0 = CollectionsKt.c0(new yg9((byte) 12), wu1.a);
        SettingsManager settingsManager = this.a;
        fll fllVar = new fll(listC0, f7j.values()[settingsManager.n("app_theme")], CollectionsKt.c0(new yg9((byte) 13), wu1.b), settingsManager.g(), this.c.a);
        boolean z = false;
        boolean z2 = f7j.values()[settingsManager.n("app_theme")] != f7j.DARK;
        dxe dxeVar = this.d;
        boolean z3 = dxeVar != null && dxeVar.i && settingsManager.i("night_mode_switch_theme") && z2;
        boolean z4 = dxeVar != null && dxeVar.i;
        String strR = dxeVar != null ? dxeVar.R(2132021281, 2132021278, 2132021282, 2132021279) : null;
        if (strR == null) {
            strR = "";
        }
        pxe pxeVar = new pxe(z3, z4, strR);
        boolean zI = settingsManager.i("darken_websites_dark_theme");
        if (((Boolean) this.f.get()).booleanValue()) {
            c4cVar = b4c.i;
        } else {
            boolean z5 = b() == e7j.d;
            int i = a().a;
            r7j r7jVarD = settingsManager.D(b());
            if (a() == b7j.d && r7jVarD == r7j.ONLY_ADDRESS_BAR) {
                r7jVarD = r7j.BOTH;
            }
            int i2 = r7jVarD.a;
            if (a() == b7j.c && b() == e7j.c) {
                z = true;
            }
            c4cVar = new c4c(z5, i, i2, z);
        }
        this.g.r(new tu1(fllVar, pxeVar, zI, c4cVar, ((Boolean) this.e.get()).booleanValue(), new ns1(!ozk.a.contains(Locale.getDefault().getLanguage()), new rxh(c7j.values()[settingsManager.n("app_font")].a))));
    }

    @Override // defpackage.u9j
    public final void j() {
        c();
    }

    @Override // defpackage.u9j
    public final void m(kze kzeVar) {
        a26.V(this.a, kzeVar, this.h);
        a26.V(this.c, kzeVar, this.j);
        owe oweVar = owe.c;
        xu1 xu1Var = this.i;
        a26.V(oweVar, kzeVar, xu1Var);
        dxe dxeVar = this.d;
        if (dxeVar != null) {
            a26.V(dxeVar, kzeVar, xu1Var);
        }
    }
}
