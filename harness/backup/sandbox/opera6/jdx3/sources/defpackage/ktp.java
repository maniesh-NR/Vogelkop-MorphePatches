package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class ktp implements r0k {
    public final arp a;
    public final arp b;
    public final arp c;

    public ktp(arp arpVar, arp arpVar2, arp arpVar3) {
        this.a = arpVar;
        this.b = arpVar2;
        this.c = arpVar3;
    }

    @Override // defpackage.r0k
    public final Task a(List list) {
        return l().a(list);
    }

    @Override // defpackage.r0k
    public final Task b(int i) {
        return l().b(i);
    }

    @Override // defpackage.r0k
    public final Task c() {
        return l().c();
    }

    @Override // defpackage.r0k
    public final boolean d(qop qopVar, gdb gdbVar, int i) {
        return l().d(qopVar, gdbVar, i);
    }

    @Override // defpackage.r0k
    public final void e(a9e a9eVar) {
        l().e(a9eVar);
    }

    @Override // defpackage.r0k
    public final void f(a9e a9eVar) {
        l().f(a9eVar);
    }

    @Override // defpackage.r0k
    public final Task g(int i) {
        return l().g(i);
    }

    @Override // defpackage.r0k
    public final Set h() {
        return l().h();
    }

    @Override // defpackage.r0k
    public final Task i(n9h n9hVar) {
        return l().i(n9hVar);
    }

    @Override // defpackage.r0k
    public final Set j() {
        return l().j();
    }

    @Override // defpackage.r0k
    public final Task k(ArrayList arrayList) {
        return l().k(arrayList);
    }

    public final r0k l() {
        return this.c.zza() != null ? (r0k) this.b.zza() : (r0k) this.a.zza();
    }
}
