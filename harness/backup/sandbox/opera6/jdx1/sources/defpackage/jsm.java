package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class jsm implements ivh {
    public final /* synthetic */ nsm a;

    public jsm(nsm nsmVar) {
        this.a = nsmVar;
    }

    @Override // defpackage.ivh
    public final void s(owh owhVar, long j, w61 w61Var) {
        Integer num;
        if (this.a.q.a == 0 || (num = (Integer) owhVar.a(kbl.b)) == null) {
            return;
        }
        nsm nsmVar = this.a;
        int iIntValue = num.intValue();
        synchronized (nsmVar.c) {
            i72 i72Var = nsmVar.f;
            while (!i72Var.isEmpty() && ((ksm) i72Var.first()).a <= iIntValue) {
                ((ksm) i72Var.first()).b.j0(Unit.a);
                o95.w(i72Var);
                this.a.q.b();
            }
        }
    }

    @Override // defpackage.ivh
    public final void t(owh owhVar, long j, hwh hwhVar) {
        Integer num;
        if (this.a.q.a == 0 || (num = (Integer) owhVar.a(kbl.b)) == null) {
            return;
        }
        nsm nsmVar = this.a;
        int iIntValue = num.intValue();
        synchronized (nsmVar.c) {
            i72 i72Var = nsmVar.f;
            Throwable th = new Throwable("Failed in framework level".concat(" with CaptureFailure.reason = " + hwhVar.getReason()));
            while (!i72Var.isEmpty() && ((ksm) i72Var.first()).a <= iIntValue) {
                ((ksm) i72Var.first()).b.B0(th);
                o95.w(i72Var);
                this.a.q.b();
            }
        }
    }
}
