package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.opera.android.OperaApplication;
import java.io.ByteArrayInputStream;

/* loaded from: classes.dex */
public final class mv0 extends no7 {
    public static final kv0 k = new kv0(e82.E(new String[]{"ar", "bg", "bs", "ca", "cs", "da", "de", "el", "en", "es", "fi", "fr", "gl", "hr", "hu", "id", "it", "ja", "ko", "mk", "ms", "nb", "nl", "pl", "pt", "ro", "ru", "sk", "sv", "ta", "th", "tl", "tr", "uk", "vi", "zh"}), new bw0(50, 166, 50, 10), false, false, false, false, false, false, false, e82.E(new String[]{"de", "en", "es", "it", "ja", "nb", "pl", "pt", "ru", "sv", "tr", "zh"}));
    public static final io7 l = io7.B;
    public static final int m = 17;
    public static final t40 n = new t40((byte) 1);

    public final Object h() {
        return k;
    }

    public final Object k(izd izdVar) {
        try {
            return gyg.K(izdVar);
        } catch (Throwable unused) {
            return k;
        }
    }

    public final void m(Object obj) {
        t((kv0) obj);
    }

    public final Object q(byte[] bArr) {
        try {
            return gyg.K(new izd(new ByteArrayInputStream(bArr)));
        } catch (Throwable unused) {
            return k;
        }
    }

    public final void r(Object obj) {
        t((kv0) obj);
    }

    public final void t(kv0 kv0Var) {
        Context context = ((no7) this).a;
        SharedPreferences sharedPreferences = ru9.c(context).a;
        boolean z = sharedPreferences.getBoolean("ai.used_chat", false);
        boolean z2 = sharedPreferences.getBoolean("ai.tos_accepted", false);
        if (z || z2) {
            return;
        }
        String[] strArr = OperaApplication.K;
        context.getApplicationContext().J().R(!kv0Var.i ? 1 : 0, "ai_assistant_menu_shortcut");
    }
}
