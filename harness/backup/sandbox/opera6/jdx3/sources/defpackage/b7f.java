package defpackage;

import java.util.Objects;
import java.util.function.Supplier;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;

/* loaded from: classes.dex */
public final class b7f extends u73 implements Supplier, s37, j4f, e9e {
    public h7f a;
    public Object b;

    public b7f(Object obj, boolean z) {
        this.b = obj;
    }

    @Override // defpackage.j4f
    public final void a(Callback callback) {
        h7f h7fVar = this.a;
        if (h7fVar != null) {
            h7fVar.c(callback);
        }
    }

    @Override // defpackage.e9e
    public final Object b(Callback callback) {
        return c(callback);
    }

    @Override // defpackage.e9e
    public final Object c(Callback callback) {
        h7f h7fVar = this.a;
        if (h7fVar == null) {
            h7fVar = new h7f();
            this.a = h7fVar;
        }
        h7fVar.b(callback);
        Object obj = this.b;
        if (obj == null) {
            return obj;
        }
        ThreadUtils.c(new jbd(this, obj, callback, (byte) 7));
        return obj;
    }

    public final void d(Object obj) {
        Object obj2 = this.b;
        this.b = obj;
        if (this.a == null || Objects.equals(obj2, obj)) {
            return;
        }
        h7f h7fVar = this.a;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((Callback) g7fVarH.next()).c(obj);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.b;
    }
}
