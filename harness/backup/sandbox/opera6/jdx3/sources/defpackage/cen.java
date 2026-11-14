package defpackage;

import org.chromium.content_public.browser.NavigationHandle;

/* loaded from: classes.dex */
public final class cen extends y08 implements tdn {
    public y1n a;
    public f6l b;
    public final /* synthetic */ fen c;

    public cen(fen fenVar) {
        this.c = fenVar;
        W();
    }

    @Override // defpackage.tdn
    public final void C() {
        W();
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void E(b2l b2lVar, NavigationHandle navigationHandle) {
        if (this.c.h(b2lVar)) {
            y1n y1nVar = this.a;
            if (y1nVar != null) {
                vml.a(y1nVar);
            }
            y1n y1nVar2 = new y1n(this, (byte) 14);
            this.a = y1nVar2;
            vml.d(y1nVar2, 1000L);
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void Q(b2l b2lVar, NavigationHandle navigationHandle) {
        y1n y1nVar = this.a;
        if (y1nVar != null) {
            vml.a(y1nVar);
            this.a = null;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void S(d7l d7lVar) {
        y1n y1nVar = this.a;
        if (y1nVar != null) {
            vml.a(y1nVar);
            this.a = null;
        }
    }

    public final void W() {
        fen fenVar = this.c;
        ydn ydnVar = fenVar.g;
        boolean z = ydnVar.d.a && ydnVar.c.isEnabled();
        f6l f6lVar = this.b;
        if (z != (f6lVar != null)) {
            if (z) {
                this.b = fenVar.f.a(this);
            } else if (f6lVar != null) {
                fenVar.f.H(f6lVar);
                this.b = null;
            }
        }
    }

    @Override // defpackage.tdn
    public final void s() {
        W();
    }

    @Override // defpackage.tdn
    public final void t() {
    }
}
