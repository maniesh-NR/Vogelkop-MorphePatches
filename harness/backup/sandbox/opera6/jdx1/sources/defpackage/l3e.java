package defpackage;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class l3e extends Exception {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public l3e(String str, int i) {
        super(Preconditions.checkNotEmpty(str, "Provided message must not be empty."));
        this.a = i;
    }

    public l3e(String str, Exception exc) {
        super(Preconditions.checkNotEmpty(str, "Provided message must not be empty."), exc);
        this.a = (byte) 13;
    }
}
