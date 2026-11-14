package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class haa extends gl4 {
    public static final int[] e = {1};
    public static final int[] f = {0, 1};
    public static final int[] g = {1};
    public static final int[] h = {1, 0};
    public final /* synthetic */ byte c;
    public int d;

    public haa(byte b) {
        this.c = b;
        switch (b) {
            case 1:
                this.d = 0;
                break;
        }
    }

    @Override // defpackage.gl4
    public final iwb c(CarouselLayoutManager carouselLayoutManager, View view) {
        int[] iArrA;
        int[] iArrA2;
        int i;
        switch (this.c) {
            case 0:
                int height = carouselLayoutManager.getHeight();
                if (carouselLayoutManager.C()) {
                    height = carouselLayoutManager.getWidth();
                }
                lph lphVar = (lph) view.getLayoutParams();
                float f2 = ((ViewGroup.MarginLayoutParams) lphVar).topMargin + ((ViewGroup.MarginLayoutParams) lphVar).bottomMargin;
                float measuredWidth = view.getMeasuredWidth() << 1;
                if (carouselLayoutManager.C()) {
                    f2 = ((ViewGroup.MarginLayoutParams) lphVar).leftMargin + ((ViewGroup.MarginLayoutParams) lphVar).rightMargin;
                    measuredWidth = view.getMeasuredHeight() << 1;
                }
                float f3 = this.a + f2;
                float fMax = Math.max(this.b + f2, f3);
                float f4 = height;
                float fMin = Math.min(measuredWidth + f2, f4);
                float fI = nb6.i((measuredWidth / 3.0f) + f2, f3 + f2, fMax + f2);
                float f5 = (fMin + fI) / 2.0f;
                int[] iArr = f4 < 2.0f * f3 ? new int[]{0} : e;
                int iMax = (int) Math.max(1.0d, Math.floor((f4 - (scd.T(r7) * fMax)) / fMin));
                int iCeil = (((int) Math.ceil(f4 / fMin)) - iMax) + 1;
                int[] iArr2 = new int[iCeil];
                for (int i2 = 0; i2 < iCeil; i2++) {
                    iArr2[i2] = iMax + i2;
                }
                i = carouselLayoutManager.n != 1 ? 0 : 1;
                int[] iArr3 = f;
                if (i != 0) {
                    iArrA2 = gl4.a(iArr);
                    iArrA = gl4.a(iArr3);
                } else {
                    iArrA = iArr3;
                    iArrA2 = iArr;
                }
                a72 a72VarA = a72.a(f4, fI, f3, fMax, iArrA2, f5, iArrA, fMin, iArr2);
                int i3 = a72VarA.c;
                int i4 = a72VarA.d;
                int i5 = a72VarA.g;
                this.d = i3 + i4 + i5;
                if (i3 + i4 + i5 > carouselLayoutManager.getItemCount()) {
                    a72VarA = a72.a(f4, fI, f3, fMax, iArr, f5, iArr3, fMin, iArr2);
                    i = 0;
                } else {
                    i = i;
                }
                return scd.x(view.getContext(), f2, height, a72VarA, i);
            default:
                int height2 = carouselLayoutManager.getHeight();
                if (carouselLayoutManager.C()) {
                    height2 = carouselLayoutManager.getWidth();
                }
                lph lphVar2 = (lph) view.getLayoutParams();
                float f6 = ((ViewGroup.MarginLayoutParams) lphVar2).topMargin + ((ViewGroup.MarginLayoutParams) lphVar2).bottomMargin;
                float measuredHeight = view.getMeasuredHeight();
                if (carouselLayoutManager.C()) {
                    f6 = ((ViewGroup.MarginLayoutParams) lphVar2).leftMargin + ((ViewGroup.MarginLayoutParams) lphVar2).rightMargin;
                    measuredHeight = view.getMeasuredWidth();
                }
                float f7 = this.a + f6;
                float fMax2 = Math.max(this.b + f6, f7);
                float f8 = height2;
                float fMin2 = Math.min(measuredHeight + f6, f8);
                float fI2 = nb6.i((measuredHeight / 3.0f) + f6, f7 + f6, fMax2 + f6);
                float f9 = (fMin2 + fI2) / 2.0f;
                float f10 = 2.0f * f7;
                int[] iArrA3 = f8 <= f10 ? new int[]{0} : g;
                int i6 = carouselLayoutManager.n;
                int[] iArrA4 = h;
                if (i6 == 1) {
                    iArrA3 = gl4.a(iArrA3);
                    iArrA4 = gl4.a(iArrA4);
                }
                int[] iArr4 = iArrA3;
                int[] iArr5 = iArrA4;
                int iMax2 = (int) Math.max(1.0d, Math.floor(((f8 - (scd.T(iArr5) * f9)) - (scd.T(iArr4) * fMax2)) / fMin2));
                int iCeil2 = (int) Math.ceil(f8 / fMin2);
                int i7 = (iCeil2 - iMax2) + 1;
                int[] iArr6 = new int[i7];
                for (int i8 = 0; i8 < i7; i8++) {
                    iArr6[i8] = iCeil2 - i8;
                }
                a72 a72VarA2 = a72.a(f8, fI2, f7, fMax2, iArr4, f9, iArr5, fMin2, iArr6);
                int i9 = a72VarA2.c;
                int i10 = a72VarA2.g;
                this.d = i9 + a72VarA2.d + i10;
                int itemCount = carouselLayoutManager.getItemCount();
                int i11 = a72VarA2.c;
                int i12 = a72VarA2.d;
                int i13 = ((i11 + i12) + i10) - itemCount;
                int i14 = (i13 <= 0 || (i11 <= 0 && i12 <= 1)) ? 0 : 1;
                while (i13 > 0) {
                    int i15 = a72VarA2.c;
                    if (i15 > 0) {
                        a72VarA2.c = i15 - 1;
                    } else {
                        int i16 = a72VarA2.d;
                        if (i16 > 1) {
                            a72VarA2.d = i16 - 1;
                        }
                    }
                    i13--;
                }
                int i17 = a72VarA2.d;
                if (i17 == 0 && a72VarA2.c == 0 && f8 > f10) {
                    a72VarA2.c = 1;
                } else {
                    i = i14;
                }
                if (i != 0) {
                    a72VarA2 = a72.a(f8, fI2, f7, fMax2, new int[]{a72VarA2.c}, f9, new int[]{i17}, fMin2, new int[]{i10});
                }
                return scd.x(view.getContext(), f6, height2, a72VarA2, carouselLayoutManager.n);
        }
    }

    @Override // defpackage.gl4
    public final boolean d(CarouselLayoutManager carouselLayoutManager, int i) {
        switch (this.c) {
            case 0:
                if (carouselLayoutManager.n == 1) {
                    int i2 = this.d;
                    if (i < i2) {
                        int itemCount = carouselLayoutManager.getItemCount();
                        int i3 = this.d;
                        if (itemCount < i3) {
                            i2 = i3;
                            if (i >= i2 || carouselLayoutManager.getItemCount() >= this.d) {
                            }
                        }
                    } else if (i >= i2) {
                    }
                    break;
                }
                break;
            default:
                int i4 = this.d;
                if (i < i4) {
                    int itemCount2 = carouselLayoutManager.getItemCount();
                    int i5 = this.d;
                    if (itemCount2 < i5) {
                        i4 = i5;
                        if (i >= i4 || carouselLayoutManager.getItemCount() >= this.d) {
                        }
                    }
                } else if (i >= i4) {
                }
                break;
        }
        return true;
    }
}
