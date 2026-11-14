package defpackage;

import java.util.ArrayList;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class fd implements w6f {
    public static final jf e = new jf(new ve5((byte) 5), null, false, false, 54);
    public final whf a;
    public yk5 b = new yk5(false, false, false, false, false);
    public final ArrayList c = new ArrayList();
    public final i7f d = new i7f();

    public fd(whf whfVar) {
        this.a = whfVar;
    }

    @Override // defpackage.w6f
    public final void F(Object obj) {
        ed edVar = (ed) obj;
        this.d.b(edVar);
        edVar.a();
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        this.d.c((ed) obj);
    }

    public final void a(id idVar) {
        this.c.add(idVar);
        c();
    }

    public final boolean b(pc pcVar) {
        jf jfVarE = e(pcVar);
        if (jfVarE != null) {
            return jfVarE.f;
        }
        return false;
    }

    public final void c() {
        g7f g7fVar = new g7f(this.d);
        while (g7fVar.hasNext()) {
            ((ed) g7fVar.next()).a();
        }
    }

    public final jf e(pc pcVar) {
        jf jfVarA;
        q1i it = new r1i(this.c).iterator();
        do {
            ListIterator listIterator = (ListIterator) it.b;
            if (!listIterator.hasPrevious()) {
                return null;
            }
            jfVarA = ((id) listIterator.previous()).a(this.b, pcVar);
        } while (jfVarA == null);
        return jf.a(jfVarA, new g9(this, pcVar, jfVarA, (byte) 1), null, null, false, 62);
    }

    public final jf f(pc pcVar, pc pcVar2) {
        jf jfVarE = e(pcVar);
        if (jfVarE == null) {
            return null;
        }
        xc xcVar = jfVarE.c;
        if (xcVar == null) {
            xcVar = pcVar.a;
        }
        return jf.a(jfVarE, null, xcVar, pcVar2, false, 43);
    }
}
