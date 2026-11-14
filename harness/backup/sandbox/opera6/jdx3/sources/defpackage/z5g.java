package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class z5g implements w5g {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z5g(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.w5g
    public final void a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ghf ghfVar = (ghf) obj;
                ode odeVar = (ode) ghfVar.c;
                a4g a4gVar = ((x5g) ghfVar.b).e;
                List listUnmodifiableList = a4gVar != null ? Collections.unmodifiableList(a4gVar.a) : null;
                if (listUnmodifiableList == null) {
                    listUnmodifiableList = l08.a;
                }
                odeVar.r(listUnmodifiableList);
                break;
            default:
                ((k6g) obj).a();
                break;
        }
    }
}
