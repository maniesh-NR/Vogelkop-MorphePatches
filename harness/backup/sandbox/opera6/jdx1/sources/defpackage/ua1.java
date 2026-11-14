package defpackage;

import android.util.LruCache;

/* loaded from: classes.dex */
public final class ua1 extends LruCache {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ua1(byte b, int i) {
        super(i);
        this.a = b;
    }

    @Override // android.util.LruCache
    public final void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                ((Number) obj).intValue();
                wa1 wa1Var = (wa1) obj2;
                if (z) {
                    wa1Var.close();
                    break;
                }
                break;
            default:
                super.entryRemoved(z, obj, obj2, obj3);
                break;
        }
    }

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        switch (this.a) {
            case 2:
                return ((x3d) obj2).b;
            default:
                return super.sizeOf(obj, obj2);
        }
    }
}
