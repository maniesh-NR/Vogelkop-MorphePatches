package defpackage;

import android.content.ContextWrapper;
import com.opera.android.OperaApplication;
import com.opera.api.Callback;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import org.chromium.base.CommandLine;

/* loaded from: classes.dex */
public final class as2 {
    public Function0 c;
    public t3g d;
    public Callback e;
    public kd6 a = kd6.a;
    public final umi b = vml.d;
    public final q65 f = new q65(new q02(this, 27), (byte) 4);

    public final void a(ContextWrapper contextWrapper, Callback callback) {
        int i;
        if (this.a == kd6.c) {
            this.e = null;
            callback.run(new sw7(this));
            return;
        }
        Callback callback2 = this.e;
        if (callback2 != null) {
            callback2.run(new rw7(jd6.c));
        }
        this.e = callback;
        this.f.B0(this.b, 1000L, TimeUnit.MILLISECONDS);
        if (this.a == kd6.a) {
            this.a = kd6.b;
            synchronized (e7d.a) {
                i = e7d.b;
            }
            if (i == 1) {
                new tjc(contextWrapper, vml.d, new fx0(this, contextWrapper, (byte) 9));
                return;
            }
            String[] strArr = OperaApplication.K;
            CommandLine commandLine = ((OperaApplication) contextWrapper.getApplicationContext()).n;
            fsp.g(contextWrapper, commandLine != null ? commandLine : null);
            e7d.a(contextWrapper, new zr2(this, (byte) 0));
        }
    }

    public final void b(tw7 tw7Var) {
        this.f.S();
        Callback callback = this.e;
        if (callback != null) {
            callback.run(tw7Var);
        }
        this.e = null;
    }
}
