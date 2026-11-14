package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class l2c implements View.OnAttachStateChangeListener {
    public static volatile c2c j = new pza(26);
    public final Context a;
    public final k2c b;
    public k2c c;
    public final View d;
    public int e;
    public int f = 0;
    public boolean g;
    public boolean h;
    public boolean i;

    public l2c(View view, k2c k2cVar, AttributeSet attributeSet) {
        Context context = view.getContext();
        this.a = context;
        this.d = view;
        this.b = k2cVar;
        view.addOnAttachStateChangeListener(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mhh.c);
        this.e = typedArrayObtainStyledAttributes.getInteger(4, 2);
        typedArrayObtainStyledAttributes.recycle();
        if (view.isAttachedToWindow()) {
            onViewAttachedToWindow(view);
        }
    }

    public static int a(Context context) {
        return context.getResources().getConfiguration().getLayoutDirection() == 1 ? 1 : 0;
    }

    public final boolean b() {
        return c() == 1;
    }

    public final int c() {
        if (this.h) {
            return this.f;
        }
        int iA = this.e;
        k2c k2cVar = this.b;
        Context context = this.a;
        if (iA == 2) {
            k2c k2cVar2 = this.c;
            j2c j2cVar = k2c.xp;
            if (k2cVar2 == null) {
                ViewParent parent = this.d.getParent();
                while (true) {
                    if (parent == null) {
                        k2cVar2 = null;
                        break;
                    }
                    if (parent instanceof k2c) {
                        k2cVar2 = (k2c) parent;
                        break;
                    }
                    parent = parent.getParent();
                }
                if (k2cVar2 == null && this.i) {
                    k2cVar2 = j2cVar;
                }
                this.c = k2cVar2;
            }
            k2c k2cVar3 = k2cVar2 != j2cVar ? k2cVar2 : null;
            if (k2cVar3 != null) {
                iA = k2cVar3.b().c();
            } else {
                if (!this.i) {
                    if (!this.g) {
                        int iA2 = a(context);
                        if (!this.g || this.f != iA2) {
                            this.g = true;
                            this.f = iA2;
                            k2cVar.i(iA2);
                        }
                    }
                    return this.f;
                }
                iA = a(context);
            }
        } else if (iA == 3) {
            iA = a(context);
        }
        this.h = true;
        if (this.g && this.f == iA) {
            return iA;
        }
        this.g = true;
        this.f = iA;
        k2cVar.i(iA);
        return iA;
    }

    public final void d(int i) {
        if (i != this.e) {
            this.e = i;
            if (this.h) {
                this.h = false;
                c();
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.i = true;
        c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.e == 2) {
            this.h = false;
        }
        this.c = null;
        this.i = false;
    }
}
