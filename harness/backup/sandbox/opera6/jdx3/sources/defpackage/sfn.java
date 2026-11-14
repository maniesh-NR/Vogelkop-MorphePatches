package defpackage;

import android.content.Context;
import android.view.MenuItem;
import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public class sfn extends blj {
    @Override // defpackage.blj
    public final void l0() {
        this.i.a(1, 0, 0, getString(2132022267));
        this.i.a(1, 1, 0, getString(2132022268));
        this.i.a(1, 2, 0, getString(2132022269));
        Context context = getContext();
        String[] strArr = OperaApplication.K;
        MenuItem menuItemFindItem = this.i.findItem(((OperaApplication) context.getApplicationContext()).R().c.getProtocol());
        if (menuItemFindItem != null) {
            menuItemFindItem.setChecked(true);
        }
    }

    @Override // defpackage.blj
    public final void m0(int i) {
        Context context = getContext();
        String[] strArr = OperaApplication.K;
        ydn ydnVarR = ((OperaApplication) context.getApplicationContext()).R();
        ydnVarR.c.c(i).d();
        if (ydnVarR.d.a) {
            ydnVarR.f();
        }
    }
}
