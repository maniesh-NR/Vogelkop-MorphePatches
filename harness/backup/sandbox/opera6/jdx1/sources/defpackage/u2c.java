package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lu2c;", "Lh8e;", "Lv2c;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class u2c extends h8e {
    public final String b;

    public u2c(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof u2c) && this.b.equals(((u2c) obj).b);
        }
        return true;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        v2c v2cVar = new v2c();
        v2cVar.o = this.b;
        return v2cVar;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        ((v2c) b8eVar).o = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + ((Object) this.b) + ")";
    }
}
