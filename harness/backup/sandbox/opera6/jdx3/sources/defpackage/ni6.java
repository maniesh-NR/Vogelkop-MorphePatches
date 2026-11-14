package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.appsflyer.internal.j;
import com.leanplum.internal.Clock;
import java.util.ArrayList;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class ni6 {
    public final b59 a;

    public ni6(Context context) {
        this.a = w1h.l(context, vml.d, "news_push_storage", new bg1[0]);
    }

    public ni6(Context context, umi umiVar) {
        this.a = w1h.l(context, umiVar, "PriceChangeNotificationControllerPrefs", new bg1[0]);
    }

    public ni6(b59 b59Var) {
        this.a = b59Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ni6(hjf hjfVar) {
        this.a = w1h.l(hjfVar, vml.d, "page_menu_order", new bg1[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ni6(hjf hjfVar, umi umiVar) {
        this.a = w1h.l(hjfVar, umiVar, "so", new bg1[0]);
    }

    public ni6(umi umiVar, Context context, String str) {
        this.a = w1h.l(context, umiVar, str, new bg1[0]);
    }

    public final int a(long j) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.a.get();
        int i = sharedPreferences.getInt("ActiveDayIndex", 0);
        int i2 = 0;
        for (int i3 = 0; i3 < 30; i3++) {
            int i4 = i - i3;
            if (i4 < 0) {
                i4 += 30;
            }
            long j2 = sharedPreferences.getLong("ActiveDay_" + i4, 0L);
            if (j2 == 0 || (j - j2) / Clock.DAY_MILLIS >= 30) {
                break;
            }
            i2++;
        }
        return i2;
    }

    public final void b(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        SharedPreferences sharedPreferences = (SharedPreferences) this.a.get();
        int i = sharedPreferences.getInt("ActiveDayIndex", 0);
        long j2 = sharedPreferences.getLong("ActiveDay_" + i, 0L);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j2);
        if (calendar2.get(6) == calendar.get(6) && calendar2.get(1) == calendar.get(1)) {
            return;
        }
        if (j2 != 0) {
            i = (i + 1) % 30;
        }
        sharedPreferences.edit().putInt("ActiveDayIndex", i).putLong(sko.i(i, "ActiveDay_"), calendar.getTimeInMillis()).apply();
    }

    public final void c(ArrayList arrayList, ArrayList arrayList2) {
        j.c((SharedPreferences) this.a.get(), "order", TextUtils.join((CharSequence) ";", (Iterable) sfe.M0(arrayList, new qw8(arrayList2, (byte) 4))));
    }
}
