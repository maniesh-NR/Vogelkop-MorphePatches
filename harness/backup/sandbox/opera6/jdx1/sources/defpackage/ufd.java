package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public interface ufd {
    Map a();

    void b();

    default Function1 c() {
        return null;
    }

    default Function2 d() {
        return null;
    }

    default Function1 e() {
        return null;
    }

    int getHeight();

    int getWidth();
}
