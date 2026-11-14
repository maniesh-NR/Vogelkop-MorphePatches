package ads_mobile_sdk;

import android.view.View;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class gs0 {
    public final ArrayList a = new ArrayList();

    static {
        Pattern.compile("^[a-zA-Z0-9 ]+$");
    }

    public final void a(View view, fs0 fs0Var) {
        es0 es0Var;
        if (view == null) {
            qp2.o("FriendlyObstruction is null");
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                es0Var = null;
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            es0Var = (es0) obj;
            if (es0Var.a.get() == view) {
                break;
            }
        }
        if (es0Var == null) {
            arrayList.add(new es0(view, fs0Var));
        }
    }
}
