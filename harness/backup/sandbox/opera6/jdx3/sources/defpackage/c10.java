package defpackage;

import android.view.View;
import android.widget.Checkable;
import android.widget.TextView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class c10 {
    public final String a;
    public final View b;
    public final TextView c;

    public c10(View view, String str) {
        this.a = str;
        this.b = view;
        WeakHashMap weakHashMap = r5n.a;
        this.c = (TextView) ((View) m5n.f(view, 2131361977));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(boolean z, boolean z2, boolean z3) {
        TextView textView = this.c;
        ((Checkable) textView).setChecked(z2);
        textView.setEnabled(z3);
        textView.setClickable(z3);
    }
}
