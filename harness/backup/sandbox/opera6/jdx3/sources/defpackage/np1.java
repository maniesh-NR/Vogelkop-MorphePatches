package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import com.opera.android.browser.chromium.ChromiumContent;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class np1 {
    public boolean a;
    public boolean b;
    public boolean c;
    public final Object d;
    public Object e;

    public np1(CompoundButton compoundButton) {
        this.e = null;
        this.a = false;
        this.b = false;
        this.d = compoundButton;
    }

    public np1(ChromiumContent chromiumContent) {
        this.e = chromiumContent;
        this.d = new r4h(this);
    }

    public np1(tcc tccVar, uo3 uo3Var, orm ormVar) {
        this.d = uo3Var;
        this.e = ormVar;
        oup.l0(tccVar, (Function1) null, new bo3(this, (byte) 1), (Function1) null, (Function1) null, 13);
    }

    public final void a() {
        CompoundButton compoundButton = (CompoundButton) this.d;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.a || this.b) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.a) {
                    drawableMutate.setTintList(null);
                }
                if (this.b) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.e);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.d;
        Context context = compoundButton.getContext();
        int[] iArr = zhh.n;
        ghf ghfVarH = ghf.H(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) ghfVarH.c;
        Context context2 = compoundButton.getContext();
        TypedArray typedArray2 = (TypedArray) ghfVarH.c;
        WeakHashMap weakHashMap = r5n.a;
        n5n.b(compoundButton, context2, iArr, attributeSet, typedArray2, i, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(sgb.F(resourceId2, compoundButton.getContext()));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(sgb.F(resourceId, compoundButton.getContext()));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(ghfVarH.s(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(kl7.c(typedArray.getInt(3, -1), (PorterDuff.Mode) null));
            }
        } finally {
            ghfVarH.J();
        }
    }

    public final void c(vb0 vb0Var) {
        fs0 fs0Var = ((uo3) this.d).a;
        if (fs0Var != null) {
            orm ormVar = (orm) this.e;
            boolean z = this.a;
            boolean z2 = this.b;
            boolean z3 = this.c;
            x5f x5fVar = (x5f) ormVar;
            if (x5fVar.h) {
                zpa zpaVar = x5fVar.d;
                es0 es0Var = new es0(2443, -1, 5);
                es0Var.q(0, 1, vb0Var);
                es0Var.q(4, 1, fs0Var);
                es0Var.r(1, 1, z);
                es0Var.r(2, 1, z2);
                es0Var.r(3, 1, z3);
                x56 x56VarF = zpa.F();
                xb0 xb0VarX = x56VarF.B(zpaVar).x(zpaVar);
                List list = (List) xb0VarX.n(44);
                ((list == null || list.isEmpty()) ? new hf0(xb0VarX, 44, am2.q(xb0VarX, 44, 1)) : new hf0(xb0VarX, 44, list)).add(es0Var);
                x5fVar.U0(x56VarF);
            }
        }
    }

    public final void d() {
        ChromiumContent chromiumContent = (ChromiumContent) this.e;
        if (this.b || this.a || !this.c) {
            return;
        }
        r4h r4hVar = (r4h) this.d;
        if (!r4hVar.g) {
            r4hVar.g = true;
            r4hVar.c = 0;
            r4hVar.d = 0;
            r4hVar.e = 0;
            r4hVar.f = 0;
            r4hVar.b = false;
            r4hVar.a.f(0);
            r4hVar.b();
        }
        this.a = true;
        h7f h7fVar = chromiumContent.C;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((iz4) g7fVarH.next()).n(chromiumContent);
        }
    }

    public final void e() {
        ChromiumContent chromiumContent = (ChromiumContent) this.e;
        if (!this.a || this.b) {
            return;
        }
        ((r4h) this.d).a();
        this.a = false;
        h7f h7fVar = chromiumContent.C;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((iz4) g7fVarH.next()).p(chromiumContent);
        }
    }

    public final void f(int i) {
        ChromiumContent chromiumContent = (ChromiumContent) this.e;
        if (this.b) {
            return;
        }
        h7f h7fVar = chromiumContent.C;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((iz4) g7fVarH.next()).w((i * 100) / 10000);
        }
        if (i == 10000) {
            e();
        }
    }
}
