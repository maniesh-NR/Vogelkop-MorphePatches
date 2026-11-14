package defpackage;

import com.opera.android.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class nu3 implements esk, kr9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Lazy b;

    public /* synthetic */ nu3(Lazy lazy, byte b) {
        this.a = b;
        this.b = lazy;
    }

    public final br9 a() {
        switch (this.a) {
        }
        return new nr9(0, this.b, Lazy.class, "get", "get()Ljava/lang/Object;", 0);
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof esk) && (obj instanceof kr9)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof esk) && (obj instanceof kr9)) {
                    break;
                }
                break;
        }
        return Intrinsics.a(a(), ((kr9) obj).a());
    }

    public final Object get() {
        switch (this.a) {
        }
        return (yug) this.b.get();
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return a().hashCode();
    }
}
