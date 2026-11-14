package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class gc1 implements tfd {
    public final /* synthetic */ c6n a;
    public final /* synthetic */ m3c b;

    public gc1(c6n c6nVar, m3c m3cVar) {
        this.a = c6nVar;
        this.b = m3cVar;
    }

    @Override // defpackage.tfd
    public final int a(shb shbVar, List list, int i) {
        c6n c6nVar = this.a;
        c6nVar.measure(0, c6n.j(0, i, c6nVar.getLayoutParams().height));
        return c6nVar.getMeasuredWidth();
    }

    @Override // defpackage.tfd
    public final ufd b(vfd vfdVar, List list, long j) {
        c6n c6nVar = this.a;
        if (c6nVar.getChildCount() == 0) {
            return vfdVar.b0(yo5.j(j), yo5.i(j), n08.a, new k51((byte) 8));
        }
        if (yo5.j(j) != 0) {
            c6nVar.getChildAt(0).setMinimumWidth(yo5.j(j));
        }
        if (yo5.i(j) != 0) {
            c6nVar.getChildAt(0).setMinimumHeight(yo5.i(j));
        }
        c6nVar.measure(c6n.j(yo5.j(j), yo5.h(j), c6nVar.getLayoutParams().width), c6n.j(yo5.i(j), yo5.g(j), c6nVar.getLayoutParams().height));
        return vfdVar.b0(c6nVar.getMeasuredWidth(), c6nVar.getMeasuredHeight(), n08.a, new cc1(c6nVar, this.b, (byte) 2));
    }

    @Override // defpackage.tfd
    public final int c(shb shbVar, List list, int i) {
        c6n c6nVar = this.a;
        c6nVar.measure(0, c6n.j(0, i, c6nVar.getLayoutParams().height));
        return c6nVar.getMeasuredWidth();
    }

    @Override // defpackage.tfd
    public final int d(shb shbVar, List list, int i) {
        c6n c6nVar = this.a;
        c6nVar.measure(c6n.j(0, i, c6nVar.getLayoutParams().width), 0);
        return c6nVar.getMeasuredHeight();
    }

    @Override // defpackage.tfd
    public final int e(shb shbVar, List list, int i) {
        c6n c6nVar = this.a;
        c6nVar.measure(c6n.j(0, i, c6nVar.getLayoutParams().width), 0);
        return c6nVar.getMeasuredHeight();
    }
}
