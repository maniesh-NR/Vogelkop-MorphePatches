package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class efi extends gfi implements ffi, dfi {
    public ArrayList i = new ArrayList();
    public HashSet j = null;
    public String k = null;
    public HashSet l = null;
    public HashSet m = null;

    @Override // defpackage.dfi
    public final Set a() {
        return null;
    }

    @Override // defpackage.dfi
    public final String b() {
        return this.k;
    }

    @Override // defpackage.dfi
    public final void d(HashSet hashSet) {
        this.j = hashSet;
    }

    @Override // defpackage.dfi
    public final void e(HashSet hashSet) {
    }

    @Override // defpackage.ffi
    public void f(jfi jfiVar) {
        this.i.add(jfiVar);
    }

    @Override // defpackage.dfi
    public final void g(HashSet hashSet) {
        this.m = hashSet;
    }

    @Override // defpackage.dfi
    public final Set getRequiredFeatures() {
        return this.j;
    }

    @Override // defpackage.ffi
    public final List h() {
        return this.i;
    }

    @Override // defpackage.dfi
    public final void i(String str) {
        this.k = str;
    }

    @Override // defpackage.dfi
    public final void j(HashSet hashSet) {
        this.l = hashSet;
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
