package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;

/* loaded from: classes.dex */
public interface zd4 extends jb4, prm {
    @Override // defpackage.jb4
    default ud4 a() {
        return g();
    }

    x6f b();

    mc4 d();

    default cc4 e() {
        return fc4.a;
    }

    default void f(boolean z) {
    }

    xd4 g();

    default boolean h() {
        return a().j() == 0;
    }

    default void i(ec4 ec4Var) {
    }

    default boolean l() {
        return false;
    }

    void m(ArrayList arrayList);

    void n(ArrayList arrayList);

    default void o() {
    }

    default boolean p() {
        return true;
    }

    default void q(boolean z) {
    }

    ListenableFuture release();
}
