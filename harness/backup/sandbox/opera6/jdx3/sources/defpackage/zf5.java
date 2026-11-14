package defpackage;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class zf5 extends View.DragShadowBuilder {
    public final q27 a;
    public final long b;
    public final Function1 c;

    public zf5(q27 q27Var, long j, Function1 function1) {
        this.a = q27Var;
        this.b = j;
        this.c = function1;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        uh4 uh4Var = new uh4();
        d2c d2cVar = d2c.a;
        Canvas canvas2 = b31.a;
        a31 a31Var = new a31();
        a31Var.a = canvas;
        th4 th4Var = uh4Var.a;
        n27 n27Var = th4Var.a;
        d2c d2cVar2 = th4Var.b;
        sh4 sh4Var = th4Var.c;
        long j = th4Var.d;
        th4Var.a = this.a;
        th4Var.b = d2cVar;
        th4Var.c = a31Var;
        th4Var.d = this.b;
        a31Var.j();
        this.c.invoke(uh4Var);
        a31Var.f();
        th4Var.a = n27Var;
        th4Var.b = d2cVar2;
        th4Var.c = sh4Var;
        th4Var.d = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        q27 q27Var = this.a;
        point.set(q27Var.M(fIntBitsToFloat / q27Var.b()), q27Var.M(Float.intBitsToFloat((int) (j & 4294967295L)) / q27Var.b()));
        point2.set(point.x / 2, point.y / 2);
    }
}
