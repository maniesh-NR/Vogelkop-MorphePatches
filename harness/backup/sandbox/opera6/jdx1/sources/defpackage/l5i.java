package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l5i extends ViewGroup {
    public final byte a;
    public final ArrayList b;
    public final ArrayList c;
    public final d7h d;
    public int e;

    public l5i(Context context) {
        super(context);
        this.a = (byte) 5;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.c = arrayList2;
        this.d = new d7h((byte) 2);
        setClipChildren(false);
        m5i m5iVar = new m5i(context);
        addView(m5iVar);
        arrayList.add(m5iVar);
        arrayList2.add(m5iVar);
        this.e = 1;
        setTag(2131363113, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}
