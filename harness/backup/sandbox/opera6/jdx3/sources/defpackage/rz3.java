package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class rz3 extends tjf {
    public final qz3 j;
    public final k11 k;
    public final int l;
    public final boolean m;
    public final long n;

    public rz3(qz3 qz3Var, View view, cv2 cv2Var, k11 k11Var) {
        super(view, qz3Var, cv2Var);
        this.j = qz3Var;
        this.k = k11Var;
        this.l = z7h.h(view.getContext(), 6.0f);
        this.m = true;
        this.n = Long.MAX_VALUE;
    }

    @Override // defpackage.tjf
    public final int b() {
        return this.l;
    }

    @Override // defpackage.tjf
    public final boolean d() {
        return false;
    }

    @Override // defpackage.tjf
    public final k11 e() {
        return this.k;
    }

    @Override // defpackage.tjf
    public final boolean g() {
        return this.m;
    }

    @Override // defpackage.tjf
    public final long h() {
        return this.n;
    }
}
