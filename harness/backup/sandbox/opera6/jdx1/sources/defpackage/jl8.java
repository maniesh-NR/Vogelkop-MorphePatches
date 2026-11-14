package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class jl8 {
    public final ArrayList a;
    public final wd2 b;
    public final dk4 c;
    public final int d;
    public final LinkedHashMap e;
    public final Integer f;
    public final kl8 g;
    public final h81 h;

    public jl8(ArrayList arrayList, wd2 wd2Var, dk4 dk4Var, int i, LinkedHashMap linkedHashMap, Integer num, kl8 kl8Var, h81 h81Var) {
        this.a = arrayList;
        this.b = wd2Var;
        this.c = dk4Var;
        this.d = i;
        this.e = linkedHashMap;
        this.f = num;
        this.g = kl8Var;
        this.h = h81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jl8) {
            jl8 jl8Var = (jl8) obj;
            if (this.a.equals(jl8Var.a) && this.b == jl8Var.b && Intrinsics.a(this.c, jl8Var.c) && this.d == jl8Var.d && this.e.equals(jl8Var.e) && this.f.equals(jl8Var.f) && this.g == jl8Var.g && Intrinsics.a(this.h, jl8Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + rfp.c(this.d, (this.c.hashCode() + ((this.b.hashCode() + z1m.g(this.a, 62, 31)) * 31)) * 31, 31)) * 31)) * 31)) * 31;
        h81 h81Var = this.h;
        return iHashCode + (h81Var == null ? 0 : h81Var.hashCode());
    }

    public final String toString() {
        return "ExtensionSessionConfigData(sessionType=2, outputConfigurations=" + this.a + ", executor=" + this.b + ", stateCallback=" + this.c + ", sessionTemplateId=" + this.d + ", sessionParameters=" + this.e + ", extensionMode=" + this.f + ", extensionStateCallback=" + this.g + ", postviewOutputConfiguration=" + this.h + ')';
    }
}
