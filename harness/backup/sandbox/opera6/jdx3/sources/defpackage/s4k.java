package defpackage;

import com.opera.android.Lazy;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class s4k implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Lazy b;

    public /* synthetic */ s4k(Lazy lazy, byte b) {
        this.a = b;
        this.b = lazy;
    }

    public final Object invoke() {
        byte b = this.a;
        Object obj = this.b.get();
        switch (b) {
            case 0:
                return (lg) obj;
            default:
                return (u4l) obj;
        }
    }
}
