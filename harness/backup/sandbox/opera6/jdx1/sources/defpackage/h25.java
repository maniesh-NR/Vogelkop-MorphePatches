package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lh25;", "Lh8e;", "Liw5;", "Lg0j;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h25 extends h8e implements g0j {
    public final Function1 b;

    public h25(Function1 function1) {
        this.b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h25) {
            return this.b == ((h25) obj).b;
        }
        return false;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        return new iw5(false, true, this.b);
    }

    @Override // defpackage.g0j
    public final f0j g() {
        f0j f0jVar = new f0j();
        f0jVar.c = false;
        f0jVar.d = true;
        this.b.invoke(f0jVar);
        return f0jVar;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        ((iw5) b8eVar).q = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
