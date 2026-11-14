package defpackage;

import android.view.ViewGroup;
import androidx.fragment.app.g;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class cw6 extends ozb implements Function0 {
    public final /* synthetic */ byte i = 0;
    public final /* synthetic */ g j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ ViewGroup l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw6(g gVar, ViewGroup viewGroup, Object obj) {
        super(0);
        this.j = gVar;
        this.l = viewGroup;
        this.k = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw6(g gVar, Object obj, ViewGroup viewGroup) {
        super(0);
        this.j = gVar;
        this.k = obj;
        this.l = viewGroup;
    }

    public final Object invoke() {
        byte b = this.i;
        ViewGroup viewGroup = this.l;
        Object obj = this.k;
        g gVar = this.j;
        switch (b) {
            case 0:
                gVar.f.e(viewGroup, obj);
                break;
            default:
                ArrayList arrayList = gVar.c;
                gn9 gn9Var = gVar.f;
                if (arrayList.isEmpty()) {
                    gn9Var.d(gVar.q, new fh4(gVar, viewGroup, (byte) 22));
                } else {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        if (!((ew6) obj2).a.g) {
                            jh jhVar = new jh();
                            gn9Var.u(((ew6) arrayList.get(0)).a.c, obj, jhVar, new bl6(gVar, (byte) 8));
                            jhVar.a();
                        }
                    }
                    gn9Var.d(gVar.q, new fh4(gVar, viewGroup, (byte) 22));
                }
                break;
        }
        return Unit.a;
    }
}
