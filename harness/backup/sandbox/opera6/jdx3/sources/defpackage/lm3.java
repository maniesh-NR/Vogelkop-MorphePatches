package defpackage;

import androidx.fragment.app.Fragment;
import com.opera.android.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class lm3 implements lkf, mkf {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public lm3(ew3 ew3Var) {
        this.a = (byte) 2;
        this.b = new r2b();
        this.c = new s2b(ew3Var, (byte) 0);
    }

    public lm3(gjm gjmVar, qcf qcfVar) {
        this.a = (byte) 1;
        this.b = gjmVar;
        this.c = qcfVar;
    }

    public lm3(lw3 lw3Var, wv1 wv1Var, ew3 ew3Var, ew3 ew3Var2, lw3 lw3Var2, Lazy lazy, Lazy lazy2, Lazy lazy3, lw3 lw3Var3, lw3 lw3Var4, tvg tvgVar, wv1 wv1Var2, Lazy lazy4, j4c j4cVar, Lazy lazy5, wv1 wv1Var3, ew3 ew3Var3, nu3 nu3Var) {
        this.a = (byte) 3;
        this.b = new ovg(lw3Var, wv1Var, ew3Var, lw3Var2, lazy, lazy2, lazy3, lw3Var3, tvgVar, wv1Var2, lazy4);
        this.c = new pvg(lazy3, wv1Var, lw3Var3, lazy2, j4cVar, lazy5, lw3Var4, wv1Var3, lw3Var2, ew3Var3, ew3Var, ew3Var2, nu3Var);
    }

    public lm3(yv3 yv3Var, yv3 yv3Var2, dw3 dw3Var, dw3 dw3Var2, Lazy lazy) {
        this.a = (byte) 0;
        this.b = new mm3(yv3Var, yv3Var2, lazy, (byte) 0);
        this.c = new nm3(yv3Var, dw3Var, dw3Var2);
    }

    @Override // defpackage.mkf
    public final l7n a(Class cls) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return ((nm3) obj).a(cls);
            case 1:
                return null;
            case 2:
                return ((s2b) obj).a(cls);
            default:
                return ((pvg) obj).a(cls);
        }
    }

    public final Fragment b(Class cls) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((mm3) obj).b(cls);
            case 1:
                qcf qcfVar = (qcf) this.c;
                gjm gjmVar = (gjm) obj;
                if (Intrinsics.a(cls, nt1.class)) {
                    return new nt1(gjmVar, qcfVar);
                }
                if (Intrinsics.a(cls, skj.class)) {
                    return new skj(gjmVar, qcfVar);
                }
                return null;
            case 2:
                return ((r2b) obj).b(cls);
            default:
                return ((ovg) obj).b(cls);
        }
    }
}
