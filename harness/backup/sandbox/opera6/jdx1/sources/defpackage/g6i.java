package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class g6i extends njb {
    public final /* synthetic */ b6i b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6i(String[] strArr, b6i b6iVar) {
        super(strArr);
        this.b = b6iVar;
    }

    @Override // defpackage.njb
    public final void a(Set set) {
        cx1 cx1VarC = cx1.C();
        pjg pjgVar = new pjg(this.b, (byte) 25);
        if (cx1VarC.a.C()) {
            pjgVar.run();
        } else {
            cx1VarC.D(pjgVar);
        }
    }
}
