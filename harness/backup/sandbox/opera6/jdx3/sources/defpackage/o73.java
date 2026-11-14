package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ListPopupWindow;
import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public abstract class o73 implements dog, PopupWindow.OnDismissListener {
    public dkf a;
    public dkf b;
    public r9i c;
    public dll d;
    public qim f;
    public eq6 g;
    public qhc h;
    public final n73 e = new n73(this);
    public int i = -1;

    public static Rect i(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        return new Rect(i, iArr[1], view.getWidth() + i, view.getHeight() + iArr[1]);
    }

    public final boolean b() {
        r9i r9iVar = this.c;
        if (r9iVar == null || !((o66) r9iVar.d).j()) {
            return false;
        }
        o66 o66Var = (o66) this.c.d;
        if (!o66Var.j()) {
            return true;
        }
        o66Var.f.dismiss();
        return true;
    }

    public jwf c() {
        return null;
    }

    public int d(View view) {
        return l(view) ? 5 : 3;
    }

    public int e(View view) throws Resources.NotFoundException {
        Rect rectN = q9n.n(view);
        int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(2131167307);
        rectN.inset(dimensionPixelSize, dimensionPixelSize);
        Rect rectI = i(view);
        int i = rectI.left;
        int i2 = rectN.left;
        if (i < i2) {
            return i2 - i;
        }
        int i3 = rectI.right;
        int i4 = rectN.right;
        if (i3 > i4) {
            return i4 - i3;
        }
        return 0;
    }

    public final r9i f() {
        r9i r9iVar = this.c;
        if (r9iVar == null || !((o66) r9iVar.d).j()) {
            return null;
        }
        return this.c;
    }

    public int g() {
        return 2130968612;
    }

    public int h(View view) throws Resources.NotFoundException {
        Rect rectN = q9n.n(view);
        int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(2131167307);
        rectN.inset(dimensionPixelSize, dimensionPixelSize);
        Rect rectI = i(view);
        int i = rectI.top;
        int i2 = rectN.top;
        if (i < i2) {
            return i2 - i;
        }
        int i3 = rectI.bottom;
        int i4 = rectN.bottom;
        if (i3 > i4) {
            return i3 - i4;
        }
        return 0;
    }

    public boolean j(View view) {
        return (view.getVisibility() == 4 || view.getGlobalVisibleRect(new Rect())) && i(view).centerY() > i(view.getRootView()).centerY();
    }

    public final boolean k() {
        r9i r9iVar = this.c;
        return r9iVar != null && ((o66) r9iVar.d).j();
    }

    public boolean l(View view) {
        return (view.getVisibility() == 4 || view.getGlobalVisibleRect(new Rect())) && i(view).centerX() > i(view.getRootView()).centerX();
    }

    public void m(r9i r9iVar, View view) {
        r9iVar.L(2131755012);
        o66 o66Var = (o66) r9iVar.d;
        o66Var.B = true;
        o66Var.y = true;
    }

    public void n(r9i r9iVar) {
    }

    public void o(View view) {
        if (k()) {
            return;
        }
        p(view);
    }

    public void onDismiss() {
        eq6 eq6Var = this.g;
        if (eq6Var != null) {
            eq6Var.K();
            this.g = null;
        }
        dll dllVar = this.d;
        if (dllVar != null) {
            dllVar.H(this.e);
            this.d = null;
        }
    }

    public final void p(View view) {
        if (k()) {
            o66 o66Var = (o66) this.c.d;
            if (o66Var.j()) {
                o66Var.f.dismiss();
                return;
            }
            return;
        }
        dll dllVarS = q9n.s(view);
        this.d = dllVarS;
        if (dllVarS != null) {
            dllVarS.F(this.e);
        }
        Context context = view.getContext();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130970353, typedValue, true);
        dkf dkfVar = new dkf(context, typedValue.resourceId);
        this.b = dkfVar;
        this.a = dkfVar;
        r9i r9iVar = new r9i(dkfVar, view, d(view), g(), c());
        this.c = r9iVar;
        ((o66) r9iVar.d).w = this;
        r9iVar.S(false);
        m(this.c, view);
        r9i r9iVar2 = this.c;
        int iH = h(view);
        if (j(view)) {
            iH = (-iH) + view.getHeight();
        }
        o66 o66Var2 = (o66) r9iVar2.d;
        o66Var2.n = iH;
        o66Var2.o = true;
        r9i r9iVar3 = this.c;
        int iE = e(view);
        o66 o66Var3 = (o66) r9iVar3.d;
        o66Var3.p = iE;
        o66Var3.q = true;
        r9i r9iVar4 = this.c;
        r9iVar4.e = this;
        o66 o66Var4 = (o66) r9iVar4.d;
        o66Var4.c.c = true;
        if (!o66Var4.m()) {
            qp2.n("CustomMenuPopupHelper cannot be used without an anchor");
            return;
        }
        l56 l56Var = ((o66) this.c.d).f;
        im7 im7Var = l56Var == null ? null : ((ListPopupWindow) l56Var).c;
        View viewM = q9n.m(im7Var);
        if (viewM != null) {
            dkf dkfVar2 = this.a;
            String[] strArr = OperaApplication.K;
            ((OperaApplication) dkfVar2.getApplicationContext()).B().b(viewM);
            viewM.setClipToOutline(true);
        }
        qim qimVar = this.f;
        if (qimVar != null) {
            this.g = qimVar.f(null);
        }
        if (this.i != -1) {
            if (im7Var != null) {
                q9n.d(new xj(this, im7Var, (byte) 17), im7Var);
            } else {
                this.i = -1;
            }
        }
        n(this.c);
    }
}
