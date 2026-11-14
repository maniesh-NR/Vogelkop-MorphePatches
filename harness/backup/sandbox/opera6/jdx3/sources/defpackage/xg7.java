package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.opera.android.BrowserActivity;
import com.opera.android.Lazy;
import com.opera.android.uninstall.UninstallActivity;
import com.opera.android.uninstall.UninstallSurveyFragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class xg7 implements lkf, mkf {
    public final /* synthetic */ byte a = 2;
    public final Object b;

    public xg7(Context context, nw3 nw3Var, nw3 nw3Var2, nw3 nw3Var3, gx3 gx3Var, nw3 nw3Var4, fx3 fx3Var) {
        this.b = new ywe(context, nw3Var, nw3Var2, nw3Var3, gx3Var, nw3Var4, fx3Var);
    }

    public xg7(BrowserActivity browserActivity, nw3 nw3Var, nw3 nw3Var2, kze kzeVar, zv3 zv3Var, sw3 sw3Var, sw3 sw3Var2, Lazy lazy, sw3 sw3Var3, j4c j4cVar, rw3 rw3Var, rw3 rw3Var2, sw3 sw3Var4, zv3 zv3Var2, Lazy lazy2, zv3 zv3Var3, nw3 nw3Var3, nw3 nw3Var4) {
        this.b = new srn(browserActivity, nw3Var, nw3Var2, kzeVar, zv3Var, sw3Var, sw3Var2, lazy, sw3Var3, j4cVar, rw3Var, rw3Var2, sw3Var4, zv3Var2, lazy2, zv3Var3, nw3Var3, nw3Var4);
    }

    public xg7(UninstallActivity uninstallActivity) {
        this.b = uninstallActivity;
    }

    public xg7(dw3 dw3Var, dw3 dw3Var2, ew3 ew3Var) {
        this.b = new mm3(dw3Var, dw3Var2, ew3Var, (byte) 1);
    }

    public xg7(dx3 dx3Var, dw3 dw3Var, j4c j4cVar, dw3 dw3Var2, uu1 uu1Var, dw3 dw3Var3, ew3 ew3Var, ew3 ew3Var2, wyn wynVar, umi umiVar, dw3 dw3Var4, dw3 dw3Var5, dw3 dw3Var6, dw3 dw3Var7, dw3 dw3Var8) {
        this.b = new zqc(dx3Var, dw3Var, j4cVar, dw3Var2, uu1Var, dw3Var3, ew3Var, ew3Var2, wynVar, umiVar, dw3Var4, dw3Var5, dw3Var6, dw3Var7, dw3Var8);
    }

    public xg7(gjm gjmVar) {
        this.b = new gxk(gjmVar, (byte) 1);
    }

    public xg7(ki kiVar) {
        this.b = new gxk(kiVar, (byte) 0);
    }

    public xg7(nw3 nw3Var, Lazy lazy, Lazy lazy2, j4c j4cVar, mw3 mw3Var, nw3 nw3Var2, mw3 mw3Var2, umi umiVar, gjm gjmVar, j4c j4cVar2, Lazy lazy3, e4i e4iVar) {
        this.b = new uln(nw3Var, lazy, lazy2, j4cVar, mw3Var, nw3Var2, mw3Var2, umiVar, gjmVar, j4cVar2, lazy3, e4iVar);
    }

    @Override // defpackage.mkf
    public final l7n a(Class cls) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
                return null;
            case 4:
                if (!Intrinsics.a(cls, rlm.class)) {
                    return null;
                }
                w6j w6jVar = ((UninstallActivity) this.b).d;
                return new rlm(w6jVar != null ? w6jVar : null);
            case 5:
            case 6:
            default:
                return null;
        }
    }

    public final Fragment b(Class cls) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((mm3) obj).b(cls);
            case 1:
                return ((zqc) obj).b(cls);
            case 2:
                return ((ywe) obj).b(cls);
            case 3:
                return ((gxk) obj).b(cls);
            case 4:
                if (Intrinsics.a(cls, UninstallSurveyFragment.class)) {
                    return new UninstallSurveyFragment();
                }
                return null;
            case 5:
                return ((uln) obj).b(cls);
            case 6:
                return ((gxk) obj).b(cls);
            default:
                return ((srn) obj).b(cls);
        }
    }
}
