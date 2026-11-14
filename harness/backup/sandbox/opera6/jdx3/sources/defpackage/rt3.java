package defpackage;

import android.view.View;
import android.widget.TextView;
import com.opera.android.BrowserActivity;
import com.opera.android.bar.BottomBar;
import java.util.function.Consumer;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final /* synthetic */ class rt3 implements Consumer {
    public final /* synthetic */ BrowserActivity a;
    public final /* synthetic */ qq6 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ View d;

    public /* synthetic */ rt3(BrowserActivity browserActivity, qq6 qq6Var, View view, View view2) {
        this.a = browserActivity;
        this.b = qq6Var;
        this.c = view;
        this.d = view2;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        kp3 kp3Var = (kp3) obj;
        BrowserActivity browserActivity = this.a;
        BottomBar bottomBar = browserActivity.A;
        if (bottomBar == null) {
            bottomBar = null;
        }
        boolean z = kp3Var.f;
        if (bottomBar.k != z) {
            bottomBar.k = z;
            bottomBar.invalidate();
        }
        BottomBar bottomBar2 = browserActivity.A;
        if (bottomBar2 == null) {
            bottomBar2 = null;
        }
        bottomBar2.i(kp3Var.a);
        qq6 qq6Var = this.b;
        if (qq6Var != null) {
            k6l k6lVar = browserActivity.V;
            if (k6lVar == null) {
                k6lVar = null;
            }
            b2l b2lVar = k6lVar.o;
            String url = b2lVar != null ? ((d7l) b2lVar).j.getUrl() : null;
            boolean z2 = kp3Var.b;
            TextView textView = (TextView) qq6Var.b;
            if (!z2 || url == null) {
                textView.setVisibility(8);
            } else {
                String strReplaceFirst = new Regex("^www\\.").a.matcher(new Regex("^https?://").a.matcher(url).replaceFirst("")).replaceFirst("");
                int iK = StringsKt.K(strReplaceFirst, '/', 0, 6);
                if (iK != -1) {
                    strReplaceFirst = strReplaceFirst.substring(0, iK);
                }
                int iK2 = StringsKt.K(strReplaceFirst, ':', 0, 6);
                if (iK2 != -1) {
                    strReplaceFirst = strReplaceFirst.substring(0, iK2);
                }
                textView.setText(strReplaceFirst);
                if (strReplaceFirst != null) {
                    q9n.A(textView, new zr9(qq6Var, strReplaceFirst, (byte) 15));
                }
                textView.setVisibility(0);
            }
        }
        View view = this.c;
        if (view != null) {
            view.setVisibility(kp3Var.d ? 0 : 8);
        }
        View view2 = this.d;
        if (view2 != null) {
            view2.setVisibility(kp3Var.e ? 0 : 8);
        }
    }
}
