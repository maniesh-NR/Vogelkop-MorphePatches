package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class st6 implements dsk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ st6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object get() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                try {
                    return (ird) ((Class) obj).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    h9o.o(e);
                    return null;
                }
            default:
                return (jx6) obj;
        }
    }
}
