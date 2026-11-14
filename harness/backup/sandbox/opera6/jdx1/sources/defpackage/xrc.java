package defpackage;

/* loaded from: classes.dex */
public enum xrc {
    INTERNAL_ERROR(0),
    INVALID_REQUEST(1),
    NETWORK_ERROR(2),
    NO_FILL(3),
    TIMEOUT(4),
    CANCELLED(5),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND(7),
    APP_ID_MISSING(8),
    REQUEST_ID_MISMATCH(10),
    INVALID_AD_RESPONSE(11),
    AD_RESPONSE_ALREADY_USED(12);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    xrc(int i) {
        this.a = i;
    }
}
