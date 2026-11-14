package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class ii7 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ni7 b;

    public /* synthetic */ ii7(ni7 ni7Var, byte b) {
        this.a = b;
        this.b = ni7Var;
    }

    public final Object invoke() {
        byte b = this.a;
        ni7 ni7Var = this.b;
        switch (b) {
            case 0:
                return Float.valueOf(((Number) ni7Var.g.invoke()).floatValue() - (ni7Var.a.getWidth() / 2.0f));
            case 1:
                return Float.valueOf(((Number) ni7Var.h.invoke()).floatValue() - (ni7Var.a.getHeight() / 2.0f));
            case 2:
                if (!ni7Var.w) {
                    ni7Var.d.invoke(Boolean.valueOf(ni7Var.k));
                    ni7Var.k = false;
                }
                return Unit.a;
            case 3:
                return Float.valueOf(ni7Var.a.getLeft());
            case 4:
                return Float.valueOf(ni7Var.a.getTop());
            default:
                return (View) ni7Var.a.getParent();
        }
    }
}
