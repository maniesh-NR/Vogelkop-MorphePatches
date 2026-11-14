package defpackage;

import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ig5 extends kuk implements Function2 {
    public boolean t;
    public final /* synthetic */ lg5 u;
    public final /* synthetic */ ScrollCaptureSession v;
    public final /* synthetic */ Rect w;
    public final /* synthetic */ Consumer x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig5(lg5 lg5Var, ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer consumer, mt5 mt5Var) {
        super(2, mt5Var);
        this.u = lg5Var;
        this.v = scrollCaptureSession;
        this.w = rect;
        this.x = consumer;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        return new ig5(this.u, this.v, this.w, this.x, mt5Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        px5 px5Var = px5.a;
        boolean z = this.t;
        if (!z) {
            ybh.y(obj);
            ScrollCaptureSession scrollCaptureSession = this.v;
            Rect rect = this.w;
            ccb ccbVar = new ccb(rect.left, rect.top, rect.right, rect.bottom);
            this.t = true;
            obj = this.u.a(scrollCaptureSession, ccbVar, this);
            if (obj == px5Var) {
                return px5Var;
            }
        } else {
            if (!z) {
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ybh.y(obj);
        }
        this.x.accept(xvg.u((ccb) obj));
        return Unit.a;
    }
}
