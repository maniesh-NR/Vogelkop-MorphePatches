package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

/* loaded from: classes.dex */
public final class qh8 extends View {
    public final /* synthetic */ ir a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ a3l c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh8(ir irVar, Rect rect, a3l a3lVar, Context context) {
        super(context);
        this.a = irVar;
        this.b = rect;
        this.c = a3lVar;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ir irVar = this.a;
        float fWidth = irVar.getBounds().width();
        Rect rect = this.b;
        float fMin = Math.min(fWidth / rect.width(), irVar.getBounds().height() / rect.height());
        if (irVar.j != fMin) {
            irVar.j = fMin;
            irVar.a();
            irVar.invalidateSelf();
        }
        irVar.draw(canvas);
        this.c.c.setAlpha(0.0f);
    }
}
