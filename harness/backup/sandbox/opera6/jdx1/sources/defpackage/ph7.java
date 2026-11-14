package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class ph7 implements Function1 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ lqh b;

    public /* synthetic */ ph7(lqh lqhVar) {
        this.b = lqhVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        lqh lqhVar = this.b;
        switch (b) {
            case 0:
                rh7 rh7Var = (rh7) obj;
                if (!rh7Var.n) {
                    break;
                } else {
                    if (rh7Var.p != null) {
                        a8b.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                    }
                    rh7Var.p = null;
                    lqhVar.a = lqhVar.a;
                    break;
                }
            default:
                if (!((bma) obj).q) {
                    break;
                } else {
                    lqhVar.a = false;
                    break;
                }
        }
        return t5m.a;
    }
}
