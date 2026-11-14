package defpackage;

import android.os.Build;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class h91 {
    public final p9g a;
    public final HashMap b = new HashMap();

    public h91(zg zgVar, String[] strArr, p9g p9gVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            for (String str : strArr) {
                this.b.put(str, Boolean.valueOf(zgVar.h(str)));
            }
        }
        this.a = p9gVar;
    }
}
