package defpackage;

import android.graphics.Bitmap;
import java.io.File;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class oya {
    public static final HashSet a = new HashSet();

    public static void a(nya nyaVar) {
        yne.b.b(nyaVar);
        a.remove(nyaVar);
    }

    public static nya b(String str, int i, int i2, int i3, int i4, mya myaVar) {
        nya nyaVar = new nya(myaVar);
        dwh dwhVarH = str.startsWith("/") ? yne.b.h(new File(str)) : yne.b.i(str);
        if ((i3 & 4096) != 0) {
            dwhVarH.h(2, new int[0]);
        }
        if ((i3 & 16384) != 0) {
            dwhVarH.i(3, new int[0]);
        }
        if (i4 <= -10) {
            dwhVarH.l(1);
        } else if (i4 <= 10) {
            dwhVarH.l(2);
        } else {
            dwhVarH.l(3);
        }
        if (i > 0 || i2 > 0) {
            dwhVarH.b.b(Math.max(0, i), Math.max(0, i2));
            if (i > 0 && i2 > 0) {
                dwhVarH.a();
            }
            dwhVarH.j();
        }
        dwhVarH.c(Bitmap.Config.RGB_565);
        dwhVarH.f(nyaVar);
        if (nyaVar.c) {
            return null;
        }
        nyaVar.b = true;
        a.add(nyaVar);
        return nyaVar;
    }
}
