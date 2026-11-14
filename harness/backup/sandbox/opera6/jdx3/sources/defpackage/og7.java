package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class og7 implements r8n {
    public final TextView a;
    public boolean b;

    public og7(TextView textView) {
        this.a = textView;
    }

    @Override // defpackage.r8n
    public final void a(View view) {
        TextView textView = this.a;
        Context context = textView.getContext();
        textView.setTextColor(this.b ? f03.y(context) : f03.F(context));
    }
}
