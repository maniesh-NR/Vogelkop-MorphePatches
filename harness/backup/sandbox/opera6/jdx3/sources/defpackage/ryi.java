package defpackage;

import java.util.Collections;

/* loaded from: classes.dex */
public final class ryi implements j6l {
    public final /* synthetic */ s9i a;

    public ryi(s9i s9iVar) {
        this.a = s9iVar;
    }

    @Override // defpackage.j6l
    public final void L(b2l b2lVar, boolean z) {
        s9i s9iVar = this.a;
        if (s9iVar.Y()) {
            s9iVar.J(Collections.singletonList(b2lVar));
        }
        if (s9iVar.Z(b2lVar)) {
            s9iVar.b0();
        }
    }

    @Override // defpackage.j6l
    public final void k() {
        this.a.b0();
    }

    @Override // defpackage.j6l
    public final void o(b2l b2lVar, int i, boolean z) {
        s9i s9iVar = this.a;
        if (s9iVar.Z(b2lVar)) {
            s9iVar.b0();
        }
    }
}
