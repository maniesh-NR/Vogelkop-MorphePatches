package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public interface kw1 {
    Object i();

    void j(int i, int i2, int i3);

    void k(int i, int i2);

    default void l(Object obj, Function2 function2) {
        function2.invoke(i(), obj);
    }

    void m(int i, Object obj);

    default void n() {
    }

    void p(int i, Object obj);

    void r(Object obj);

    void s();

    void u();
}
