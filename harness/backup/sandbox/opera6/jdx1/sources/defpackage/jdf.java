package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ljdf;", "Lh8e;", "Lkdf;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class jdf extends h8e {
    public final Function1 b;

    public jdf(Function1 function1) {
        this.b = function1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && jdf.class == obj.getClass() && this.b == ((jdf) obj).b;
        }
        return true;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        return new kdf(this.b);
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        kdf kdfVar = (kdf) b8eVar;
        kdfVar.getClass();
        kdfVar.o = this.b;
        xsh xshVar = kdfVar.t;
        if (xshVar != null) {
            kdfVar.T0(xshVar);
        }
    }

    public final int hashCode() {
        return this.b.hashCode() + 1602224128;
    }
}
