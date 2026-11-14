package defpackage;

import android.view.Surface;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class fg4 implements AutoCloseable {
    public final Surface a;
    public final int b;
    public final af2 c;
    public final /* synthetic */ gg4 d;

    public fg4(gg4 gg4Var, Surface surface) {
        this.d = gg4Var;
        this.a = surface;
        bf2 bf2Var = gg4.d;
        bf2Var.getClass();
        this.b = bf2.b.incrementAndGet(bf2Var);
        this.c = c26.i(false);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Surface surface;
        List<btm> listK0;
        if (this.c.a()) {
            gg4 gg4Var = this.d;
            synchronized (gg4Var.a) {
                surface = this.a;
                Integer num = (Integer) gg4Var.b.get(surface);
                if (num == null) {
                    throw new IllegalStateException(("Surface " + surface + " (" + this + ") has no use count").toString());
                }
                int iIntValue = num.intValue() - 1;
                gg4Var.b.put(surface, Integer.valueOf(iIntValue));
                if (iIntValue == 0) {
                    listK0 = CollectionsKt.k0(gg4Var.c);
                    gg4Var.b.remove(surface);
                } else {
                    listK0 = null;
                }
            }
            if (listK0 != null) {
                for (btm btmVar : listK0) {
                    synchronized (btmVar.e) {
                        g07 g07Var = (g07) btmVar.g.remove(surface);
                        if (g07Var != null) {
                            if (gyg.G(3, "CXCP")) {
                                g07Var.toString();
                            }
                            btmVar.c.e(g07Var);
                            try {
                                g07Var.b();
                            } catch (IllegalStateException unused) {
                                if (gyg.G(5, "CXCP")) {
                                    Objects.toString(surface);
                                }
                            }
                            btmVar.e();
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        return "SurfaceToken-" + this.b;
    }
}
