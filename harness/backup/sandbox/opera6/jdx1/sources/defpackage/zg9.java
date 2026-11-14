package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lzg9;", "Lh8e;", "Lah9;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class zg9 extends h8e {
    public final lde b;

    public zg9(lde ldeVar) {
        this.b = ldeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zg9) {
            return Intrinsics.a(this.b, ((zg9) obj).b);
        }
        return false;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        return new ah9(this.b, 1, null);
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        ((ah9) b8eVar).Y0(this.b);
    }

    public final int hashCode() {
        lde ldeVar = this.b;
        if (ldeVar != null) {
            return ldeVar.hashCode();
        }
        return 0;
    }
}
