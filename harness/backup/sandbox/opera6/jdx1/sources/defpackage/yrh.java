package defpackage;

/* loaded from: classes.dex */
public final class yrh extends RuntimeException {
    public yrh(Class cls) {
        super(fki.q(cls, "Failed to find result encoder for resource class: ", ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary."));
    }
}
