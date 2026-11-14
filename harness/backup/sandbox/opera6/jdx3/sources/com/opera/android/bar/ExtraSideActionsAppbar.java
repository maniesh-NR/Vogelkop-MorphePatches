package com.opera.android.bar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.bn8;
import defpackage.dll;
import defpackage.pc5;
import defpackage.q9n;
import defpackage.u43;
import defpackage.u8n;

/* loaded from: classes.dex */
public class ExtraSideActionsAppbar extends u43 {
    public static final /* synthetic */ int f = 0;
    public final bn8 d;
    public View e;

    public ExtraSideActionsAppbar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setWillNotDraw(false);
        bn8 bn8Var = new bn8(this, context.getResources());
        this.d = bn8Var;
        setBackground(bn8Var);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.e = findViewById(2131363731);
        pc5 pc5Var = new pc5(this, (byte) 10);
        dll dllVarS = q9n.s(this);
        if (dllVarS != null) {
            u8n.b(dllVarS, this, pc5Var);
        }
        pc5Var.a(this);
    }
}
