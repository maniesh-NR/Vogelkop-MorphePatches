package defpackage;

import android.view.MotionEvent;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class dc1 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c6n b;

    public /* synthetic */ dc1(c6n c6nVar, byte b) {
        this.a = b;
        this.b = c6nVar;
    }

    public final Object invoke(Object obj) {
        boolean zDispatchTouchEvent;
        byte b = this.a;
        c6n c6nVar = this.b;
        switch (b) {
            case 0:
                c6nVar.q = (Function1) obj;
                return Unit.a;
            case 1:
                v31 v31Var = (v31) obj;
                if (!(v31Var instanceof v31)) {
                    v31Var = null;
                }
                if (v31Var != null) {
                    v31Var.g().removeViewInLayout(c6nVar);
                    HashMap map = (HashMap) v31Var.g().c;
                    y9m.r(map).remove(((HashMap) v31Var.g().b).remove(c6nVar));
                    c6nVar.setImportantForAccessibility(0);
                }
                c6nVar.removeAllViewsInLayout();
                return Unit.a;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                switch (motionEvent.getActionMasked()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = c6nVar.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = c6nVar.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
        }
    }
}
