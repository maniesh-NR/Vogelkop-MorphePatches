package defpackage;

import android.text.TextUtils;

/* loaded from: classes.dex */
public interface wv8 {
    String a(yz yzVar);

    double b(yz yzVar);

    String c(yz yzVar);

    default boolean d(yz yzVar) {
        return !TextUtils.isEmpty(a(yzVar));
    }

    CharSequence e(yz yzVar);

    CharSequence f(yz yzVar);

    CharSequence g(yz yzVar);

    default CharSequence h(yz yzVar) {
        return "";
    }

    default String j(yz yzVar) {
        return "";
    }
}
