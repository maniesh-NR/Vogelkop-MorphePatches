package defpackage;

import J.N;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class cxk implements j6l {
    public final /* synthetic */ i3j a;

    public cxk(i3j i3jVar) {
        this.a = i3jVar;
    }

    @Override // defpackage.j6l
    public final void L(b2l b2lVar, boolean z) {
        ArrayList arrayList = (ArrayList) this.a.a;
        int iIndexOf = arrayList.indexOf(b2lVar);
        if (iIndexOf != -1) {
            arrayList.remove(iIndexOf);
            N.MmlwU2A7(iIndexOf);
        }
    }

    @Override // defpackage.j6l
    public final void o(b2l b2lVar, int i, boolean z) {
        i3j i3jVar = this.a;
        if (i3jVar.L(b2lVar)) {
            i3jVar.h(b2lVar);
        }
    }
}
