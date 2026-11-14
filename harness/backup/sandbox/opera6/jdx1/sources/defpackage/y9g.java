package defpackage;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class y9g {
    public static final AtomicInteger c = new AtomicInteger(1);
    public final SparseArray a = new SparseArray();
    public final nce b;

    public y9g() {
        HashMap map = new HashMap();
        fd6 fd6Var = new fd6((byte) 4);
        nce nceVar = new nce(map);
        nceVar.g = fd6Var;
        this.b = nceVar;
    }
}
