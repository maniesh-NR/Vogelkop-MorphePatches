package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* loaded from: classes.dex */
public final class hc extends Drawable {
    public final /* synthetic */ byte a;
    public final Object b;

    public hc() {
        this.a = (byte) 3;
        this.b = new Rect();
        new Paint(1);
    }

    public hc(fr8 fr8Var) {
        this.a = (byte) 1;
        this.b = fr8Var;
    }

    public /* synthetic */ hc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a(Canvas canvas) {
    }

    private final void b(int i) {
    }

    private final void c(int i) {
    }

    private final void d(int i) {
    }

    private final void e(int i) {
    }

    private final void f(ColorFilter colorFilter) {
    }

    private final void g(ColorFilter colorFilter) {
    }

    private final void h(ColorFilter colorFilter) {
    }

    private final void i(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ActionBarContainer actionBarContainer = (ActionBarContainer) obj;
                if (!actionBarContainer.g) {
                    Drawable drawable = actionBarContainer.d;
                    if (drawable != null) {
                        drawable.draw(canvas);
                    }
                    Drawable drawable2 = actionBarContainer.e;
                    if (drawable2 != null && actionBarContainer.h) {
                        drawable2.draw(canvas);
                        break;
                    }
                } else {
                    Drawable drawable3 = actionBarContainer.f;
                    if (drawable3 != null) {
                        drawable3.draw(canvas);
                        break;
                    }
                }
                break;
            case 1:
                fr8 fr8Var = (fr8) obj;
                int i = fr8Var.g;
                Rect rect = fr8Var.d;
                int i2 = fr8Var.c;
                boolean z = i != i2;
                if (z) {
                    float f = i / i2;
                    canvas.save();
                    float f2 = i2 / 2.0f;
                    canvas.scale(f, f, f2, f2);
                }
                if (fr8Var.l) {
                    fr8Var.a.b(rect.width(), fr8Var.b).b(canvas, rect.left, rect.top, p37.j0(0.38f, -1));
                } else {
                    fr8Var.n(canvas, rect);
                }
                Drawable drawable4 = fr8Var.p;
                if (drawable4 != null) {
                    drawable4.setBounds(fr8Var.e);
                    fr8Var.p.draw(canvas);
                }
                if (z) {
                    canvas.restore();
                    break;
                }
                break;
            case 2:
                ((jva) obj).c(canvas);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        switch (this.a) {
            case 1:
                return ((fr8) this.b).g;
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        switch (this.a) {
            case 1:
                return ((fr8) this.b).g;
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
            case 0:
            case 2:
                return 0;
            case 1:
            default:
                return -3;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        switch (this.a) {
            case 0:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.b;
                boolean z = actionBarContainer.g;
                Drawable drawable = actionBarContainer.d;
                if (!z) {
                    if (drawable != null) {
                        drawable.getOutline(outline);
                        break;
                    }
                } else if (actionBarContainer.f != null) {
                    drawable.getOutline(outline);
                    break;
                }
                break;
            default:
                super.getOutline(outline);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        byte b = this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        byte b = this.a;
    }
}
