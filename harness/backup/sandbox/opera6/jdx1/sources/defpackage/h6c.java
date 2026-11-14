package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class h6c extends w7d {
    public final ro9 k = new ro9((byte) 21);

    public h6c(Function1 function1) {
        function1.invoke(this);
    }

    public static void O(h6c h6cVar, String str, ue5 ue5Var, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        h6cVar.k.c(1, new g6c(str != null ? new nna((Object) str, (byte) 16) : null, new gbb((byte) 20), new ue5(-857469575, new b91(ue5Var, (byte) 2), true)));
    }

    @Override // defpackage.w7d
    public final ro9 B() {
        return this.k;
    }

    public final void P(int i, Function1 function1, Function1 function12, ue5 ue5Var) {
        this.k.c(i, new g6c(function1, function12, ue5Var));
    }
}
