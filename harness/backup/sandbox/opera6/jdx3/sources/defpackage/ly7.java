package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;

/* loaded from: classes.dex */
public final class ly7 extends n1 {
    public final Context c;
    public final View d;
    public final List e;
    public final LinearLayout f;
    public final jf7 g;
    public boolean h;

    public ly7(Context context, View view, List list, LinearLayout linearLayout, jf7 jf7Var) {
        super((byte) 8, false);
        this.c = context;
        this.d = view;
        this.e = list;
        this.f = linearLayout;
        this.g = jf7Var;
        this.h = true;
        H0();
    }

    public final void H0() {
        int[][] iArr;
        boolean z = this.h;
        List list = this.e;
        if (z) {
            IntRange intRangeG = j95.g(list);
            ArrayList arrayList = new ArrayList();
            ubb it = intRangeG.iterator();
            while (((acb) it).c) {
                Object next = it.next();
                if (((Number) next).intValue() % 12 < 6) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                arrayList2.add(Integer.valueOf(((Number) obj).intValue() + 1));
            }
            iArr = new int[][]{CollectionsKt.j0(arrayList2)};
        } else {
            IntRange intRangeG2 = j95.g(list);
            ArrayList arrayList3 = new ArrayList();
            ubb it2 = intRangeG2.iterator();
            while (((acb) it2).c) {
                Object next2 = it2.next();
                if (((Number) next2).intValue() % 12 >= 6) {
                    arrayList3.add(next2);
                }
            }
            ArrayList arrayList4 = new ArrayList(k95.o(arrayList3, 10));
            int size2 = arrayList3.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList3.get(i2);
                i2++;
                arrayList4.add(Integer.valueOf(((Number) obj2).intValue() + 1));
            }
            iArr = new int[][]{CollectionsKt.j0(arrayList4)};
        }
        this.b = iArr;
        int iN0 = n0() - 1;
        int[][] iArr2 = new int[iN0][];
        for (int i3 = 0; i3 < iN0; i3++) {
            iArr2[i3] = new int[6];
        }
        int i4 = 0;
        for (int i5 = 0; i5 < iN0; i5++) {
            for (int i6 = 0; i6 < 6; i6++) {
                int[][] iArr3 = (int[][]) this.b;
                if (i4 < (iArr3 != null ? iArr3 : null)[0].length) {
                    int[] iArr4 = iArr2[i5];
                    if (iArr3 == null) {
                        iArr3 = null;
                    }
                    iArr4[i6] = iArr3[0][i4];
                    i4++;
                }
            }
        }
        this.b = iArr2;
    }

    @Override // defpackage.n1
    public final void J() {
        Context context = this.c;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        AppCompatImageView appCompatImageViewFindViewById = View.inflate(context, 2131558684, linearLayout).findViewById(2131362672);
        View view = this.d;
        appCompatImageViewFindViewById.setLayoutParams(new LinearLayout.LayoutParams(view.getWidth(), view.getHeight()));
        this.f.addView(linearLayout);
        AppCompatImageView appCompatImageViewFindViewById2 = linearLayout.findViewById(2131362672);
        appCompatImageViewFindViewById2.setOnClickListener(new jf7(this, appCompatImageViewFindViewById2, (byte) 7));
    }

    @Override // defpackage.n1
    public final Context i0() {
        return this.c;
    }

    @Override // defpackage.n1
    public final View.OnClickListener l0() {
        return this.g;
    }

    @Override // defpackage.n1
    public final int n0() {
        return ((this.e.size() / 2) / 6) + 1;
    }

    @Override // defpackage.n1
    public final LinearLayout o0() {
        return this.f;
    }

    @Override // defpackage.n1
    public final View p0() {
        return this.d;
    }

    @Override // defpackage.n1
    public final List q0() {
        return this.e;
    }
}
