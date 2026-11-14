package defpackage;

/* loaded from: classes.dex */
public final class hj6 extends y3d implements ysd {
    public final void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        if (obj2 == null && obj3 == null) {
            super.entryRemoved(z, str, (Object) null, (Object) null);
        } else {
            h9o.t();
        }
    }

    @Override // defpackage.ysd
    public final void l(int i) {
        if (j7c.a(i, 2)) {
            evictAll();
        }
    }

    public final int sizeOf(Object obj, Object obj2) {
        throw sko.g(obj2);
    }
}
