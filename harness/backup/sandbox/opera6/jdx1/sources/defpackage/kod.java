package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes.dex */
public interface kod {
    default ListenableFuture c(csh cshVar) {
        a1b a1bVarU = cshVar.u(0);
        while (a1bVarU.hasNext()) {
            if (((qjd) a1bVarU.next()).b == null) {
                return yr9.b(new UnsupportedOperationException());
            }
        }
        return yr9.c(cshVar);
    }
}
