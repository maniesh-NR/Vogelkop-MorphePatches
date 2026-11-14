package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.w;

/* loaded from: classes.dex */
public final class ul9 extends ol9 {
    public final /* synthetic */ byte b;
    public final Object c;

    public /* synthetic */ ul9(Object obj, byte b) {
        this.b = b;
        this.c = obj;
    }

    @Override // defpackage.ol9
    public final Fragment a(ClassLoader classLoader, String str) {
        byte b = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                return Fragment.instantiate(((w) obj).x.b, str, null);
            default:
                Class clsC = ol9.c(classLoader, str);
                a1b a1bVarU = ((h1b) obj).u(0);
                while (a1bVarU.hasNext()) {
                    Fragment fragmentB = ((lkf) a1bVarU.next()).b(clsC);
                    if (fragmentB != null) {
                        return fragmentB;
                    }
                }
                return super.a(classLoader, str);
        }
    }
}
