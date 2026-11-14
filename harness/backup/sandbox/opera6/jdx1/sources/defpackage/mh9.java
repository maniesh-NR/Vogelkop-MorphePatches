package defpackage;

/* loaded from: classes.dex */
public final class mh9 {
    public final h61 a;
    public final u61 b;
    public final ivg c;
    public final ph9 d;
    public final tu7 e;

    public mh9(h61 h61Var, u61 u61Var) {
        ivg ivgVar = nh9.a;
        ph9 ph9Var = new ph9(nh9.b);
        new wu5();
        this.a = h61Var;
        this.b = u61Var;
        this.c = ivgVar;
        this.d = ph9Var;
        this.e = new tu7(this, (byte) 13);
    }

    public final sam a(pam pamVar) {
        ivg ivgVar = this.c;
        ry7 ry7Var = new ry7(this, pamVar, (byte) 11);
        synchronized (((auj) ivgVar.b)) {
            sam samVar = (sam) ((y3d) ivgVar.c).get(pamVar);
            if (samVar != null) {
                if (samVar.a()) {
                    return samVar;
                }
            }
            try {
                sam samVar2 = (sam) ry7Var.invoke(new gil(ivgVar, pamVar, (byte) 14));
                synchronized (((auj) ivgVar.b)) {
                    if (((y3d) ivgVar.c).get(pamVar) == null && samVar2.a()) {
                        ((y3d) ivgVar.c).put(pamVar, samVar2);
                    }
                }
                return samVar2;
            } catch (Exception e) {
                h9o.m("Could not load font", e);
                return null;
            }
        }
    }

    public final sam b(lh9 lh9Var, ki9 ki9Var, int i, int i2) {
        int i3 = this.b.a;
        if (i3 != 0 && i3 != Integer.MAX_VALUE) {
            ki9Var = new ki9(djh.c(ki9Var.a + i3, 1, 1000));
        }
        return a(new pam(lh9Var, ki9Var, i, i2));
    }
}
