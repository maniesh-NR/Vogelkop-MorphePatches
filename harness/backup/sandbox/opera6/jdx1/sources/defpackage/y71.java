package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class y71 implements xj4 {
    public final /* synthetic */ byte a;
    public final xfk b;
    public final fd4 c;

    public /* synthetic */ y71(xfk xfkVar, fd4 fd4Var, byte b) {
        this.a = b;
        this.b = xfkVar;
        this.c = fd4Var;
    }

    @Override // defpackage.xj4
    public final wj4 a(wc4 wc4Var, Map map, dk4 dk4Var) throws Exception {
        boolean zH;
        byte b = this.a;
        xfk xfkVar = this.b;
        fd4 fd4Var = this.c;
        switch (b) {
            case 0:
                qii qiiVar = qii.b;
                ArrayList arrayList = fd4Var.d;
                if (arrayList != null) {
                    ruf rufVar = (ruf) CollectionsKt.Z(((g9b) CollectionsKt.Z(arrayList)).a.a);
                    InputConfiguration inputConfiguration = new InputConfiguration(rufVar.a.getWidth(), rufVar.a.getHeight(), rufVar.b);
                    ArrayList arrayList2 = new ArrayList(map.size());
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        arrayList2.add((Surface) ((Map.Entry) it.next()).getValue());
                    }
                    if (!wc4Var.l(inputConfiguration, arrayList2, dk4Var)) {
                        wc4Var.toString();
                        Objects.toString(dk4Var);
                        dk4Var.a();
                        return qiiVar;
                    }
                } else {
                    ArrayList arrayList3 = new ArrayList(map.size());
                    Iterator it2 = map.entrySet().iterator();
                    while (it2.hasNext()) {
                        arrayList3.add((Surface) ((Map.Entry) it2.next()).getValue());
                    }
                    if (!wc4Var.T(arrayList3, dk4Var)) {
                        wc4Var.toString();
                        Objects.toString(dk4Var);
                        dk4Var.a();
                        return qiiVar;
                    }
                }
                return new vj4(n08.a, uup.j(map, xfkVar));
            default:
                qii qiiVar2 = qii.b;
                buf bufVarI = uup.i(fd4Var, xfkVar, map);
                ArrayList arrayList4 = bufVarI.a;
                if (arrayList4.isEmpty()) {
                    Objects.toString(fd4Var);
                    dk4Var.a();
                    return qiiVar2;
                }
                ArrayList arrayList5 = fd4Var.d;
                if (arrayList5 == null) {
                    zH = wc4Var.k(arrayList4, dk4Var);
                } else {
                    ruf rufVar2 = (ruf) CollectionsKt.Z(((g9b) CollectionsKt.Z(arrayList5)).a.a);
                    zH = wc4Var.h(new m8b(rufVar2.a.getWidth(), rufVar2.a.getHeight(), rufVar2.b), arrayList4, dk4Var);
                }
                if (zH) {
                    return new vj4(n08.a, bufVarI.d);
                }
                Objects.toString(wc4Var);
                Objects.toString(dk4Var);
                dk4Var.a();
                return qiiVar2;
        }
    }
}
