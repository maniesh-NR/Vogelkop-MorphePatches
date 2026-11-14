package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface vfd extends shb {
    ufd A(int i, int i2, Map map, z3 z3Var, Function1 function1);

    default ufd b0(int i, int i2, Map map, Function1 function1) {
        return A(i, i2, map, null, function1);
    }
}
