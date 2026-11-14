package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.opera.android.Lazy;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class ukf {
    public static final Pattern c = Pattern.compile("\t");
    public final b59 a;
    public final ay b;

    public ukf(Context context) {
        umi umiVar = vml.d;
        this.a = w1h.l(context, umiVar, "ads_opera_gb", new bg1[0]);
        ay ayVar = new ay((Object) this, (byte) 9);
        Lazy.e(ayVar, umiVar);
        this.b = ayVar;
    }

    public final void a(ArrayList arrayList) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.a.get();
        if (sharedPreferences.contains("opera_gb_events_version")) {
            if (1 != sharedPreferences.getInt("opera_gb_events_version", -1)) {
                s49.m("gbs version error");
                return;
            }
            String string = sharedPreferences.getString("opera_gb_events_data", null);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            String[] strArrSplit = TextUtils.split(string, "\n");
            int iMax = Math.max(0, strArrSplit.length - 200);
            for (int i = iMax; i < strArrSplit.length; i++) {
                try {
                    String[] strArrSplit2 = TextUtils.split(strArrSplit[i], c);
                    if (strArrSplit2.length != 3) {
                        throw new IllegalArgumentException("invalid gb stats item text");
                    }
                    arrayList.add(new tkf(strArrSplit2[0], Integer.parseInt(strArrSplit2[1]), Integer.parseInt(strArrSplit2[2])));
                } catch (IllegalArgumentException e) {
                    t3p.r(e);
                    return;
                }
            }
            if (iMax > 0) {
                vml.c(new vdf(this, (byte) 5));
            }
        }
    }

    public final void b(gu9 gu9Var, int i) {
        if (gu9Var.n == null) {
            return;
        }
        List list = (List) this.b.get();
        String str = gu9Var.n.c;
        int i2 = 0;
        while (true) {
            if (i2 >= list.size()) {
                i2 = -1;
                break;
            } else if (str.equals(((tkf) list.get(i2)).a)) {
                break;
            } else {
                i2++;
            }
        }
        tkf tkfVar = i2 >= 0 ? (tkf) list.remove(i2) : new tkf(str, 0, 0);
        tkfVar.getClass();
        int iA = vep.A(i);
        if (iA == 0) {
            tkfVar.b++;
        } else if (iA == 1) {
            tkfVar.c++;
        }
        if (list.size() >= 200) {
            list.subList(0, list.size() - 199).clear();
        }
        list.add(tkfVar);
        c();
    }

    public final void c() {
        ((SharedPreferences) this.a.get()).edit().putInt("opera_gb_events_version", 1).putString("opera_gb_events_data", TextUtils.join("\n", (Iterable) this.b.get())).apply();
    }
}
