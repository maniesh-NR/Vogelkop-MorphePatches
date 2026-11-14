package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class gu4 {
    public final long a;
    public final String b;
    public final String c;
    public final ru4 d;
    public final su4 e;
    public final boolean f;
    public final Boolean g;
    public final qu4 h;
    public final ArrayList i;

    public gu4(long j, String str, String str2, ru4 ru4Var, su4 su4Var, boolean z, Boolean bool, qu4 qu4Var, ArrayList arrayList) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = ru4Var;
        this.e = su4Var;
        this.f = z;
        this.g = bool;
        this.h = qu4Var;
        this.i = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu4)) {
            return false;
        }
        gu4 gu4Var = (gu4) obj;
        return this.a == gu4Var.a && this.b.equals(gu4Var.b) && Intrinsics.a(this.c, gu4Var.c) && this.d == gu4Var.d && this.e == gu4Var.e && this.f == gu4Var.f && Intrinsics.a(this.g, gu4Var.g) && Intrinsics.a(this.h, gu4Var.h) && this.i.equals(gu4Var.i);
    }

    public final int hashCode() {
        int iF = z1m.f(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iK = fki.k((this.e.hashCode() + ((this.d.hashCode() + ((iF + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.f);
        Boolean bool = this.g;
        int iHashCode = (iK + (bool == null ? 0 : bool.hashCode())) * 31;
        qu4 qu4Var = this.h;
        return this.i.hashCode() + ((iHashCode + (qu4Var != null ? qu4Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = sko.q(this.a, "Chat(chatId=", ", title=", this.b);
        sbQ.append(", userId=");
        sbQ.append(this.c);
        sbQ.append(", position=");
        sbQ.append(this.d);
        sbQ.append(", state=");
        sbQ.append(this.e);
        sbQ.append(", hasContent=");
        sbQ.append(this.f);
        sbQ.append(", isPrivate=");
        sbQ.append(this.g);
        sbQ.append(", modifiers=");
        sbQ.append(this.h);
        sbQ.append(", messages=");
        sbQ.append(this.i);
        sbQ.append(")");
        return sbQ.toString();
    }
}
