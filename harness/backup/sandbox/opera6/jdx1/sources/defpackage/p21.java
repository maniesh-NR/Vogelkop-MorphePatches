package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillId;

/* loaded from: classes.dex */
public final class p21 implements cg9 {
    public final s6h a;
    public final i3j b;
    public final v31 c;
    public final yoh d;
    public final String e;
    public final Rect f = new Rect();
    public final AutofillId g;
    public final kde h;
    public boolean i;

    /* JADX INFO: Thrown type has an unknown type hierarchy: pxb */
    public p21(s6h s6hVar, i3j i3jVar, v31 v31Var, yoh yohVar, String str) throws pxb {
        this.a = s6hVar;
        this.b = i3jVar;
        this.c = v31Var;
        this.d = yohVar;
        this.e = str;
        v31Var.setImportantForAutofill(1);
        AutofillId autofillId = v31Var.getAutofillId();
        if (autofillId == null) {
            throw vep.q("Required value was null.");
        }
        this.g = autofillId;
        this.h = new kde();
    }

    @Override // defpackage.cg9
    public final void a(vg9 vg9Var, vg9 vg9Var2) {
        m3c m3cVarE0;
        f0j f0jVarW;
        m3c m3cVarE02;
        f0j f0jVarW2;
        v31 v31Var = this.c;
        s6h s6hVar = this.a;
        if (vg9Var != null && (m3cVarE02 = ui6.e0(vg9Var)) != null && (f0jVarW2 = m3cVarE02.w()) != null && kfo.S(f0jVarW2)) {
            s6hVar.J().notifyViewExited(v31Var, m3cVarE02.b);
        }
        if (vg9Var2 == null || (m3cVarE0 = ui6.e0(vg9Var2)) == null || (f0jVarW = m3cVarE0.w()) == null || !kfo.S(f0jVarW)) {
            return;
        }
        int i = m3cVarE0.b;
        yoh yohVar = this.d;
        m3c m3cVar = (m3c) yohVar.a.e(i);
        if (m3cVar == null || m3cVar.g == -4) {
            return;
        }
        ro9 ro9Var = yohVar.c;
        int iD = yohVar.d(m3cVar);
        long[] jArr = (long[]) ro9Var.c;
        long j = jArr[iD];
        long j2 = jArr[iD + 1];
        s6hVar.J().notifyViewEntered(v31Var, i, new Rect((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2));
    }
}
