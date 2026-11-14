package defpackage;

import com.opera.android.bar.TopToolbarContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class cvl implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pr b;

    public /* synthetic */ cvl(pr prVar, byte b) {
        this.a = b;
        this.b = prVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        pr prVar = this.b;
        switch (b) {
            case 0:
                prVar.C((dvl) null);
                break;
            default:
                int i = ((avl) ((bvl) prVar.c).getState().g()).c;
                prVar.C(i > 0 ? new dvl((TopToolbarContainer) ((mt3) prVar.b).invoke(), i) : null);
                break;
        }
        return Unit.a;
    }
}
