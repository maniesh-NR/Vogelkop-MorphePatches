package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class oqi extends ldk {
    public final b59 j;
    public boolean k;
    public boolean l;
    public final /* synthetic */ pqi m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqi(pqi pqiVar, Context context, umi umiVar) {
        super(umiVar);
        this.m = pqiVar;
        r16 r16Var = ngh.a;
        this.j = w1h.l(context, umiVar, "sdx_override", new bg1[0]);
    }

    @Override // defpackage.ldk
    public final Object a() {
        SharedPreferences sharedPreferences = (SharedPreferences) this.j.get();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        sharedPreferences.getAll().forEach(new by1(new nqi((Object) linkedHashMap, (byte) 0), (byte) 3));
        return linkedHashMap;
    }

    @Override // defpackage.ldk
    public final void b(Object obj) {
        Map map = (Map) obj;
        SharedPreferences.Editor editorEdit = ((SharedPreferences) this.j.get()).edit();
        editorEdit.clear();
        if (map != null) {
            map.forEach(new by1(new nqi((Object) editorEdit, (byte) 1), (byte) 4));
        }
        editorEdit.commit();
    }

    @Override // defpackage.ldk
    public final int c() {
        return 2;
    }

    @Override // defpackage.ldk
    public final void d(Object obj) {
        n08 n08Var = (Map) obj;
        this.k = true;
        this.l = !(n08Var == null || n08Var.isEmpty());
        pqi pqiVar = this.m;
        if (pqiVar.b == null) {
            if (n08Var == null) {
                n08Var = n08.a;
            }
            pqiVar.b = n08Var;
        }
    }
}
