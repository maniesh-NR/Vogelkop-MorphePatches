package defpackage;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class qto {
    public static fuo a(int i) {
        h58 h58Var = fuo.g;
        w4 w4VarE = sko.e(h58Var, h58Var);
        while (w4VarE.hasNext()) {
            fuo fuoVar = (fuo) w4VarE.next();
            if (fuoVar.a == i) {
                return fuoVar;
            }
        }
        h9o.h("Collection contains no element matching the predicate.");
        return null;
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) fuo.b.getValue();
    }
}
