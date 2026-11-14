package defpackage;

/* loaded from: classes.dex */
public final class yu9 implements pvd {
    public static final yu9 b = new yu9(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ yu9(byte b2) {
        this.a = b2;
    }

    @Override // defpackage.pvd
    public final boolean isSupported(Class cls) {
        switch (this.a) {
            case 0:
                return hv9.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // defpackage.pvd
    public final ekh messageInfoFor(Class cls) {
        switch (this.a) {
            case 0:
                if (!hv9.class.isAssignableFrom(cls)) {
                    qp2.o("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (ekh) hv9.d(cls.asSubclass(hv9.class)).c(3);
                } catch (Exception e) {
                    h9o.s("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
