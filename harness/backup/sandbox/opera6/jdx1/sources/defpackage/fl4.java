package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class fl4 extends tc2 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ CarouselLayoutManager c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl4(CarouselLayoutManager carouselLayoutManager, byte b) {
        super(1);
        this.b = b;
        switch (b) {
            case 1:
                this.c = carouselLayoutManager;
                super(0);
                break;
            default:
                this.c = carouselLayoutManager;
                break;
        }
    }

    public final void a(RectF rectF, RectF rectF2, RectF rectF3) {
        switch (this.b) {
            case 0:
                float f = rectF2.top;
                float f2 = rectF3.top;
                if (f < f2 && rectF2.bottom > f2) {
                    float f3 = f2 - f;
                    rectF.top += f3;
                    rectF3.top += f3;
                }
                float f4 = rectF2.bottom;
                float f5 = rectF3.bottom;
                if (f4 > f5 && rectF2.top < f5) {
                    float f6 = f4 - f5;
                    rectF.bottom = Math.max(rectF.bottom - f6, rectF.top);
                    rectF2.bottom = Math.max(rectF2.bottom - f6, rectF2.top);
                    break;
                }
                break;
            default:
                float f7 = rectF2.left;
                float f8 = rectF3.left;
                if (f7 < f8 && rectF2.right > f8) {
                    float f9 = f8 - f7;
                    rectF.left += f9;
                    f7 = rectF2.left + f9;
                    rectF2.left = f7;
                }
                float f10 = rectF2.right;
                float f11 = rectF3.right;
                if (f10 > f11 && f7 < f11) {
                    float f12 = f10 - f11;
                    rectF.right = Math.max(rectF.right - f12, rectF.left);
                    rectF2.right = Math.max(rectF2.right - f12, rectF2.left);
                    break;
                }
                break;
        }
    }

    public final RectF b(float f, float f2, float f3, float f4) {
        switch (this.b) {
            case 0:
                return new RectF(0.0f, f3, f2, f - f3);
            default:
                return new RectF(f4, 0.0f, f2 - f4, f);
        }
    }

    public final int c() {
        byte b = this.b;
        CarouselLayoutManager carouselLayoutManager = this.c;
        switch (b) {
            case 0:
                return carouselLayoutManager.getHeight();
            default:
                return carouselLayoutManager.getHeight() - carouselLayoutManager.getPaddingBottom();
        }
    }

    public final int d() {
        switch (this.b) {
            case 0:
                return this.c.getPaddingLeft();
            default:
                return 0;
        }
    }

    public final int e() {
        byte b = this.b;
        CarouselLayoutManager carouselLayoutManager = this.c;
        switch (b) {
            case 0:
                return carouselLayoutManager.getWidth() - carouselLayoutManager.getPaddingRight();
            default:
                return carouselLayoutManager.getWidth();
        }
    }

    public final int f() {
        switch (this.b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.c;
                if (carouselLayoutManager.D()) {
                    return carouselLayoutManager.getWidth();
                }
                return 0;
        }
    }

    public final int g() {
        switch (this.b) {
            case 0:
                return 0;
            default:
                return this.c.getPaddingTop();
        }
    }

    public final void h(View view, int i, int i2) {
        switch (this.b) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.c;
                int paddingLeft = carouselLayoutManager.getPaddingLeft();
                lph lphVar = (lph) view.getLayoutParams();
                carouselLayoutManager.layoutDecoratedWithMargins(view, paddingLeft, i, carouselLayoutManager.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) lphVar).leftMargin + ((ViewGroup.MarginLayoutParams) lphVar).rightMargin + paddingLeft, i2);
                break;
            default:
                CarouselLayoutManager carouselLayoutManager2 = this.c;
                int paddingTop = carouselLayoutManager2.getPaddingTop();
                lph lphVar2 = (lph) view.getLayoutParams();
                carouselLayoutManager2.layoutDecoratedWithMargins(view, i, paddingTop, i2, carouselLayoutManager2.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) lphVar2).topMargin + ((ViewGroup.MarginLayoutParams) lphVar2).bottomMargin + paddingTop);
                break;
        }
    }

    public final void i(RectF rectF, RectF rectF2, RectF rectF3) {
        switch (this.b) {
            case 0:
                if (rectF2.bottom <= rectF3.top) {
                    float fFloor = ((float) Math.floor(rectF.bottom)) - 1.0f;
                    rectF.bottom = fFloor;
                    rectF.top = Math.min(rectF.top, fFloor);
                }
                if (rectF2.top >= rectF3.bottom) {
                    float fCeil = ((float) Math.ceil(rectF.top)) + 1.0f;
                    rectF.top = fCeil;
                    rectF.bottom = Math.max(fCeil, rectF.bottom);
                    break;
                }
                break;
            default:
                if (rectF2.right <= rectF3.left) {
                    float fFloor2 = ((float) Math.floor(rectF.right)) - 1.0f;
                    rectF.right = fFloor2;
                    rectF.left = Math.min(rectF.left, fFloor2);
                }
                if (rectF2.left >= rectF3.right) {
                    float fCeil2 = ((float) Math.ceil(rectF.left)) + 1.0f;
                    rectF.left = fCeil2;
                    rectF.right = Math.max(fCeil2, rectF.right);
                    break;
                }
                break;
        }
    }

    public final void j(View view, Rect rect, float f, float f2) {
        switch (this.b) {
            case 0:
                view.offsetTopAndBottom((int) (f2 - (rect.top + f)));
                break;
            default:
                view.offsetLeftAndRight((int) (f2 - (rect.left + f)));
                break;
        }
    }
}
