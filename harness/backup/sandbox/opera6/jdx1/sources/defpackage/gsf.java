package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.f;

/* loaded from: classes.dex */
public final class gsf extends hsf {
    public final /* synthetic */ byte d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gsf(f fVar, byte b) {
        super(fVar);
        this.d = b;
    }

    @Override // defpackage.hsf
    public final int b(View view) {
        int decoratedRight;
        int i;
        byte b = this.d;
        f fVar = this.a;
        switch (b) {
            case 0:
                lph lphVar = (lph) view.getLayoutParams();
                decoratedRight = fVar.getDecoratedRight(view);
                i = ((ViewGroup.MarginLayoutParams) lphVar).rightMargin;
                break;
            default:
                lph lphVar2 = (lph) view.getLayoutParams();
                decoratedRight = fVar.getDecoratedBottom(view);
                i = ((ViewGroup.MarginLayoutParams) lphVar2).bottomMargin;
                break;
        }
        return decoratedRight + i;
    }

    @Override // defpackage.hsf
    public final int c(View view) {
        int decoratedMeasuredWidth;
        int i;
        byte b = this.d;
        f fVar = this.a;
        switch (b) {
            case 0:
                lph lphVar = (lph) view.getLayoutParams();
                decoratedMeasuredWidth = fVar.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) lphVar).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) lphVar).rightMargin;
                break;
            default:
                lph lphVar2 = (lph) view.getLayoutParams();
                decoratedMeasuredWidth = fVar.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) lphVar2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) lphVar2).bottomMargin;
                break;
        }
        return decoratedMeasuredWidth + i;
    }

    @Override // defpackage.hsf
    public final int d(View view) {
        int decoratedMeasuredHeight;
        int i;
        byte b = this.d;
        f fVar = this.a;
        switch (b) {
            case 0:
                lph lphVar = (lph) view.getLayoutParams();
                decoratedMeasuredHeight = fVar.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) lphVar).topMargin;
                i = ((ViewGroup.MarginLayoutParams) lphVar).bottomMargin;
                break;
            default:
                lph lphVar2 = (lph) view.getLayoutParams();
                decoratedMeasuredHeight = fVar.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) lphVar2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) lphVar2).rightMargin;
                break;
        }
        return decoratedMeasuredHeight + i;
    }

    @Override // defpackage.hsf
    public final int e(View view) {
        int decoratedLeft;
        int i;
        byte b = this.d;
        f fVar = this.a;
        switch (b) {
            case 0:
                lph lphVar = (lph) view.getLayoutParams();
                decoratedLeft = fVar.getDecoratedLeft(view);
                i = ((ViewGroup.MarginLayoutParams) lphVar).leftMargin;
                break;
            default:
                lph lphVar2 = (lph) view.getLayoutParams();
                decoratedLeft = fVar.getDecoratedTop(view);
                i = ((ViewGroup.MarginLayoutParams) lphVar2).topMargin;
                break;
        }
        return decoratedLeft - i;
    }

    @Override // defpackage.hsf
    public final int f() {
        switch (this.d) {
            case 0:
                return this.a.getWidth();
            default:
                return this.a.getHeight();
        }
    }

    @Override // defpackage.hsf
    public final int g() {
        int width;
        int paddingRight;
        byte b = this.d;
        f fVar = this.a;
        switch (b) {
            case 0:
                width = fVar.getWidth();
                paddingRight = fVar.getPaddingRight();
                break;
            default:
                width = fVar.getHeight();
                paddingRight = fVar.getPaddingBottom();
                break;
        }
        return width - paddingRight;
    }

    @Override // defpackage.hsf
    public final int h() {
        switch (this.d) {
            case 0:
                return this.a.getPaddingRight();
            default:
                return this.a.getPaddingBottom();
        }
    }

    @Override // defpackage.hsf
    public final int i() {
        switch (this.d) {
            case 0:
                return this.a.getWidthMode();
            default:
                return this.a.getHeightMode();
        }
    }

    @Override // defpackage.hsf
    public final int j() {
        switch (this.d) {
            case 0:
                return this.a.getHeightMode();
            default:
                return this.a.getWidthMode();
        }
    }

    @Override // defpackage.hsf
    public final int k() {
        switch (this.d) {
            case 0:
                return this.a.getPaddingLeft();
            default:
                return this.a.getPaddingTop();
        }
    }

    @Override // defpackage.hsf
    public final int l() {
        int width;
        int paddingRight;
        byte b = this.d;
        f fVar = this.a;
        switch (b) {
            case 0:
                width = fVar.getWidth() - fVar.getPaddingLeft();
                paddingRight = fVar.getPaddingRight();
                break;
            default:
                width = fVar.getHeight() - fVar.getPaddingTop();
                paddingRight = fVar.getPaddingBottom();
                break;
        }
        return width - paddingRight;
    }

    @Override // defpackage.hsf
    public final int n(View view) {
        byte b = this.d;
        Rect rect = this.c;
        f fVar = this.a;
        switch (b) {
            case 0:
                fVar.getTransformedBoundingBox(view, true, rect);
                return rect.right;
            default:
                fVar.getTransformedBoundingBox(view, true, rect);
                return rect.bottom;
        }
    }

    @Override // defpackage.hsf
    public final int o(View view) {
        byte b = this.d;
        Rect rect = this.c;
        f fVar = this.a;
        switch (b) {
            case 0:
                fVar.getTransformedBoundingBox(view, true, rect);
                return rect.left;
            default:
                fVar.getTransformedBoundingBox(view, true, rect);
                return rect.top;
        }
    }

    @Override // defpackage.hsf
    public final void p(int i) {
        switch (this.d) {
            case 0:
                this.a.offsetChildrenHorizontal(i);
                break;
            default:
                this.a.offsetChildrenVertical(i);
                break;
        }
    }
}
