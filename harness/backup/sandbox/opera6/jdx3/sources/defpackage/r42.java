package defpackage;

import android.view.View;
import com.opera.android.sheet.OperaBottomSheetBehavior;

/* loaded from: classes.dex */
public final class r42 extends njf {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r42(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void i() {
    }

    private final void j(View view, float f) {
    }

    private final void k(View view, float f) {
    }

    private final void l(View view, float f) {
    }

    private final void m(View view, float f) {
    }

    @Override // defpackage.njf
    public final void b() {
        byte b = this.a;
    }

    @Override // defpackage.njf
    public final void c(View view, float f) {
        switch (this.a) {
            case 1:
                ((x79) this.b).O();
                break;
        }
    }

    @Override // defpackage.njf
    public final void d(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((t42) obj).K.r(Boolean.valueOf(i == 3));
                break;
            case 1:
                ((x79) obj).O();
                break;
            case 2:
                ((lrc) obj).D.r(Boolean.valueOf(i == 3));
                break;
            case 3:
                knh knhVar = (knh) obj;
                if (!knhVar.H) {
                    if (i == 3) {
                        knhVar.H = true;
                        knhVar.J0();
                        knhVar.I0();
                        break;
                    } else if (i == 5) {
                        vl6 vl6Var = knhVar.B;
                        ((OperaBottomSheetBehavior) (vl6Var != null ? vl6Var : null).b).I(3);
                        break;
                    }
                } else if (i == 4 || i == 5) {
                    vl6 vl6Var2 = knhVar.B;
                    (vl6Var2 != null ? vl6Var2 : null).S();
                    break;
                }
                break;
            default:
                ((mqn) obj).U.r(Boolean.valueOf(i == 3));
                break;
        }
    }
}
