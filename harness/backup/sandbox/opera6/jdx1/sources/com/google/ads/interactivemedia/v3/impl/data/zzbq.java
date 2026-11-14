package com.google.ads.interactivemedia.v3.impl.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class zzbq {
    private static final /* synthetic */ zzbq[] $VALUES;
    public static final zzbq GET;
    public static final zzbq POST;

    static {
        zzbq zzbqVar = new zzbq("GET", 0);
        GET = zzbqVar;
        zzbq zzbqVar2 = new zzbq("POST", 1);
        POST = zzbqVar2;
        $VALUES = new zzbq[]{zzbqVar, zzbqVar2};
    }

    public static zzbq valueOf(String str) {
        return (zzbq) Enum.valueOf(zzbq.class, str);
    }

    public static zzbq[] values() {
        return (zzbq[]) $VALUES.clone();
    }
}
