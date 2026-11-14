package defpackage;

import android.graphics.Rect;
import android.util.Range;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public interface xd4 extends ud4 {
    zpl A();

    h28 F();

    List J();

    Set M();

    boolean N();

    Set a();

    boolean d();

    String e();

    void f(n97 n97Var, wwg wwgVar);

    Rect g();

    default xd4 getImplementation() {
        return this;
    }

    default void i(i3j i3jVar) {
        y7h.c = i3jVar;
    }

    Object p();

    ygh s();

    List t(int i);

    Set u();

    void v(rb4 rb4Var);

    boolean w();

    List y(Range range);

    boolean z();
}
