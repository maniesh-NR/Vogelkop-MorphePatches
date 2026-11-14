package ads_mobile_sdk;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class da2 {
    public final String a;
    public final String c;
    public final String e;
    public final ji f;
    public final hz0 g;

    static {
        new UUID(0L, 0L).toString();
    }

    public da2(Context context, String str, String str2, String str3) {
        ji jiVar = ji.c;
        if (jiVar == null) {
            jiVar = new ji(context);
            ji.c = jiVar;
        }
        this.f = jiVar;
        this.g = hz0.a(context);
        this.a = str;
        str.concat("_3p");
        this.c = str2;
        str2.concat("_3p");
        this.e = str3;
    }

    public final fz0 a(long j) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            qp2.n(this.e.concat(": Invalid negative current timestamp. Updating PAID failed"));
            return null;
        }
        ji jiVar = this.f;
        SharedPreferences sharedPreferences = (SharedPreferences) jiVar.b;
        SharedPreferences sharedPreferences2 = (SharedPreferences) jiVar.b;
        String str = this.c;
        long j2 = sharedPreferences.getLong(str, -1L);
        if (j2 != -1) {
            if (jCurrentTimeMillis < j2) {
                jiVar.a(Long.valueOf(jCurrentTimeMillis), str);
            } else if (jCurrentTimeMillis >= j2 + j) {
                return a(UUID.randomUUID().toString());
            }
        }
        String string = sharedPreferences2.getString(this.a, null);
        return string == null ? a(UUID.randomUUID().toString()) : new fz0(sharedPreferences2.getLong(str, -1L), string);
    }

    public final fz0 a(String str) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            qp2.n(this.e.concat(": Invalid negative current timestamp. Updating PAID failed"));
            return null;
        }
        String str2 = this.c;
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        ji jiVar = this.f;
        jiVar.a(lValueOf, str2);
        jiVar.a((Object) str, this.a);
        return new fz0(jCurrentTimeMillis, str);
    }
}
