package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class cr8 extends fr8 implements gq8, ValueAnimator.AnimatorUpdateListener {
    public ValueAnimator A;
    public final boolean B;
    public final int s;
    public final int t;
    public final int u;
    public tq8 v;
    public final zzj w;
    public final ArrayList x;
    public d03 y;
    public final int z;

    public cr8(Context context, tta ttaVar, vr8 vr8Var, zzj zzjVar) {
        super(context, ttaVar, vr8Var);
        this.x = new ArrayList(4);
        this.B = true;
        this.w = zzjVar;
        this.s = fan.a(7.0f, context.getResources());
        this.t = fan.a(2.0f, context.getResources());
        int i = this.c;
        Resources resources = context.getResources();
        this.u = ((i - (fan.a(7.0f, resources) << 1)) - fan.a(2.0f, resources)) / 2;
        this.z = context.getResources().getInteger(2131492881);
        this.A = ValueAnimator.ofFloat(1.0f, 1.0f);
        l();
    }

    @Override // defpackage.gq8
    public final void Q(hq8 hq8Var) {
    }

    @Override // defpackage.fr8
    public final void b(vr8 vr8Var, boolean z) {
        super.b(vr8Var, z);
        this.y = e();
        if (this.B) {
            ArrayList arrayList = this.x;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                br8 br8Var = (br8) obj;
                int iT = this.f;
                if (iT == 0) {
                    iT = f03.t(2130969727, br8Var.d.getContext(), 2131101243);
                }
                br8Var.c = iT;
                br8Var.b.h();
            }
        }
        invalidate();
    }

    @Override // defpackage.fr8
    public final void n(Canvas canvas, Rect rect) {
        int iSave;
        float fFloatValue = ((Float) this.A.getAnimatedValue()).floatValue();
        boolean z = fFloatValue > 1.0f;
        if (z) {
            iSave = canvas.save();
            canvas.scale(fFloatValue, fFloatValue, rect.exactCenterX(), rect.exactCenterY());
        } else {
            iSave = -1;
        }
        ol7 ol7Var = this.y;
        if (ol7Var != null) {
            ol7Var.setBounds(rect);
            this.y.draw(canvas);
        }
        if (z) {
            canvas.restoreToCount(iSave);
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.x;
            if (i >= arrayList.size()) {
                return;
            }
            int i2 = rect.left;
            int i3 = this.s;
            int i4 = this.t;
            int i5 = this.u;
            int i6 = i4 + i5;
            int i7 = ((i % 2) * i6) + i2 + i3;
            int i8 = (i6 * (i / 2)) + rect.top + i3;
            ((br8) arrayList.get(i)).b.a(canvas, i7, i8, i7 + i5, i8 + i5);
            i++;
        }
    }

    @Override // defpackage.fr8
    public final void q(boolean z) {
        if (this.v == null) {
            return;
        }
        t(false);
    }

    @Override // defpackage.gq8
    public final void r(int i, hq8 hq8Var) {
        if (i == 4) {
            s();
        } else if (i == 1 || i == 3 || i == 2) {
            t(true);
        }
    }

    @Override // defpackage.fr8
    public final void s() {
        tq8 tq8Var = this.v;
        if (tq8Var != null) {
            setText(!this.l ? tq8Var.h() : " ");
            if (getText() == "") {
                setContentDescription(getContext().getString(2132019980));
            }
        }
    }

    public final void t(boolean z) {
        ArrayList arrayList;
        int i = 0;
        while (true) {
            arrayList = this.x;
            if (i >= 4 || i >= this.v.e.size()) {
                break;
            }
            hq8 hq8VarU = this.v.u(i);
            if (i < arrayList.size()) {
                br8 br8Var = (br8) arrayList.get(i);
                hq8 hq8Var = br8Var.a;
                if (hq8VarU != hq8Var) {
                    hq8Var.o(br8Var);
                    yr8 yr8Var = br8Var.b;
                    yr8Var.f = null;
                    yr8Var.j = 0;
                    yr8Var.e();
                    yr8Var.k = null;
                    yr8Var.l = null;
                    arrayList.set(i, new br8(this, hq8VarU));
                }
            } else {
                arrayList.add(new br8(this, hq8VarU));
            }
            ((br8) arrayList.get(i)).b.f(z);
            i++;
        }
        while (i < arrayList.size()) {
            br8 br8Var2 = (br8) arrayList.remove(i);
            br8Var2.a.o(br8Var2);
            yr8 yr8Var2 = br8Var2.b;
            yr8Var2.f = null;
            yr8Var2.j = 0;
            yr8Var2.e();
            yr8Var2.k = null;
            yr8Var2.l = null;
        }
        invalidate();
    }
}
