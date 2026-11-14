package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class mp1 extends CheckedTextView {
    public final nrl a;
    public final hp1 b;
    public final wq1 c;
    public bpd d;

    public mp1(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, 2130969010);
        gll.a(getContext(), this);
        wq1 wq1Var = new wq1(this);
        this.c = wq1Var;
        wq1Var.e(attributeSet, 2130969010);
        wq1Var.b();
        hp1 hp1Var = new hp1(this);
        this.b = hp1Var;
        hp1Var.b(attributeSet, 2130969010);
        this.a = new nrl(this);
        Context context2 = getContext();
        int[] iArr = zhh.m;
        ghf ghfVarH = ghf.H(2130969010, 0, context2, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) ghfVarH.c;
        Context context3 = getContext();
        TypedArray typedArray2 = (TypedArray) ghfVarH.c;
        WeakHashMap weakHashMap = r5n.a;
        n5n.b(this, context3, iArr, attributeSet, typedArray2, 2130969010, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(sgb.F(resourceId2, getContext()));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(sgb.F(resourceId, getContext()));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(ghfVarH.s(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(kl7.c(typedArray.getInt(3, -1), null));
            }
            ghfVarH.J();
            bpd bpdVar = this.d;
            if (bpdVar == null) {
                bpdVar = new bpd(this);
                this.d = bpdVar;
            }
            bpdVar.K(attributeSet, 2130969010);
        } catch (Throwable th) {
            ghfVarH.J();
            throw th;
        }
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        wq1 wq1Var = this.c;
        if (wq1Var != null) {
            wq1Var.b();
        }
        hp1 hp1Var = this.b;
        if (hp1Var != null) {
            hp1Var.a();
        }
        nrl nrlVar = this.a;
        if (nrlVar != null) {
            ((mp1) nrlVar.b).getCheckMarkDrawable();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        c09.x(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        bpd bpdVar = this.d;
        if (bpdVar == null) {
            bpdVar = new bpd(this);
            this.d = bpdVar;
        }
        bpdVar.Q(z);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        hp1 hp1Var = this.b;
        if (hp1Var != null) {
            hp1Var.c();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        hp1 hp1Var = this.b;
        if (hp1Var != null) {
            hp1Var.d(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(sgb.F(i, getContext()));
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        nrl nrlVar = this.a;
        if (nrlVar != null) {
            if (nrlVar.a) {
                nrlVar.a = false;
            } else {
                nrlVar.a = true;
                ((mp1) nrlVar.b).getCheckMarkDrawable();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        wq1 wq1Var = this.c;
        if (wq1Var != null) {
            wq1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        wq1 wq1Var = this.c;
        if (wq1Var != null) {
            wq1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) throws Resources.NotFoundException {
        super.setTextAppearance(context, i);
        wq1 wq1Var = this.c;
        if (wq1Var != null) {
            wq1Var.f(i, context);
        }
    }
}
