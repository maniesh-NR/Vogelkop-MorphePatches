package ads_mobile_sdk;

import defpackage.ioj;

/* loaded from: classes.dex */
public enum rm0 {
    FILL(0),
    NO_FILL(1),
    TIMEOUT(2),
    NOT_FOUND(3),
    CANCELLED(4),
    EXCEPTION(5),
    ERROR(6),
    RENDERED_BUT_LOST(8),
    INFLIGHT(9);

    public static final ioj b = new ioj((byte) 15);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    rm0(int i) {
        this.a = i;
    }
}
