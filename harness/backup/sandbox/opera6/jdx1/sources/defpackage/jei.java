package defpackage;

import android.graphics.Matrix;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class jei extends gfi implements lei, dfi {
    public HashSet i = null;
    public String j = null;
    public HashSet k = null;
    public HashSet l = null;
    public HashSet m = null;
    public Matrix n;

    @Override // defpackage.dfi
    public final Set a() {
        return this.k;
    }

    @Override // defpackage.dfi
    public final String b() {
        return this.j;
    }

    @Override // defpackage.dfi
    public final void d(HashSet hashSet) {
        this.i = hashSet;
    }

    @Override // defpackage.dfi
    public final void e(HashSet hashSet) {
        this.k = hashSet;
    }

    @Override // defpackage.dfi
    public final void g(HashSet hashSet) {
        this.m = hashSet;
    }

    @Override // defpackage.dfi
    public final Set getRequiredFeatures() {
        return this.i;
    }

    @Override // defpackage.dfi
    public final void i(String str) {
        this.j = str;
    }

    @Override // defpackage.dfi
    public final void j(HashSet hashSet) {
        this.l = hashSet;
    }

    @Override // defpackage.lei
    public final void k(Matrix matrix) {
        this.n = matrix;
    }

    @Override // defpackage.dfi
    public final Set l() {
        return this.l;
    }

    @Override // defpackage.dfi
    public final Set m() {
        return this.m;
    }
}
