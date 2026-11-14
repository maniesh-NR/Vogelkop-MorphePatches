package defpackage;

import java.nio.charset.MalformedInputException;

/* loaded from: classes.dex */
public final class lsl extends MalformedInputException {
    public final String a;

    public lsl(String str) {
        super(0);
        this.a = str;
    }

    @Override // java.nio.charset.MalformedInputException, java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }
}
