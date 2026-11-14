package defpackage;

import androidx.recyclerview.widget.d;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class iy0 extends xph {
    public final /* synthetic */ byte c = 1;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy0(gn3 gn3Var, xm3 xm3Var) {
        super(xm3Var);
        Objects.requireNonNull(gn3Var);
        this.d = gn3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy0(jy0 jy0Var) {
        super(jy0Var);
        this.d = jy0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy0(wg7 wg7Var, d dVar) {
        super(dVar);
        this.d = wg7Var;
    }

    @Override // defpackage.xph
    public final boolean a(int i) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                return ((fy0) ((ArrayList) ((jy0) obj).f.c).get(i)).c() == ey0.b;
            case 1:
                return ((gn3) obj).s.H(i).a();
            default:
                return ((xe7) ((wg7) obj).z.b.f(i)).d != null;
        }
    }
}
