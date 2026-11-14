package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import androidx.media3.ui.PlayerView;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zig {
    public boolean B;
    public boolean C;
    public final uig a;
    public final View b;
    public final ViewGroup c;
    public final ViewGroup d;
    public final ViewGroup e;
    public final ViewGroup f;
    public final ViewGroup g;
    public final ViewGroup h;
    public final ViewGroup i;
    public final ViewGroup j;
    public final View k;
    public final View l;
    public final AnimatorSet m;
    public final AnimatorSet n;
    public final AnimatorSet o;
    public final AnimatorSet p;
    public final AnimatorSet q;
    public final ValueAnimator r;
    public final ValueAnimator s;
    public final vig t;
    public final vig u;
    public final vig v;
    public final vig w;
    public final vig x;
    public final z22 y = new z22(this, (byte) 13);
    public boolean D = true;
    public byte A = 0;
    public final ArrayList z = new ArrayList();

    /* JADX WARN: Type inference failed for: r2v0, types: [vig] */
    /* JADX WARN: Type inference failed for: r2v1, types: [vig] */
    /* JADX WARN: Type inference failed for: r2v2, types: [vig] */
    /* JADX WARN: Type inference failed for: r2v3, types: [vig] */
    /* JADX WARN: Type inference failed for: r2v4, types: [vig] */
    public zig(uig uigVar) throws Resources.NotFoundException {
        this.a = uigVar;
        final byte b = 0;
        this.t = new Runnable(this) { // from class: vig
            public final /* synthetic */ zig b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() throws android.content.res.Resources.NotFoundException {
                /*
                    Method dump skipped, instructions count: 400
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.vig.run():void");
            }
        };
        final byte b2 = 3;
        this.u = new Runnable(this) { // from class: vig
            public final /* synthetic */ zig b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                /*
                    Method dump skipped, instructions count: 400
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.vig.run():void");
            }
        };
        final byte b3 = 4;
        this.v = new Runnable(this) { // from class: vig
            public final /* synthetic */ zig b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                /*
                    Method dump skipped, instructions count: 400
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.vig.run():void");
            }
        };
        final byte b4 = 5;
        this.w = new Runnable(this) { // from class: vig
            public final /* synthetic */ zig b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                /*
                    Method dump skipped, instructions count: 400
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.vig.run():void");
            }
        };
        final byte b5 = 6;
        this.x = new Runnable(this) { // from class: vig
            public final /* synthetic */ zig b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                /*
                    Method dump skipped, instructions count: 400
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.vig.run():void");
            }
        };
        final byte b6 = 1;
        this.c = (ViewGroup) uigVar.findViewById(2131362812);
        this.b = uigVar.findViewById(2131362774);
        this.d = (ViewGroup) uigVar.findViewById(2131362769);
        this.f = (ViewGroup) uigVar.findViewById(2131362786);
        ViewGroup viewGroup = (ViewGroup) uigVar.findViewById(2131362767);
        this.e = viewGroup;
        this.j = (ViewGroup) uigVar.findViewById(2131362811);
        View viewFindViewById = uigVar.findViewById(2131362798);
        this.k = viewFindViewById;
        this.g = (ViewGroup) uigVar.findViewById(2131362766);
        this.h = (ViewGroup) uigVar.findViewById(2131362777);
        this.i = (ViewGroup) uigVar.findViewById(2131362778);
        View viewFindViewById2 = uigVar.findViewById(2131362790);
        this.l = viewFindViewById2;
        View viewFindViewById3 = uigVar.findViewById(2131362789);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new zvd(this, (byte) 19));
            viewFindViewById3.setOnClickListener(new zvd(this, (byte) 19));
        }
        final byte b7 = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: wig
            public final /* synthetic */ zig b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b8 = b2;
                zig zigVar = this.b;
                switch (b8) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = zigVar.b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = zigVar.c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = zigVar.d;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup4 = zigVar.f;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue);
                            break;
                        }
                        break;
                    case 1:
                        zigVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        zigVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = zigVar.b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = zigVar.c;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup6 = zigVar.d;
                        if (viewGroup6 != null) {
                            viewGroup6.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup7 = zigVar.f;
                        if (viewGroup7 != null) {
                            viewGroup7.setAlpha(fFloatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat.addListener(new xig(this, b));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: wig
            public final /* synthetic */ zig b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b8 = b;
                zig zigVar = this.b;
                switch (b8) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = zigVar.b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = zigVar.c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = zigVar.d;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup4 = zigVar.f;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue);
                            break;
                        }
                        break;
                    case 1:
                        zigVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        zigVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = zigVar.b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = zigVar.c;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup6 = zigVar.d;
                        if (viewGroup6 != null) {
                            viewGroup6.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup7 = zigVar.f;
                        if (viewGroup7 != null) {
                            viewGroup7.setAlpha(fFloatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat2.addListener(new xig(this, b6));
        Resources resources = uigVar.getResources();
        float dimension = resources.getDimension(2131165690) - resources.getDimension(2131165695);
        float dimension2 = resources.getDimension(2131165690);
        AnimatorSet animatorSet = new AnimatorSet();
        this.m = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new yig(this, uigVar, b));
        animatorSet.play(valueAnimatorOfFloat).with(c(viewFindViewById, 0.0f, dimension)).with(c(viewGroup, 0.0f, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.n = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new yig(this, uigVar, b6));
        animatorSet2.play(c(viewFindViewById, dimension, dimension2)).with(c(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.o = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new yig(this, uigVar, b7));
        animatorSet3.play(valueAnimatorOfFloat).with(c(viewFindViewById, 0.0f, dimension2)).with(c(viewGroup, 0.0f, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.p = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new xig(this, b7));
        animatorSet4.play(valueAnimatorOfFloat2).with(c(viewFindViewById, dimension, 0.0f)).with(c(viewGroup, dimension, 0.0f));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.q = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new xig(this, b2));
        animatorSet5.play(valueAnimatorOfFloat2).with(c(viewFindViewById, dimension2, 0.0f)).with(c(viewGroup, dimension2, 0.0f));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.r = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: wig
            public final /* synthetic */ zig b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b8 = b6;
                zig zigVar = this.b;
                switch (b8) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = zigVar.b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = zigVar.c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = zigVar.d;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup4 = zigVar.f;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue);
                            break;
                        }
                        break;
                    case 1:
                        zigVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        zigVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = zigVar.b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = zigVar.c;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup6 = zigVar.d;
                        if (viewGroup6 != null) {
                            viewGroup6.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup7 = zigVar.f;
                        if (viewGroup7 != null) {
                            viewGroup7.setAlpha(fFloatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat3.addListener(new xig(this, (byte) 4));
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.s = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: wig
            public final /* synthetic */ zig b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b8 = b7;
                zig zigVar = this.b;
                switch (b8) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = zigVar.b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = zigVar.c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = zigVar.d;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup4 = zigVar.f;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue);
                            break;
                        }
                        break;
                    case 1:
                        zigVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        zigVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = zigVar.b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = zigVar.c;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup6 = zigVar.d;
                        if (viewGroup6 != null) {
                            viewGroup6.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup7 = zigVar.f;
                        if (viewGroup7 != null) {
                            viewGroup7.setAlpha(fFloatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat4.addListener(new xig(this, (byte) 5));
    }

    public static int b(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + width;
    }

    public static ObjectAnimator c(View view, float f, float f2) {
        return ObjectAnimator.ofFloat(view, "translationY", f, f2);
    }

    public static boolean i(View view) {
        int id = view.getId();
        return id == 2131362767 || id == 2131362785 || id == 2131362797 || id == 2131362788 || id == 2131362801 || id == 2131362802 || id == 2131362779 || id == 2131362780;
    }

    public final void a(float f) {
        ViewGroup viewGroup = this.i;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.j;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
        ViewGroup viewGroup3 = this.g;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f);
        }
    }

    public final void d(Runnable runnable, long j) {
        if (j >= 0) {
            this.a.postDelayed(runnable, j);
        }
    }

    public final void e() {
        vig vigVar = this.x;
        uig uigVar = this.a;
        uigVar.removeCallbacks(vigVar);
        uigVar.removeCallbacks(this.u);
        uigVar.removeCallbacks(this.w);
        uigVar.removeCallbacks(this.v);
    }

    public final void f() {
        if (this.A != 3) {
            e();
            int i = this.a.t0;
            if (i > 0) {
                if (!this.D) {
                    d(this.x, i);
                } else if (this.A == 1) {
                    d(this.v, 2000L);
                } else {
                    d(this.w, i);
                }
            }
        }
    }

    public final void g(View view, boolean z) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.z;
        if (!z) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.B && i(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(int i) {
        byte b = this.A;
        this.A = i;
        uig uigVar = this.a;
        if (i == 2) {
            uigVar.setVisibility(8);
        } else if (b == 2) {
            uigVar.setVisibility(0);
        }
        if (b != i) {
            Iterator it = uigVar.j.iterator();
            while (it.hasNext()) {
                vkg vkgVar = (vkg) it.next();
                int visibility = uigVar.getVisibility();
                PlayerView playerView = vkgVar.c;
                playerView.m();
                yzb yzbVar = playerView.s;
                if (yzbVar != null) {
                    gld gldVar = (gld) yzbVar.b;
                    boolean z = visibility == 0;
                    u02 u02Var = gldVar.s;
                    if (u02Var != null) {
                        ((RelativeLayout) ((or2) u02Var.f).f).animate().alpha(z ? 1.0f : 0.0f).withStartAction(new cld(gldVar, (byte) 1)).withEndAction(new gh2((byte) 4, gldVar, z)).setDuration(200L).start();
                    }
                }
            }
        }
    }

    public final void j() {
        if (!this.D) {
            h(0);
            f();
            return;
        }
        byte b = this.A;
        if (b == 1) {
            this.p.start();
        } else if (b == 2) {
            this.q.start();
        } else if (b == 3) {
            this.C = true;
        } else if (b == 4) {
            return;
        }
        f();
    }
}
