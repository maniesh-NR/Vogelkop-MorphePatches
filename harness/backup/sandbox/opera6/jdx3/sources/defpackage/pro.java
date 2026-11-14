package defpackage;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.c;

/* loaded from: classes.dex */
public final class pro {
    public final String a;
    public final sm b;
    public final eq c;
    public final wjo d;
    public final String e = UUID.randomUUID().toString();
    public final Boolean f = fcp.d;
    public final String g = aap.f().K;
    public final String h = aap.f().y;
    public final c i = aap.f().z;

    public pro(String str, sm smVar, eq eqVar, wjo wjoVar) {
        this.a = str;
        this.b = smVar;
        this.c = eqVar;
        this.d = wjoVar;
        sm smVar2 = sm.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pro)) {
            return false;
        }
        pro proVar = (pro) obj;
        return Intrinsics.a(this.a, proVar.a) && this.b == proVar.b && Intrinsics.a(this.c, proVar.c) && this.d == proVar.d;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        eq eqVar = this.c;
        return this.d.hashCode() + ((iHashCode + (eqVar == null ? 0 : eqVar.hashCode())) * 31);
    }

    public final String toString() {
        return "AdRequestInfo(placementId=" + this.a + ", adFormat=" + this.b + ", adSize=" + this.c + ", auctionType=" + this.d + ')';
    }
}
