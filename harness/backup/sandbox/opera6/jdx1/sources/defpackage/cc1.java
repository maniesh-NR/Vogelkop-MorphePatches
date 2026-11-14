package defpackage;

import android.view.View;
import android.view.WindowInsets;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class cc1 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c6n b;
    public final /* synthetic */ m3c c;

    public /* synthetic */ cc1(c6n c6nVar, m3c m3cVar, byte b) {
        this.a = b;
        this.b = c6nVar;
        this.c = m3cVar;
    }

    public final Object invoke(Object obj) {
        WindowInsets windowInsetsF;
        byte b = this.a;
        m3c m3cVar = this.c;
        c6n c6nVar = this.b;
        switch (b) {
            case 0:
                a26.P(c6nVar, m3cVar);
                c6nVar.c.C = true;
                int[] iArr = c6nVar.n;
                int i = iArr[0];
                int i2 = iArr[1];
                View view = c6nVar.b;
                view.getLocationOnScreen(iArr);
                long j = c6nVar.o;
                long jH = ((b2c) obj).h();
                c6nVar.o = jH;
                g3o g3oVar = c6nVar.p;
                if (g3oVar != null && ((i != iArr[0] || i2 != iArr[1] || !gcb.a(j, jH)) && (windowInsetsF = c6nVar.h(g3oVar).f()) != null)) {
                    view.dispatchApplyWindowInsets(windowInsetsF);
                }
                break;
            case 1:
                View view2 = c6nVar.b;
                v31 v31Var = (v31) obj;
                if (!(v31Var instanceof v31)) {
                    v31Var = null;
                }
                if (v31Var != null) {
                    ((HashMap) v31Var.g().b).put(c6nVar, m3cVar);
                    v31Var.g().addView(c6nVar);
                    ((HashMap) v31Var.g().c).put(m3cVar, c6nVar);
                    c6nVar.setImportantForAccessibility(1);
                    r5n.l(c6nVar, new q31(v31Var, m3cVar, v31Var));
                }
                if (view2.getParent() != c6nVar) {
                    c6nVar.addView(view2);
                }
                break;
            default:
                a26.P(c6nVar, m3cVar);
                break;
        }
        return Unit.a;
    }
}
