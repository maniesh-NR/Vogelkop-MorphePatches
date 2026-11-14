package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public interface skh extends tj5 {
    tj5 a();

    @Override // defpackage.tj5
    default Object b(an2 an2Var, Object obj) {
        return a().b(an2Var, obj);
    }

    @Override // defpackage.tj5
    default void c(xj xjVar) {
        a().c(xjVar);
    }

    @Override // defpackage.tj5
    default Set d() {
        return a().d();
    }

    @Override // defpackage.tj5
    default Set e(an2 an2Var) {
        return a().e(an2Var);
    }

    @Override // defpackage.tj5
    default boolean g(an2 an2Var) {
        return a().g(an2Var);
    }

    @Override // defpackage.tj5
    default sj5 h(an2 an2Var) {
        return a().h(an2Var);
    }

    @Override // defpackage.tj5
    default Object i(an2 an2Var) {
        return a().i(an2Var);
    }

    @Override // defpackage.tj5
    default Object j(an2 an2Var, sj5 sj5Var) {
        return a().j(an2Var, sj5Var);
    }
}
