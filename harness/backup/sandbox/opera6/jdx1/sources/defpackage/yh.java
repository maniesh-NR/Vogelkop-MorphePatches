package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class yh extends th {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zh b;
    public final /* synthetic */ String c;
    public final /* synthetic */ rh d;

    public /* synthetic */ yh(zh zhVar, String str, rh rhVar, byte b) {
        this.a = b;
        this.b = zhVar;
        this.c = str;
        this.d = rhVar;
    }

    @Override // defpackage.th
    public final void a(Object obj, nh nhVar) {
        byte b = this.a;
        rh rhVar = this.d;
        String str = this.c;
        zh zhVar = this.b;
        switch (b) {
            case 0:
                LinkedHashMap linkedHashMap = zhVar.b;
                ArrayList arrayList = zhVar.d;
                Object obj2 = linkedHashMap.get(str);
                if (obj2 == null) {
                    rqd.o("Attempting to launch an unregistered ActivityResultLauncher with contract ", rhVar, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int iIntValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    zhVar.b(iIntValue, rhVar, obj, nhVar);
                    return;
                } catch (Exception e) {
                    arrayList.remove(str);
                    throw e;
                }
            default:
                ArrayList arrayList2 = zhVar.d;
                Object obj3 = zhVar.b.get(str);
                if (obj3 == null) {
                    rqd.o("Attempting to launch an unregistered ActivityResultLauncher with contract ", rhVar, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int iIntValue2 = ((Number) obj3).intValue();
                arrayList2.add(str);
                try {
                    zhVar.b(iIntValue2, rhVar, obj, nhVar);
                    return;
                } catch (Exception e2) {
                    arrayList2.remove(str);
                    throw e2;
                }
        }
    }

    public final void b() {
        this.b.f(this.c);
    }
}
