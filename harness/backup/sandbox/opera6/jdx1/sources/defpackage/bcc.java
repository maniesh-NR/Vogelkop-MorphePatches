package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class bcc implements Function0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ruj b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ w27 e;

    public bcc(boolean z, ruj rujVar, int i, Function1 function1, w27 w27Var) {
        this.a = z;
        this.b = rujVar;
        this.c = i;
        this.d = function1;
        this.e = w27Var;
    }

    public final Object invoke() {
        int i = this.c;
        boolean z = this.a;
        ruj rujVar = this.b;
        if (z) {
        } else {
            rujVar.put(Integer.valueOf(i), Unit.a);
            this.d.invoke(this.e);
        }
        return Unit.a;
    }
}
