package defpackage;

import android.util.Size;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public interface eri {
    public static final cri a = cri.a;

    String a(int i, p6l p6lVar, String str);

    boolean b();

    boolean c();

    void cancel();

    boolean d();

    boolean e();

    boolean f();

    lsc g(byte[] bArr, Size size, Size size2, String str);

    long getId();

    String getTitle();

    String getUrl();

    hh4 h(eh7 eh7Var, Callback callback);

    void i(String str, boolean z, tn tnVar);

    String j();

    String k();

    default String l() {
        return d() ? "user" : getTitle();
    }

    int m();
}
