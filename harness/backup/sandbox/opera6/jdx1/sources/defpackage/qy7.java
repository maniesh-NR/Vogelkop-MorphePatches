package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class qy7 extends FrameLayout {
    public static final Set e = Collections.singleton("👪");
    public final View a;
    public final List b;
    public final LinearLayout c;
    public final n1 d;

    public qy7(Context context, View view, nz7 nz7Var, jf7 jf7Var) {
        ly7 oy7Var;
        super(context, null, 0);
        this.a = view;
        List list = nz7Var.b;
        this.b = list;
        String str = nz7Var.a;
        LinearLayout linearLayout = (LinearLayout) View.inflate(context, 2131559503, null).findViewById(2131364991);
        this.c = linearLayout;
        int iOrdinal = (list.size() == 26 ? e.contains(list.get(0)) ? py7.b : py7.c : list.size() == 36 ? py7.d : py7.a).ordinal();
        if (iOrdinal == 0) {
            oy7Var = new oy7(context, view, list, linearLayout, jf7Var, (byte) 1);
        } else if (iOrdinal == 1) {
            oy7Var = new oy7(context, view, list, linearLayout, jf7Var, (byte) 0);
        } else if (iOrdinal == 2) {
            oy7Var = new ny7(context, view, list, linearLayout, jf7Var, str);
        } else {
            if (iOrdinal != 3) {
                h9o.p();
                throw null;
            }
            oy7Var = new ly7(context, view, list, linearLayout, jf7Var);
        }
        this.d = oy7Var;
        oy7Var.J();
        oy7Var.K();
        oy7Var.I();
        addView(linearLayout);
    }
}
