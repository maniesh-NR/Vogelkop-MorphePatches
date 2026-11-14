package defpackage;

import android.content.Intent;
import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public class vcb implements cdb {
    public final /* synthetic */ byte a = 1;
    public final Object b;

    public vcb(Object obj) {
        this.b = obj;
    }

    public vcb(zt3 zt3Var, Intent intent) {
        this.b = zt3Var;
    }

    @Override // defpackage.cdb
    public void execute() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                BrowserActivity browserActivity = ((zt3) obj).a;
                int i = BrowserActivity.E1;
                browserActivity.o1(1);
                ((jbn) browserActivity.y.a.q.get()).f(ibn.a, new st3(browserActivity, (byte) 3));
                break;
            default:
                ac8.a(obj);
                break;
        }
    }
}
