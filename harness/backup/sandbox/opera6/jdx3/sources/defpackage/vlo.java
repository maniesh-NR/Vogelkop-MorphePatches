package defpackage;

/* loaded from: classes.dex */
public final class vlo implements ylo {
    public static final Object c = new Object();
    public volatile ylo a;
    public volatile Object b;

    public static vlo b(ylo yloVar) {
        if (yloVar instanceof vlo) {
            return (vlo) yloVar;
        }
        vlo vloVar = new vlo();
        vloVar.b = c;
        vloVar.a = yloVar;
        return vloVar;
    }

    public final Object a() {
        Object objA;
        Object obj = this.b;
        Object obj2 = c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            objA = this.b;
            if (objA == obj2) {
                objA = this.a.a();
                Object obj3 = this.b;
                if (obj3 != obj2 && obj3 != objA) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
                }
                this.b = objA;
                this.a = null;
            }
        }
        return objA;
    }
}
