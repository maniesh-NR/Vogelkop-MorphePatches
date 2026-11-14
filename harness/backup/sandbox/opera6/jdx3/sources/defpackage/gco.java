package defpackage;

import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class gco {
    public static final HashSet a = new HashSet(Arrays.asList("yandex.by", "yandex.com", "yandex.com.tr", "yandex.kz", "yandex.net", "yandex.ru", "yandex.ua", "yandex.uz", "ya.ru"));

    public static boolean a(eri eriVar) {
        if (!(eriVar instanceof l6e)) {
            return false;
        }
        l6e l6eVar = (l6e) eriVar;
        int i = l6eVar.h;
        if (i == 0) {
            throw null;
        }
        if (i != 1 && i != 3) {
            return false;
        }
        String str = l6eVar.d;
        String[] strArr = wqm.a;
        return a.contains(aik.g(str));
    }
}
