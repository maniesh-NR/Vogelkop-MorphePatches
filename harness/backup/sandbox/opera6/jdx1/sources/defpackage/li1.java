package defpackage;

import android.os.Build;
import java.util.HashSet;

/* loaded from: classes.dex */
public class li1 {
    public static final HashSet d = new HashSet();
    public final String a;
    public final String b;
    public final /* synthetic */ byte c;

    public li1(String str, String str2, byte b) {
        this.c = b;
        this.a = str;
        this.b = str2;
        d.add(this);
    }

    public boolean a() {
        HashSet hashSet = ki1.a;
        String str = this.b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        return ("eng".equals(str2) || "userdebug".equals(str2)) && hashSet.contains(str.concat(":dev"));
    }
}
