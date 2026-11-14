package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class qvb {
    public final pvb a;
    public final int b;
    public final int c;

    public qvb(View view, pvb pvbVar) {
        this.a = pvbVar;
        int top = 0;
        int left = 0;
        for (View view2 = pvbVar.getView(); view2 != view; view2 = (View) view2.getParent()) {
            left += view2.getLeft();
        }
        this.b = left;
        for (View view3 = pvbVar.getView(); view3 != view; view3 = (View) view3.getParent()) {
            top += view3.getTop();
        }
        this.c = top;
    }
}
