package defpackage;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.function.Consumer;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class foi {
    public final Object a;

    public foi(byte b) {
        switch (b) {
            case 1:
                a36 a36Var = new a36();
                ioi ioiVar = new ioi();
                ioiVar.a = new hoi(a36Var);
                this.a = ioiVar;
                break;
            default:
                this.a = hyg.k(Boolean.FALSE);
                break;
        }
    }

    public static void b(ViewGroup viewGroup, ioi ioiVar) {
        viewGroup.setScrollCaptureHint(ioiVar != null ? 2 : 0);
        viewGroup.setScrollCaptureCallback(ioiVar);
    }

    public final void a(v31 v31Var, i3j i3jVar, CoroutineContext coroutineContext, Consumer consumer) {
        dfe dfeVar = new dfe(new joi[16]);
        j7h.o(i3jVar.A(), 0, new xm6(1, dfeVar, dfe.class, "add", "add(Ljava/lang/Object;)Z", 8, (byte) 1));
        Arrays.sort(dfeVar.a, 0, dfeVar.c, new vd3(new Function1[]{new bli((byte) 3), new bli((byte) 4)}, (byte) 1));
        int i = dfeVar.c;
        joi joiVar = (joi) (i == 0 ? null : dfeVar.a[i - 1]);
        if (joiVar == null) {
            return;
        }
        ccb ccbVar = joiVar.c;
        lg5 lg5Var = new lg5(joiVar.a, ccbVar, sgb.b(coroutineContext), this, v31Var);
        wye wyeVar = joiVar.d;
        voh vohVarY = rm5.v(wyeVar).y(wyeVar, true);
        long jC = ccbVar.c();
        ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(v31Var, xvg.u(f03.f0(vohVarY)), new Point((int) (jC >> 32), (int) (jC & 4294967295L)), lg5Var);
        scrollCaptureTarget.setScrollBounds(xvg.u(ccbVar));
        consumer.accept(scrollCaptureTarget);
    }
}
