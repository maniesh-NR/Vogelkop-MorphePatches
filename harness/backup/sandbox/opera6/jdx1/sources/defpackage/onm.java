package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lonm;", "Lh8e;", "Lpnm;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class onm extends h8e {
    public final float b;
    public final float c;

    public onm(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof onm)) {
            return false;
        }
        onm onmVar = (onm) obj;
        return gh7.b(this.b, onmVar.b) && gh7.b(this.c, onmVar.c);
    }

    @Override // defpackage.h8e
    public final b8e f() {
        pnm pnmVar = new pnm();
        pnmVar.o = this.b;
        pnmVar.p = this.c;
        return pnmVar;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        pnm pnmVar = (pnm) b8eVar;
        pnmVar.o = this.b;
        pnmVar.p = this.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (Float.hashCode(this.b) * 31);
    }
}
