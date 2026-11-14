package defpackage;

/* loaded from: classes.dex */
public final class mz2 {
    public final xje a;
    public final kcf b;

    /* JADX WARN: Multi-variable type inference failed */
    public mz2(xje xjeVar, kcf kcfVar) {
        this.a = xjeVar;
        this.b = kcfVar;
        if ((xjeVar == null ? kcfVar : xjeVar) != null) {
            return;
        }
        qp2.o("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }
}
