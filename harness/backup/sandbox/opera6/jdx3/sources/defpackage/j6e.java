package defpackage;

/* loaded from: classes.dex */
public final class j6e {
    public final l6e a;

    /* JADX WARN: Multi-variable type inference failed */
    public j6e(String str, String str2, String str3, String str4, int i, k6e k6eVar) {
        if (i != 5) {
            Object[] objArr = 0;
            if (l6e.p(str2)) {
                this.a = new f1a(str, str2, str3, str4, i, new i6e(k6eVar, objArr == true ? 1 : 0), new i6e(k6eVar, (byte) 1));
                return;
            }
            String[] strArr = wqm.a;
            for (String str5 : aik.g(str2).split("\\.")) {
                if ("yandex".equals(str5)) {
                    this.a = new fco(i, str, str2, str3, str4);
                    return;
                }
            }
        }
        if (i != 5) {
            hr5 hr5Var = l6e.k;
            if (str2.startsWith("opera-aria://ui/")) {
                this.a = new l42(i, str, str2, str3, str4);
                return;
            } else if (str2.startsWith("https://chatgpt.com/?q")) {
                this.a = new iu4(i, str, str2, str3, str4);
                return;
            }
        }
        this.a = new l6e(i, str, str2, str3, str4);
    }
}
