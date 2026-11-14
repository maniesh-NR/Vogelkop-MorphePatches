package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class l32 {
    public final umi a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final k32 d;
    public final i7f e;

    public l32(Context context, umi umiVar) {
        r16 r16Var = ngh.a;
        this.a = umiVar;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new k32(context, (byte) 0);
        this.e = new i7f();
    }

    public final d12 a(String str, String str2, boolean z, cv2 cv2Var, pa paVar) throws Throwable {
        e32 j32Var;
        LinkedHashMap linkedHashMap = z ? this.c : this.b;
        WeakReference weakReference = (WeakReference) linkedHashMap.get(str);
        d32 d32Var = weakReference != null ? (d32) weakReference.get() : null;
        if (d32Var == null) {
            if (z) {
                j32Var = new g32(null);
                c32 c32Var = new c32(new f32((byte) 0));
                cv2Var.invoke(Boolean.TRUE);
                j32Var.i(c32Var);
            } else {
                r16 r16Var = ngh.a;
                j32Var = new j32(this.a, this.d, str, cv2Var, new f9((Object) this, (Object) str, (Object) str2, (byte) 8));
            }
            d32Var = new d32(j32Var, paVar);
            linkedHashMap.put(str, new WeakReference(d32Var));
        } else {
            e32 e32Var = d32Var.a;
            pa paVar2 = d32Var.b;
            d32Var.b = paVar;
            paVar2.invoke();
            if (d32Var.c) {
                linkedHashMap.remove(str);
                return a(str, str2, z, cv2Var, paVar);
            }
            if (e32Var.a != null) {
                cv2Var.invoke(Boolean.FALSE);
            } else {
                e32Var.c = cv2Var;
            }
        }
        return d32Var.a;
    }
}
