package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class u9n implements View.OnLayoutChangeListener {
    public int a;
    public final /* synthetic */ View b;

    public u9n(View view) {
        r9b r9bVarI;
        this.b = view;
        WeakHashMap weakHashMap = r5n.a;
        g3o g3oVarA = i5n.a(view);
        this.a = (g3oVarA == null || (r9bVarI = g3oVarA.a.i(8)) == null) ? 0 : r9bVarI.d;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        r9b r9bVarI;
        WeakHashMap weakHashMap = r5n.a;
        View view2 = this.b;
        g3o g3oVarA = i5n.a(view2);
        int i9 = (g3oVarA == null || (r9bVarI = g3oVarA.a.i(8)) == null) ? 0 : r9bVarI.d;
        if (this.a != i9) {
            this.a = i9;
            view2.requestApplyInsets();
        }
    }
}
