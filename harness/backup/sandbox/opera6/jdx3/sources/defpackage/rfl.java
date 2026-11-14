package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class rfl implements cr9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Drawable b;

    public /* synthetic */ rfl(Drawable drawable, byte b) {
        this.a = b;
        this.b = drawable;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        Drawable drawable = this.b;
        switch (b) {
            case 0:
                long j = ((u95) obj).a;
                vt9 vt9Var = (ih5) obj2;
                int iIntValue = ((Number) obj3).intValue();
                vt9 vt9Var2 = vt9Var;
                if (vt9Var2.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ydp.l.f(drawable, vt9Var2, 48);
                } else {
                    vt9Var2.Q();
                }
                break;
            default:
                long j2 = ((u95) obj).a;
                vt9 vt9Var3 = (ih5) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                vt9 vt9Var4 = vt9Var3;
                if (vt9Var4.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ydp.l.f(drawable, vt9Var4, 48);
                } else {
                    vt9Var4.Q();
                }
                break;
        }
        return Unit.a;
    }
}
