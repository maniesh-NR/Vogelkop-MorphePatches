package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class sq6 implements nfa {
    public final /* synthetic */ uq6 a;

    public sq6(uq6 uq6Var) {
        this.a = uq6Var;
    }

    @Override // defpackage.nfa
    public final boolean c(Uri uri, bp bpVar, boolean z) {
        tq6 tq6Var;
        uq6 uq6Var = this.a;
        HashMap map = uq6Var.d;
        if (uq6Var.l == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ifa ifaVar = uq6Var.j;
            String str = tym.a;
            List list = ifaVar.e;
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                tq6 tq6Var2 = (tq6) map.get(((hfa) list.get(i2)).a);
                if (tq6Var2 != null && jElapsedRealtime < tq6Var2.h) {
                    i++;
                }
            }
            z16 z16Var = new z16(1, 0, uq6Var.j.e.size(), i, (byte) 1);
            uq6Var.c.getClass();
            asc ascVarG = i06.g(z16Var, bpVar);
            if (ascVarG != null && ascVarG.a == 2 && (tq6Var = (tq6) map.get(uri)) != null) {
                return tq6Var.a(ascVarG.b);
            }
        }
        return false;
    }

    @Override // defpackage.nfa
    public final void d() {
        this.a.e.remove(this);
    }
}
