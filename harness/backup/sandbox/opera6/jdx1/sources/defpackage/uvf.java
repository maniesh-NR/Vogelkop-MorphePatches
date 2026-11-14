package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Luvf;", "Lh8e;", "Lwvf;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class uvf extends h8e {
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final Function1 f;

    public uvf(float f, float f2, float f3, float f4, Function1 function1) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = function1;
        boolean z = true;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            y7b.a("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        uvf uvfVar = obj instanceof uvf ? (uvf) obj : null;
        return uvfVar != null && gh7.b(this.b, uvfVar.b) && gh7.b(this.c, uvfVar.c) && gh7.b(this.d, uvfVar.d) && gh7.b(this.e, uvfVar.e);
    }

    @Override // defpackage.h8e
    public final b8e f() {
        wvf wvfVar = new wvf();
        wvfVar.o = this.b;
        wvfVar.p = this.c;
        wvfVar.q = this.d;
        wvfVar.r = this.e;
        wvfVar.s = true;
        return wvfVar;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        wvf wvfVar = (wvf) b8eVar;
        wvfVar.o = this.b;
        wvfVar.p = this.c;
        wvfVar.q = this.d;
        wvfVar.r = this.e;
        wvfVar.s = true;
    }

    public final int hashCode() {
        return ((Float.hashCode(this.e) + sko.d(this.d, sko.d(this.c, Float.hashCode(this.b) * 31, 31), 31)) * 31) + 1231;
    }
}
