package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class olm extends qlm {
    public olm() {
        super("PRIMARY", 0);
    }

    @Override // defpackage.qlm
    public final boolean h(r22 r22Var, Set set) {
        if (r22Var == null) {
            return false;
        }
        if (((blm) r22Var.c) == blm.b) {
            return true;
        }
        Integer num = (Integer) CollectionsKt.a0(set);
        if (num != null) {
            return ((dlm) ((List) r22Var.d).get(num.intValue())).c == null;
        }
        return false;
    }
}
