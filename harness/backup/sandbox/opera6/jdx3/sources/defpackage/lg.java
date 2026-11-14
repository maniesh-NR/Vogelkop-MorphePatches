package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class lg implements kri, w6f {
    public final ArrayList a = new ArrayList();
    public final q6e b;
    public l6e c;
    public eri d;

    public lg(q6e q6eVar) {
        this.b = q6eVar;
        q6eVar.F(this);
    }

    @Override // defpackage.w6f
    public final void F(Object obj) {
        this.a.add((kg) obj);
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        this.a.remove((kg) obj);
    }

    @Override // defpackage.kri
    public final void a(q6e q6eVar) {
        eri eriVar = this.d;
        l6e l6eVarF = null;
        if (eriVar != null && this.c != null) {
            l6eVarF = q6eVar.f(eriVar);
        }
        f(l6eVarF, false, false);
        c(false);
    }

    public final eri b() {
        eri eriVar = this.d;
        if (eriVar != null) {
            return eriVar;
        }
        eri.a.getClass();
        return cri.b;
    }

    public final void c(boolean z) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((kg) obj).q(b(), z);
        }
    }

    public final boolean e(long j) {
        l6e l6eVarC = this.b.c(j);
        boolean zF = f(l6eVarC, false, false);
        if (zF) {
            this.c = l6eVarC;
            c(false);
        }
        return zF;
    }

    public final boolean f(eri eriVar, boolean z, boolean z2) {
        if (eriVar == null) {
            eriVar = this.b.b();
        }
        if (Objects.equals(this.d, eriVar)) {
            return false;
        }
        this.d = eriVar;
        if (!z2) {
            return true;
        }
        c(z);
        return true;
    }
}
