package defpackage;

import android.content.res.Resources;
import android.widget.TextView;

/* loaded from: classes.dex */
public final /* synthetic */ class bu5 implements f7f {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ zt5 b;

    public final void d0(Object obj) {
        byte b = this.a;
        zt5 zt5Var = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                TextView textView = zt5Var.c;
                Resources resources = textView.getResources();
                textView.setText(str == null ? resources.getString(2132018383) : resources.getString(2132018382, str));
                break;
            default:
                vr8 vr8Var = (vr8) obj;
                laj lajVar = vr8Var.b;
                TextView textView2 = zt5Var.c;
                lajVar.a(textView2);
                textView2.setTextColor(vr8Var.f.a(textView2.getContext()));
                break;
        }
    }
}
