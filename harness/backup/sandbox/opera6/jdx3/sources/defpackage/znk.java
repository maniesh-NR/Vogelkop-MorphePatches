package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes.dex */
public final class znk extends er8 implements pvb {
    public static final int[] K = {R.attr.state_focused};
    public final Paint B;
    public final float C;
    public final int D;
    public int E;
    public int F;
    public Drawable G;
    public float H;
    public final boolean I;
    public boolean J;

    public znk(Context context, tta ttaVar, vr8 vr8Var) {
        super(context, ttaVar, vr8Var, null);
        this.B = new Paint(1);
        this.H = 1.0f;
        this.C = fan.a(1.0f, context.getResources());
        this.D = nr8.e(context);
        this.I = (((vok) wok.t(context).i()).a & 2) != 0;
        this.E = f03.t(2130970898, context, 2131103876);
        this.F = f03.t(2130970900, context, 2131099815);
        z(context);
    }

    @Override // defpackage.pvb
    public final String c() {
        return getText().toString();
    }

    @Override // defpackage.fr8
    public final boolean d() {
        hq8 hq8Var = this.s;
        return (hq8Var == null || ((qok) hq8Var).e.d == 11) ? false : true;
    }

    @Override // defpackage.fr8
    public final void g(Canvas canvas) {
        this.H = 0.0f;
        super.g(canvas);
        this.H = 1.0f;
    }

    @Override // defpackage.fr8, defpackage.pvb
    public final View getView() {
        return this;
    }

    @Override // defpackage.pvb
    public final void h(boolean z) {
        if (z == this.J) {
            return;
        }
        this.J = z;
        refreshDrawableState();
    }

    @Override // defpackage.pvb
    /* renamed from: j */
    public final boolean getA() {
        return this.s != null;
    }

    @Override // defpackage.fr8
    public final int k() {
        return this.D;
    }

    @Override // defpackage.pvb
    public final i1 m() {
        hq8 hq8Var = this.s;
        if (hq8Var == null) {
            return null;
        }
        return new i1(hq8Var.g(), ((qok) hq8Var).e.b, this.D);
    }

    @Override // defpackage.er8, defpackage.fr8
    public final void o() {
        super.o();
        Context context = getContext();
        this.E = f03.t(2130970898, context, 2131103876);
        this.F = f03.t(2130970900, context, 2131099815);
        z(context);
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.J ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), K) : super.onCreateDrawableState(i);
    }

    @Override // defpackage.er8
    public final void v(Canvas canvas, Rect rect, float f) {
        super.v(canvas, rect, f);
        if (this.G == null) {
            return;
        }
        float fWidth = rect.width() / 10.0f;
        float f2 = cs5.W(this) ? rect.left + fWidth : rect.right - fWidth;
        float f3 = rect.bottom - fWidth;
        float fWidth2 = rect.width() * 0.4167f;
        float f4 = fWidth2 / 2.0f;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.B;
        paint.setStyle(style);
        float f5 = this.C;
        paint.setStrokeWidth(f5);
        paint.setColor(p37.a0(this.H, this.F));
        canvas.drawCircle(f2, f3, (f5 / 2.0f) + f4, paint);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(p37.a0(this.H, this.E));
        canvas.drawCircle(f2, f3, f4, paint);
        int iRound = Math.round(fWidth2 * 0.8f);
        float f6 = iRound / 2.0f;
        int iRound2 = Math.round(f2 - f6);
        int iRound3 = Math.round(f3 - f6);
        this.G.setAlpha((int) (this.H * 255.0f));
        this.G.setBounds(iRound2, iRound3, iRound2 + iRound, iRound + iRound3);
        this.G.draw(canvas);
    }

    @Override // defpackage.er8
    public final String w() {
        return ((qok) this.s).e.b;
    }

    @Override // defpackage.er8
    public final void x() {
        z(getContext());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(android.content.Context r5) {
        /*
            r4 = this;
            hq8 r0 = r4.s
            r1 = 0
            if (r0 != 0) goto L8
            r4.G = r1
            return
        L8:
            qok r0 = (defpackage.qok) r0
            ook r0 = r0.e
            byte r0 = r0.d
            r2 = 1
            if (r0 == r2) goto L30
            r2 = 6
            if (r0 == r2) goto L2c
            r2 = 9
            r3 = 0
            if (r0 == r2) goto L24
            r2 = 3
            if (r0 == r2) goto L20
            r2 = 4
            if (r0 == r2) goto L30
            goto L33
        L20:
            r3 = 2131232164(0x7f0805a4, float:1.808043E38)
            goto L33
        L24:
            boolean r0 = r4.I
            if (r0 == 0) goto L33
            r3 = 2131231964(0x7f0804dc, float:1.8080024E38)
            goto L33
        L2c:
            r3 = 2131232009(0x7f080509, float:1.8080115E38)
            goto L33
        L30:
            r3 = 2131232123(0x7f08057b, float:1.8080346E38)
        L33:
            if (r3 != 0) goto L38
            r4.G = r1
            return
        L38:
            android.graphics.drawable.Drawable r0 = sgb.F(r3, r5)
            r1 = 2130970899(0x7f040913, float:1.7550521E38)
            r2 = 2131099815(0x7f0600a7, float:1.7811994E38)
            int r5 = f03.t(r1, r5, r2)
            j14.n0(r0, r5)
            r4.G = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.znk.z(android.content.Context):void");
    }
}
