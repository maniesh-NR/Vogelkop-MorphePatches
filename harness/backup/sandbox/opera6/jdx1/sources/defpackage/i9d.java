package defpackage;

/* loaded from: classes.dex */
public final class i9d implements pvd {
    public pvd[] a;

    @Override // defpackage.pvd
    public final boolean isSupported(Class cls) {
        for (pvd pvdVar : this.a) {
            if (pvdVar.isSupported(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.pvd
    public final ekh messageInfoFor(Class cls) {
        for (pvd pvdVar : this.a) {
            if (pvdVar.isSupported(cls)) {
                return pvdVar.messageInfoFor(cls);
            }
        }
        yt7.k("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }
}
