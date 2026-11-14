package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lsub;", "Lh8e;", "Luub;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class sub extends h8e {
    public final Function1 b;
    public final Function1 c;

    public sub(Function1 function1, Function1 function12) {
        this.b = function1;
        this.c = function12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sub)) {
            return false;
        }
        sub subVar = (sub) obj;
        return this.b == subVar.b && this.c == subVar.c;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        uub uubVar = new uub();
        uubVar.o = this.b;
        uubVar.p = this.c;
        return uubVar;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        uub uubVar = (uub) b8eVar;
        uubVar.o = this.b;
        uubVar.p = this.c;
    }

    public final int hashCode() {
        Function1 function1 = this.b;
        int iHashCode = (function1 != null ? function1.hashCode() : 0) * 31;
        Function1 function12 = this.c;
        return iHashCode + (function12 != null ? function12.hashCode() : 0);
    }
}
