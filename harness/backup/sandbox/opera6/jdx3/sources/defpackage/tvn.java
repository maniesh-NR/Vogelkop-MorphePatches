package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes.dex */
public final class tvn {
    public final int a;
    public final b b;
    public final c c;
    public final boolean d;
    public final nak e;

    public tvn(int i, b bVar, c cVar, boolean z) {
        nak nakVarF = z4o.f((Object) null);
        this.a = i;
        this.b = bVar;
        this.c = cVar;
        this.d = z;
        this.e = nakVarF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tvn) {
            tvn tvnVar = (tvn) obj;
            return this.a == tvnVar.a && Intrinsics.a(this.b, tvnVar.b) && this.c.equals(tvnVar.c) && this.d == tvnVar.d && this.e == tvnVar.e;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        b bVar = this.b;
        return this.e.hashCode() + fki.k(z1m.h(this.c.a, (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31), 31, this.d);
    }

    public final String toString() {
        return "WebSocketRequest(id=" + this.a + ", originalId=" + this.b + ", json=" + this.c + ", isSubscription=" + this.d + ", result=" + this.e + ")";
    }
}
