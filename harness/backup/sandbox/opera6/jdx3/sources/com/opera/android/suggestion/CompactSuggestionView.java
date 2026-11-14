package com.opera.android.suggestion;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.chip.Chip;
import com.opera.android.utilities.DisplayUtil;
import defpackage.fan;
import defpackage.hqk;
import defpackage.jl4;
import defpackage.jxb;
import defpackage.oc5;
import defpackage.qc5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class CompactSuggestionView extends ViewGroup {
    public static final /* synthetic */ int n = 0;
    public int a;
    public final d5o b;
    public hqk c;
    public nv6 d;
    public final ArrayList e;
    public final oc5 f;
    public int g;
    public boolean h;
    public boolean i;
    public final Point j;
    public byte k;
    public final boolean l;
    public jl4 m;

    public CompactSuggestionView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        d5o d5oVar = new d5o();
        d5oVar.c = this;
        d5oVar.a = Collections.EMPTY_LIST;
        this.b = d5oVar;
        this.e = new ArrayList();
        this.i = true;
        Point point = new Point();
        this.j = point;
        this.k = (byte) 2;
        this.l = true;
        this.f = new oc5(context);
        Resources resources = context.getResources();
        point.x = resources.getDimensionPixelSize(2131165467);
        point.y = resources.getDimensionPixelSize(2131165468);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i) {
        int paddingLeft;
        if (i <= 0 || !this.h || this.g == (paddingLeft = ((i - getPaddingLeft()) - getPaddingRight()) + this.j.x)) {
            return;
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            qc5 qc5Var = (qc5) obj;
            if (qc5Var.d != null) {
                qc5Var.b.setVisibility(0);
                qc5Var.b((i - getPaddingLeft()) - getPaddingRight());
            }
        }
        Context context = getContext();
        byte b = DisplayUtil.c(context) < DisplayUtil.b(context) ? this.k : this.l;
        oc5 oc5Var = this.f;
        oc5Var.getClass();
        if (arrayList.size() > b) {
            System.currentTimeMillis();
            Resources resources = oc5Var.a.getResources();
            Rect rect = fan.a;
            int i4 = (((int) (paddingLeft / resources.getDisplayMetrics().density)) + 3) / 4;
            ro9 ro9Var = oc5Var.b;
            if (ro9Var != null && ro9Var.b != i4) {
                ro9Var = null;
                oc5Var.b = null;
            }
            if (ro9Var == null) {
                ro9Var = new ro9((byte) 17, i4);
                oc5Var.b = ro9Var;
            }
            ArrayList arrayList2 = new ArrayList(b == true ? 1 : 0);
            int i5 = 0;
            byte b2 = b;
            while (i5 < b2) {
                ArrayList arrayList3 = oc5.c;
                int size2 = arrayList.size();
                int i6 = i2;
                while (i6 < size2) {
                    Object obj2 = arrayList.get(i6);
                    i6++;
                    arrayList3.add(((qc5) obj2).c);
                }
                for (int size3 = arrayList.size(); size3 < 20; size3++) {
                    arrayList3.add(jxb.d);
                }
                int i7 = ro9Var.b;
                boolean[][] zArr = (boolean[][]) ro9Var.d;
                int size4 = arrayList3.size();
                float[][] fArr = (float[][]) ro9Var.c;
                int length = fArr.length;
                for (int i8 = i2; i8 < length; i8++) {
                    Arrays.fill(fArr[i8], 0.0f);
                }
                for (boolean[] zArr2 : zArr) {
                    Arrays.fill(zArr2, false);
                }
                int i9 = 1;
                byte b3 = b2;
                while (i9 <= size4) {
                    int i10 = 1;
                    byte b4 = b3;
                    while (i10 <= i7) {
                        int i11 = i9 - 1;
                        jxb jxbVar = (jxb) arrayList3.get(i11);
                        byte b5 = b4 == true ? 1 : 0;
                        int i12 = jxbVar.a;
                        if (i12 <= i10) {
                            float f = jxbVar.b;
                            float[] fArr2 = fArr[i11];
                            float f2 = f + fArr2[i10 - i12];
                            float f3 = fArr2[i10];
                            fArr[i9][i10] = Math.max(f2, f3);
                            zArr[i9][i10] = f2 > f3;
                        } else {
                            fArr[i9][i10] = fArr[i11][i10];
                            zArr[i9][i10] = false;
                        }
                        i10++;
                        b4 = b5;
                    }
                    i9++;
                    b3 = b4;
                }
                byte b6 = b3 == true ? 1 : 0;
                ArrayList arrayList4 = new ArrayList();
                while (size4 >= 1) {
                    if (zArr[size4][i7]) {
                        jxb jxbVar2 = (jxb) arrayList3.get(size4 - 1);
                        i7 -= jxbVar2.a;
                        arrayList4.add(0, jxbVar2);
                    }
                    size4--;
                }
                arrayList3.clear();
                if (arrayList4.isEmpty()) {
                    break;
                }
                arrayList2.add(arrayList4);
                int size5 = arrayList4.size();
                int i13 = 0;
                while (i13 < size5) {
                    Object obj3 = arrayList4.get(i13);
                    i13++;
                    arrayList.remove(((jxb) obj3).c);
                }
                if (arrayList.isEmpty()) {
                    break;
                }
                i5++;
                b2 = b6;
                i2 = 0;
            }
            for (int size6 = arrayList2.size() - 1; size6 >= 0; size6--) {
                List list = (List) arrayList2.get(size6);
                for (int size7 = list.size() - 1; size7 >= 0; size7--) {
                    arrayList.add(0, ((jxb) list.get(size7)).c);
                }
            }
            System.currentTimeMillis();
        }
        this.g = paddingLeft;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        boolean zW = cs5.W(this);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            Chip chip = ((qc5) arrayList.get(i6)).b;
            if (chip.getVisibility() != 8) {
                int measuredWidth = chip.getMeasuredWidth();
                int measuredHeight = chip.getMeasuredHeight();
                if (paddingLeft + measuredWidth > i5 - getPaddingRight()) {
                    paddingLeft = getPaddingLeft();
                    paddingTop += this.a;
                }
                int i7 = !zW ? paddingLeft : (i5 - paddingLeft) - measuredWidth;
                chip.layout(i7, paddingTop, i7 + measuredWidth, measuredHeight + paddingTop);
                paddingLeft = measuredWidth + this.j.x + paddingLeft;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        Context context = getContext();
        byte b = DisplayUtil.c(context) < DisplayUtil.b(context) ? this.k : this.l;
        a(size);
        ArrayList arrayList = this.e;
        int size2 = arrayList.size();
        int i3 = 0;
        this.a = 0;
        int paddingLeft2 = getPaddingLeft();
        int i4 = 1;
        while (true) {
            Point point = this.j;
            if (i3 >= size2) {
                setMeasuredDimension(size, View.resolveSize(getPaddingBottom() + (((i4 * this.a) + getPaddingTop()) - point.y), i2));
                return;
            }
            qc5 qc5Var = (qc5) arrayList.get(i3);
            Chip chip = qc5Var.b;
            if (chip.getVisibility() != 8) {
                qc5Var.b(paddingLeft);
                int measuredWidth = chip.getMeasuredWidth();
                int paddingRight = ((size - getPaddingRight()) - paddingLeft2) - measuredWidth;
                this.a = Math.max(this.a, chip.getMeasuredHeight() + point.y);
                if (paddingRight >= 0) {
                    paddingLeft2 = measuredWidth + point.x + paddingLeft2;
                } else if (i4 == b) {
                    chip.setVisibility(8);
                } else {
                    i4++;
                    paddingLeft2 = getPaddingLeft() + measuredWidth + point.x;
                }
            }
            i3++;
        }
    }
}
