package defpackage;

import java.lang.ref.SoftReference;

/* loaded from: classes.dex */
public final class v15 extends ClassValue {
    @Override // java.lang.ClassValue
    public final Object computeValue(Class cls) {
        zee zeeVar = new zee();
        zeeVar.a = new SoftReference(null);
        return zeeVar;
    }
}
