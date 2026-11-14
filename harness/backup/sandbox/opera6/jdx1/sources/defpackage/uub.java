package defpackage;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class uub extends b8e implements tub {
    public Function1 o;
    public Function1 p;

    @Override // defpackage.tub
    public final boolean V(KeyEvent keyEvent) {
        Function1 function1 = this.p;
        if (function1 != null) {
            return ((Boolean) function1.invoke(new oub(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // defpackage.tub
    public final boolean c0(KeyEvent keyEvent) {
        Function1 function1 = this.o;
        if (function1 != null) {
            return ((Boolean) function1.invoke(new oub(keyEvent))).booleanValue();
        }
        return false;
    }
}
