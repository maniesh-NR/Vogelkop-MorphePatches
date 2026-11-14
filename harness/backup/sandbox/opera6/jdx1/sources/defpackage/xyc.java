package defpackage;

/* loaded from: classes.dex */
public enum xyc implements q6h {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    xyc(int i2) {
        this.a = i2;
    }

    public final int getNumber() {
        return this.a;
    }
}
