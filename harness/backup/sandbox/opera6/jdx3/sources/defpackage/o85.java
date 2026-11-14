package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import com.opera.android.custom_views.DropShadowFrameLayout;
import com.opera.android.custom_views.StylingTextView;

/* loaded from: classes.dex */
public final class o85 {
    public static final long o;
    public static final long p;
    public static final long q;
    public static final long r;
    public static final long s;
    public static final long t;
    public static final PathInterpolator u;
    public static final fci v;
    public static final AccelerateDecelerateInterpolator w;
    public static final AccelerateInterpolator x;
    public final p85 a;
    public final u85 b;
    public final Context c;
    public final pde d;
    public final ArgbEvaluator e;
    public final int f;
    public final int g;
    public boolean h;
    public ValueAnimator i;
    public Long j;
    public hh4 k;
    public int l;
    public final shf m;
    public final n85 n;

    static {
        on7 on7Var = pn7.b;
        un7 un7Var = un7.d;
        o = cs5.x0(500, un7Var);
        p = cs5.x0(500, un7Var);
        q = cs5.x0(MessageTemplateConstants.Values.CENTER_POPUP_HEIGHT, un7Var);
        r = cs5.x0(MessageTemplateConstants.Values.CENTER_POPUP_HEIGHT, un7Var);
        s = cs5.x0(MessageTemplateConstants.Values.CENTER_POPUP_HEIGHT, un7Var);
        t = cs5.x0(200, un7Var);
        u = (PathInterpolator) sz7.a.getValue();
        v = lf1.n;
        w = lf1.a;
        x = lf1.b;
    }

    public o85(pde pdeVar, p85 p85Var, ize izeVar, pde pdeVar2, tsd tsdVar, u85 u85Var) {
        this.a = p85Var;
        this.b = u85Var;
        ConstraintLayout constraintLayout = p85Var.e;
        Context context = constraintLayout.getContext();
        this.c = context;
        final byte b = 0;
        this.d = new pde(0);
        this.e = new ArgbEvaluator();
        this.f = z7h.h(context, 32.0f);
        this.g = z7h.h(context, 56.0f);
        shf shfVar = new shf(context, pdeVar, tsdVar);
        this.m = shfVar;
        this.n = new n85(constraintLayout, p85Var.b);
        int i = d03.e;
        ConstraintLayout constraintLayout2 = p85Var.f;
        ydp.q(constraintLayout2, j14.i0(2131231307, constraintLayout2.getContext()));
        FrameLayout frameLayout = p85Var.d;
        ydp.q(frameLayout, j14.i0(2131233194, frameLayout.getContext()));
        FrameLayout frameLayout2 = (FrameLayout) p85Var.g;
        ydp.q(frameLayout2, j14.i0(2131233194, frameLayout2.getContext()));
        a26.T(pdeVar2, pdeVar, new f7f(this) { // from class: k85
            public final /* synthetic */ o85 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b2 = b;
                o85 o85Var = this.b;
                switch (b2) {
                    case 0:
                        ybh.u(o85Var.a.e, 0, 0, ((mnf) obj).b, 7);
                        break;
                    case 1:
                        int iIntValue = ((Integer) obj).intValue();
                        p85 p85Var2 = o85Var.a;
                        DropShadowFrameLayout dropShadowFrameLayout = (DropShadowFrameLayout) p85Var2.m;
                        dropShadowFrameLayout.setPadding(iIntValue, dropShadowFrameLayout.getPaddingTop(), iIntValue, dropShadowFrameLayout.getPaddingBottom());
                        LinearLayout linearLayout = p85Var2.b;
                        linearLayout.setPadding(iIntValue, linearLayout.getPaddingTop(), iIntValue, linearLayout.getPaddingBottom());
                        break;
                    case 2:
                        o85Var.f((rmn) obj);
                        break;
                    default:
                        ValueAnimator valueAnimator = o85Var.i;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            valueAnimator.removeAllUpdateListeners();
                            valueAnimator.removeAllListeners();
                        }
                        o85Var.i = null;
                        break;
                }
            }
        });
        DropShadowFrameLayout dropShadowFrameLayout = (DropShadowFrameLayout) p85Var.m;
        dropShadowFrameLayout.b(u0h.g(context, maj.c));
        if (dropShadowFrameLayout.a.X(0.0f)) {
            dropShadowFrameLayout.invalidate();
        }
        pde pdeVar3 = (pde) shfVar.c;
        final byte b2 = 1;
        a26.T(pdeVar3, pdeVar, new f7f(this) { // from class: k85
            public final /* synthetic */ o85 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b2;
                o85 o85Var = this.b;
                switch (b22) {
                    case 0:
                        ybh.u(o85Var.a.e, 0, 0, ((mnf) obj).b, 7);
                        break;
                    case 1:
                        int iIntValue = ((Integer) obj).intValue();
                        p85 p85Var2 = o85Var.a;
                        DropShadowFrameLayout dropShadowFrameLayout2 = (DropShadowFrameLayout) p85Var2.m;
                        dropShadowFrameLayout2.setPadding(iIntValue, dropShadowFrameLayout2.getPaddingTop(), iIntValue, dropShadowFrameLayout2.getPaddingBottom());
                        LinearLayout linearLayout = p85Var2.b;
                        linearLayout.setPadding(iIntValue, linearLayout.getPaddingTop(), iIntValue, linearLayout.getPaddingBottom());
                        break;
                    case 2:
                        o85Var.f((rmn) obj);
                        break;
                    default:
                        ValueAnimator valueAnimator = o85Var.i;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            valueAnimator.removeAllUpdateListeners();
                            valueAnimator.removeAllListeners();
                        }
                        o85Var.i = null;
                        break;
                }
            }
        });
        final byte b3 = 2;
        a26.T(izeVar, pdeVar, new f7f(this) { // from class: k85
            public final /* synthetic */ o85 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b3;
                o85 o85Var = this.b;
                switch (b22) {
                    case 0:
                        ybh.u(o85Var.a.e, 0, 0, ((mnf) obj).b, 7);
                        break;
                    case 1:
                        int iIntValue = ((Integer) obj).intValue();
                        p85 p85Var2 = o85Var.a;
                        DropShadowFrameLayout dropShadowFrameLayout2 = (DropShadowFrameLayout) p85Var2.m;
                        dropShadowFrameLayout2.setPadding(iIntValue, dropShadowFrameLayout2.getPaddingTop(), iIntValue, dropShadowFrameLayout2.getPaddingBottom());
                        LinearLayout linearLayout = p85Var2.b;
                        linearLayout.setPadding(iIntValue, linearLayout.getPaddingTop(), iIntValue, linearLayout.getPaddingBottom());
                        break;
                    case 2:
                        o85Var.f((rmn) obj);
                        break;
                    default:
                        ValueAnimator valueAnimator = o85Var.i;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            valueAnimator.removeAllUpdateListeners();
                            valueAnimator.removeAllListeners();
                        }
                        o85Var.i = null;
                        break;
                }
            }
        });
        q9n.e(constraintLayout, new e73(this, izeVar, (byte) 2));
        a26.T((pde) u85Var.k, pdeVar, new cl4(this, (byte) 2));
        constraintLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: m85
            public final /* synthetic */ o85 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b4 = b;
                o85 o85Var = this.b;
                switch (b4) {
                    case 0:
                        ((hv3) o85Var.b.i).b(hbf.a);
                        break;
                    default:
                        ((hv3) o85Var.b.i).b(hbf.a);
                        break;
                }
            }
        });
        ((ImageView) p85Var.j).setOnClickListener(new View.OnClickListener(this) { // from class: m85
            public final /* synthetic */ o85 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b4 = b2;
                o85 o85Var = this.b;
                switch (b4) {
                    case 0:
                        ((hv3) o85Var.b.i).b(hbf.a);
                        break;
                    default:
                        ((hv3) o85Var.b.i).b(hbf.a);
                        break;
                }
            }
        });
        constraintLayout.addOnLayoutChangeListener(new z22(this, (byte) 5));
        final byte b4 = 3;
        a26.T(tsdVar, pdeVar, new f7f(this) { // from class: k85
            public final /* synthetic */ o85 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b4;
                o85 o85Var = this.b;
                switch (b22) {
                    case 0:
                        ybh.u(o85Var.a.e, 0, 0, ((mnf) obj).b, 7);
                        break;
                    case 1:
                        int iIntValue = ((Integer) obj).intValue();
                        p85 p85Var2 = o85Var.a;
                        DropShadowFrameLayout dropShadowFrameLayout2 = (DropShadowFrameLayout) p85Var2.m;
                        dropShadowFrameLayout2.setPadding(iIntValue, dropShadowFrameLayout2.getPaddingTop(), iIntValue, dropShadowFrameLayout2.getPaddingBottom());
                        LinearLayout linearLayout = p85Var2.b;
                        linearLayout.setPadding(iIntValue, linearLayout.getPaddingTop(), iIntValue, linearLayout.getPaddingBottom());
                        break;
                    case 2:
                        o85Var.f((rmn) obj);
                        break;
                    default:
                        ValueAnimator valueAnimator = o85Var.i;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            valueAnimator.removeAllUpdateListeners();
                            valueAnimator.removeAllListeners();
                        }
                        o85Var.i = null;
                        break;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(o24 o24Var, ViewGroup viewGroup, StylingTextView stylingTextView) {
        jf jfVar = o24Var.b;
        xc xcVar = jfVar.c;
        if (xcVar == null) {
            xcVar = o24Var.a.a;
        }
        Context context = stylingTextView.getContext();
        int i = xcVar.a;
        rxh rxhVar = xcVar.b;
        Drawable drawableF = sgb.F(i, context);
        rm5 rm5Var = xcVar.f;
        if (rm5Var.equals(uc.m)) {
            j14.o0(drawableF, f03.u(2130969288, stylingTextView.getContext(), 0));
        } else if (!rm5Var.equals(vc.m) && !(rm5Var instanceof wc)) {
            h9o.p();
            return;
        }
        stylingTextView.setText(rxhVar.a(stylingTextView.getResources()));
        stylingTextView.s(drawableF, null);
        CharSequence charSequenceA = rxhVar.a(viewGroup.getResources());
        int i2 = xcVar.e;
        viewGroup.setContentDescription(charSequenceA);
        n1h.o(viewGroup, charSequenceA, i2);
        viewGroup.setOnClickListener(new l85(o24Var, (byte) 0));
        viewGroup.setEnabled(jfVar.d);
    }

    public static void c(o24 o24Var, ImageView imageView) {
        xc xcVar = o24Var.b.c;
        if (xcVar == null) {
            xcVar = o24Var.a.a;
        }
        imageView.setImageResource(xcVar.a);
        CharSequence charSequenceA = xcVar.b.a(imageView.getResources());
        int i = xcVar.e;
        imageView.setContentDescription(charSequenceA);
        n1h.o(imageView, charSequenceA, i);
        imageView.setOnClickListener(new l85(o24Var, (byte) 1));
        imageView.setEnabled(o24Var.b.d);
    }

    public final void a(q85 q85Var) {
        eri eriVar = q85Var.b;
        boolean z = q85Var.a;
        zm8 zm8Var = q85Var.e;
        long id = eriVar.getId();
        Long l = this.j;
        if (l == null || id != l.longValue()) {
            this.j = Long.valueOf(eriVar.getId());
            hh4 hh4Var = this.k;
            if (hh4Var != null) {
                hh4Var.cancel();
            }
            this.k = eriVar.h(new eh7(this.f), new iu2(this, (byte) 18));
        }
        o24 o24Var = q85Var.c;
        p85 p85Var = this.a;
        if (o24Var != null) {
            c(o24Var, (ImageView) p85Var.i);
        }
        o24 o24Var2 = q85Var.d;
        if (o24Var2 != null) {
            c(o24Var2, (ImageView) p85Var.k);
        }
        if (zm8Var != null) {
            b(zm8Var.a, p85Var.d, p85Var.c);
            b(zm8Var.b, (FrameLayout) p85Var.g, (StylingTextView) p85Var.h);
        }
        boolean z2 = zm8Var != null;
        n85 n85Var = this.n;
        boolean z3 = n85Var.e != z2;
        boolean z4 = n85Var.f != z;
        if (z3 || z4) {
            n85Var.e = z2;
            n85Var.f = z;
            ValueAnimator valueAnimator = n85Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f = n85Var.g;
            float f2 = (!z2 || z) ? 0.0f : 1.0f;
            long jAbs = (long) (Math.abs(f2 - f) * ((z3 || !n85Var.a.isAttachedToWindow()) ? 0L : f2 > 0.0f ? pn7.f(s) : pn7.f(t)));
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
            valueAnimatorOfFloat.setDuration(jAbs);
            valueAnimatorOfFloat.setInterpolator(lf1.f);
            valueAnimatorOfFloat.addUpdateListener(new nl2(n85Var, (byte) 2));
            valueAnimatorOfFloat.addListener(new kc(n85Var, (byte) 5));
            valueAnimatorOfFloat.start();
            n85Var.h = valueAnimatorOfFloat;
        }
        boolean z5 = zm8Var != null;
        if (z == this.h) {
            if (this.i != null) {
                return;
            }
            d();
            return;
        }
        this.h = z;
        ValueAnimator valueAnimator2 = this.i;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
            valueAnimator2.removeAllListeners();
            valueAnimator2.cancel();
        }
        this.i = null;
        int iE = e();
        int width = p85Var.f.getWidth();
        float fB = this.g == iE ? 0.0f : djh.b((width - r5) / (iE - r5), 0.0f, 1.0f);
        float f3 = z ? 0.0f : 1.0f;
        long jF = (long) (pn7.f(z ? z5 ? r : p : z5 ? q : o) * Math.abs(f3 - fB));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fB, f3);
        valueAnimatorOfFloat2.setDuration(jF);
        valueAnimatorOfFloat2.setInterpolator(z5 ? v : u);
        valueAnimatorOfFloat2.addUpdateListener(new nl2(this, (byte) 1));
        valueAnimatorOfFloat2.addListener(new kc(this, (byte) 6));
        valueAnimatorOfFloat2.start();
        this.i = valueAnimatorOfFloat2;
    }

    public final void d() {
        p85 p85Var = this.a;
        ImageView imageView = (ImageView) p85Var.k;
        ImageView imageView2 = (ImageView) p85Var.i;
        TextView textView = (TextView) p85Var.l;
        p37.t0(this.h ? -2 : -1, p85Var.f);
        q85 q85Var = (q85) ((pde) this.b.k).g();
        boolean z = this.h;
        float f = z ? 0.0f : 1.0f;
        textView.setAlpha(f);
        int i = 8;
        textView.setVisibility(!z ? 0 : 8);
        imageView2.setAlpha(f);
        imageView2.setVisibility((z || q85Var.c == null) ? 8 : 0);
        imageView.setAlpha(f);
        if (!z && q85Var.d != null) {
            i = 0;
        }
        imageView.setVisibility(i);
        if (this.i == null) {
            p85Var.f.setBackgroundTintList(ColorStateList.valueOf(this.h ? j7h.k(2130969080, this.c) : this.l));
        }
        DropShadowFrameLayout dropShadowFrameLayout = (DropShadowFrameLayout) p85Var.m;
        if (dropShadowFrameLayout.a.X(this.h ? 1.0f : 0.0f)) {
            dropShadowFrameLayout.invalidate();
        }
    }

    public final int e() {
        int iIntValue = ((Number) ((pde) this.m.c).g()).intValue();
        int width = (this.a.e.getWidth() - iIntValue) - iIntValue;
        int i = this.g;
        return width < i ? i : width;
    }

    public final void f(rmn rmnVar) {
        int i = rmnVar.g;
        v8k v8kVar = v8k.a;
        p85 p85Var = this.a;
        ConstraintLayout constraintLayout = p85Var.f;
        int iF = p37.F(i, v8kVar.d(constraintLayout.getContext()), v8k.b.d(constraintLayout.getContext()));
        this.l = iF;
        p85Var.d.setBackgroundTintList(ColorStateList.valueOf(iF));
        ((FrameLayout) p85Var.g).setBackgroundTintList(ColorStateList.valueOf(this.l));
        if (this.i != null) {
            return;
        }
        p85Var.f.setBackgroundTintList(ColorStateList.valueOf(this.h ? j7h.k(2130969080, this.c) : this.l));
    }
}
