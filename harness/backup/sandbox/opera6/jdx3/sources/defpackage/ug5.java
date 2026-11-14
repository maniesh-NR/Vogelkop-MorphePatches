package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import com.opera.android.custom_views.StylingImageCheckableWithText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class ug5 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ug5(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public final Object invoke() {
        byte b = this.a;
        int i = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                f87 parent = ((View) obj).getParent();
                f87 f87Var = parent instanceof f87 ? parent : null;
                Window window = f87Var != null ? f87Var.getWindow() : null;
                if (window != null) {
                    mcj.s(window, p37.u0(i));
                }
                break;
            case 1:
                qe6 qe6VarH = ((on9) ((rn9) obj).d).H();
                if (qe6VarH != null) {
                    ((lba) qe6VarH.b).e(i);
                }
                break;
            case 2:
                break;
            case 3:
                StylingImageCheckableWithText stylingImageCheckableWithText = (StylingImageCheckableWithText) obj;
                stylingImageCheckableWithText.q = null;
                ValueAnimator valueAnimatorT = stylingImageCheckableWithText.t(i, 0, new dnj(stylingImageCheckableWithText, (byte) 18), false);
                stylingImageCheckableWithText.r = valueAnimatorT;
                valueAnimatorT.setStartDelay(900L);
                ValueAnimator valueAnimator = stylingImageCheckableWithText.r;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                break;
            default:
                ((z3) obj).invoke(Integer.valueOf(i));
                break;
        }
        return Unit.a;
    }
}
