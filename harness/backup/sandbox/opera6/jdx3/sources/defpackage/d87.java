package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ld87;", "Lh8e;", "Le87;", "catalog"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class d87 extends h8e {
    public final hkf b;

    public d87(hkf hkfVar) {
        this.b = hkfVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof d87) && this.b == ((d87) obj).b;
        }
        return true;
    }

    public final b8e f() {
        return new e87(this.b);
    }

    public final /* bridge */ /* synthetic */ void h(b8e b8eVar) {
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "";
    }
}
