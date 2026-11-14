package defpackage;

import android.content.Context;
import com.opera.android.BrowserActivity;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final class buj {
    public final BrowserActivity a;
    public final umi b;
    public final du3 c;
    public final ysj d;
    public final x5f e;

    /* JADX WARN: Multi-variable type inference failed */
    public buj(BrowserActivity browserActivity, umi umiVar, du3 du3Var, ysj ysjVar, x5f x5fVar) {
        this.a = browserActivity;
        this.b = umiVar;
        this.c = du3Var;
        this.d = ysjVar;
        this.e = x5fVar;
        if (nb6.j != null) {
            return;
        }
        Context applicationContext = browserActivity.getApplicationContext();
        CountDownLatch countDownLatch = oz7.a;
        vh9 vh9VarV = cs5.v(applicationContext);
        vh9VarV = vh9VarV == null ? new vh9(applicationContext, new th9("Noto Color Emoji Compat", 2130903048)) : vh9VarV;
        ((tx7) vh9VarV).b = true;
        oz7.a(applicationContext, vh9VarV);
        nb6.j = new qie((byte) 22);
    }

    public final void a(int i) {
        ysj ysjVar = this.d;
        ysjVar.b(am2.i(i, 5000, ysjVar), ijm.b);
    }
}
