package defpackage;

import androidx.webkit.StartUpLocation;
import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes.dex */
public final class kyn implements StartUpLocation {
    public final Throwable a;

    public kyn(Throwable th) {
        this.a = th;
    }

    @Override // androidx.webkit.StartUpLocation
    public final String getStackInformation() {
        StringWriter stringWriter = new StringWriter();
        this.a.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
}
