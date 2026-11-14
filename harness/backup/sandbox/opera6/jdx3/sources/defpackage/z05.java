package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class z05 extends fp4 {
    public final List h;
    public final bre i;
    public final boolean j;
    public final boolean k;

    public z05(yla ylaVar, long j, String str, String str2, List list, List list2, List list3, int i, boolean z, boolean z2) {
        super(ylaVar, j, str, str2, list, list2);
        List listUnmodifiableList = Collections.unmodifiableList(list3);
        this.h = listUnmodifiableList;
        bre breVar = null;
        if (i != -1 && i >= 0 && i < listUnmodifiableList.size()) {
            breVar = (bre) listUnmodifiableList.get(i);
        }
        this.i = breVar;
        this.j = z;
        this.k = breVar != null && z2;
    }

    @Override // defpackage.fp4, defpackage.qtm, defpackage.d93
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z05.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        z05 z05Var = (z05) obj;
        return this.j == z05Var.j && this.k == z05Var.k && this.h.equals(z05Var.h) && Objects.equals(this.i, z05Var.i);
    }

    @Override // defpackage.fp4, defpackage.qtm, defpackage.d93
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.h, this.i, Boolean.valueOf(this.j), Boolean.valueOf(this.k));
    }
}
