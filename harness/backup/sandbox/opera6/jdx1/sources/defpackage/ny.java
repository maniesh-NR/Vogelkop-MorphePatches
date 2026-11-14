package defpackage;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public final class ny extends Exception {
    public final /* synthetic */ byte a = 1;
    public final String b;

    public ny(int i, int i2) {
        this.b = sko.h(i, i2, "Failed to find a Migration routine from ", " to ");
    }

    public ny(String str) {
        this.b = str;
    }

    public final void d(Appendable appendable) throws IOException {
        if (appendable != null) {
            try {
                appendable.append("Bad URL: URL is in stacktrace\n");
                appendable.append("\tat Fake.Method(Fake.java:1234)\n");
                appendable.append("\tat " + this.b + "\n");
            } catch (IOException unused) {
            }
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        switch (this.a) {
            case 1:
                return this.b;
            default:
                return super.getMessage();
        }
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) throws IOException {
        switch (this.a) {
            case 0:
                d(printStream);
                break;
            default:
                super.printStackTrace(printStream);
                break;
        }
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) throws IOException {
        switch (this.a) {
            case 0:
                d(printWriter);
                break;
            default:
                super.printStackTrace(printWriter);
                break;
        }
    }
}
