package defpackage;

import J.N;
import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.opera.android.bar.FindInPage;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class x39 implements TextView.OnEditorActionListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x39(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                FindInPage findInPage = (FindInPage) obj;
                if ((i != 3 && (keyEvent == null || keyEvent.getKeyCode() != 66 || keyEvent.getAction() != 1)) || findInPage.e > 1) {
                    int i2 = FindInPage.w;
                    q9n.u(findInPage.findViewById(2131362964));
                } else if (!findInPage.c.isEmpty()) {
                    String str = findInPage.c;
                    findInPage.c = str;
                    findInPage.g = false;
                    zg zgVar = findInPage.d;
                    zgVar.c = str;
                    zgVar.a = N.MaMXv1PI((WebContents) zgVar.b, str, true, false);
                }
                findInPage.l.clearFocus();
                break;
            case 1:
                iji ijiVar = (iji) obj;
                if (ijiVar.o.k.isEnabled()) {
                    ijiVar.l(true);
                    break;
                }
                break;
            default:
                ((SearchView) obj).m();
                break;
        }
        return true;
    }
}
