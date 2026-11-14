package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class u42 {
    public final y42 a;
    public final x42 b;
    public final pu4 c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;

    public u42(y42 y42Var, x42 x42Var, pu4 pu4Var, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.a = y42Var;
        this.b = x42Var;
        this.c = pu4Var;
        this.d = linkedHashMap;
        this.e = linkedHashMap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u42)) {
            return false;
        }
        u42 u42Var = (u42) obj;
        return this.a == u42Var.a && this.b == u42Var.b && this.c.equals(u42Var.c) && this.d.equals(u42Var.d) && this.e.equals(u42Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AriaState(state=" + this.a + ", inputState=" + this.b + ", activeChat=" + this.c + ", chats=" + this.d + ", uploadedFiles=" + this.e + ")";
    }
}
