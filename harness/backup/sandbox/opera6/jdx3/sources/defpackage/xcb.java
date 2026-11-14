package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.r;
import androidx.fragment.app.w;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import java.util.Arrays;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class xcb implements cdb {
    public final /* synthetic */ byte a;
    public final BrowserActivity b;
    public final String c;

    public /* synthetic */ xcb(BrowserActivity browserActivity, String str, byte b) {
        this.a = b;
        this.b = browserActivity;
        this.c = str;
    }

    @Override // defpackage.cdb
    public final void execute() {
        byte b = this.a;
        String str = this.c;
        r rVar = this.b;
        switch (b) {
            case 0:
                BrowserActivity browserActivityO = q9n.o(rVar);
                if (browserActivityO != null) {
                    mm6 mm6VarY0 = browserActivityO.y0();
                    eej eejVarO = browserActivityO.O();
                    mm6VarY0.getClass();
                    bpd bpdVar = new bpd((byte) 11, mm6VarY0, str, false);
                    yl6 yl6VarA = mm6VarY0.a();
                    SharedPreferences sharedPreferences = (SharedPreferences) yl6VarA.c.get();
                    nej nejVar = eejVarO.a;
                    im6 im6Var = new im6(bpdVar, yl6VarA, sharedPreferences, (byte) 0);
                    nejVar.getClass();
                    nejVar.b(im6Var, ijm.b);
                    break;
                }
                break;
            case 1:
                BrowserActivity browserActivityO2 = q9n.o(rVar);
                if (browserActivityO2 != null) {
                    browserActivityO2.y0().b(str, null);
                    break;
                }
                break;
            default:
                w supportFragmentManager = rVar.getSupportFragmentManager();
                fge fgeVarO = lcp.o(supportFragmentManager, fge.class);
                if (fgeVarO == null) {
                    int i = BrowserActivity.E1;
                    rVar.o1(1);
                    umi umiVar = rVar.x;
                    String[] strArr = OperaApplication.K;
                    fge fgeVar = new fge(rVar, umiVar, ((OperaApplication) rVar.getApplication()).L().c);
                    fgeVar.O = str;
                    qim qimVar = rVar.o;
                    Objects.requireNonNull(qimVar);
                    qimVar.g(new zhj(new wzg(fgeVar, fge.class, (byte) 4), null, 1, -1, null, false, Arrays.asList(new n6h[0])));
                    break;
                } else {
                    supportFragmentManager.Y(-1, 0, "flow");
                    View view = fgeVarO.getView();
                    if (view != null) {
                        WeakHashMap weakHashMap = r5n.a;
                        ((EditText) ((View) m5n.f(view, 2131364217))).setText(str);
                        break;
                    }
                }
                break;
        }
    }
}
