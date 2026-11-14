package defpackage;

import android.graphics.Color;
import com.opera.android.bar.BottomBar;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class f9l implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r9l b;

    public /* synthetic */ f9l(r9l r9lVar, byte b) {
        this.a = b;
        this.b = r9lVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        r9l r9lVar = this.b;
        switch (b) {
            case 0:
                BottomBar bottomBar = r9lVar.g.a;
                if (Color.alpha(bottomBar.c.a.a) == 255) {
                    bottomBar.animate().alpha(0.0f).setStartDelay(100L).setDuration(100L).start();
                } else {
                    bottomBar.animate().alpha(0.0f).setStartDelay(0L).setDuration(50L).start();
                }
                return Unit.a;
            case 1:
                boolean z = ((nnh) obj).a;
                if (!z) {
                    r9lVar.z.b(vr0.o);
                    r9lVar.j();
                } else if (z) {
                    g4l.e(r9lVar.D);
                }
                return Unit.a;
            case 2:
                return new asi((ge) obj, r9lVar.c, r9lVar.d, r9lVar.w, r9lVar.A);
            default:
                return new asi((ge) obj, r9lVar.c, r9lVar.d, r9lVar.w, r9lVar.A, (u3l) r9lVar.f().s.g());
        }
    }
}
