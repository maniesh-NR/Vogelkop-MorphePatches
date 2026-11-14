package defpackage;

import com.opera.android.settings.SettingsManager;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class pk extends j93 {
    public final ri3 d;
    public final pde e;
    public final pde f;
    public final wnm g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk(SettingsManager settingsManager, d8j d8jVar, ri3 ri3Var) {
        v08 v08VarW;
        super(settingsManager, d8jVar);
        a8j a8jVar = a8j.a;
        this.d = ri3Var;
        us4 us4Var = (us4) ri3Var.a.q.getValue();
        ui3 ui3Var = (ui3) xf8.o0(us4Var.a);
        if (ui3Var == null) {
            v08VarW = v08.a;
        } else {
            Set set = ui3Var.b;
            v08VarW = ic4.w(set, new rs4(ui3Var, ic4.w(set, new rs4(ui3Var, (Set) xf8.o0(us4Var.c))), us4Var));
        }
        LinkedHashSet linkedHashSet = (Iterable) v08VarW;
        int iA = qbd.a(k95.o(linkedHashSet, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        for (Object obj : linkedHashSet) {
            linkedHashMap.put(((nvm) obj).a, obj);
        }
        pde pdeVar = new pde(linkedHashMap);
        this.e = pdeVar;
        pde pdeVar2 = new pde(settingsManager.b());
        this.f = pdeVar2;
        a7j a7jVar = (a7j) pdeVar2.g();
        l08 l08Var = l08.a;
        this.g = xf8.Y(new ok(a7jVar, l08Var, l08Var, l08Var), pdeVar2, b8h.d(b8h.j(pdeVar, new y2((byte) 7))), new ve5((byte) 10));
    }

    public final void g(String str, boolean z) {
        pde pdeVar = this.e;
        LinkedHashMap linkedHashMap = new LinkedHashMap((Map) pdeVar.g());
        nvm nvmVar = (nvm) linkedHashMap.get(str);
        if (nvmVar == null) {
            qp2.n("");
        } else {
            linkedHashMap.put(str, new nvm(nvmVar.a, nvmVar.b, nvmVar.c, nvmVar.d, nvmVar.e, z));
            pdeVar.r(linkedHashMap);
        }
    }
}
