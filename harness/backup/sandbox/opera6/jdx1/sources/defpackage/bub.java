package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class bub implements ytb {
    public final ytb a;

    public bub(ytb ytbVar) {
        this.a = ytbVar;
    }

    public final boolean d() {
        return this.a.d();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        bub bubVar = obj instanceof bub ? (bub) obj : null;
        ytb ytbVar = bubVar != null ? bubVar.a : null;
        ytb ytbVar2 = this.a;
        if (!Intrinsics.a(ytbVar2, ytbVar)) {
            return false;
        }
        n15 n15VarG = ytbVar2.g();
        if (!(n15VarG instanceof itb)) {
            return false;
        }
        ytb ytbVar3 = obj instanceof ytb ? (ytb) obj : null;
        ktb ktbVarG = ytbVar3 != null ? ytbVar3.g() : null;
        if (ktbVarG == null || !(ktbVarG instanceof itb)) {
            return false;
        }
        return Intrinsics.a(((itb) n15VarG).a(), ((itb) ktbVarG).a());
    }

    public final ktb g() {
        return this.a.g();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final List i() {
        return this.a.i();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.a;
    }
}
