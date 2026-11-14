package defpackage;

import android.os.Build;
import java.io.File;

/* loaded from: classes.dex */
public final class m7a {
    public static final File c = new File("/proc/self/fd");
    public static volatile m7a d;
    public int a;
    public boolean b;

    public static m7a a() {
        if (d == null) {
            synchronized (m7a.class) {
                if (d == null) {
                    m7a m7aVar = new m7a();
                    m7aVar.b = true;
                    String str = Build.MODEL;
                    if (str != null && str.length() >= 7) {
                        str.substring(0, 7);
                    }
                    d = m7aVar;
                }
            }
        }
        return d;
    }
}
