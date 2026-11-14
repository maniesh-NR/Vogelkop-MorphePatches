package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class za1 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eb1 b;

    public /* synthetic */ za1(eb1 eb1Var, byte b) {
        this.a = b;
        this.b = eb1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        eb1 eb1Var = this.b;
        switch (b) {
            case 0:
                Function0 function0 = (Function0) obj;
                View view = eb1Var.a;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function0.invoke();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new l31(function0, (byte) 1));
                    }
                }
                return Unit.a;
            case 1:
                ActionMode actionMode = eb1Var.h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return Unit.a;
            case 2:
                ActionMode actionMode2 = eb1Var.h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return Unit.a;
            default:
                eb1Var.e.f();
                return new ci(eb1Var, (byte) 3);
        }
    }
}
