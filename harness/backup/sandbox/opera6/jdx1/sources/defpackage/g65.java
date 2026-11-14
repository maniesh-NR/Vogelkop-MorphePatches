package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes.dex */
public class g65 extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public g65(int i, int i2, int i3, IndexOutOfBoundsException indexOutOfBoundsException) {
        Locale locale = Locale.US;
        StringBuilder sbQ = p3p.q(i, "Pos: ", ", limit: ");
        sbQ.append(i2);
        sbQ.append(", len: ");
        sbQ.append(i3);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbQ.toString()), indexOutOfBoundsException);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g65(long j, long j2, int i, IndexOutOfBoundsException indexOutOfBoundsException) {
        Locale locale = Locale.US;
        StringBuilder sbQ = p3p.q(j, "Pos: ", ", limit: ");
        sbQ.append(j2);
        sbQ.append(", len: ");
        sbQ.append(i);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbQ.toString()), indexOutOfBoundsException);
    }

    public g65(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": ".concat(str));
        }
        super(sb.toString());
    }

    public /* synthetic */ g65(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    public g65(Throwable th) {
        super(th != null ? th.getMessage() : null, th);
    }
}
