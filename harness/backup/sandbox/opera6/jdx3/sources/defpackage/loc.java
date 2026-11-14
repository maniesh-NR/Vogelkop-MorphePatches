package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class loc {
    public static final long b;
    public static final nx1 c;
    public final SharedPreferences a;

    static {
        on7 on7Var = pn7.b;
        b = cs5.x0(4, un7.g);
        c = new nx1((byte) 2);
    }

    public loc(Context context) {
        this.a = context.getApplicationContext().getSharedPreferences("ls_notification_dedup", 0);
    }

    public final void a(long j) {
        SharedPreferences sharedPreferences = this.a;
        Map<String, ?> all = sharedPreferences.getAll();
        if (all.isEmpty()) {
            return;
        }
        SharedPreferences.Editor editorEdit = null;
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if ((value instanceof Long) && j - ((Number) value).longValue() >= pn7.f(b)) {
                if (editorEdit == null) {
                    editorEdit = sharedPreferences.edit();
                }
                editorEdit.remove(key);
            }
        }
        if (editorEdit != null) {
            editorEdit.apply();
        }
    }

    public final synchronized boolean b(String str) {
        if (StringsKt.N(str)) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        a(jCurrentTimeMillis);
        if (this.a.contains(str)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putLong(str, jCurrentTimeMillis);
        editorEdit.apply();
        return true;
    }
}
