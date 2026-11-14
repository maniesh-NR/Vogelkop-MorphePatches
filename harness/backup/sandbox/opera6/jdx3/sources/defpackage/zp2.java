package defpackage;

import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import com.opera.android.custom_views.OperaTextInputEditText;
import java.util.LinkedHashMap;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.widget.TextViewWithClickableSpans;

/* loaded from: classes.dex */
public final /* synthetic */ class zp2 implements View.OnFocusChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zp2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, final boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                aq2 aq2Var = (aq2) obj;
                iq2 iq2Var = aq2Var.c;
                if (!z) {
                    iq2Var.J = iq2Var.J0();
                    aq2Var.b.p(iq2Var.J);
                    break;
                }
                break;
            case 1:
                fq2 fq2Var = (fq2) obj;
                if (z) {
                    fq2Var.g.getClass();
                    q9n.u(view);
                    break;
                }
                break;
            case 2:
                t35 t35Var = (t35) obj;
                t35Var.s(t35Var.t());
                break;
            case 3:
                ym7 ym7Var = (ym7) obj;
                ym7Var.l = z;
                ym7Var.p();
                if (!z) {
                    ym7Var.s(false);
                    ym7Var.m = false;
                    break;
                }
                break;
            case 4:
                g9c g9cVar = (g9c) obj;
                if (!z) {
                    g9cVar.b();
                    break;
                } else {
                    q9n.u(view);
                    g9cVar.o(view);
                    break;
                }
            case 5:
                final fge fgeVar = (fge) obj;
                if (fgeVar.C != null) {
                    ValueAnimator valueAnimator = fgeVar.G;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        fgeVar.G = null;
                    }
                    final int iA = fan.a(16.0f, fgeVar.getResources());
                    final int iA2 = fan.a(48.0f, fgeVar.getResources());
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    fgeVar.G = duration;
                    duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xfe
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            float interpolation = lf1.l.getInterpolation(valueAnimator2.getAnimatedFraction());
                            if (!z) {
                                interpolation = 1.0f - interpolation;
                            }
                            int iRound = Math.round(iA2 - ((r0 - iA) * interpolation));
                            fge fgeVar2 = fgeVar;
                            boolean zL = fgeVar2.F.l();
                            bq1 bq1Var = fgeVar2.F;
                            int paddingLeft = zL ? bq1Var.getPaddingLeft() : iRound;
                            int paddingTop = fgeVar2.F.getPaddingTop();
                            if (!zL) {
                                iRound = fgeVar2.F.getPaddingRight();
                            }
                            bq1Var.setPadding(paddingLeft, paddingTop, iRound, fgeVar2.F.getPaddingBottom());
                            fgeVar2.C.setAlpha(Math.max(0.0f, ((1.0f - interpolation) * 2.0f) - 1.0f));
                        }
                    });
                    fgeVar.G.addListener(new in8((byte) 3, fgeVar, z));
                    fgeVar.G.start();
                    break;
                }
                break;
            case 6:
                awi awiVar = (awi) obj;
                if (!z) {
                    awiVar.I0(((OperaTextInputEditText) awiVar.u.d).getText());
                    q9n.u((OperaTextInputEditText) awiVar.u.d);
                    break;
                }
                break;
            case 7:
                r9l r9lVar = (r9l) obj;
                if (!z && r9lVar.u) {
                    LinkedHashMap linkedHashMap = r9l.F;
                    p6l p6lVar = r9lVar.t.e;
                    k6l k6lVar = r9lVar.c;
                    Editable text = r9lVar.q.o.getText();
                    r9l.F.put(p6lVar, new k9l(text != null ? text.toString() : null, k6lVar.y));
                    break;
                }
                break;
            case 8:
                TextViewWithClickableSpans textViewWithClickableSpans = (TextViewWithClickableSpans) obj;
                int i = TextViewWithClickableSpans.l;
                textViewWithClickableSpans.v(z ? 0 : -1);
                break;
            default:
                WindowAndroid windowAndroid = (WindowAndroid) obj;
                b2b b2bVar = WindowAndroid.B;
                View.OnFocusChangeListener onFocusChangeListener = windowAndroid.s;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(windowAndroid.p, z);
                }
                if (!z) {
                    windowAndroid.q(true, true);
                    break;
                }
                break;
        }
    }
}
