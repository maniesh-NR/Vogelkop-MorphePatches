package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;

/* loaded from: classes.dex */
public final class oy7 extends n1 {
    public static final int[][] i = {new int[]{0, 2, 3, 4, 5, 6}, new int[]{0, 7, 8, 9, 10, 11}, new int[]{0, 12, 13, 14, 15, 16}, new int[]{0, 17, 18, 19, 20, 21}, new int[]{1, 22, 23, 24, 25, 26}};
    public final /* synthetic */ byte c;
    public final Context d;
    public final View e;
    public final List f;
    public final LinearLayout g;
    public final jf7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy7(Context context, View view, List list, LinearLayout linearLayout, jf7 jf7Var, byte b) {
        super((byte) 8, false);
        this.c = b;
        switch (b) {
            case 1:
                super((byte) 8, false);
                this.d = context;
                this.e = view;
                this.f = list;
                this.g = linearLayout;
                this.h = jf7Var;
                IntRange intRangeG = j95.g(list);
                ArrayList arrayList = new ArrayList(k95.o(intRangeG, 10));
                acb it = intRangeG.iterator();
                while (it.c) {
                    arrayList.add(Integer.valueOf(((ubb) it).nextInt() + 1));
                }
                ((n1) this).b = new int[][]{CollectionsKt.j0(arrayList)};
                int iN0 = n0();
                int iM0 = m0();
                int[][] iArr = new int[iN0][];
                for (int i2 = 0; i2 < iN0; i2++) {
                    iArr[i2] = new int[iM0];
                }
                int i3 = 0;
                for (int i4 = 0; i4 < iN0; i4++) {
                    for (int i5 = 0; i5 < iM0; i5++) {
                        int[][] iArr2 = (int[][]) ((n1) this).b;
                        if (i3 < (iArr2 != null ? iArr2 : null)[0].length) {
                            iArr[i4][i5] = (iArr2 == null ? null : iArr2)[0][i3];
                            i3++;
                        }
                    }
                }
                ((n1) this).b = iArr;
                break;
            default:
                this.d = context;
                this.e = view;
                this.f = list;
                this.g = linearLayout;
                this.h = jf7Var;
                ((n1) this).b = i;
                break;
        }
    }

    public final Context i0() {
        switch (this.c) {
        }
        return this.d;
    }

    public final View.OnClickListener l0() {
        byte b = this.c;
        return this.h;
    }

    public final int m0() {
        switch (this.c) {
            case 0:
                return i[0].length;
            default:
                int[][] iArr = (int[][]) ((n1) this).b;
                if (iArr == null) {
                    iArr = null;
                }
                return Math.min(6, iArr[0].length);
        }
    }

    public final int n0() {
        switch (this.c) {
            case 0:
                return 5;
            default:
                int iM0 = m0();
                List list = this.f;
                return (list.size() / iM0) + (list.size() % iM0 == 0 ? 0 : 1);
        }
    }

    public final LinearLayout o0() {
        switch (this.c) {
        }
        return this.g;
    }

    public final View p0() {
        switch (this.c) {
        }
        return this.e;
    }

    public final List q0() {
        switch (this.c) {
        }
        return this.f;
    }
}
