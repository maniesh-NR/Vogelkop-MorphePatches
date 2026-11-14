package defpackage;

/* loaded from: classes.dex */
public final class gqi extends l7n {
    public final pne b;
    public final sqi c;
    public final pqi d;
    public final ode e = new ode();

    public gqi(pne pneVar, sqi sqiVar, pqi pqiVar) {
        this.b = pneVar;
        this.c = sqiVar;
        this.d = pqiVar;
    }

    public static eqi f(Object obj, Object obj2) {
        String string = null;
        String string2 = obj != null ? obj.toString() : null;
        if (obj2 != null) {
            if (obj2.equals(obj)) {
                obj2 = null;
            }
            if (obj2 != null) {
                string = obj2.toString();
            }
        }
        return new eqi(string2, string);
    }
}
