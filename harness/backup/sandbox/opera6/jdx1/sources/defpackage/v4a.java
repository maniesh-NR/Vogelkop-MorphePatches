package defpackage;

import androidx.gridlayout.widget.GridLayout;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class v4a {
    public static final v4a e = GridLayout.l(LinearLayoutManager.INVALID_OFFSET, 1, GridLayout.p, 0.0f);
    public final boolean a;
    public final s4a b;
    public final nb6 c;
    public final float d;

    public v4a(boolean z, s4a s4aVar, nb6 nb6Var, float f) {
        this.a = z;
        this.b = s4aVar;
        this.c = nb6Var;
        this.d = f;
    }

    public final nb6 a(boolean z) {
        l4a l4aVar = GridLayout.p;
        nb6 nb6Var = this.c;
        return nb6Var != l4aVar ? nb6Var : this.d == 0.0f ? z ? GridLayout.s : GridLayout.x : GridLayout.y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4a)) {
            return false;
        }
        v4a v4aVar = (v4a) obj;
        return this.c.equals(v4aVar.c) && this.b.equals(v4aVar.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
