package defpackage;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.opera.hype.image.editor.EditImage;
import com.opera.hype.image.editor.TextBoxEditText;
import com.opera.hype.image.editor.TextBoxFrame;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class bfl {
    public final Context a;
    public final ba3 b;
    public final al7 c;
    public final rf2 d;
    public final TextBoxFrame e;
    public final TextBoxEditText f;
    public final Set g;
    public final Set h;
    public final LinkedHashSet i;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.view.View, android.widget.TextView, com.opera.hype.image.editor.TextBoxEditText, yq1] */
    public bfl(Context context, ba3 ba3Var, tam tamVar, al7 al7Var) throws Resources.NotFoundException {
        this.a = context;
        this.b = ba3Var;
        this.c = al7Var;
        View viewInflate = LayoutInflater.from(context).inflate(2131558927, (ViewGroup) null, false);
        int i = 2131362414;
        ?? r9 = (TextBoxEditText) w1h.j(2131362414, viewInflate);
        if (r9 != 0) {
            i = 2131362436;
            View viewJ = w1h.j(2131362436, viewInflate);
            if (viewJ != null) {
                i = 2131362437;
                View viewJ2 = w1h.j(2131362437, viewInflate);
                if (viewJ2 != null) {
                    i = 2131362438;
                    View viewJ3 = w1h.j(2131362438, viewInflate);
                    if (viewJ3 != null) {
                        i = 2131362439;
                        View viewJ4 = w1h.j(2131362439, viewInflate);
                        if (viewJ4 != null) {
                            i = 2131362440;
                            View viewJ5 = w1h.j(2131362440, viewInflate);
                            if (viewJ5 != null) {
                                i = 2131362441;
                                View viewJ6 = w1h.j(2131362441, viewInflate);
                                if (viewJ6 != null) {
                                    i = 2131362442;
                                    View viewJ7 = w1h.j(2131362442, viewInflate);
                                    if (viewJ7 != null) {
                                        i = 2131362443;
                                        ImageView imageView = (ImageView) w1h.j(2131362443, viewInflate);
                                        if (imageView != null) {
                                            TextBoxFrame textBoxFrame = (TextBoxFrame) viewInflate;
                                            rf2 rf2Var = new rf2(textBoxFrame, r9, viewJ, viewJ2, viewJ3, viewJ4, viewJ5, viewJ6, viewJ7, imageView, (byte) 4);
                                            textBoxFrame.setId(View.generateViewId());
                                            textBoxFrame.setTag(2131363169, this);
                                            LayoutTransition layoutTransition = textBoxFrame.getLayoutTransition();
                                            if (layoutTransition != null) {
                                                layoutTransition.disableTransitionType(0);
                                            }
                                            LayoutTransition layoutTransition2 = textBoxFrame.getLayoutTransition();
                                            if (layoutTransition2 != null) {
                                                layoutTransition2.disableTransitionType(1);
                                            }
                                            r9.setSaveEnabled(false);
                                            r9.l = tamVar.k(r9);
                                            this.d = rf2Var;
                                            this.e = textBoxFrame;
                                            this.f = r9;
                                            Set setE = e82.E(new View[]{viewJ4, viewJ, viewJ5, viewJ6});
                                            Set setE2 = e82.E(new View[]{viewJ2, viewJ3, viewJ7});
                                            this.g = setE2;
                                            Set setSingleton = Collections.singleton(imageView);
                                            this.h = setSingleton;
                                            this.i = b5j.e(b5j.e(setSingleton, setE), setE2);
                                            if (b()) {
                                                r9.setSelectAllOnFocus(!c());
                                                r9.setAutoSizeTextTypeWithDefaults(1);
                                                r9.addTextChangedListener(new h63((Object) this, (byte) 7));
                                                Object obj = null;
                                                for (Object obj2 : ((EditImage) al7Var.b).d) {
                                                    fya fyaVar = (fya) obj2;
                                                    if ((fyaVar instanceof oel) && ((oel) fyaVar).k != null) {
                                                        obj = obj2;
                                                    }
                                                }
                                                r9.setImeOptions(Intrinsics.a(obj, this.b) ? 6 : 5);
                                                r9.setRawInputType(1);
                                            }
                                            this.b.h(this.f);
                                            if (this.b instanceof ox7) {
                                                rf2 rf2Var2 = this.d;
                                                Resources resources = ((TextBoxFrame) rf2Var2.b).getResources();
                                                int dimensionPixelSize = resources.getDimensionPixelSize(2131165809);
                                                ((TextBoxEditText) rf2Var2.e).setPadding(dimensionPixelSize, resources.getDimensionPixelSize(2131165810), dimensionPixelSize, resources.getDimensionPixelSize(2131165808));
                                            }
                                            this.f.setEnabled(this.b.a == eya.d);
                                            TextBoxFrame textBoxFrame2 = this.e;
                                            if (b()) {
                                                textBoxFrame2.setBackgroundResource(2131231745);
                                                textBoxFrame2.setForeground(this.a.getDrawable(2131231740));
                                            }
                                            textBoxFrame2.setBackground(textBoxFrame2.getBackground().mutate());
                                            Drawable foreground = textBoxFrame2.getForeground();
                                            textBoxFrame2.setForeground(foreground != null ? foreground.mutate() : null);
                                            f(false);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final boolean a() {
        return !StringsKt.N(this.b.f());
    }

    public final boolean b() {
        ba3 ba3Var = this.b;
        return (ba3Var instanceof oel) && ((oel) ba3Var).k != null;
    }

    public final boolean c() {
        ba3 ba3Var = this.b;
        if (!(ba3Var instanceof oel)) {
            return false;
        }
        oel oelVar = (oel) ba3Var;
        return oelVar.k != null && oelVar.l;
    }

    public final void d(i97 i97Var) {
        PointF pointF;
        boolean z;
        ba3 ba3Var = this.b;
        float fE = 1.0f / ba3Var.e();
        for (View view : this.i) {
            view.setScaleX(fE);
            view.setScaleY(fE);
        }
        if ((ba3Var instanceof oel) && (pointF = ((oel) ba3Var).k) != null) {
            float fE2 = ba3Var.e() * i97Var.c;
            float f = pointF.x / fE2;
            float f2 = pointF.y / fE2;
            PointF pointF2 = i97Var.d;
            PointF pointF3 = i97Var.b;
            float f3 = f * pointF3.x;
            pointF2.x = f3;
            float f4 = f2 * pointF3.y;
            pointF2.y = f4;
            int i = (int) f3;
            int i2 = (int) f4;
            yq1 yq1Var = this.f;
            ViewGroup.LayoutParams layoutParams = yq1Var.getLayoutParams();
            if (i == Integer.MIN_VALUE || layoutParams.width == i) {
                z = false;
            } else {
                layoutParams.width = i;
                z = true;
            }
            if (i2 != Integer.MIN_VALUE && layoutParams.height != i2) {
                layoutParams.height = i2;
                z = true;
            }
            if (z) {
                yq1Var.setLayoutParams(layoutParams);
            }
        }
        TextBoxFrame textBoxFrame = this.e;
        if (!textBoxFrame.isLaidOut()) {
            textBoxFrame.measure(0, 0);
        }
        int width = textBoxFrame.getWidth();
        Integer numValueOf = Integer.valueOf(width);
        if (width <= 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : textBoxFrame.getMeasuredWidth();
        int height = textBoxFrame.getHeight();
        Integer numValueOf2 = height > 0 ? Integer.valueOf(height) : null;
        int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : textBoxFrame.getMeasuredHeight();
        textBoxFrame.setScaleX(ba3Var.e() * i97Var.c);
        textBoxFrame.setScaleY(ba3Var.e() * i97Var.c);
        aa3 aa3Var = ba3Var.f;
        xtb[] xtbVarArr = ba3.j;
        xtb xtbVar = xtbVarArr[1];
        Object obj = aa3Var.b;
        float f5 = ((PointF) obj).x;
        float f6 = ((PointF) obj).y;
        PointF pointF4 = i97Var.d;
        PointF pointF5 = i97Var.b;
        pointF4.x = f5 * pointF5.x;
        pointF4.y = f6 * pointF5.y;
        PointF pointF6 = i97Var.a;
        pointF4.offset(pointF6.x, pointF6.y);
        ybh.u(textBoxFrame, (int) (pointF4.x + ((textBoxFrame.getScaleX() * (-iIntValue)) / 2.0f) + (((textBoxFrame.getScaleX() - 1.0f) * iIntValue) / 2.0f)), (int) (pointF4.y + ((textBoxFrame.getScaleY() * (-iIntValue2)) / 2.0f) + (((textBoxFrame.getScaleY() - 1.0f) * iIntValue2) / 2.0f)), 0, 12);
        aa3 aa3Var2 = ba3Var.h;
        xtb xtbVar2 = xtbVarArr[3];
        textBoxFrame.setRotation(((Number) aa3Var2.b).floatValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(boolean r5, boolean r6) {
        /*
            r4 = this;
            java.util.LinkedHashSet r0 = r4.i
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L46
            java.lang.Object r1 = r0.next()
            android.view.View r1 = (android.view.View) r1
            if (r5 == 0) goto L37
            boolean r2 = r4.b()
            r3 = 0
            if (r2 != 0) goto L31
            java.util.Set r2 = r4.h
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r2 = kotlin.collections.CollectionsKt.E(r2, r1)
            if (r2 != 0) goto L2f
            java.util.Set r2 = r4.g
            boolean r2 = r2.contains(r1)
            if (r2 != 0) goto L2f
            r2 = r3
            goto L35
        L2f:
            r2 = 1
            goto L35
        L31:
            boolean r2 = r4.c()
        L35:
            if (r2 != 0) goto L42
        L37:
            r3 = 8
            if (r6 == 0) goto L42
            int r2 = r1.getVisibility()
            if (r2 == r3) goto L42
            r3 = 4
        L42:
            r1.setVisibility(r3)
            goto L6
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bfl.e(boolean, boolean):void");
    }

    public final void f(boolean z) {
        TextBoxFrame textBoxFrame = this.e;
        if (z) {
            textBoxFrame.getBackground().setAlpha(255);
            Drawable foreground = textBoxFrame.getForeground();
            if (foreground != null) {
                foreground.setAlpha(0);
                return;
            }
            return;
        }
        textBoxFrame.getBackground().setAlpha((!b() || a()) ? 0 : 255);
        Drawable foreground2 = textBoxFrame.getForeground();
        if (foreground2 != null) {
            foreground2.setAlpha(a() ? 0 : 255);
        }
    }

    public final String toString() {
        return "TextBox(obj=" + this.b + ", view=" + this.e + ")";
    }
}
