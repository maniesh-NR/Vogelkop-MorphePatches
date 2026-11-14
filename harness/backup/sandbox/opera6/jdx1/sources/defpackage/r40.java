package defpackage;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Collection;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import kotlinx.serialization.json.b;

/* loaded from: classes.dex */
public final class r40 implements sth {
    public static final r40 c;
    public static final r40 d;
    public static final r40 e;
    public final /* synthetic */ byte a;
    public String b;

    static {
        byte b = 0;
        boolean z = false;
        c = new r40(b, "TINK", z);
        d = new r40(b, "CRUNCHY", z);
        e = new r40(b, "NO_PREFIX", z);
    }

    public /* synthetic */ r40(byte b, String str, boolean z) {
        this.a = b;
        this.b = str;
    }

    public r40(String str, byte b) {
        this.a = b;
        switch (b) {
            case 6:
                this.b = fki.o(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
                break;
            default:
                str.getClass();
                this.b = str;
                break;
        }
    }

    public r40(String str, String str2) {
        this.a = (byte) 4;
        this.b = str;
    }

    public static CharSequence c(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public static String g(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(str2);
                str2 = p3p.w(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return sko.k(str, " : ", str2);
    }

    public final void a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(c(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.b);
                    sb.append(c(it.next()));
                }
            }
        } catch (IOException e2) {
            qp2.g(e2);
        }
    }

    public final String b(Collection collection) {
        Iterator it = collection.iterator();
        StringBuilder sb = new StringBuilder();
        a(sb, it);
        return sb.toString();
    }

    public final void d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            g(this.b, str, objArr);
        }
    }

    public final void e(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            g(this.b, str, objArr);
        }
    }

    public final void f(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            g(this.b, str, objArr);
        }
    }

    public final b k() {
        return qqb.c(this.b);
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return super.toString();
        }
    }
}
