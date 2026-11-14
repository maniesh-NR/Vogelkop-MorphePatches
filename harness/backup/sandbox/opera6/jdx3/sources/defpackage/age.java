package defpackage;

import androidx.fragment.app.w;

/* loaded from: classes.dex */
public final class age implements hxl, p5j {
    public final /* synthetic */ fge a;

    public age(fge fgeVar) {
        this.a = fgeVar;
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        if ("my_flow_visible".equals(str)) {
            fge fgeVar = this.a;
            if (fgeVar.Q) {
                return;
            }
            w supportFragmentManager = fgeVar.r.getSupportFragmentManager();
            if (fgeVar.u.r(fgeVar.t)) {
                return;
            }
            supportFragmentManager.Y(-1, 1, "flow");
        }
    }

    @Override // defpackage.hxl
    public final void i() {
    }

    @Override // defpackage.hxl
    public final void x(int i) {
        fge fgeVar = this.a;
        if (fgeVar.Q) {
            return;
        }
        w supportFragmentManager = fgeVar.r.getSupportFragmentManager();
        if (fgeVar.u.r(fgeVar.t)) {
            return;
        }
        supportFragmentManager.Y(-1, 1, "flow");
    }

    @Override // defpackage.hxl
    public final void z() {
    }
}
