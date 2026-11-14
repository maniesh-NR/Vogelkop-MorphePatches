package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ano extends ozb implements Function0 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ voo j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ano(voo vooVar, byte b) {
        super(0);
        this.i = b;
        this.j = vooVar;
    }

    public final Object invoke() {
        byte b = this.i;
        voo vooVar = this.j;
        switch (b) {
            case 0:
                List list = vooVar.a.l.i;
                if (list != null) {
                    return uyg.f(list, vooVar.g);
                }
                return null;
            case 1:
                List list2 = vooVar.a.l.h;
                if (list2 != null) {
                    return uyg.f(list2, vooVar.g);
                }
                return null;
            default:
                List list3 = vooVar.a.l.g;
                if (list3 != null) {
                    return uyg.f(list3, vooVar.g);
                }
                return null;
        }
    }
}
