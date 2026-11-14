package defpackage;

import java.util.Objects;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class tr2 implements es2 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Object b;

    public tr2(Function1 function1) {
        this.b = function1;
    }

    public tr2(wr2 wr2Var) {
        Objects.requireNonNull(wr2Var);
        this.b = wr2Var;
    }

    @Override // defpackage.es2
    public final void a(String str) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((wr2) obj).r.H(str);
                break;
            default:
                ((Function1) obj).invoke(str);
                break;
        }
    }
}
