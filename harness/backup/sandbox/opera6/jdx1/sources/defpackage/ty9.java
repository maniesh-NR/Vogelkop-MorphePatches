package defpackage;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ty9 extends Exception {
    public static final StackTraceElement[] f = new StackTraceElement[0];
    public final List a;
    public hub b;
    public int c;
    public Class d;
    public final String e;

    public ty9(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    public ty9(String str, List list) {
        this.e = str;
        setStackTrace(f);
        this.a = list;
    }

    public static void d(Throwable th, ArrayList arrayList) {
        if (!(th instanceof ty9)) {
            arrayList.add(th);
            return;
        }
        Iterator it = ((ty9) th).a.iterator();
        while (it.hasNext()) {
            d((Throwable) it.next(), arrayList);
        }
    }

    public static void g(List list, sy9 sy9Var) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            sy9Var.append("Cause (");
            int i2 = i + 1;
            sy9Var.append(String.valueOf(i2));
            sy9Var.append(" of ");
            sy9Var.append(String.valueOf(size));
            sy9Var.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof ty9) {
                ((ty9) th).i(sy9Var);
            } else {
                h(th, sy9Var);
            }
            i = i2;
        }
    }

    public static void h(Throwable th, Appendable appendable) throws IOException {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            rqd.p(th);
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        String strConcat;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.e);
        String str2 = "";
        if (this.d != null) {
            str = ", " + this.d;
        } else {
            str = "";
        }
        sb.append(str);
        if (this.c != 0) {
            int i = this.c;
            strConcat = ", ".concat(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "MEMORY_CACHE" : "RESOURCE_DISK_CACHE" : "DATA_DISK_CACHE" : "REMOTE" : "LOCAL");
        } else {
            strConcat = "";
        }
        sb.append(strConcat);
        if (this.b != null) {
            str2 = ", " + this.b;
        }
        sb.append(str2);
        ArrayList arrayList = new ArrayList();
        d(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" causes:");
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Throwable th = (Throwable) obj;
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public final void i(Appendable appendable) throws IOException {
        h(this, appendable);
        try {
            g(this.a, new sy9(appendable));
        } catch (IOException e) {
            rqd.p(e);
        }
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() throws IOException {
        i(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) throws IOException {
        i(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) throws IOException {
        i(printWriter);
    }
}
