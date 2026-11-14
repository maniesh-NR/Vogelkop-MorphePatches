package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes.dex */
public final class ms8 extends es8 implements View.OnClickListener {
    public final pr8 f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.drawable.Drawable, ol7, zu4] */
    public ms8(int i, fr8 fr8Var, pr8 pr8Var) {
        super(fr8Var);
        ?? r0 = fr8Var.q;
        Rect rect = fr8Var.r;
        r0.c = rect;
        Drawable drawable = ((ol7) r0).a;
        if (drawable != null) {
            drawable.setBounds(rect.left, rect.top, rect.right, rect.bottom);
        }
        r0.invalidateSelf();
        fr8Var.setBackground(r0);
        fr8Var.setOnClickListener(this);
        fr8Var.setOnTouchListener(new hs8(this, (byte) 0));
        fr8Var.setId(i);
        fr8Var.setTooltipText(fr8Var.getResources().getString(2132017383));
        fr8Var.setContentDescription(fr8Var.getResources().getString(2132017383));
        this.f = pr8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ((qr8) this.f).b.e(new ys(), false);
    }
}
