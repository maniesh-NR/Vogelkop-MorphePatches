package defpackage;

/* loaded from: classes.dex */
public abstract class czc {
    public void a(eaj eajVar, String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(eajVar);
        sb.append(':');
        StringBuilder sb2 = new StringBuilder(sb.toString());
        sb2.append(" ");
        if (str2 != null && str2.length() > 0) {
            sb2.append("(" + str2 + ')');
            sb2.append(" ");
        }
        sb2.append(str);
        System.out.println((Object) sb2.toString());
        if (th != null) {
            th.printStackTrace();
        }
    }
}
