package defpackage;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class noh implements q2n {
    public final k28 b;

    public noh(k28 k28Var, xd4 xd4Var) {
        this.b = k28Var;
        xd4Var.w();
    }

    @Override // defpackage.q2n
    public final Set a() {
        return this.b.e;
    }

    @Override // defpackage.q2n
    public final Size b(mo2 mo2Var, ip7 ip7Var) {
        gp2 gp2VarB;
        wh4 wh4VarA = this.b.a(ip7Var);
        if (wh4VarA == null || (gp2VarB = wh4VarA.b(mo2Var)) == null) {
            return null;
        }
        return gp2VarB.f.a();
    }

    @Override // defpackage.q2n
    public final List c(ip7 ip7Var) {
        wh4 wh4VarA = this.b.a(ip7Var);
        return wh4VarA != null ? new ArrayList(wh4VarA.a.keySet()) : l08.a;
    }
}
