package defpackage;

import com.opera.android.browser.chromium.ChromiumContent;

/* loaded from: classes.dex */
public final class qx3 implements j6l {
    public final b7f a = new b7f(null, true);
    public b2l b;

    public qx3(k6l k6lVar) {
        k6lVar.F(this);
        k6lVar.s.F(new qz(this, (byte) 4));
    }

    @Override // defpackage.j6l
    public final void H(b2l b2lVar, b2l b2lVar2, int i) {
        a(b2lVar2);
    }

    public final void a(b2l b2lVar) {
        uy3 uy3VarF = uy3.F(b2lVar);
        ChromiumContent chromiumContent = uy3VarF != null ? uy3VarF.b : null;
        b7f b7fVar = this.a;
        if (chromiumContent != null) {
            this.b = null;
            b7fVar.d(chromiumContent);
        } else if (b2lVar != this.b) {
            this.b = b2lVar;
            b7fVar.d(null);
        }
    }

    @Override // defpackage.j6l
    public final void onDestroy() {
        this.a.d(null);
    }
}
