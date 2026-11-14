package com.opera.android.custom_views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ActionBarContextView;
import com.opera.android.OperaApplication;
import defpackage.dll;
import defpackage.e2c;
import defpackage.ghf;
import defpackage.hjf;
import defpackage.lzb;
import defpackage.mbi;
import defpackage.q9n;
import defpackage.r8n;
import defpackage.u8n;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public class LayoutDirectionActionBarContextView extends ActionBarContextView {
    public static final /* synthetic */ int H = 0;
    public final int B;
    public final int C;
    public int D;
    public int E;
    public final e2c F;
    public final e2c G;

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutDirectionActionBarContextView(Context context, @Nullable AttributeSet attributeSet) {
        super(new mbi(context, (byte) 0), attributeSet, 0);
        this.F = new e2c(this, (byte) 0);
        this.G = new e2c(this, (byte) 1);
        ghf ghfVarH = ghf.H(2130968608, 0, context, attributeSet, zhh.d);
        TypedArray typedArray = (TypedArray) ghfVarH.c;
        this.B = typedArray.getResourceId(5, 0);
        this.C = typedArray.getResourceId(4, 0);
        ghfVarH.J();
        String[] strArr = OperaApplication.K;
        ((OperaApplication) context.getApplicationContext()).B().b(this);
        lzb lzbVar = new lzb(this, (byte) 1);
        l5b l5bVar = q9n.c;
        dll dllVarV = hjf.v(getContext());
        if (dllVarV == null) {
            return;
        }
        u8n.b(dllVarV, this, lzbVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(se seVar) {
        super.c(seVar);
        l(2131361868, this.F);
        l(2131361867, this.G);
        if (((ActionBarContextView) this).c == null) {
            return;
        }
        ColorStateList colorStateListV = f03.v(getContext());
        qe qeVar = ((ActionBarContextView) this).c;
        qeVar.j();
        me meVar = qeVar.t.g;
        j14.o0(meVar != null ? meVar.getDrawable() : null, colorStateListV);
        j14.p0(((ActionBarContextView) this).c.j(), colorStateListV);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void draw(Canvas canvas) {
        boolean z = (this.D == 0 && this.E == 0) ? false : true;
        if (z) {
            canvas.save();
            canvas.clipRect(this.D, 0, getWidth() - this.E, getHeight());
        }
        super/*android.view.View*/.draw(canvas);
        if (z) {
            canvas.restore();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean fitSystemWindows(Rect rect) {
        rect.bottom = 0;
        rect.top = 0;
        this.D = rect.left;
        this.E = rect.right;
        return super/*android.view.View*/.fitSystemWindows(rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getLayoutDirection() {
        return cs5.W(this) ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(int i, r8n r8nVar) {
        dll dllVarV;
        u8n u8nVar;
        TextView textView = (TextView) findViewById(i);
        if (textView == null) {
            return;
        }
        l5b l5bVar = q9n.c;
        dll dllVarV2 = hjf.v(textView.getContext());
        boolean zContains = false;
        if (dllVarV2 != null && (u8nVar = (u8n) textView.getTag(2131365014)) != null && u8nVar.b == textView && u8nVar.a == dllVarV2) {
            zContains = u8nVar.f.contains(r8nVar);
        }
        if (!zContains && (dllVarV = hjf.v(textView.getContext())) != null) {
            u8n.b(dllVarV, textView, r8nVar);
        }
        r8nVar.a(textView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        requestApplyInsets();
    }
}
