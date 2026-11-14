package defpackage;

/* loaded from: classes.dex */
public final class i2d extends ua7 {
    public final /* synthetic */ byte e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2d(Object obj, byte b) {
        super((byte) 21);
        this.e = b;
        this.f = obj;
    }

    public final Object y(g3d g3dVar) {
        byte b = this.e;
        Object obj = this.f;
        switch (b) {
            case 0:
                return ((ykj) obj).k(g3dVar);
            case 1:
                return ((ykj) obj).k(g3dVar);
            default:
                Float f = (Float) ((ua7) obj).y(g3dVar);
                if (f == null) {
                    return null;
                }
                return Float.valueOf(f.floatValue() * 2.55f);
        }
    }
}
