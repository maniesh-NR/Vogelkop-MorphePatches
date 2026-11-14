package defpackage;

import com.opera.android.ui.catalog.widget.OperaListItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.b;

/* loaded from: classes.dex */
public final /* synthetic */ class j31 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pqh b;

    public /* synthetic */ j31(pqh pqhVar, byte b) {
        this.a = b;
        this.b = pqhVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        boolean z = true;
        pqh pqhVar = this.b;
        switch (b) {
            case 0:
                pqhVar.a = (vg9) obj;
                break;
            case 1:
                pqhVar.a = (String) obj;
                break;
            case 2:
                aw9 aw9Var = (aw9) obj;
                if (Intrinsics.a(aw9Var.x(), "waiting")) {
                    pqhVar.a = aw9Var;
                    z = false;
                }
                break;
            case 3:
                bma bmaVar = (bma) obj;
                if (pqhVar.a != null) {
                    bmaVar.getClass();
                } else if (bmaVar.q) {
                    pqhVar.a = bmaVar;
                }
                break;
            case 4:
                Object obj2 = (u5m) obj;
                if (((b8e) obj2).a.n) {
                    pqhVar.a = obj2;
                    z = false;
                }
                break;
            case 5:
                u5c u5cVar = ((w5m) ((u5m) obj)).o;
                List listJ = (List) pqhVar.a;
                if (listJ != null) {
                    listJ.add(u5cVar);
                } else {
                    listJ = j95.j(new u5c[]{u5cVar});
                }
                pqhVar.a = listJ;
                break;
            case 6:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                xtb[] xtbVarArr = uxk.w;
                ((OperaListItem) pqhVar.a).t(zBooleanValue);
                break;
            default:
                pqhVar.a = (b) obj;
                break;
        }
        return Unit.a;
    }
}
