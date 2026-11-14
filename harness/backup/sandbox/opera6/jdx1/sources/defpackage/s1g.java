package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public class s1g extends IOException {
    public final boolean a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public s1g(String str, Exception exc, boolean z, int i) {
        super(str, exc);
        this.a = z;
        this.b = i;
    }

    public static s1g d(String str, RuntimeException runtimeException) {
        return new s1g(str, runtimeException, true, 1);
    }

    public static s1g g(String str, Exception exc) {
        return new s1g(str, exc, true, 4);
    }

    public static s1g h(String str) {
        return new s1g(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder(message != null ? message.concat(" ") : "");
        sb.append("{contentIsMalformed=");
        sb.append(this.a);
        sb.append(", dataType=");
        return p3p.k(this.b, "}", sb);
    }
}
