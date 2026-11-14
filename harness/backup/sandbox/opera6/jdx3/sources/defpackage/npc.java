package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class npc {

    @NotNull
    public static final mpc Companion = new mpc();
    public static final l4c[] h = {null, null, null, z4c.a(f7c.b, new fza((byte) 21)), null, null, null};
    public final long a;
    public final String b;
    public final String c;
    public final boc d;
    public final String e;
    public final String f;
    public final String g;

    public /* synthetic */ npc(int i, long j, String str, String str2, boc bocVar, String str3, String str4, String str5) {
        if (3 != (i & 3)) {
            x7d.I(i, 3, lpc.a.getDescriptor());
            throw null;
        }
        this.a = j;
        this.b = str;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bocVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof npc)) {
            return false;
        }
        npc npcVar = (npc) obj;
        return this.a == npcVar.a && Intrinsics.a(this.b, npcVar.b) && Intrinsics.a(this.c, npcVar.c) && this.d == npcVar.d && Intrinsics.a(this.e, npcVar.e) && Intrinsics.a(this.f, npcVar.f) && Intrinsics.a(this.g, npcVar.g);
    }

    public final int hashCode() {
        int iF = z1m.f(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        boc bocVar = this.d;
        int iHashCode2 = (iHashCode + (bocVar == null ? 0 : bocVar.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
