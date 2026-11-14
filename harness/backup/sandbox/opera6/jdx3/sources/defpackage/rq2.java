package defpackage;

import com.opera.android.browser.chromium.ChromiumContent;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class rq2 implements qu2 {
    public final ChromiumContent a;
    public final dx3 b;
    public final int c;
    public final iz9 d;
    public final nej e;
    public final i7f f = new i7f();
    public List g = l08.a;
    public nq2 h;

    /* JADX WARN: Multi-variable type inference failed */
    public rq2(ChromiumContent chromiumContent, dx3 dx3Var, int i, iz9 iz9Var) {
        this.a = chromiumContent;
        this.b = dx3Var;
        this.c = i;
        this.d = iz9Var;
        this.e = a4h.f(dx3Var);
    }

    @Override // defpackage.w6f
    public final void F(Object obj) {
        this.f.b((pu2) obj);
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        this.f.c((pu2) obj);
    }

    @Override // defpackage.qu2
    public final void d() {
        nq2 nq2Var = this.h;
        if (nq2Var != null) {
            nq2Var.finish(hjm.b);
        }
        this.h = null;
    }

    @Override // defpackage.qu2
    public final void show() {
        if (this.h != null) {
            return;
        }
        nq2 nq2Var = new nq2(this.b, this.c, this.a, this.d, new zy9(this));
        nq2Var.b(this.g);
        nej nejVar = this.e;
        nejVar.getClass();
        nejVar.b(nq2Var, ijm.b);
        this.h = nq2Var;
    }

    @Override // defpackage.qu2
    public final void w(ArrayList arrayList) {
        this.g = arrayList;
        nq2 nq2Var = this.h;
        if (nq2Var != null) {
            nq2Var.b(arrayList);
        }
    }
}
