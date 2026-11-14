package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class xmj extends vmj {
    public Drawable h;
    public final Rect i;

    public xmj(Context context, b8h b8hVar, umj umjVar, int i, int i2, na5 na5Var) {
        super(context, i, i2, umjVar, na5Var.d(context));
        Drawable drawableF = b8hVar.f(context);
        j14.n0(drawableF, this.c.a);
        this.h = drawableF;
        int i3 = i / 2;
        int i4 = i2 / 2;
        int i5 = (i - i3) / 2;
        int i6 = (i2 - i4) / 2;
        this.i = new Rect(i5, i6, i3 + i5, i4 + i6);
    }

    @Override // defpackage.vmj
    public final void b(Canvas canvas) {
        this.h.setBounds(this.i);
        this.h.draw(canvas);
    }

    @Override // defpackage.vmj, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        super.setAlpha(i);
        Drawable drawableMutate = this.h.mutate();
        this.h = drawableMutate;
        drawableMutate.setAlpha(i);
    }
}
