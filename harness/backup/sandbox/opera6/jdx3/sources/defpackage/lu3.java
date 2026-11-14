package defpackage;

import com.opera.android.BrowserActivity;
import java.util.Objects;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class lu3 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ BrowserActivity b;

    public /* synthetic */ lu3(BrowserActivity browserActivity, byte b) {
        this.a = b;
        this.b = browserActivity;
    }

    public final Object invoke() {
        byte b = this.a;
        BrowserActivity browserActivity = this.b;
        switch (b) {
            case 0:
                return ((jt3) browserActivity.y.r.get()).f;
            case 1:
                return (ctl) browserActivity.y.a.A().get();
            case 2:
                return browserActivity.J0();
            default:
                qim qimVar = browserActivity.o;
                Objects.requireNonNull(qimVar);
                return qimVar.g;
        }
    }
}
