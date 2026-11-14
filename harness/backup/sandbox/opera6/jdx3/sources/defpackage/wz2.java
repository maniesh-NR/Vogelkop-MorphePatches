package defpackage;

import J.N;
import org.chromium.components.embedder_support.view.ContentViewRenderView;

/* loaded from: classes.dex */
public final class wz2 extends zz2 {
    public final /* synthetic */ ro9 d;
    public final /* synthetic */ ami e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz2(ami amiVar, umi umiVar, int i, ro9 ro9Var, ro9 ro9Var2) {
        super(umiVar, i, ro9Var);
        this.d = ro9Var2;
        this.e = amiVar;
        n9k n9kVar = new n9k(new fv2(this, (byte) 2));
        vp5 vp5Var = (vp5) amiVar.d;
        vp5Var.f.a.k.add(new qlk(n9kVar, (byte) 10));
        vr9 vr9Var = new vr9((byte) 20, n9kVar, vp5Var, false);
        ckf ckfVar = vp5Var.f.a;
        if (ckfVar.l.isEmpty()) {
            N.MTRhfnYH(((ContentViewRenderView) ckfVar).a, true);
        }
        ckfVar.l.add(vr9Var);
    }

    @Override // defpackage.zz2
    public final void a(boolean z) {
        ((oml) this.c).cancel(false);
        this.a = true;
        if (z) {
            ami amiVar = this.e;
            amiVar.x((ro9) amiVar.g, this.d);
        }
    }

    @Override // defpackage.zz2
    public final void b() {
        ami amiVar = this.e;
        amiVar.y((ro9) amiVar.g, this.d);
        amiVar.t((ro9) this.b);
        amiVar.h = null;
    }
}
