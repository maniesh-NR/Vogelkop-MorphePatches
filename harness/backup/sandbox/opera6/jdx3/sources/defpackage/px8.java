package defpackage;

import android.content.Context;
import android.view.View;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class px8 {
    public final int a;
    public final pxh b;
    public final int c;
    public final msh d;
    public final ox8 e;

    public px8(msh mshVar, int i, pxh pxhVar, int i2, ox8 ox8Var) {
        this.a = i;
        this.b = pxhVar;
        this.c = i2;
        this.d = mshVar;
        this.e = ox8Var;
    }

    public abstract List a(Context context, msh mshVar);

    public int b() {
        return 0;
    }

    public void c(View view) {
        Context context = view.getContext();
        List listA = a(view.getContext(), this.d);
        ox8 ox8Var = this.e;
        bm8 bm8Var = new bm8(ox8Var, (byte) 5);
        if (listA == null || listA.isEmpty()) {
            ox8Var.f(Collections.EMPTY_LIST);
            return;
        }
        int iB = b();
        u7k u7kVarF = u7k.f(4);
        u7kVarF.s(iB);
        itl itlVar = (itl) u7kVarF.a;
        itlVar.k = 2;
        itlVar.d = true;
        ly4 ly4Var = new ly4(itlVar);
        ly4Var.r = listA;
        ly4Var.s = bm8Var;
        new zhj(new wzg(ly4Var, ly4.class, (byte) 4), null, 2, -1, null, false, Arrays.asList(new n6h[0])).c(context);
    }
}
