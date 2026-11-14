package com.opera.android.custom_views;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import defpackage.g7f;
import defpackage.h7f;
import defpackage.rn9;
import defpackage.w6f;
import defpackage.yqd;
import defpackage.z6f;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ObservableEditText extends OperaEditText implements w6f {
    public static final /* synthetic */ int u = 0;
    public final h7f s;
    public final rn9 t;

    public ObservableEditText(Context context) {
        super(context);
        this.s = new h7f();
        this.t = new rn9(new yqd(this, (byte) 23), this);
    }

    public ObservableEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.s = new h7f();
        this.t = new rn9(new yqd(this, (byte) 23), this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (isEnabled()) {
            h7f h7fVar = this.s;
            g7f g7fVarH = am2.h(h7fVar, h7fVar);
            while (g7fVarH.hasNext()) {
                if (((z6f) g7fVarH.next()).c(keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
            }
        }
        return super/*android.view.View*/.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w6f
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void F(z6f z6fVar) {
        addTextChangedListener(z6fVar);
        this.s.b(z6fVar);
        this.t.b = !r0.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w6f
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void H(z6f z6fVar) {
        removeTextChangedListener(z6fVar);
        this.s.c(z6fVar);
        this.t.b = !r0.isEmpty();
    }

    @Override // com.opera.android.custom_views.OperaEditText
    public void onFocusChanged(boolean z, int i, Rect rect) {
        this.t.getClass();
        h7f h7fVar = this.s;
        if (h7fVar != null) {
            g7f g7fVar = new g7f(h7fVar);
            while (g7fVar.hasNext()) {
                ((z6f) g7fVar.next()).f(z);
            }
        }
        super.onFocusChanged(z, i, rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        rn9 rn9Var = this.t;
        if (i != 4) {
            rn9Var.getClass();
        } else if (rn9Var.b) {
            bq1 bq1Var = (ObservableEditText) rn9Var.d;
            WeakHashMap weakHashMap = r5n.a;
            g3o g3oVarA = i5n.a(bq1Var);
            if (g3oVarA == null || g3oVarA.a.i(8).d == 0) {
                if (keyEvent.getAction() == 1) {
                    ((Runnable) rn9Var.c).run();
                }
                return true;
            }
        }
        return super/*android.view.View*/.onKeyPreIme(i, keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onSelectionChanged(int i, int i2) {
        super/*android.widget.TextView*/.onSelectionChanged(i, i2);
        h7f h7fVar = this.s;
        if (h7fVar != null) {
            g7f g7fVar = new g7f(h7fVar);
            while (g7fVar.hasNext()) {
                ((z6f) g7fVar.next()).d(i, i2);
            }
        }
    }

    @Override // com.opera.android.custom_views.OperaEditText
    public boolean onTextContextMenuItem(int i) {
        h7f h7fVar = this.s;
        if (i == 16908322) {
            g7f g7fVarH = am2.h(h7fVar, h7fVar);
            while (g7fVarH.hasNext()) {
                ((z6f) g7fVarH.next()).h();
            }
        }
        boolean zOnTextContextMenuItem = super.onTextContextMenuItem(i);
        if (zOnTextContextMenuItem && i == 16908322) {
            g7f g7fVarH2 = am2.h(h7fVar, h7fVar);
            while (g7fVarH2.hasNext()) {
                ((z6f) g7fVarH2.next()).i();
            }
        }
        return zOnTextContextMenuItem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onWindowFocusChanged(boolean z) {
        super/*android.view.View*/.onWindowFocusChanged(z);
        h7f h7fVar = this.s;
        if (h7fVar != null) {
            g7f g7fVar = new g7f(h7fVar);
            while (g7fVar.hasNext()) {
                ((z6f) g7fVar.next()).getClass();
            }
        }
    }
}
